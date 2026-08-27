import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fj implements ArgumentType<fh> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final ij<cwj> b;

   public fj(dn $$0) {
      this.b = $$0.a(ke.f);
   }

   public static fj a(dn $$0) {
      return new fj($$0);
   }

   public fh a(StringReader $$0) throws CommandSyntaxException {
      fk.a $$1 = fk.a(this.b, $$0, true);
      return new fh($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fh a(CommandContext<ds> $$0, String $$1) {
      return (fh)$$0.getArgument($$1, fh.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fk.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
