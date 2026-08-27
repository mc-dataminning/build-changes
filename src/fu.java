import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fu implements ArgumentType<fs> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final ix<dcv> b;

   public fu(dy $$0) {
      this.b = $$0.b(ld.f);
   }

   public static fu a(dy $$0) {
      return new fu($$0);
   }

   public fs a(StringReader $$0) throws CommandSyntaxException {
      fv.a $$1 = fv.a(this.b, $$0, true);
      return new fs($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fs a(CommandContext<ec> $$0, String $$1) {
      return (fs)$$0.getArgument($$1, fs.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fv.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
