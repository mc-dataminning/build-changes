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

public class fl<T> implements ArgumentType<fl.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final aks<? extends jn<T>> b;

   public fl(aks<? extends jn<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fl<T> a(aks<? extends jn<T>> $$0) {
      return new fl<>($$0);
   }

   public static <T> fl.c<T> a(CommandContext<eh> $$0, String $$1, aks<jn<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fl.c<?> $$4 = (fl.c<?>)$$0.getArgument($$1, fl.c.class);
      Optional<fl.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fl.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akt $$2 = akt.a($$0);
            return new fl.d<>(awt.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         akt $$4 = akt.a($$0);
         return new fl.b<>(aks.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof em $$2 ? $$2.a(this.b, em.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ib<fl<T>, fl.a<T>.a> {
      public void a(fl.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fl.a<T>.a a(we $$0) {
         return new fl.a.a($$0.r());
      }

      public void a(fl.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fl.a<T>.a a(fl<T> $$0) {
         return new fl.a.a($$0.b);
      }

      public final class a implements ib.a<fl<T>> {
         final aks<? extends jn<T>> b;

         a(aks<? extends jn<T>> $$1) {
            this.b = $$1;
         }

         public fl<T> a(ed $$0) {
            return new fl<>(this.b);
         }

         @Override
         public ib<fl<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(aks<T> a) implements fl.c<T> {
      @Override
      public Either<aks<T>, awt<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fl.c<E>> a(aks<? extends jn<E>> $$0) {
         return this.a.d($$0).map(fl.b::new);
      }

      public boolean a(ja<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public aks<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ja<T>> {
      Either<aks<T>, awt<T>> a();

      <E> Optional<fl.c<E>> a(aks<? extends jn<E>> var1);

      String b();
   }

   static record d<T>(awt<T> a) implements fl.c<T> {
      @Override
      public Either<aks<T>, awt<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fl.c<E>> a(aks<? extends jn<E>> $$0) {
         return this.a.d($$0).map(fl.d::new);
      }

      public boolean a(ja<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public awt<T> c() {
         return this.a;
      }
   }
}
