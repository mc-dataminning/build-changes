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

public class fr implements ArgumentType<lm> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("particle.invalidOptions", $$0));
   private final jq.a d;

   public fr(eq $$0) {
      this.d = $$0;
   }

   public static fr a(eq $$0) {
      return new fr($$0);
   }

   public static lm a(CommandContext<eu> $$0, String $$1) {
      return (lm)$$0.getArgument($$1, lm.class);
   }

   public lm a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lm a(StringReader $$0, jq.a $$1) throws CommandSyntaxException {
      ln<?> $$2 = a($$0, $$1.d(lw.Y));
      return a($$0, (ln<lm>)$$2, $$1);
   }

   private static ln<?> a(StringReader $$0, jq<ln<?>> $$1) throws CommandSyntaxException {
      ale $$2 = ale.a($$0);
      ald<ln<?>> $$3 = ald.a(lw.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lm> T a(StringReader $$0, ln<T> $$1, jq.a $$2) throws CommandSyntaxException {
      ug $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new ve($$0).f();
      } else {
         $$3 = new ug();
      }

      return (T)$$1.c().codec().parse($$2.a(uu.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jq.b<ln<?>> $$2 = this.d.d(lw.Y);
      return ez.a($$2.c_().map(ald::a), $$1);
   }
}
