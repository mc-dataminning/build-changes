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

public class fj<T> implements ArgumentType<alh<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xa.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xa.b("advancement.advancementNotFound", $$0));
   final alh<? extends js<T>> g;

   public fj(alh<? extends js<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fj<T> a(alh<? extends js<T>> $$0) {
      return new fj<>($$0);
   }

   public static <T> alh<T> a(CommandContext<ej> $$0, String $$1, alh<js<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alh<?> $$4 = (alh<?>)$$0.getArgument($$1, alh.class);
      Optional<alh<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> js<T> a(CommandContext<ej> $$0, alh<? extends js<T>> $$1) {
      return ((ej)$$0.getSource()).l().ba().f($$1);
   }

   private static <T> jf.c<T> b(CommandContext<ej> $$0, String $$1, alh<js<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alh<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jf.c<ejv<?, ?>> a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mh.aL, b);
   }

   public static jf.c<esb> b(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mh.be, c);
   }

   public static jf.c<etl> c(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mh.bf, d);
   }

   public static deu<?> d(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      dew $$2 = ((ej)$$0.getSource()).l().aI();
      alh<dep<?>> $$3 = a($$0, $$1, mh.bv, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static aj e(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      alh<ai> $$2 = a($$0, $$1, mh.bu, f);
      aj $$3 = ((ej)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public alh<T> a(StringReader $$0) throws CommandSyntaxException {
      ali $$1 = ali.a($$0);
      return alh.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eo $$2 ? $$2.a(this.g, eo.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ig<fj<T>, fj.a<T>.a> {
      public void a(fj.a<T>.a $$0, vw $$1) {
         $$1.b($$0.b);
      }

      public fj.a<T>.a a(vw $$0) {
         return new fj.a.a($$0.r());
      }

      public void a(fj.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fj.a<T>.a a(fj<T> $$0) {
         return new fj.a.a($$0.g);
      }

      public final class a implements ig.a<fj<T>> {
         final alh<? extends js<T>> b;

         a(final alh<? extends js<T>> $$1) {
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
