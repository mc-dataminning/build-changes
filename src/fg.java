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

public class fg implements ArgumentType<lw> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("particle.invalidOptions", $$0));
   private final jh.a d;

   public fg(ef $$0) {
      this.d = $$0;
   }

   public static fg a(ef $$0) {
      return new fg($$0);
   }

   public static lw a(CommandContext<ej> $$0, String $$1) {
      return (lw)$$0.getArgument($$1, lw.class);
   }

   public lw a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static lw a(StringReader $$0, jh.a $$1) throws CommandSyntaxException {
      lx<?> $$2 = a($$0, $$1.e(mh.Y));
      return a(JavaOps.INSTANCE, $$0, (lx<lw>)$$2, $$1);
   }

   private static lx<?> a(StringReader $$0, jh<lx<?>> $$1) throws CommandSyntaxException {
      alg $$2 = alg.a($$0);
      alf<lx<?>> $$3 = alf.a(mh.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lw, O> T a(DynamicOps<O> $$0, StringReader $$1, lx<T> $$2, jh.a $$3) throws CommandSyntaxException {
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
      jh.b<lx<?>> $$2 = this.d.e(mh.Y);
      return eo.a($$2.c_().map(alf::a), $$1);
   }
}
