import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fh implements ArgumentType<ff> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final hi<csv> b;

   public fh(dn $$0) {
      this.b = $$0.a(je.e);
   }

   public static fh a(dn $$0) {
      return new fh($$0);
   }

   public ff a(StringReader $$0) throws CommandSyntaxException {
      fi.a $$1 = fi.a(this.b, $$0, true);
      return new ff($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static ff a(CommandContext<dt> $$0, String $$1) {
      return (ff)$$0.getArgument($$1, ff.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fi.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
