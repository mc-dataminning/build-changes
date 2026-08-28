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

public class ft implements ArgumentType<lp> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xi.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("particle.invalidOptions", $$0));
   private final js.a d;

   public ft(es $$0) {
      this.d = $$0;
   }

   public static ft a(es $$0) {
      return new ft($$0);
   }

   public static lp a(CommandContext<ew> $$0, String $$1) {
      return (lp)$$0.getArgument($$1, lp.class);
   }

   public lp a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lp a(StringReader $$0, js.a $$1) throws CommandSyntaxException {
      lq<?> $$2 = a($$0, $$1.d(lz.Y));
      return a($$0, (lq<lp>)$$2, $$1);
   }

   private static lq<?> a(StringReader $$0, js<lq<?>> $$1) throws CommandSyntaxException {
      ali $$2 = ali.a($$0);
      alh<lq<?>> $$3 = alh.a(lz.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lp> T a(StringReader $$0, lq<T> $$1, js.a $$2) throws CommandSyntaxException {
      uk $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new vi($$0).f();
      } else {
         $$3 = new uk();
      }

      return (T)$$1.c().codec().parse($$2.a(uy.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      js.b<lq<?>> $$2 = this.d.d(lz.Y);
      return fb.a($$2.c_().map(alh::a), $$1);
   }
}
