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

public class fo<T> implements ArgumentType<fo.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final alj<? extends jt<T>> b;

   public fo(alj<? extends jt<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fo<T> a(alj<? extends jt<T>> $$0) {
      return new fo<>($$0);
   }

   public static <T> fo.c<T> a(CommandContext<ek> $$0, String $$1, alj<jt<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fo.c<?> $$4 = (fo.c<?>)$$0.getArgument($$1, fo.c.class);
      Optional<fo.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fo.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alk $$2 = alk.a($$0);
            return new fo.d<>(axv.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         alk $$4 = alk.a($$0);
         return new fo.b<>(alj.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ep $$2 ? $$2.a(this.b, ep.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ih<fo<T>, fo.a<T>.a> {
      public void a(fo.a<T>.a $$0, vy $$1) {
         $$1.b($$0.b);
      }

      public fo.a<T>.a a(vy $$0) {
         return new fo.a.a($$0.r());
      }

      public void a(fo.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fo.a<T>.a a(fo<T> $$0) {
         return new fo.a.a($$0.b);
      }

      public final class a implements ih.a<fo<T>> {
         final alj<? extends jt<T>> b;

         a(final alj<? extends jt<T>> $$1) {
            this.b = $$1;
         }

         public fo<T> a(eg $$0) {
            return new fo<>(this.b);
         }

         @Override
         public ih<fo<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(alj<T> a) implements fo.c<T> {
      @Override
      public Either<alj<T>, axv<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fo.c<E>> a(alj<? extends jt<E>> $$0) {
         return this.a.d($$0).map(fo.b::new);
      }

      public boolean a(jg<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public alj<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jg<T>> {
      Either<alj<T>, axv<T>> a();

      <E> Optional<fo.c<E>> a(alj<? extends jt<E>> var1);

      String b();
   }

   static record d<T>(axv<T> a) implements fo.c<T> {
      @Override
      public Either<alj<T>, axv<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fo.c<E>> a(alj<? extends jt<E>> $$0) {
         return this.a.e($$0).map(fo.d::new);
      }

      public boolean a(jg<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axv<T> c() {
         return this.a;
      }
   }
}
