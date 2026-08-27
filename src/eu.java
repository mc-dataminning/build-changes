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

public class eu<T> implements ArgumentType<eu.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vd.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vd.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final ij<T> d;
   final ahc<? extends it<T>> e;

   public eu(dn $$0, ahc<? extends it<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> eu<T> a(dn $$0, ahc<? extends it<T>> $$1) {
      return new eu<>($$0, $$1);
   }

   public static <T> eu.c<T> a(CommandContext<ds> $$0, String $$1, ahc<it<T>> $$2) throws CommandSyntaxException {
      eu.c<?> $$3 = (eu.c<?>)$$0.getArgument($$1, eu.c.class);
      Optional<eu.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            ahc<?> $$2x = $$1xx.g();
            return er.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            asq<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public eu.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ahd $$2 = ahd.a($$0);
            asq<T> $$3 = asq.a(this.e, $$2);
            il.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new eu.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ahd $$6 = ahd.a($$0);
         ahc<T> $$7 = ahc.a(this.e, $$6);
         ih.c<T> $$8 = this.d.a($$7).orElseThrow(() -> er.a.create($$6, this.e.a()));
         return new eu.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      dx.a(this.d.e().map(asq::b), $$1, "#");
      return dx.a(this.d.c().map(ahc::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hj<eu<T>, eu.a<T>.a> {
      public void a(eu.a<T>.a $$0, ug $$1) {
         $$1.b($$0.b);
      }

      public eu.a<T>.a a(ug $$0) {
         return new eu.a.a($$0.u());
      }

      public void a(eu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eu.a<T>.a a(eu<T> $$0) {
         return new eu.a.a($$0.e);
      }

      public final class a implements hj.a<eu<T>> {
         final ahc<? extends it<T>> b;

         a(ahc<? extends it<T>> $$1) {
            this.b = $$1;
         }

         public eu<T> a(dn $$0) {
            return new eu<>($$0, this.b);
         }

         @Override
         public hj<eu<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ih.c<T> a) implements eu.c<T> {
      @Override
      public Either<ih.c<T>, il.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<eu.c<E>> a(ahc<? extends it<E>> $$0) {
         return this.a.g().b($$0) ? Optional.of((eu.c<E>)this) : Optional.empty();
      }

      public boolean a(ih<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.g().a().toString();
      }

      public ih.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ih<T>> {
      Either<ih.c<T>, il.c<T>> a();

      <E> Optional<eu.c<E>> a(ahc<? extends it<E>> var1);

      String b();
   }

   static record d<T>(il.c<T> a) implements eu.c<T> {
      @Override
      public Either<ih.c<T>, il.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<eu.c<E>> a(ahc<? extends it<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((eu.c<E>)this) : Optional.empty();
      }

      public boolean a(ih<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public il.c<T> c() {
         return this.a;
      }
   }
}
