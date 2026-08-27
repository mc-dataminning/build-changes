import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fn implements ArgumentType<fl> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final ip<dch> b;

   public fn(dr $$0) {
      this.b = $$0.b(ku.f);
   }

   public static fn a(dr $$0) {
      return new fn($$0);
   }

   public fl a(StringReader $$0) throws CommandSyntaxException {
      fo.a $$1 = fo.a(this.b, $$0, true);
      return new fl($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fl a(CommandContext<dv> $$0, String $$1) {
      return (fl)$$0.getArgument($$1, fl.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fo.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
