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

public class fs implements ArgumentType<fo> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("argument.pos2d.incomplete"));
   private final boolean c;

   public fs(boolean $$0) {
      this.c = $$0;
   }

   public static fs a() {
      return new fs(true);
   }

   public static fs a(boolean $$0) {
      return new fs($$0);
   }

   public static els a(CommandContext<ds> $$0, String $$1) {
      elt $$2 = ((fo)$$0.getArgument($$1, fo.class)).a((ds)$$0.getSource());
      return new els((float)$$2.c, (float)$$2.e);
   }

   public fo a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fu $$2 = fu.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fu $$3 = fu.a($$0, this.c);
            return new fv($$2, new fu(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dx)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dx.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dx.b.a);
         } else {
            $$3 = ((dx)$$0.getSource()).C();
         }

         return dx.b($$2, $$3, $$1, dt.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
