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

public class ft implements ArgumentType<lq> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xl.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xl.b("particle.invalidOptions", $$0));
   private final js.a d;

   public ft(es $$0) {
      this.d = $$0;
   }

   public static ft a(es $$0) {
      return new ft($$0);
   }

   public static lq a(CommandContext<ew> $$0, String $$1) {
      return (lq)$$0.getArgument($$1, lq.class);
   }

   public lq a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lq a(StringReader $$0, js.a $$1) throws CommandSyntaxException {
      lr<?> $$2 = a($$0, $$1.d(ma.Y));
      return a($$0, (lr<lq>)$$2, $$1);
   }

   private static lr<?> a(StringReader $$0, js<lr<?>> $$1) throws CommandSyntaxException {
      all $$2 = all.a($$0);
      alk<lr<?>> $$3 = alk.a(ma.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lq> T a(StringReader $$0, lr<T> $$1, js.a $$2) throws CommandSyntaxException {
      un $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new vl($$0).f();
      } else {
         $$3 = new un();
      }

      return (T)$$1.c().codec().parse($$2.a(vb.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      js.b<lr<?>> $$2 = this.d.d(ma.Y);
      return fb.a($$2.c_().map(alk::a), $$1);
   }
}
