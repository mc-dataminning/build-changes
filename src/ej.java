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

public class ej implements ArgumentType<czd> {
   private static final Collection<String> a = Stream.of(czd.a, czd.b).map(czd::b).collect(Collectors.toList());
   private static final czd[] b = czd.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("argument.gamemode.invalid", $$0));

   public czd a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      czd $$2 = czd.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ea ? ea.b(Arrays.stream(b).map(czd::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ej a() {
      return new ej();
   }

   public static czd a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return (czd)$$0.getArgument($$1, czd.class);
   }
}
