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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ed implements ArgumentType<cpi> {
   private static final Collection<String> a = Stream.of(cpi.a, cpi.b).map(cpi::b).collect(Collectors.toList());
   private static final cpi[] b = cpi.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tf.a("argument.gamemode.invalid", $$0));

   public cpi a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cpi $$2 = cpi.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof du ? du.b(Arrays.stream(b).map(cpi::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ed a() {
      return new ed();
   }

   public static cpi a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return (cpi)$$0.getArgument($$1, cpi.class);
   }
}
