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

public class fr implements ArgumentType<fs> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("argument.pos2d.incomplete"));

   public static fr a() {
      return new fr();
   }

   public static apk a(CommandContext<dv> $$0, String $$1) {
      id $$2 = ((fs)$$0.getArgument($$1, fs.class)).c((dv)$$0.getSource());
      return new apk($$2.u(), $$2.w());
   }

   public fs a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fy $$2 = fy.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fy $$3 = fy.a($$0);
            return new fz($$2, new fy(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
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

         return ea.b($$2, $$3, $$1, dw.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
