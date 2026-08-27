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

public class fl implements ArgumentType<fm> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("argument.pos2d.incomplete"));

   public static fl a() {
      return new fl();
   }

   public static akh a(CommandContext<dt> $$0, String $$1) {
      gw $$2 = ((fm)$$0.getArgument($$1, fm.class)).c((dt)$$0.getSource());
      return new akh($$2.u(), $$2.w());
   }

   public fm a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fs $$2 = fs.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fs $$3 = fs.a($$0);
            return new ft($$2, new fs(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dw)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dw.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dw.b.a);
         } else {
            $$3 = ((dw)$$0.getSource()).z();
         }

         return dw.b($$2, $$3, $$1, du.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
