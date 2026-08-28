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

public class fu implements ArgumentType<lt> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wv.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wv.b("particle.invalidOptions", $$0));
   private final ju.a d;

   public fu(et $$0) {
      this.d = $$0;
   }

   public static fu a(et $$0) {
      return new fu($$0);
   }

   public static lt a(CommandContext<ex> $$0, String $$1) {
      return (lt)$$0.getArgument($$1, lt.class);
   }

   public lt a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lt a(StringReader $$0, ju.a $$1) throws CommandSyntaxException {
      lu<?> $$2 = a($$0, $$1.e(me.Y));
      return a($$0, (lu<lt>)$$2, $$1);
   }

   private static lu<?> a(StringReader $$0, ju<lu<?>> $$1) throws CommandSyntaxException {
      ald $$2 = ald.a($$0);
      alc<lu<?>> $$3 = alc.a(me.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lt> T a(StringReader $$0, lu<T> $$1, ju.a $$2) throws CommandSyntaxException {
      tw $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new uu($$0).f();
      } else {
         $$3 = new tw();
      }

      return (T)$$1.c().codec().parse($$2.a(uk.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ju.b<lu<?>> $$2 = this.d.e(me.Y);
      return fc.a($$2.c_().map(alc::a), $$1);
   }
}
