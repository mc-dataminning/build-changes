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

public class ex<T> implements ArgumentType<ex.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final ajg<? extends iy<T>> b;

   public ex(ajg<? extends iy<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ex<T> a(ajg<? extends iy<T>> $$0) {
      return new ex<>($$0);
   }

   public static <T> ex.c<T> a(CommandContext<du> $$0, String $$1, ajg<iy<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ex.c<?> $$4 = (ex.c<?>)$$0.getArgument($$1, ex.c.class);
      Optional<ex.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ex.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ajh $$2 = ajh.a($$0);
            return new ex.d<>(avd.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ajh $$4 = ajh.a($$0);
         return new ex.b<>(ajg.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz $$2 ? $$2.a(this.b, dz.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hn<ex<T>, ex.a<T>.a> {
      public void a(ex.a<T>.a $$0, uu $$1) {
         $$1.b($$0.b);
      }

      public ex.a<T>.a a(uu $$0) {
         return new ex.a.a($$0.r());
      }

      public void a(ex.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ex.a<T>.a a(ex<T> $$0) {
         return new ex.a.a($$0.b);
      }

      public final class a implements hn.a<ex<T>> {
         final ajg<? extends iy<T>> b;

         a(ajg<? extends iy<T>> $$1) {
            this.b = $$1;
         }

         public ex<T> a(dq $$0) {
            return new ex<>(this.b);
         }

         @Override
         public hn<ex<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ajg<T> a) implements ex.c<T> {
      @Override
      public Either<ajg<T>, avd<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ex.c<E>> a(ajg<? extends iy<E>> $$0) {
         return this.a.d($$0).map(ex.b::new);
      }

      public boolean a(il<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public ajg<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<il<T>> {
      Either<ajg<T>, avd<T>> a();

      <E> Optional<ex.c<E>> a(ajg<? extends iy<E>> var1);

      String b();
   }

   static record d<T>(avd<T> a) implements ex.c<T> {
      @Override
      public Either<ajg<T>, avd<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ex.c<E>> a(ajg<? extends iy<E>> $$0) {
         return this.a.d($$0).map(ex.d::new);
      }

      public boolean a(il<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public avd<T> c() {
         return this.a;
      }
   }
}
