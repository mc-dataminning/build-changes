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

public class ft<T> implements ArgumentType<ft.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jl<T> d;
   final akj<? extends jw<T>> e;

   public ft(em $$0, akj<? extends jw<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> ft<T> a(em $$0, akj<? extends jw<T>> $$1) {
      return new ft<>($$0, $$1);
   }

   public static <T> ft.c<T> a(CommandContext<eq> $$0, String $$1, akj<jw<T>> $$2) throws CommandSyntaxException {
      ft.c<?> $$3 = (ft.c<?>)$$0.getArgument($$1, ft.c.class);
      Optional<ft.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            akj<?> $$2x = $$1xx.h();
            return fp.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            awm<?> $$2x = $$1xx.g();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public ft.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akk $$2 = akk.a($$0);
            awm<T> $$3 = awm.a(this.e, $$2);
            jn.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new ft.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         akk $$6 = akk.a($$0);
         akj<T> $$7 = akj.a(this.e, $$6);
         jj.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fp.a.createWithContext($$0, $$6, this.e.a()));
         return new ft.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ev.a(this.d.e().map(awm::b), $$1, "#");
      return ev.a(this.d.c().map(akj::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements il<ft<T>, ft.a<T>.a> {
      public void a(ft.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public ft.a<T>.a a(vr $$0) {
         return new ft.a.a($$0.r());
      }

      public void a(ft.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ft.a<T>.a a(ft<T> $$0) {
         return new ft.a.a($$0.e);
      }

      public final class a implements il.a<ft<T>> {
         final akj<? extends jw<T>> b;

         a(final akj<? extends jw<T>> $$1) {
            this.b = $$1;
         }

         public ft<T> a(em $$0) {
            return new ft<>($$0, this.b);
         }

         @Override
         public il<ft<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jj.c<T> a) implements ft.c<T> {
      @Override
      public Either<jj.c<T>, jn.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ft.c<E>> a(akj<? extends jw<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((ft.c<E>)this) : Optional.empty();
      }

      public boolean a(jj<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jj.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jj<T>> {
      Either<jj.c<T>, jn.c<T>> a();

      <E> Optional<ft.c<E>> a(akj<? extends jw<E>> var1);

      String b();
   }

   static record d<T>(jn.c<T> a) implements ft.c<T> {
      @Override
      public Either<jj.c<T>, jn.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ft.c<E>> a(akj<? extends jw<E>> $$0) {
         return this.a.g().c($$0) ? Optional.of((ft.c<E>)this) : Optional.empty();
      }

      public boolean a(jj<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.g().b();
      }

      public jn.c<T> c() {
         return this.a;
      }
   }
}
