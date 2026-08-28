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

public class ew implements ArgumentType<dis> {
   private static final Collection<String> a = Stream.of(dis.a, dis.b).map(dis::b).collect(Collectors.toList());
   private static final dis[] b = dis.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("argument.gamemode.invalid", $$0));

   public dis a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dis $$2 = dis.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof en ? en.b(Arrays.stream(b).map(dis::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ew a() {
      return new ew();
   }

   public static dis a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return (dis)$$0.getArgument($$1, dis.class);
   }
}
