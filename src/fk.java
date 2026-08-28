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

public class fk<T> implements ArgumentType<alq<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xg.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xg.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xg.b("advancement.advancementNotFound", $$0));
   final alq<? extends jt<T>> g;

   public fk(alq<? extends jt<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fk<T> a(alq<? extends jt<T>> $$0) {
      return new fk<>($$0);
   }

   public static <T> alq<T> a(CommandContext<ek> $$0, String $$1, alq<jt<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alq<?> $$4 = (alq<?>)$$0.getArgument($$1, alq.class);
      Optional<alq<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> jt<T> a(CommandContext<ek> $$0, alq<? extends jt<T>> $$1) {
      return ((ek)$$0.getSource()).l().ba().f($$1);
   }

   private static <T> jg.c<T> b(CommandContext<ek> $$0, String $$1, alq<jt<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alq<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jg.c<ekh<?, ?>> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mi.aL, b);
   }

   public static jg.c<esn> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mi.be, c);
   }

   public static jg.c<etx> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mi.bf, d);
   }

   public static dfg<?> d(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      dfi $$2 = ((ek)$$0.getSource()).l().aI();
      alq<dfb<?>> $$3 = a($$0, $$1, mi.bv, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static aj e(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      alq<ai> $$2 = a($$0, $$1, mi.bu, f);
      aj $$3 = ((ek)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public alq<T> a(StringReader $$0) throws CommandSyntaxException {
      alr $$1 = alr.a($$0);
      return alq.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ep $$2 ? $$2.a(this.g, ep.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ih<fk<T>, fk.a<T>.a> {
      public void a(fk.a<T>.a $$0, vy $$1) {
         $$1.b($$0.b);
      }

      public fk.a<T>.a a(vy $$0) {
         return new fk.a.a($$0.r());
      }

      public void a(fk.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fk.a<T>.a a(fk<T> $$0) {
         return new fk.a.a($$0.g);
      }

      public final class a implements ih.a<fk<T>> {
         final alq<? extends jt<T>> b;

         a(final alq<? extends jt<T>> $$1) {
            this.b = $$1;
         }

         public fk<T> a(eg $$0) {
            return new fk<>(this.b);
         }

         @Override
         public ih<fk<T>, ?> a() {
            return a.this;
         }
      }
   }
}
