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

public class ft<T> implements ArgumentType<ft.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final ald<? extends jv<T>> b;

   public ft(ald<? extends jv<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ft<T> a(ald<? extends jv<T>> $$0) {
      return new ft<>($$0);
   }

   public static <T> ft.c<T> a(CommandContext<ep> $$0, String $$1, ald<jv<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ft.c<?> $$4 = (ft.c<?>)$$0.getArgument($$1, ft.c.class);
      Optional<ft.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ft.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ale $$2 = ale.a($$0);
            return new ft.d<>(axe.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ale $$4 = ale.a($$0);
         return new ft.b<>(ald.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eu $$2 ? $$2.a(this.b, eu.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ik<ft<T>, ft.a<T>.a> {
      public void a(ft.a<T>.a $$0, wl $$1) {
         $$1.b($$0.b);
      }

      public ft.a<T>.a a(wl $$0) {
         return new ft.a.a($$0.r());
      }

      public void a(ft.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ft.a<T>.a a(ft<T> $$0) {
         return new ft.a.a($$0.b);
      }

      public final class a implements ik.a<ft<T>> {
         final ald<? extends jv<T>> b;

         a(final ald<? extends jv<T>> $$1) {
            this.b = $$1;
         }

         public ft<T> a(el $$0) {
            return new ft<>(this.b);
         }

         @Override
         public ik<ft<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ald<T> a) implements ft.c<T> {
      @Override
      public Either<ald<T>, axe<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ft.c<E>> a(ald<? extends jv<E>> $$0) {
         return this.a.d($$0).map(ft.b::new);
      }

      public boolean a(ji<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public ald<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ji<T>> {
      Either<ald<T>, axe<T>> a();

      <E> Optional<ft.c<E>> a(ald<? extends jv<E>> var1);

      String b();
   }

   static record d<T>(axe<T> a) implements ft.c<T> {
      @Override
      public Either<ald<T>, axe<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ft.c<E>> a(ald<? extends jv<E>> $$0) {
         return this.a.d($$0).map(ft.d::new);
      }

      public boolean a(ji<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axe<T> c() {
         return this.a;
      }
   }
}
