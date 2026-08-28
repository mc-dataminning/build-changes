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

public class fp implements ArgumentType<fp.a> {
   private static final Collection<String> a = Arrays.asList("=", ">", "<");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("arguments.operation.div0"));

   public static fp a() {
      return new fp();
   }

   public static fp.a a(CommandContext<et> $$0, String $$1) {
      return (fp.a)$$0.getArgument($$1, fp.a.class);
   }

   public fp.a a(StringReader $$0) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw b.createWithContext($$0);
      } else {
         int $$1 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         return a($$0.getString().substring($$1, $$0.getCursor()));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ey.a(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static fp.a a(String $$0) throws CommandSyntaxException {
      return (fp.a)($$0.equals("><") ? ($$0x, $$1) -> {
         int $$2 = $$0x.a();
         $$0x.a($$1.a());
         $$1.a($$2);
      } : b($$0));
   }

   private static fp.b b(String $$0) throws CommandSyntaxException {
      return switch ($$0) {
         case "=" -> ($$0x, $$1) -> $$1;
         case "+=" -> Integer::sum;
         case "-=" -> ($$0x, $$1) -> $$0x - $$1;
         case "*=" -> ($$0x, $$1) -> $$0x * $$1;
         case "/=" -> ($$0x, $$1) -> {
         if ($$1 == 0) {
            throw c.create();
         } else {
            return azc.a($$0x, $$1);
         }
      };
         case "%=" -> ($$0x, $$1) -> {
         if ($$1 == 0) {
            throw c.create();
         } else {
            return azc.b($$0x, $$1);
         }
      };
         case "<" -> Math::min;
         case ">" -> Math::max;
         default -> throw b.create();
      };
   }

   @FunctionalInterface
   public interface a {
      void apply(ezg var1, ezg var2) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b extends fp.a {
      int apply(int var1, int var2) throws CommandSyntaxException;

      @Override
      default void apply(ezg $$0, ezg $$1) throws CommandSyntaxException {
         $$0.a(this.apply($$0.a(), $$1.a()));
      }
   }
}
