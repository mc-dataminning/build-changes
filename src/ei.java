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

public class ei implements ArgumentType<cvk> {
   private static final Collection<String> a = Stream.of(cvk.a, cvk.b).map(cvk::b).collect(Collectors.toList());
   private static final cvk[] b = cvk.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("argument.gamemode.invalid", $$0));

   public cvk a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cvk $$2 = cvk.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz ? dz.b(Arrays.stream(b).map(cvk::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ei a() {
      return new ei();
   }

   public static cvk a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return (cvk)$$0.getArgument($$1, cvk.class);
   }
}
