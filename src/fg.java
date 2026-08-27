import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fg implements ArgumentType<fe> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final hh<csk> b;

   public fg(dm $$0) {
      this.b = $$0.a(jd.e);
   }

   public static fg a(dm $$0) {
      return new fg($$0);
   }

   public fe a(StringReader $$0) throws CommandSyntaxException {
      fh.a $$1 = fh.a(this.b, $$0, true);
      return new fe($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fe a(CommandContext<ds> $$0, String $$1) {
      return (fe)$$0.getArgument($$1, fe.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fh.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
