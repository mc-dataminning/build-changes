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
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("particle.invalidOptions", $$0));
   private final jh.a d;
   private static final uz<Object> e = uz.a(JavaOps.INSTANCE);

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
      return a(JavaOps.INSTANCE, e, $$0, (lx<lw>)$$2, $$1);
   }

   private static lx<?> a(StringReader $$0, jh<lx<?>> $$1) throws CommandSyntaxException {
      ali $$2 = ali.a($$0);
      alh<lx<?>> $$3 = alh.a(mh.Y, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends lw, O> T a(DynamicOps<O> $$0, uz<O> $$1, StringReader $$2, lx<T> $$3, jh.a $$4) throws CommandSyntaxException {
      alg<O> $$5 = $$4.a($$0);
      O $$6;
      if ($$2.canRead() && $$2.peek() == '{') {
         $$6 = $$1.b($$2);
      } else {
         $$6 = $$5.emptyMap();
      }

      return (T)$$3.c().codec().parse($$5, $$6).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jh.b<lx<?>> $$2 = this.d.e(mh.Y);
      return eo.a($$2.c_().map(alh::a), $$1);
   }
}
