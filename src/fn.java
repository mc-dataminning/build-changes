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

public class fn<T> implements ArgumentType<fn.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final alh<? extends js<T>> b;

   public fn(alh<? extends js<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fn<T> a(alh<? extends js<T>> $$0) {
      return new fn<>($$0);
   }

   public static <T> fn.c<T> a(CommandContext<ej> $$0, String $$1, alh<js<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fn.c<?> $$4 = (fn.c<?>)$$0.getArgument($$1, fn.c.class);
      Optional<fn.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fn.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ali $$2 = ali.a($$0);
            return new fn.d<>(axt.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ali $$4 = ali.a($$0);
         return new fn.b<>(alh.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eo $$2 ? $$2.a(this.b, eo.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ig<fn<T>, fn.a<T>.a> {
      public void a(fn.a<T>.a $$0, vw $$1) {
         $$1.b($$0.b);
      }

      public fn.a<T>.a a(vw $$0) {
         return new fn.a.a($$0.r());
      }

      public void a(fn.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fn.a<T>.a a(fn<T> $$0) {
         return new fn.a.a($$0.b);
      }

      public final class a implements ig.a<fn<T>> {
         final alh<? extends js<T>> b;

         a(final alh<? extends js<T>> $$1) {
            this.b = $$1;
         }

         public fn<T> a(ef $$0) {
            return new fn<>(this.b);
         }

         @Override
         public ig<fn<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(alh<T> a) implements fn.c<T> {
      @Override
      public Either<alh<T>, axt<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fn.c<E>> a(alh<? extends js<E>> $$0) {
         return this.a.d($$0).map(fn.b::new);
      }

      public boolean a(jf<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public alh<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jf<T>> {
      Either<alh<T>, axt<T>> a();

      <E> Optional<fn.c<E>> a(alh<? extends js<E>> var1);

      String b();
   }

   static record d<T>(axt<T> a) implements fn.c<T> {
      @Override
      public Either<alh<T>, axt<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fn.c<E>> a(alh<? extends js<E>> $$0) {
         return this.a.e($$0).map(fn.d::new);
      }

      public boolean a(jf<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axt<T> c() {
         return this.a;
      }
   }
}
