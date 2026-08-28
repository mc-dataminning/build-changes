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

public class fq implements ArgumentType<ll> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xd.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("particle.invalidOptions", $$0));
   private final jp.a d;

   public fq(ep $$0) {
      this.d = $$0;
   }

   public static fq a(ep $$0) {
      return new fq($$0);
   }

   public static ll a(CommandContext<et> $$0, String $$1) {
      return (ll)$$0.getArgument($$1, ll.class);
   }

   public ll a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static ll a(StringReader $$0, jp.a $$1) throws CommandSyntaxException {
      lm<?> $$2 = a($$0, $$1.b(lv.Y));
      return a($$0, (lm<ll>)$$2, $$1);
   }

   private static lm<?> a(StringReader $$0, jp<lm<?>> $$1) throws CommandSyntaxException {
      alb $$2 = alb.a($$0);
      ala<lm<?>> $$3 = ala.a(lv.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends ll> T a(StringReader $$0, lm<T> $$1, jp.a $$2) throws CommandSyntaxException {
      uf $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new vd($$0).f();
      } else {
         $$3 = new uf();
      }

      return (T)$$1.c().codec().parse($$2.a(ut.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jp.b<lm<?>> $$2 = this.d.b(lv.Y);
      return ey.a($$2.c().map(ala::a), $$1);
   }
}
