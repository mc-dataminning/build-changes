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

public class fl implements ArgumentType<dhm> {
   private static final Collection<String> a = Stream.of(dhm.a, dhm.b).map(dhm::b).collect(Collectors.toList());
   private static final dhm[] b = dhm.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wv.b("argument.gamemode.invalid", $$0));

   public dhm a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dhm $$2 = dhm.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc ? fc.b(Arrays.stream(b).map(dhm::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fl a() {
      return new fl();
   }

   public static dhm a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return (dhm)$$0.getArgument($$1, dhm.class);
   }
}
