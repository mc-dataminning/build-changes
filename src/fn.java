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

public class fn<T> implements ArgumentType<fn.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xg.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final ji<T> d;
   final alq<? extends jt<T>> e;

   public fn(eg $$0, alq<? extends jt<T>> $$1) {
      this.e = $$1;
      this.d = $$0.e($$1);
   }

   public static <T> fn<T> a(eg $$0, alq<? extends jt<T>> $$1) {
      return new fn<>($$0, $$1);
   }

   public static <T> fn.c<T> a(CommandContext<ek> $$0, String $$1, alq<jt<T>> $$2) throws CommandSyntaxException {
      fn.c<?> $$3 = (fn.c<?>)$$0.getArgument($$1, fn.c.class);
      Optional<fn.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            alq<?> $$2x = $$1xx.h();
            return fj.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            ayc<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fn.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alr $$2 = alr.a($$0);
            ayc<T> $$3 = ayc.a(this.e, $$2);
            jk.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fn.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         alr $$6 = alr.a($$0);
         alq<T> $$7 = alq.a(this.e, $$6);
         jg.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fj.a.createWithContext($$0, $$6, this.e.a()));
         return new fn.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ep.a(this.d.f().map(ayc::b), $$1, "#");
      return ep.a(this.d.c_().map(alq::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ih<fn<T>, fn.a<T>.a> {
      public void a(fn.a<T>.a $$0, vy $$1) {
         $$1.b($$0.b);
      }

      public fn.a<T>.a a(vy $$0) {
         return new fn.a.a($$0.r());
      }

      public void a(fn.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fn.a<T>.a a(fn<T> $$0) {
         return new fn.a.a($$0.e);
      }

      public final class a implements ih.a<fn<T>> {
         final alq<? extends jt<T>> b;

         a(final alq<? extends jt<T>> $$1) {
            this.b = $$1;
         }

         public fn<T> a(eg $$0) {
            return new fn<>($$0, this.b);
         }

         @Override
         public ih<fn<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jg.c<T> a) implements fn.c<T> {
      @Override
      public Either<jg.c<T>, jk.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fn.c<E>> a(alq<? extends jt<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fn.c<E>)this) : Optional.empty();
      }

      public boolean a(jg<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jg.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jg<T>> {
      Either<jg.c<T>, jk.c<T>> a();

      <E> Optional<fn.c<E>> a(alq<? extends jt<E>> var1);

      String b();
   }

   static record d<T>(jk.c<T> a) implements fn.c<T> {
      @Override
      public Either<jg.c<T>, jk.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fn.c<E>> a(alq<? extends jt<E>> $$0) {
         return this.a.h().d($$0) ? Optional.of((fn.c<E>)this) : Optional.empty();
      }

      public boolean a(jg<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public jk.c<T> c() {
         return this.a;
      }
   }
}
