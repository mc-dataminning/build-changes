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

public class fp implements ArgumentType<fl> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("argument.pos2d.incomplete"));
   private final boolean c;

   public fp(boolean $$0) {
      this.c = $$0;
   }

   public static fp a() {
      return new fp(true);
   }

   public static fp a(boolean $$0) {
      return new fp($$0);
   }

   public static ehe a(CommandContext<ds> $$0, String $$1) {
      ehf $$2 = ((fl)$$0.getArgument($$1, fl.class)).a((ds)$$0.getSource());
      return new ehe((float)$$2.c, (float)$$2.e);
   }

   public fl a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fr $$2 = fr.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fr $$3 = fr.a($$0, this.c);
            return new fs($$2, new fr(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dv)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dv.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dv.b.a);
         } else {
            $$3 = ((dv)$$0.getSource()).A();
         }

         return dv.b($$2, $$3, $$1, dt.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
