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

public class fh implements ArgumentType<lx> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("particle.invalidOptions", $$0));
   private final ji.a d;
   private static final vb<?> e = vb.a(uo.a);

   public fh(eg $$0) {
      this.d = $$0;
   }

   public static fh a(eg $$0) {
      return new fh($$0);
   }

   public static lx a(CommandContext<ek> $$0, String $$1) {
      return (lx)$$0.getArgument($$1, lx.class);
   }

   public lx a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lx a(StringReader $$0, ji.a $$1) throws CommandSyntaxException {
      ly<?> $$2 = a($$0, $$1.e(mi.Y));
      return a(e, $$0, (ly<lx>)$$2, $$1);
   }

   private static ly<?> a(StringReader $$0, ji<ly<?>> $$1) throws CommandSyntaxException {
      alr $$2 = alr.a($$0);
      alq<ly<?>> $$3 = alq.a(mi.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lx, O> T a(vb<O> $$0, StringReader $$1, ly<T> $$2, ji.a $$3) throws CommandSyntaxException {
      alp<O> $$4 = $$3.a($$0.a());
      O $$5;
      if ($$1.canRead() && $$1.peek() == '{') {
         $$5 = $$0.b($$1);
      } else {
         $$5 = $$4.emptyMap();
      }

      return (T)$$2.c().codec().parse($$4, $$5).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ji.b<ly<?>> $$2 = this.d.e(mi.Y);
      return ep.a($$2.c_().map(alq::a), $$1);
   }
}
