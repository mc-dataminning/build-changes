import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class fm implements ArgumentType<fo> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(uv.c("argument.pos.outofbounds"));

   public static fm a() {
      return new fm();
   }

   public static hx a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ami $$2 = ((du)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static hx a(CommandContext<du> $$0, ami $$1, String $$2) throws CommandSyntaxException {
      hx $$3 = b($$0, $$2);
      if (!$$1.A($$3)) {
         throw a.create();
      } else if (!$$1.j($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static hx b(CommandContext<du> $$0, String $$1) {
      return ((fo)$$0.getArgument($$1, fo.class)).c((du)$$0.getSource());
   }

   public static hx c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      hx $$2 = b($$0, $$1);
      if (!csf.k($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fo a(StringReader $$0) throws CommandSyntaxException {
      return (fo)($$0.canRead() && $$0.peek() == '^' ? fp.a($$0) : fv.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dy)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dy.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dy.b.a);
         } else {
            $$3 = ((dy)$$0.getSource()).B();
         }

         return dy.a($$2, $$3, $$1, dv.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
