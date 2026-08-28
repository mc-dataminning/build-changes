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

public class fl<T> implements ArgumentType<fl.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jg<T> d;
   final alf<? extends jr<T>> e;

   public fl(ee $$0, alf<? extends jr<T>> $$1) {
      this.e = $$1;
      this.d = $$0.e($$1);
   }

   public static <T> fl<T> a(ee $$0, alf<? extends jr<T>> $$1) {
      return new fl<>($$0, $$1);
   }

   public static <T> fl.c<T> a(CommandContext<ei> $$0, String $$1, alf<jr<T>> $$2) throws CommandSyntaxException {
      fl.c<?> $$3 = (fl.c<?>)$$0.getArgument($$1, fl.c.class);
      Optional<fl.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            alf<?> $$2x = $$1xx.h();
            return fh.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axr<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fl.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alg $$2 = alg.a($$0);
            axr<T> $$3 = axr.a(this.e, $$2);
            ji.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fl.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         alg $$6 = alg.a($$0);
         alf<T> $$7 = alf.a(this.e, $$6);
         je.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fh.a.createWithContext($$0, $$6, this.e.a()));
         return new fl.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      en.a(this.d.f().map(axr::b), $$1, "#");
      return en.a(this.d.c_().map(alf::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ie<fl<T>, fl.a<T>.a> {
      public void a(fl.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fl.a<T>.a a(vu $$0) {
         return new fl.a.a($$0.r());
      }

      public void a(fl.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fl.a<T>.a a(fl<T> $$0) {
         return new fl.a.a($$0.e);
      }

      public final class a implements ie.a<fl<T>> {
         final alf<? extends jr<T>> b;

         a(final alf<? extends jr<T>> $$1) {
            this.b = $$1;
         }

         public fl<T> a(ee $$0) {
            return new fl<>($$0, this.b);
         }

         @Override
         public ie<fl<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(je.c<T> a) implements fl.c<T> {
      @Override
      public Either<je.c<T>, ji.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fl.c<E>> a(alf<? extends jr<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fl.c<E>)this) : Optional.empty();
      }

      public boolean a(je<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public je.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<je<T>> {
      Either<je.c<T>, ji.c<T>> a();

      <E> Optional<fl.c<E>> a(alf<? extends jr<E>> var1);

      String b();
   }

   static record d<T>(ji.c<T> a) implements fl.c<T> {
      @Override
      public Either<je.c<T>, ji.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fl.c<E>> a(alf<? extends jr<E>> $$0) {
         return this.a.h().d($$0) ? Optional.of((fl.c<E>)this) : Optional.empty();
      }

      public boolean a(je<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public ji.c<T> c() {
         return this.a;
      }
   }
}
