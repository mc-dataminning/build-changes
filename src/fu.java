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

public class fu implements ArgumentType<lr> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wo.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("particle.invalidOptions", $$0));
   private final jt.a d;

   public fu(et $$0) {
      this.d = $$0;
   }

   public static fu a(et $$0) {
      return new fu($$0);
   }

   public static lr a(CommandContext<ex> $$0, String $$1) {
      return (lr)$$0.getArgument($$1, lr.class);
   }

   public lr a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lr a(StringReader $$0, jt.a $$1) throws CommandSyntaxException {
      ls<?> $$2 = a($$0, $$1.d(mc.Y));
      return a($$0, (ls<lr>)$$2, $$1);
   }

   private static ls<?> a(StringReader $$0, jt<ls<?>> $$1) throws CommandSyntaxException {
      aku $$2 = aku.a($$0);
      akt<ls<?>> $$3 = akt.a(mc.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lr> T a(StringReader $$0, ls<T> $$1, jt.a $$2) throws CommandSyntaxException {
      tq $$3;
      if ($$0.canRead() && $$0.peek() == '{') {
         $$3 = new uo($$0).f();
      } else {
         $$3 = new tq();
      }

      return (T)$$1.c().codec().parse($$2.a(ue.a), $$3).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jt.b<ls<?>> $$2 = this.d.d(mc.Y);
      return fc.a($$2.c_().map(akt::a), $$1);
   }
}
