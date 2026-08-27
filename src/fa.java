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

public class fa implements ArgumentType<kv> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("particle.notFound", $$0));
   private final iy.a c;

   public fa(dz $$0) {
      this.c = $$0;
   }

   public static fa a(dz $$0) {
      return new fa($$0);
   }

   public static kv a(CommandContext<ed> $$0, String $$1) {
      return (kv)$$0.getArgument($$1, kv.class);
   }

   public kv a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static kv a(StringReader $$0, iy.a $$1) throws CommandSyntaxException {
      kw<?> $$2 = a($$0, $$1.b(le.T));
      return a($$0, (kw<kv>)$$2, $$1);
   }

   private static kw<?> a(StringReader $$0, iy<kw<?>> $$1) throws CommandSyntaxException {
      akh $$2 = akh.a($$0);
      akg<kw<?>> $$3 = akg.a(le.T, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends kv> T a(StringReader $$0, kw<T> $$1, iy.a $$2) throws CommandSyntaxException {
      return $$1.c().b($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      iy.b<kw<?>> $$2 = this.c.b(le.T);
      return ei.a($$2.c().map(akg::a), $$1);
   }
}
