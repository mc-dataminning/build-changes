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

public class ew implements ArgumentType<dix> {
   private static final Collection<String> a = Stream.of(dix.a, dix.b).map(dix::b).collect(Collectors.toList());
   private static final dix[] b = dix.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("argument.gamemode.invalid", $$0));

   public dix a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dix $$2 = dix.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof en ? en.b(Arrays.stream(b).map(dix::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ew a() {
      return new ew();
   }

   public static dix a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return (dix)$$0.getArgument($$1, dix.class);
   }
}
