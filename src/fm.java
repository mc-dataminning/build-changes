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

public class fm implements ArgumentType<lg> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("particle.invalidOptions", $$0));
   private final jk.a d;

   public fm(el $$0) {
      this.d = $$0;
   }

   public static fm a(el $$0) {
      return new fm($$0);
   }

   public static lg a(CommandContext<ep> $$0, String $$1) {
      return (lg)$$0.getArgument($$1, lg.class);
   }

   public lg a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lg a(StringReader $$0, jk.a $$1) throws CommandSyntaxException {
      lh<?> $$2 = a($$0, $$1.b(lq.T));
      return a($$0, (lh<lg>)$$2, $$1);
   }

   private static lh<?> a(StringReader $$0, jk<lh<?>> $$1) throws CommandSyntaxException {
      ale $$2 = ale.a($$0);
      ald<lh<?>> $$3 = ald.a(lq.T, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lg> T a(StringReader $$0, lh<T> $$1, jk.a $$2) throws CommandSyntaxException {
      ur $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new vp($$0).f();
      } else {
         $$3 = new ur();
      }

      return (T)$$1.c().codec().parse($$2.a(vf.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jk.b<lh<?>> $$2 = this.d.b(lq.T);
      return eu.a($$2.c().map(ald::a), $$1);
   }
}
