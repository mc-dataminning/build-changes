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

public class fn implements ArgumentType<lh> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("particle.invalidOptions", $$0));
   private final jl.a d;

   public fn(em $$0) {
      this.d = $$0;
   }

   public static fn a(em $$0) {
      return new fn($$0);
   }

   public static lh a(CommandContext<eq> $$0, String $$1) {
      return (lh)$$0.getArgument($$1, lh.class);
   }

   public lh a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lh a(StringReader $$0, jl.a $$1) throws CommandSyntaxException {
      li<?> $$2 = a($$0, $$1.b(lr.X));
      return a($$0, (li<lh>)$$2, $$1);
   }

   private static li<?> a(StringReader $$0, jl<li<?>> $$1) throws CommandSyntaxException {
      akk $$2 = akk.a($$0);
      akj<li<?>> $$3 = akj.a(lr.X, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lh> T a(StringReader $$0, li<T> $$1, jl.a $$2) throws CommandSyntaxException {
      tx $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new uv($$0).f();
      } else {
         $$3 = new tx();
      }

      return (T)$$1.c().codec().parse($$2.a(ul.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jl.b<li<?>> $$2 = this.d.b(lr.X);
      return ev.a($$2.c().map(akj::a), $$1);
   }
}
