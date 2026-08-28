import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class fj<T> implements ArgumentType<alf<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wy.b("advancement.advancementNotFound", $$0));
   final alf<? extends js<T>> g;

   public fj(alf<? extends js<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fj<T> a(alf<? extends js<T>> $$0) {
      return new fj<>($$0);
   }

   public static <T> alf<T> a(CommandContext<ej> $$0, String $$1, alf<js<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alf<?> $$4 = (alf<?>)$$0.getArgument($$1, alf.class);
      Optional<alf<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> js<T> a(CommandContext<ej> $$0, alf<? extends js<T>> $$1) {
      return ((ej)$$0.getSource()).l().ba().f($$1);
   }

   private static <T> jf.c<T> b(CommandContext<ej> $$0, String $$1, alf<js<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alf<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jf.c<ejf<?, ?>> a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mh.aL, b);
   }

   public static jf.c<eri> b(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mh.be, c);
   }

   public static jf.c<ess> c(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mh.bf, d);
   }

   public static deg<?> d(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      dei $$2 = ((ej)$$0.getSource()).l().aI();
      alf<deb<?>> $$3 = a($$0, $$1, mh.bu, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static aj e(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      alf<ai> $$2 = a($$0, $$1, mh.bt, f);
      aj $$3 = ((ej)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public alf<T> a(StringReader $$0) throws CommandSyntaxException {
      alg $$1 = alg.a($$0);
      return alf.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eo $$2 ? $$2.a(this.g, eo.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ig<fj<T>, fj.a<T>.a> {
      public void a(fj.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fj.a<T>.a a(vu $$0) {
         return new fj.a.a($$0.r());
      }

      public void a(fj.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fj.a<T>.a a(fj<T> $$0) {
         return new fj.a.a($$0.g);
      }

      public final class a implements ig.a<fj<T>> {
         final alf<? extends js<T>> b;

         a(final alf<? extends js<T>> $$1) {
            this.b = $$1;
         }

         public fj<T> a(ef $$0) {
            return new fj<>(this.b);
         }

         @Override
         public ig<fj<T>, ?> a() {
            return a.this;
         }
      }
   }
}
