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

public class fe implements ArgumentType<dcc> {
   private static final Collection<String> a = Stream.of(dcc.a, dcc.b).map(dcc::b).collect(Collectors.toList());
   private static final dcc[] b = dcc.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("argument.gamemode.invalid", $$0));

   public dcc a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dcc $$2 = dcc.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ev ? ev.b(Arrays.stream(b).map(dcc::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fe a() {
      return new fe();
   }

   public static dcc a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return (dcc)$$0.getArgument($$1, dcc.class);
   }
}
