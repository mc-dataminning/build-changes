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

public class fq implements ArgumentType<fs> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.c("argument.pos.outofbounds"));

   public static fq a() {
      return new fq();
   }

   public static id a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      apu $$2 = ((dv)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static id a(CommandContext<dv> $$0, apu $$1, String $$2) throws CommandSyntaxException {
      id $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static id b(CommandContext<dv> $$0, String $$1) {
      return ((fs)$$0.getArgument($$1, fs.class)).c((dv)$$0.getSource());
   }

   public static id c(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      id $$2 = b($$0, $$1);
      if (!czg.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fs a(StringReader $$0) throws CommandSyntaxException {
      return (fs)($$0.canRead() && $$0.peek() == '^' ? ft.a($$0) : fz.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ea)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ea.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ea.b.a);
         } else {
            $$3 = ((ea)$$0.getSource()).B();
         }

         return ea.a($$2, $$3, $$1, dw.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
