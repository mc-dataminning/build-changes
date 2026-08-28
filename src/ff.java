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

public class ff implements ArgumentType<lv> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("particle.invalidOptions", $$0));
   private final jg.a d;

   public ff(ee $$0) {
      this.d = $$0;
   }

   public static ff a(ee $$0) {
      return new ff($$0);
   }

   public static lv a(CommandContext<ei> $$0, String $$1) {
      return (lv)$$0.getArgument($$1, lv.class);
   }

   public lv a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lv a(StringReader $$0, jg.a $$1) throws CommandSyntaxException {
      lw<?> $$2 = a($$0, $$1.e(mg.Y));
      return a(JavaOps.INSTANCE, $$0, (lw<lv>)$$2, $$1);
   }

   private static lw<?> a(StringReader $$0, jg<lw<?>> $$1) throws CommandSyntaxException {
      alg $$2 = alg.a($$0);
      alf<lw<?>> $$3 = alf.a(mg.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lv, O> T a(DynamicOps<O> $$0, StringReader $$1, lw<T> $$2, jg.a $$3) throws CommandSyntaxException {
      ale<O> $$4 = $$3.a($$0);
      O $$5;
      if ($$1.canRead() && $$1.peek() == '{') {
         $$5 = ux.b($$4, $$1);
      } else {
         $$5 = $$4.emptyMap();
      }

      return (T)$$2.c().codec().parse($$4, $$5).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jg.b<lw<?>> $$2 = this.d.e(mg.Y);
      return en.a($$2.c_().map(alf::a), $$1);
   }
}
