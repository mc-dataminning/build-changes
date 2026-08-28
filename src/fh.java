import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fh implements ArgumentType<lx> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("particle.invalidOptions", $$0));
   private final ji.a d;
   private static final vb<Object> e = vb.a(JavaOps.INSTANCE);

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
      return a(JavaOps.INSTANCE, e, $$0, (ly<lx>)$$2, $$1);
   }

   private static ly<?> a(StringReader $$0, ji<ly<?>> $$1) throws CommandSyntaxException {
      alk $$2 = alk.a($$0);
      alj<ly<?>> $$3 = alj.a(mi.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lx, O> T a(DynamicOps<O> $$0, vb<O> $$1, StringReader $$2, ly<T> $$3, ji.a $$4) throws CommandSyntaxException {
      ali<O> $$5 = $$4.a($$0);
      O $$6;
      if ($$2.canRead() && $$2.peek() == '{') {
         $$6 = $$1.b($$2);
      } else {
         $$6 = $$5.emptyMap();
      }

      return (T)$$3.c().codec().parse($$5, $$6).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ji.b<ly<?>> $$2 = this.d.e(mi.Y);
      return ep.a($$2.c_().map(alj::a), $$1);
   }
}
