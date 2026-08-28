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

public class fh implements ArgumentType<ded> {
   private static final Collection<String> a = Stream.of(ded.a, ded.b).map(ded::b).collect(Collectors.toList());
   private static final ded[] b = ded.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("argument.gamemode.invalid", $$0));

   public ded a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      ded $$2 = ded.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey ? ey.b(Arrays.stream(b).map(ded::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fh a() {
      return new fh();
   }

   public static ded a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return (ded)$$0.getArgument($$1, ded.class);
   }
}
