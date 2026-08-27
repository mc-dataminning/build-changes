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

public class ey<T> implements ArgumentType<ey.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final aju<? extends ja<T>> b;

   public ey(aju<? extends ja<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ey<T> a(aju<? extends ja<T>> $$0) {
      return new ey<>($$0);
   }

   public static <T> ey.c<T> a(CommandContext<dv> $$0, String $$1, aju<ja<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ey.c<?> $$4 = (ey.c<?>)$$0.getArgument($$1, ey.c.class);
      Optional<ey.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ey.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ajv $$2 = ajv.a($$0);
            return new ey.d<>(avt.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ajv $$4 = ajv.a($$0);
         return new ey.b<>(aju.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ea $$2 ? $$2.a(this.b, ea.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hp<ey<T>, ey.a<T>.a> {
      public void a(ey.a<T>.a $$0, vi $$1) {
         $$1.b($$0.b);
      }

      public ey.a<T>.a a(vi $$0) {
         return new ey.a.a($$0.r());
      }

      public void a(ey.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ey.a<T>.a a(ey<T> $$0) {
         return new ey.a.a($$0.b);
      }

      public final class a implements hp.a<ey<T>> {
         final aju<? extends ja<T>> b;

         a(aju<? extends ja<T>> $$1) {
            this.b = $$1;
         }

         public ey<T> a(dr $$0) {
            return new ey<>(this.b);
         }

         @Override
         public hp<ey<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(aju<T> a) implements ey.c<T> {
      @Override
      public Either<aju<T>, avt<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ey.c<E>> a(aju<? extends ja<E>> $$0) {
         return this.a.d($$0).map(ey.b::new);
      }

      public boolean a(in<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public aju<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<in<T>> {
      Either<aju<T>, avt<T>> a();

      <E> Optional<ey.c<E>> a(aju<? extends ja<E>> var1);

      String b();
   }

   static record d<T>(avt<T> a) implements ey.c<T> {
      @Override
      public Either<aju<T>, avt<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ey.c<E>> a(aju<? extends ja<E>> $$0) {
         return this.a.d($$0).map(ey.d::new);
      }

      public boolean a(in<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public avt<T> c() {
         return this.a;
      }
   }
}
