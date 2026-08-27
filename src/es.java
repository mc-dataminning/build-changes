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

public class es implements ArgumentType<kl> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wi.b("particle.notFound", $$0));
   private final ip.a c;

   public es(dr $$0) {
      this.c = $$0;
   }

   public static es a(dr $$0) {
      return new es($$0);
   }

   public static kl a(CommandContext<dv> $$0, String $$1) {
      return (kl)$$0.getArgument($$1, kl.class);
   }

   public kl a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static kl a(StringReader $$0, ip.a $$1) throws CommandSyntaxException {
      km<?> $$2 = a($$0, $$1.b(ku.T));
      return a($$0, (km<kl>)$$2, $$1);
   }

   private static km<?> a(StringReader $$0, ip<km<?>> $$1) throws CommandSyntaxException {
      ajv $$2 = ajv.a($$0);
      aju<km<?>> $$3 = aju.a(ku.T, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends kl> T a(StringReader $$0, km<T> $$1, ip.a $$2) throws CommandSyntaxException {
      return $$1.c().b($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ip.b<km<?>> $$2 = this.c.b(ku.T);
      return ea.a($$2.c().map(aju::a), $$1);
   }
}
