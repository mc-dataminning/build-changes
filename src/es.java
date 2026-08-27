import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class es<T> implements ArgumentType<es.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> te.a("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final hh<T> d;
   final aeo<? extends hs<T>> e;

   public es(dm $$0, aeo<? extends hs<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> es<T> a(dm $$0, aeo<? extends hs<T>> $$1) {
      return new es<>($$0, $$1);
   }

   public static <T> es.c<T> a(CommandContext<ds> $$0, String $$1, aeo<hs<T>> $$2) throws CommandSyntaxException {
      es.c<?> $$3 = (es.c<?>)$$0.getArgument($$1, es.c.class);
      Optional<es.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            aeo<?> $$2x = $$1xx.g();
            return ep.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            apy<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public es.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aep $$2 = aep.a($$0);
            apy<T> $$3 = apy.a(this.e, $$2);
            hj.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new es.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         aep $$6 = aep.a($$0);
         aeo<T> $$7 = aeo.a(this.e, $$6);
         hf.c<T> $$8 = this.d.a($$7).orElseThrow(() -> ep.a.create($$6, this.e.a()));
         return new es.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      dv.a(this.d.e().map(apy::b), $$1, "#");
      return dv.a(this.d.c().map(aeo::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gh<es<T>, es.a<T>.a> {
      public void a(es.a<T>.a $$0, sh $$1) {
         $$1.b($$0.b);
      }

      public es.a<T>.a a(sh $$0) {
         return new es.a.a($$0.t());
      }

      public void a(es.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public es.a<T>.a a(es<T> $$0) {
         return new es.a.a($$0.e);
      }

      public final class a implements gh.a<es<T>> {
         final aeo<? extends hs<T>> b;

         a(aeo<? extends hs<T>> $$1) {
            this.b = $$1;
         }

         public es<T> a(dm $$0) {
            return new es<>($$0, this.b);
         }

         @Override
         public gh<es<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(hf.c<T> a) implements es.c<T> {
      @Override
      public Either<hf.c<T>, hj.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<es.c<E>> a(aeo<? extends hs<E>> $$0) {
         return this.a.g().b($$0) ? Optional.of((es.c<E>)this) : Optional.empty();
      }

      public boolean a(hf<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.g().a().toString();
      }

      public hf.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<hf<T>> {
      Either<hf.c<T>, hj.c<T>> a();

      <E> Optional<es.c<E>> a(aeo<? extends hs<E>> var1);

      String b();
   }

   static record d<T>(hj.c<T> a) implements es.c<T> {
      @Override
      public Either<hf.c<T>, hj.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<es.c<E>> a(aeo<? extends hs<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((es.c<E>)this) : Optional.empty();
      }

      public boolean a(hf<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public hj.c<T> c() {
         return this.a;
      }
   }
}
