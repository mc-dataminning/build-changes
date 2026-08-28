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

public class fh implements ArgumentType<dct> {
   private static final Collection<String> a = Stream.of(dct.a, dct.b).map(dct::b).collect(Collectors.toList());
   private static final dct[] b = dct.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wz.b("argument.gamemode.invalid", $$0));

   public dct a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      dct $$2 = dct.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey ? ey.b(Arrays.stream(b).map(dct::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fh a() {
      return new fh();
   }

   public static dct a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return (dct)$$0.getArgument($$1, dct.class);
   }
}
