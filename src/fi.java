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

public class fi implements ArgumentType<fk> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.c("argument.pos.outofbounds"));

   public static fi a() {
      return new fi();
   }

   public static gu a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      akk $$2 = ((dr)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static gu a(CommandContext<dr> $$0, akk $$1, String $$2) throws CommandSyntaxException {
      gu $$3 = b($$0, $$2);
      if (!$$1.A($$3)) {
         throw a.create();
      } else if (!$$1.j($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static gu b(CommandContext<dr> $$0, String $$1) {
      return ((fk)$$0.getArgument($$1, fk.class)).c((dr)$$0.getSource());
   }

   public static gu c(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      gu $$2 = b($$0, $$1);
      if (!cpm.k($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fk a(StringReader $$0) throws CommandSyntaxException {
      return (fk)($$0.canRead() && $$0.peek() == '^' ? fl.a($$0) : fr.a($$0));
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

         return du.a($$2, $$3, $$1, ds.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
