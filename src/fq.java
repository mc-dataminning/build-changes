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

public class fq implements ArgumentType<lk> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wz.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wz.b("particle.invalidOptions", $$0));
   private final jo.a d;

   public fq(ep $$0) {
      this.d = $$0;
   }

   public static fq a(ep $$0) {
      return new fq($$0);
   }

   public static lk a(CommandContext<et> $$0, String $$1) {
      return (lk)$$0.getArgument($$1, lk.class);
   }

   public lk a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lk a(StringReader $$0, jo.a $$1) throws CommandSyntaxException {
      ll<?> $$2 = a($$0, $$1.b(lu.Y));
      return a($$0, (ll<lk>)$$2, $$1);
   }

   private static ll<?> a(StringReader $$0, jo<ll<?>> $$1) throws CommandSyntaxException {
      akr $$2 = akr.a($$0);
      akq<ll<?>> $$3 = akq.a(lu.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lk> T a(StringReader $$0, ll<T> $$1, jo.a $$2) throws CommandSyntaxException {
      ub $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new uz($$0).f();
      } else {
         $$3 = new ub();
      }

      return (T)$$1.c().codec().parse($$2.a(up.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jo.b<ll<?>> $$2 = this.d.b(lu.Y);
      return ey.a($$2.c().map(akq::a), $$1);
   }
}
