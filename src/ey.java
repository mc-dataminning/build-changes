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

public class ey implements ArgumentType<dkg> {
   private static final Collection<String> a = Stream.of(dkg.a, dkg.b).map(dkg::b).collect(Collectors.toList());
   private static final dkg[] b = dkg.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("argument.gamemode.invalid", $$0));

   public dkg a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dkg $$2 = dkg.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ep ? ep.b(Arrays.stream(b).map(dkg::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ey a() {
      return new ey();
   }

   public static dkg a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return (dkg)$$0.getArgument($$1, dkg.class);
   }
}
