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

public class fu<T> implements ArgumentType<fu.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final akj<? extends jw<T>> b;

   public fu(akj<? extends jw<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fu<T> a(akj<? extends jw<T>> $$0) {
      return new fu<>($$0);
   }

   public static <T> fu.c<T> a(CommandContext<eq> $$0, String $$1, akj<jw<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fu.c<?> $$4 = (fu.c<?>)$$0.getArgument($$1, fu.c.class);
      Optional<fu.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fu.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akk $$2 = akk.a($$0);
            return new fu.d<>(awm.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         akk $$4 = akk.a($$0);
         return new fu.b<>(akj.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ev $$2 ? $$2.a(this.b, ev.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements il<fu<T>, fu.a<T>.a> {
      public void a(fu.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public fu.a<T>.a a(vr $$0) {
         return new fu.a.a($$0.r());
      }

      public void a(fu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fu.a<T>.a a(fu<T> $$0) {
         return new fu.a.a($$0.b);
      }

      public final class a implements il.a<fu<T>> {
         final akj<? extends jw<T>> b;

         a(final akj<? extends jw<T>> $$1) {
            this.b = $$1;
         }

         public fu<T> a(em $$0) {
            return new fu<>(this.b);
         }

         @Override
         public il<fu<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(akj<T> a) implements fu.c<T> {
      @Override
      public Either<akj<T>, awm<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fu.c<E>> a(akj<? extends jw<E>> $$0) {
         return this.a.d($$0).map(fu.b::new);
      }

      public boolean a(jj<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public akj<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jj<T>> {
      Either<akj<T>, awm<T>> a();

      <E> Optional<fu.c<E>> a(akj<? extends jw<E>> var1);

      String b();
   }

   static record d<T>(awm<T> a) implements fu.c<T> {
      @Override
      public Either<akj<T>, awm<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fu.c<E>> a(akj<? extends jw<E>> $$0) {
         return this.a.d($$0).map(fu.d::new);
      }

      public boolean a(jj<T> $$0) {
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
