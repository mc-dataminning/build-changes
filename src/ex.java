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

public class ex<T> implements ArgumentType<ex.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wi.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final ip<T> d;
   final aju<? extends ja<T>> e;

   public ex(dr $$0, aju<? extends ja<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> ex<T> a(dr $$0, aju<? extends ja<T>> $$1) {
      return new ex<>($$0, $$1);
   }

   public static <T> ex.c<T> a(CommandContext<dv> $$0, String $$1, aju<ja<T>> $$2) throws CommandSyntaxException {
      ex.c<?> $$3 = (ex.c<?>)$$0.getArgument($$1, ex.c.class);
      Optional<ex.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            aju<?> $$2x = $$1xx.h();
            return eu.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            avt<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public ex.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ajv $$2 = ajv.a($$0);
            avt<T> $$3 = avt.a(this.e, $$2);
            ir.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new ex.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ajv $$6 = ajv.a($$0);
         aju<T> $$7 = aju.a(this.e, $$6);
         in.c<T> $$8 = this.d.a($$7).orElseThrow(() -> eu.a.createWithContext($$0, $$6, this.e.a()));
         return new ex.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ea.a(this.d.e().map(avt::b), $$1, "#");
      return ea.a(this.d.c().map(aju::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hp<ex<T>, ex.a<T>.a> {
      public void a(ex.a<T>.a $$0, vi $$1) {
         $$1.b($$0.b);
      }

      public ex.a<T>.a a(vi $$0) {
         return new ex.a.a($$0.r());
      }

      public void a(ex.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ex.a<T>.a a(ex<T> $$0) {
         return new ex.a.a($$0.e);
      }

      public final class a implements hp.a<ex<T>> {
         final aju<? extends ja<T>> b;

         a(aju<? extends ja<T>> $$1) {
            this.b = $$1;
         }

         public ex<T> a(dr $$0) {
            return new ex<>($$0, this.b);
         }

         @Override
         public hp<ex<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(in.c<T> a) implements ex.c<T> {
      @Override
      public Either<in.c<T>, ir.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ex.c<E>> a(aju<? extends ja<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((ex.c<E>)this) : Optional.empty();
      }

      public boolean a(in<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public in.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<in<T>> {
      Either<in.c<T>, ir.c<T>> a();

      <E> Optional<ex.c<E>> a(aju<? extends ja<E>> var1);

      String b();
   }

   static record d<T>(ir.c<T> a) implements ex.c<T> {
      @Override
      public Either<in.c<T>, ir.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ex.c<E>> a(aju<? extends ja<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((ex.c<E>)this) : Optional.empty();
      }

      public boolean a(in<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public ir.c<T> c() {
         return this.a;
      }
   }
}
