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

public class ft implements ArgumentType<fo> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("argument.pos.mixed"));
   private final boolean d;

   public ft(boolean $$0) {
      this.d = $$0;
   }

   public static ft a() {
      return new ft(true);
   }

   public static ft a(boolean $$0) {
      return new ft($$0);
   }

   public static eif a(CommandContext<du> $$0, String $$1) {
      return ((fo)$$0.getArgument($$1, fo.class)).a((du)$$0.getSource());
   }

   public static fo b(CommandContext<du> $$0, String $$1) {
      return (fo)$$0.getArgument($$1, fo.class);
   }

   public fo a(StringReader $$0) throws CommandSyntaxException {
      return (fo)($$0.canRead() && $$0.peek() == '^' ? fp.a($$0) : fv.a($$0, this.d));
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
            $$3 = ((dy)$$0.getSource()).C();
         }

         return dy.a($$2, $$3, $$1, dv.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
