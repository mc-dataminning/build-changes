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

public class es<T> implements ArgumentType<es.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final aeq<? extends hr<T>> b;

   public es(aeq<? extends hr<T>> $$0) {
      this.b = $$0;
   }

   public static <T> es<T> a(aeq<? extends hr<T>> $$0) {
      return new es<>($$0);
   }

   public static <T> es.c<T> a(CommandContext<dr> $$0, String $$1, aeq<hr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      es.c<?> $$4 = (es.c<?>)$$0.getArgument($$1, es.c.class);
      Optional<es.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public es.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aer $$2 = aer.a($$0);
            return new es.d<>(aqa.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         aer $$4 = aer.a($$0);
         return new es.b<>(aeq.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof du $$2 ? $$2.a(this.b, du.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gg<es<T>, es.a<T>.a> {
      public void a(es.a<T>.a $$0, si $$1) {
         $$1.b($$0.b);
      }

      public es.a<T>.a a(si $$0) {
         return new es.a.a($$0.t());
      }

      public void a(es.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public es.a<T>.a a(es<T> $$0) {
         return new es.a.a($$0.b);
      }

      public final class a implements gg.a<es<T>> {
         final aeq<? extends hr<T>> b;

         a(aeq<? extends hr<T>> $$1) {
            this.b = $$1;
         }

         public es<T> a(dl $$0) {
            return new es<>(this.b);
         }

         @Override
         public gg<es<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(aeq<T> a) implements es.c<T> {
      @Override
      public Either<aeq<T>, aqa<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<es.c<E>> a(aeq<? extends hr<E>> $$0) {
         return this.a.c($$0).map(es.b::new);
      }

      public boolean a(he<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public aeq<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<he<T>> {
      Either<aeq<T>, aqa<T>> a();

      <E> Optional<es.c<E>> a(aeq<? extends hr<E>> var1);

      String b();
   }

   static record d<T>(aqa<T> a) implements es.c<T> {
      @Override
      public Either<aeq<T>, aqa<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<es.c<E>> a(aeq<? extends hr<E>> $$0) {
         return this.a.d($$0).map(es.d::new);
      }

      public boolean a(he<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public aqa<T> c() {
         return this.a;
      }
   }
}
