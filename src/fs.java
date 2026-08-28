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

public class fs<T> implements ArgumentType<fs.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jk<T> d;
   final ald<? extends jv<T>> e;

   public fs(el $$0, ald<? extends jv<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fs<T> a(el $$0, ald<? extends jv<T>> $$1) {
      return new fs<>($$0, $$1);
   }

   public static <T> fs.c<T> a(CommandContext<ep> $$0, String $$1, ald<jv<T>> $$2) throws CommandSyntaxException {
      fs.c<?> $$3 = (fs.c<?>)$$0.getArgument($$1, fs.c.class);
      Optional<fs.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            ald<?> $$2x = $$1xx.h();
            return fo.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axe<?> $$2x = $$1xx.g();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fs.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ale $$2 = ale.a($$0);
            axe<T> $$3 = axe.a(this.e, $$2);
            jm.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fs.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ale $$6 = ale.a($$0);
         ald<T> $$7 = ald.a(this.e, $$6);
         ji.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fo.a.createWithContext($$0, $$6, this.e.a()));
         return new fs.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      eu.a(this.d.e().map(axe::b), $$1, "#");
      return eu.a(this.d.c().map(ald::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ik<fs<T>, fs.a<T>.a> {
      public void a(fs.a<T>.a $$0, wl $$1) {
         $$1.b($$0.b);
      }

      public fs.a<T>.a a(wl $$0) {
         return new fs.a.a($$0.r());
      }

      public void a(fs.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fs.a<T>.a a(fs<T> $$0) {
         return new fs.a.a($$0.e);
      }

      public final class a implements ik.a<fs<T>> {
         final ald<? extends jv<T>> b;

         a(final ald<? extends jv<T>> $$1) {
            this.b = $$1;
         }

         public fs<T> a(el $$0) {
            return new fs<>($$0, this.b);
         }

         @Override
         public ik<fs<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ji.c<T> a) implements fs.c<T> {
      @Override
      public Either<ji.c<T>, jm.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fs.c<E>> a(ald<? extends jv<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fs.c<E>)this) : Optional.empty();
      }

      public boolean a(ji<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public ji.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ji<T>> {
      Either<ji.c<T>, jm.c<T>> a();

      <E> Optional<fs.c<E>> a(ald<? extends jv<E>> var1);

      String b();
   }

   static record d<T>(jm.c<T> a) implements fs.c<T> {
      @Override
      public Either<ji.c<T>, jm.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fs.c<E>> a(ald<? extends jv<E>> $$0) {
         return this.a.g().c($$0) ? Optional.of((fs.c<E>)this) : Optional.empty();
      }

      public boolean a(ji<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.g().b();
      }

      public jm.c<T> c() {
         return this.a;
      }
   }
}
