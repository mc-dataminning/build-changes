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

public class ei implements ArgumentType<cwb> {
   private static final Collection<String> a = Stream.of(cwb.a, cwb.b).map(cwb::b).collect(Collectors.toList());
   private static final cwb[] b = cwb.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vs.b("argument.gamemode.invalid", $$0));

   public cwb a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cwb $$2 = cwb.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz ? dz.b(Arrays.stream(b).map(cwb::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ei a() {
      return new ei();
   }

   public static cwb a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return (cwb)$$0.getArgument($$1, cwb.class);
   }
}
