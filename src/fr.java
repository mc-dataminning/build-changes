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

public class fr implements ArgumentType<fm> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("argument.pos.mixed"));
   private final boolean d;

   public fr(boolean $$0) {
      this.d = $$0;
   }

   public static fr a() {
      return new fr(true);
   }

   public static fr a(boolean $$0) {
      return new fr($$0);
   }

   public static elb a(CommandContext<ds> $$0, String $$1) {
      return ((fm)$$0.getArgument($$1, fm.class)).a((ds)$$0.getSource());
   }

   public static fm b(CommandContext<ds> $$0, String $$1) {
      return (fm)$$0.getArgument($$1, fm.class);
   }

   public fm a(StringReader $$0) throws CommandSyntaxException {
      return (fm)($$0.canRead() && $$0.peek() == '^' ? fn.a($$0) : ft.a($$0, this.d));
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
            $$3 = ((dw)$$0.getSource()).C();
         }

         return dw.a($$2, $$3, $$1, dt.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
