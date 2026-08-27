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

public class et<T> implements ArgumentType<et.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tm.a("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tm.a("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final hi<T> d;
   final aew<? extends ht<T>> e;

   public et(dn $$0, aew<? extends ht<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> et<T> a(dn $$0, aew<? extends ht<T>> $$1) {
      return new et<>($$0, $$1);
   }

   public static <T> et.c<T> a(CommandContext<dt> $$0, String $$1, aew<ht<T>> $$2) throws CommandSyntaxException {
      et.c<?> $$3 = (et.c<?>)$$0.getArgument($$1, et.c.class);
      Optional<et.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            aew<?> $$2x = $$1xx.g();
            return eq.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            aqi<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public et.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aex $$2 = aex.a($$0);
            aqi<T> $$3 = aqi.a(this.e, $$2);
            hk.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new et.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         aex $$6 = aex.a($$0);
         aew<T> $$7 = aew.a(this.e, $$6);
         hg.c<T> $$8 = this.d.a($$7).orElseThrow(() -> eq.a.create($$6, this.e.a()));
         return new et.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      dw.a(this.d.e().map(aqi::b), $$1, "#");
      return dw.a(this.d.c().map(aew::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gi<et<T>, et.a<T>.a> {
      public void a(et.a<T>.a $$0, sp $$1) {
         $$1.b($$0.b);
      }

      public et.a<T>.a a(sp $$0) {
         return new et.a.a($$0.t());
      }

      public void a(et.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public et.a<T>.a a(et<T> $$0) {
         return new et.a.a($$0.e);
      }

      public final class a implements gi.a<et<T>> {
         final aew<? extends ht<T>> b;

         a(aew<? extends ht<T>> $$1) {
            this.b = $$1;
         }

         public et<T> a(dn $$0) {
            return new et<>($$0, this.b);
         }

         @Override
         public gi<et<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(hg.c<T> a) implements et.c<T> {
      @Override
      public Either<hg.c<T>, hk.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<et.c<E>> a(aew<? extends ht<E>> $$0) {
         return this.a.g().b($$0) ? Optional.of((et.c<E>)this) : Optional.empty();
      }

      public boolean a(hg<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.g().a().toString();
      }

      public hg.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<hg<T>> {
      Either<hg.c<T>, hk.c<T>> a();

      <E> Optional<et.c<E>> a(aew<? extends ht<E>> var1);

      String b();
   }

   static record d<T>(hk.c<T> a) implements et.c<T> {
      @Override
      public Either<hg.c<T>, hk.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<et.c<E>> a(aew<? extends ht<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((et.c<E>)this) : Optional.empty();
      }

      public boolean a(hg<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public hk.c<T> c() {
         return this.a;
      }
   }
}
