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

public class ep implements ArgumentType<jv> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vg.b("particle.notFound", $$0));
   private final ij<jw<?>> c;

   public ep(dn $$0) {
      this.c = $$0.a(ke.S);
   }

   public static ep a(dn $$0) {
      return new ep($$0);
   }

   public static jv a(CommandContext<ds> $$0, String $$1) {
      return (jv)$$0.getArgument($$1, jv.class);
   }

   public jv a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static jv a(StringReader $$0, ij<jw<?>> $$1) throws CommandSyntaxException {
      jw<?> $$2 = b($$0, $$1);
      return a($$0, (jw<jv>)$$2);
   }

   private static jw<?> b(StringReader $$0, ij<jw<?>> $$1) throws CommandSyntaxException {
      ahh $$2 = ahh.a($$0);
      ahg<jw<?>> $$3 = ahg.a(ke.S, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends jv> T a(StringReader $$0, jw<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dx.a(this.c.c().map(ahg::a), $$1);
   }
}
