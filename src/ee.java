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

public class ee implements ArgumentType<cph> {
   private static final Collection<String> a = Stream.of(cph.a, cph.b).map(cph::b).collect(Collectors.toList());
   private static final cph[] b = cph.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("argument.gamemode.invalid", $$0));

   public cph a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cph $$2 = cph.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dv ? dv.b(Arrays.stream(b).map(cph::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ee a() {
      return new ee();
   }

   public static cph a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (cph)$$0.getArgument($$1, cph.class);
   }
}
