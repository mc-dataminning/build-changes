import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class en implements ArgumentType<en.a> {
   private static final Collection<String> a = Arrays.asList("=", ">", "<");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vb.c("arguments.operation.div0"));

   public static en a() {
      return new en();
   }

   public static en.a a(CommandContext<ds> $$0, String $$1) {
      return (en.a)$$0.getArgument($$1, en.a.class);
   }

   public en.a a(StringReader $$0) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw b.create();
      } else {
         int $$1 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         return a($$0.getString().substring($$1, $$0.getCursor()));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static en.a a(String $$0) throws CommandSyntaxException {
      return (en.a)($$0.equals("><") ? ($$0x, $$1) -> {
         int $$2 = $$0x.b();
         $$0x.b($$1.b());
         $$1.b($$2);
      } : b($$0));
   }

   private static en.b b(String $$0) throws CommandSyntaxException {
      switch ($$0) {
         case "=":
            return ($$0x, $$1) -> $$1;
         case "+=":
            return ($$0x, $$1) -> $$0x + $$1;
         case "-=":
            return ($$0x, $$1) -> $$0x - $$1;
         case "*=":
            return ($$0x, $$1) -> $$0x * $$1;
         case "/=":
            return ($$0x, $$1) -> {
               if ($$1 == 0) {
                  throw c.create();
               } else {
                  return aty.a($$0x, $$1);
               }
            };
         case "%=":
            return ($$0x, $$1) -> {
               if ($$1 == 0) {
                  throw c.create();
               } else {
                  return aty.b($$0x, $$1);
               }
            };
         case "<":
            return Math::min;
         case ">":
            return Math::max;
         default:
            throw b.create();
      }
   }

   @FunctionalInterface
   public interface a {
      void apply(elz var1, elz var2) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b extends en.a {
      int apply(int var1, int var2) throws CommandSyntaxException;

      @Override
      default void apply(elz $$0, elz $$1) throws CommandSyntaxException {
         $$0.b(this.apply($$0.b(), $$1.b()));
      }
   }
}
