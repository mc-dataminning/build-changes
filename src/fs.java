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

public class fs implements ArgumentType<lo> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("particle.invalidOptions", $$0));
   private final jr.a d;

   public fs(er $$0) {
      this.d = $$0;
   }

   public static fs a(er $$0) {
      return new fs($$0);
   }

   public static lo a(CommandContext<ev> $$0, String $$1) {
      return (lo)$$0.getArgument($$1, lo.class);
   }

   public lo a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lo a(StringReader $$0, jr.a $$1) throws CommandSyntaxException {
      lp<?> $$2 = a($$0, $$1.d(ly.Y));
      return a($$0, (lp<lo>)$$2, $$1);
   }

   private static lp<?> a(StringReader $$0, jr<lp<?>> $$1) throws CommandSyntaxException {
      alh $$2 = alh.a($$0);
      alg<lp<?>> $$3 = alg.a(ly.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lo> T a(StringReader $$0, lp<T> $$1, jr.a $$2) throws CommandSyntaxException {
      uj $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new vh($$0).f();
      } else {
         $$3 = new uj();
      }

      return (T)$$1.c().codec().parse($$2.a(ux.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jr.b<lp<?>> $$2 = this.d.d(ly.Y);
      return fa.a($$2.c_().map(alg::a), $$1);
   }
}
