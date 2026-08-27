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

public class ew<T> implements ArgumentType<ew.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final afv<? extends io<T>> b;

   public ew(afv<? extends io<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ew<T> a(afv<? extends io<T>> $$0) {
      return new ew<>($$0);
   }

   public static <T> ew.c<T> a(CommandContext<du> $$0, String $$1, afv<io<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ew.c<?> $$4 = (ew.c<?>)$$0.getArgument($$1, ew.c.class);
      Optional<ew.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ew.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            afw $$2 = afw.a($$0);
            return new ew.d<>(arh.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         afw $$4 = afw.a($$0);
         return new ew.b<>(afv.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dy $$2 ? $$2.a(this.b, dy.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hf<ew<T>, ew.a<T>.a> {
      public void a(ew.a<T>.a $$0, tl $$1) {
         $$1.b($$0.b);
      }

      public ew.a<T>.a a(tl $$0) {
         return new ew.a.a($$0.u());
      }

      public void a(ew.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ew.a<T>.a a(ew<T> $$0) {
         return new ew.a.a($$0.b);
      }

      public final class a implements hf.a<ew<T>> {
         final afv<? extends io<T>> b;

         a(afv<? extends io<T>> $$1) {
            this.b = $$1;
         }

         public ew<T> a(dp $$0) {
            return new ew<>(this.b);
         }

         @Override
         public hf<ew<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(afv<T> a) implements ew.c<T> {
      @Override
      public Either<afv<T>, arh<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ew.c<E>> a(afv<? extends io<E>> $$0) {
         return this.a.c($$0).map(ew.b::new);
      }

      public boolean a(ib<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public afv<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ib<T>> {
      Either<afv<T>, arh<T>> a();

      <E> Optional<ew.c<E>> a(afv<? extends io<E>> var1);

      String b();
   }

   static record d<T>(arh<T> a) implements ew.c<T> {
      @Override
      public Either<afv<T>, arh<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ew.c<E>> a(afv<? extends io<E>> $$0) {
         return this.a.d($$0).map(ew.d::new);
      }

      public boolean a(ib<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public arh<T> c() {
         return this.a;
      }
   }
}
