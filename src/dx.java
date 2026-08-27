import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class dx implements ArgumentType<n> {
   private static final Collection<String> b = Arrays.asList("red", "green");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("argument.color.invalid", $$0));

   private dx() {
   }

   public static dx a() {
      return new dx();
   }

   public static n a(CommandContext<dr> $$0, String $$1) {
      return (n)$$0.getArgument($$1, n.class);
   }

   public n a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      n $$2 = n.b($$1);
      if ($$2 != null && !$$2.d()) {
         return $$2;
      } else {
         throw a.create($$1);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return du.b(n.a(true, false), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
