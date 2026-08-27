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

public class eu implements ArgumentType<ehy> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("argument.scoreboardDisplaySlot.invalid", $$0));

   private eu() {
   }

   public static eu a() {
      return new eu();
   }

   public static ehy a(CommandContext<dr> $$0, String $$1) {
      return (ehy)$$0.getArgument($$1, ehy.class);
   }

   public ehy a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      ehy $$2 = ehy.t.a($$1);
      if ($$2 == null) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return du.b(Arrays.stream(ehy.values()).map(ehy::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
