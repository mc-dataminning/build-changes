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

public class fj implements ArgumentType<fk> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("argument.pos2d.incomplete"));

   public static fj a() {
      return new fj();
   }

   public static aka a(CommandContext<dr> $$0, String $$1) {
      gu $$2 = ((fk)$$0.getArgument($$1, fk.class)).c((dr)$$0.getSource());
      return new aka($$2.u(), $$2.w());
   }

   public fk a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fq $$2 = fq.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fq $$3 = fq.a($$0);
            return new fr($$2, new fq(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof du)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<du.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(du.b.a);
         } else {
            $$3 = ((du)$$0.getSource()).z();
         }

         return du.b($$2, $$3, $$1, ds.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
