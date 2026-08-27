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

public class fu implements ArgumentType<fq> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("argument.pos2d.incomplete"));
   private final boolean c;

   public fu(boolean $$0) {
      this.c = $$0;
   }

   public static fu a() {
      return new fu(true);
   }

   public static fu a(boolean $$0) {
      return new fu($$0);
   }

   public static eps a(CommandContext<du> $$0, String $$1) {
      ept $$2 = ((fq)$$0.getArgument($$1, fq.class)).a((du)$$0.getSource());
      return new eps((float)$$2.c, (float)$$2.e);
   }

   public fq a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fw $$2 = fw.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fw $$3 = fw.a($$0, this.c);
            return new fx($$2, new fw(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dz)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dz.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dz.b.a);
         } else {
            $$3 = ((dz)$$0.getSource()).C();
         }

         return dz.b($$2, $$3, $$1, dv.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
