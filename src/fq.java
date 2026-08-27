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

public class fq implements ArgumentType<fl> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("argument.pos.mixed"));
   private final boolean d;

   public fq(boolean $$0) {
      this.d = $$0;
   }

   public static fq a() {
      return new fq(true);
   }

   public static fq a(boolean $$0) {
      return new fq($$0);
   }

   public static ehf a(CommandContext<ds> $$0, String $$1) {
      return ((fl)$$0.getArgument($$1, fl.class)).a((ds)$$0.getSource());
   }

   public static fl b(CommandContext<ds> $$0, String $$1) {
      return (fl)$$0.getArgument($$1, fl.class);
   }

   public fl a(StringReader $$0) throws CommandSyntaxException {
      return (fl)($$0.canRead() && $$0.peek() == '^' ? fm.a($$0) : fs.a($$0, this.d));
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

         return dv.a($$2, $$3, $$1, dt.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
