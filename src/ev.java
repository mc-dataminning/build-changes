import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class ev<T> implements ArgumentType<ev.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final ahc<? extends it<T>> b;

   public ev(ahc<? extends it<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ev<T> a(ahc<? extends it<T>> $$0) {
      return new ev<>($$0);
   }

   public static <T> ev.c<T> a(CommandContext<ds> $$0, String $$1, ahc<it<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ev.c<?> $$4 = (ev.c<?>)$$0.getArgument($$1, ev.c.class);
      Optional<ev.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ev.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ahd $$2 = ahd.a($$0);
            return new ev.d<>(asq.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ahd $$4 = ahd.a($$0);
         return new ev.b<>(ahc.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dx $$2 ? $$2.a(this.b, dx.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hj<ev<T>, ev.a<T>.a> {
      public void a(ev.a<T>.a $$0, ug $$1) {
         $$1.b($$0.b);
      }

      public ev.a<T>.a a(ug $$0) {
         return new ev.a.a($$0.u());
      }

      public void a(ev.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ev.a<T>.a a(ev<T> $$0) {
         return new ev.a.a($$0.b);
      }

      public final class a implements hj.a<ev<T>> {
         final ahc<? extends it<T>> b;

         a(ahc<? extends it<T>> $$1) {
            this.b = $$1;
         }

         public ev<T> a(dn $$0) {
            return new ev<>(this.b);
         }

         @Override
         public hj<ev<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ahc<T> a) implements ev.c<T> {
      @Override
      public Either<ahc<T>, asq<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ev.c<E>> a(ahc<? extends it<E>> $$0) {
         return this.a.c($$0).map(ev.b::new);
      }

      public boolean a(ih<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public ahc<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ih<T>> {
      Either<ahc<T>, asq<T>> a();

      <E> Optional<ev.c<E>> a(ahc<? extends it<E>> var1);

      String b();
   }

   static record d<T>(asq<T> a) implements ev.c<T> {
      @Override
      public Either<ahc<T>, asq<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ev.c<E>> a(ahc<? extends it<E>> $$0) {
         return this.a.d($$0).map(ev.d::new);
      }

      public boolean a(ih<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public asq<T> c() {
         return this.a;
      }
   }
}
