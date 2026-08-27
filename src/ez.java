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

public class ez implements ArgumentType<esv> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wg.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private ez() {
   }

   public static ez a() {
      return new ez();
   }

   public static esv a(CommandContext<du> $$0, String $$1) {
      return (esv)$$0.getArgument($$1, esv.class);
   }

   public esv a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      esv $$2 = esv.t.a($$1);
      if ($$2 == null) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dz.b(Arrays.stream(esv.values()).map(esv::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
