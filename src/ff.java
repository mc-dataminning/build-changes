import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ff implements ArgumentType<fd> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final hg<cpn> b;

   public ff(dm $$0) {
      this.b = $$0.a(jc.e);
   }

   public static ff a(dm $$0) {
      return new ff($$0);
   }

   public fd a(StringReader $$0) throws CommandSyntaxException {
      fg.a $$1 = fg.a(this.b, $$0, true);
      return new fd($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fd a(CommandContext<ds> $$0, String $$1) {
      return (fd)$$0.getArgument($$1, fd.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fg.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
