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

public class fp implements ArgumentType<fk> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("argument.pos.mixed"));
   private final boolean d;

   public fp(boolean $$0) {
      this.d = $$0;
   }

   public static fp a() {
      return new fp(true);
   }

   public static fp a(boolean $$0) {
      return new fp($$0);
   }

   public static ehd a(CommandContext<dr> $$0, String $$1) {
      return ((fk)$$0.getArgument($$1, fk.class)).a((dr)$$0.getSource());
   }

   public static fk b(CommandContext<dr> $$0, String $$1) {
      return (fk)$$0.getArgument($$1, fk.class);
   }

   public fk a(StringReader $$0) throws CommandSyntaxException {
      return (fk)($$0.canRead() && $$0.peek() == '^' ? fl.a($$0) : fr.a($$0, this.d));
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
            $$3 = ((du)$$0.getSource()).A();
         }

         return du.a($$2, $$3, $$1, ds.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
