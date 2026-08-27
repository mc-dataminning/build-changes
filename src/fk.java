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

public class fk<T> implements ArgumentType<fk.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jc<T> d;
   final aks<? extends jn<T>> e;

   public fk(ed $$0, aks<? extends jn<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fk<T> a(ed $$0, aks<? extends jn<T>> $$1) {
      return new fk<>($$0, $$1);
   }

   public static <T> fk.c<T> a(CommandContext<eh> $$0, String $$1, aks<jn<T>> $$2) throws CommandSyntaxException {
      fk.c<?> $$3 = (fk.c<?>)$$0.getArgument($$1, fk.c.class);
      Optional<fk.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            aks<?> $$2x = $$1xx.h();
            return fg.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            awt<?> $$2x = $$1xx.g();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fk.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akt $$2 = akt.a($$0);
            awt<T> $$3 = awt.a(this.e, $$2);
            je.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fk.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         akt $$6 = akt.a($$0);
         aks<T> $$7 = aks.a(this.e, $$6);
         ja.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fg.a.createWithContext($$0, $$6, this.e.a()));
         return new fk.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      em.a(this.d.e().map(awt::b), $$1, "#");
      return em.a(this.d.c().map(aks::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ib<fk<T>, fk.a<T>.a> {
      public void a(fk.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fk.a<T>.a a(we $$0) {
         return new fk.a.a($$0.r());
      }

      public void a(fk.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fk.a<T>.a a(fk<T> $$0) {
         return new fk.a.a($$0.e);
      }

      public final class a implements ib.a<fk<T>> {
         final aks<? extends jn<T>> b;

         a(aks<? extends jn<T>> $$1) {
            this.b = $$1;
         }

         public fk<T> a(ed $$0) {
            return new fk<>($$0, this.b);
         }

         @Override
         public ib<fk<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ja.c<T> a) implements fk.c<T> {
      @Override
      public Either<ja.c<T>, je.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fk.c<E>> a(aks<? extends jn<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fk.c<E>)this) : Optional.empty();
      }

      public boolean a(ja<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public ja.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ja<T>> {
      Either<ja.c<T>, je.c<T>> a();

      <E> Optional<fk.c<E>> a(aks<? extends jn<E>> var1);

      String b();
   }

   static record d<T>(je.c<T> a) implements fk.c<T> {
      @Override
      public Either<ja.c<T>, je.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fk.c<E>> a(aks<? extends jn<E>> $$0) {
         return this.a.g().c($$0) ? Optional.of((fk.c<E>)this) : Optional.empty();
      }

      public boolean a(ja<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.g().b();
      }

      public je.c<T> c() {
         return this.a;
      }
   }
}
