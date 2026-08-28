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

public class fi implements ArgumentType<deg> {
   private static final Collection<String> a = Stream.of(deg.a, deg.b).map(deg::b).collect(Collectors.toList());
   private static final deg[] b = deg.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("argument.gamemode.invalid", $$0));

   public deg a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      deg $$2 = deg.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ez ? ez.b(Arrays.stream(b).map(deg::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fi a() {
      return new fi();
   }

   public static deg a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return (deg)$$0.getArgument($$1, deg.class);
   }
}
