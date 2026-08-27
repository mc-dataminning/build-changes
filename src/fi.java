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

public class fi<T> implements ArgumentType<fi.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final akm<? extends jk<T>> b;

   public fi(akm<? extends jk<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fi<T> a(akm<? extends jk<T>> $$0) {
      return new fi<>($$0);
   }

   public static <T> fi.c<T> a(CommandContext<ee> $$0, String $$1, akm<jk<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fi.c<?> $$4 = (fi.c<?>)$$0.getArgument($$1, fi.c.class);
      Optional<fi.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fi.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akn $$2 = akn.a($$0);
            return new fi.d<>(awm.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         akn $$4 = akn.a($$0);
         return new fi.b<>(akm.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ej $$2 ? $$2.a(this.b, ej.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hy<fi<T>, fi.a<T>.a> {
      public void a(fi.a<T>.a $$0, vx $$1) {
         $$1.b($$0.b);
      }

      public fi.a<T>.a a(vx $$0) {
         return new fi.a.a($$0.r());
      }

      public void a(fi.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fi.a<T>.a a(fi<T> $$0) {
         return new fi.a.a($$0.b);
      }

      public final class a implements hy.a<fi<T>> {
         final akm<? extends jk<T>> b;

         a(akm<? extends jk<T>> $$1) {
            this.b = $$1;
         }

         public fi<T> a(ea $$0) {
            return new fi<>(this.b);
         }

         @Override
         public hy<fi<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(akm<T> a) implements fi.c<T> {
      @Override
      public Either<akm<T>, awm<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fi.c<E>> a(akm<? extends jk<E>> $$0) {
         return this.a.d($$0).map(fi.b::new);
      }

      public boolean a(ix<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public akm<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ix<T>> {
      Either<akm<T>, awm<T>> a();

      <E> Optional<fi.c<E>> a(akm<? extends jk<E>> var1);

      String b();
   }

   static record d<T>(awm<T> a) implements fi.c<T> {
      @Override
      public Either<akm<T>, awm<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fi.c<E>> a(akm<? extends jk<E>> $$0) {
         return this.a.d($$0).map(fi.d::new);
      }

      public boolean a(ix<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public awm<T> c() {
         return this.a;
      }
   }
}
