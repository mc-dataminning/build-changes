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

public class ed implements ArgumentType<cmj> {
   private static final Collection<String> a = Stream.of(cmj.a, cmj.b).map(cmj::b).collect(Collectors.toList());
   private static final cmj[] b = cmj.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("argument.gamemode.invalid", $$0));

   public cmj a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cmj $$2 = cmj.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof du ? du.b(Arrays.stream(b).map(cmj::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ed a() {
      return new ed();
   }

   public static cmj a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return (cmj)$$0.getArgument($$1, cmj.class);
   }
}
