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

public class fh<T> implements ArgumentType<fh.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final akg<? extends jj<T>> b;

   public fh(akg<? extends jj<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fh<T> a(akg<? extends jj<T>> $$0) {
      return new fh<>($$0);
   }

   public static <T> fh.c<T> a(CommandContext<ed> $$0, String $$1, akg<jj<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fh.c<?> $$4 = (fh.c<?>)$$0.getArgument($$1, fh.c.class);
      Optional<fh.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fh.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akh $$2 = akh.a($$0);
            return new fh.d<>(awg.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         akh $$4 = akh.a($$0);
         return new fh.b<>(akg.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ei $$2 ? $$2.a(this.b, ei.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hx<fh<T>, fh.a<T>.a> {
      public void a(fh.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fh.a<T>.a a(vu $$0) {
         return new fh.a.a($$0.r());
      }

      public void a(fh.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fh.a<T>.a a(fh<T> $$0) {
         return new fh.a.a($$0.b);
      }

      public final class a implements hx.a<fh<T>> {
         final akg<? extends jj<T>> b;

         a(akg<? extends jj<T>> $$1) {
            this.b = $$1;
         }

         public fh<T> a(dz $$0) {
            return new fh<>(this.b);
         }

         @Override
         public hx<fh<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(akg<T> a) implements fh.c<T> {
      @Override
      public Either<akg<T>, awg<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fh.c<E>> a(akg<? extends jj<E>> $$0) {
         return this.a.d($$0).map(fh.b::new);
      }

      public boolean a(iw<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public akg<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<iw<T>> {
      Either<akg<T>, awg<T>> a();

      <E> Optional<fh.c<E>> a(akg<? extends jj<E>> var1);

      String b();
   }

   static record d<T>(awg<T> a) implements fh.c<T> {
      @Override
      public Either<akg<T>, awg<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fh.c<E>> a(akg<? extends jj<E>> $$0) {
         return this.a.d($$0).map(fh.d::new);
      }

      public boolean a(iw<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public awg<T> c() {
         return this.a;
      }
   }
}
