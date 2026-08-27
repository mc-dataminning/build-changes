import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fl implements ArgumentType<fj> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final in<daa> b;

   public fl(dq $$0) {
      this.b = $$0.b(kj.f);
   }

   public static fl a(dq $$0) {
      return new fl($$0);
   }

   public fj a(StringReader $$0) throws CommandSyntaxException {
      fm.a $$1 = fm.a(this.b, $$0, true);
      return new fj($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fj a(CommandContext<du> $$0, String $$1) {
      return (fj)$$0.getArgument($$1, fj.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fm.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
