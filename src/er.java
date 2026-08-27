import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class er<T> implements ArgumentType<er.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tf.a("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final hg<T> d;
   final aeq<? extends hr<T>> e;

   public er(dl $$0, aeq<? extends hr<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> er<T> a(dl $$0, aeq<? extends hr<T>> $$1) {
      return new er<>($$0, $$1);
   }

   public static <T> er.c<T> a(CommandContext<dr> $$0, String $$1, aeq<hr<T>> $$2) throws CommandSyntaxException {
      er.c<?> $$3 = (er.c<?>)$$0.getArgument($$1, er.c.class);
      Optional<er.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            aeq<?> $$2x = $$1xx.g();
            return eo.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            aqa<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public er.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aer $$2 = aer.a($$0);
            aqa<T> $$3 = aqa.a(this.e, $$2);
            hi.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new er.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         aer $$6 = aer.a($$0);
         aeq<T> $$7 = aeq.a(this.e, $$6);
         he.c<T> $$8 = this.d.a($$7).orElseThrow(() -> eo.a.create($$6, this.e.a()));
         return new er.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      du.a(this.d.e().map(aqa::b), $$1, "#");
      return du.a(this.d.c().map(aeq::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gg<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, si $$1) {
         $$1.b($$0.b);
      }

      public er.a<T>.a a(si $$0) {
         return new er.a.a($$0.t());
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.e);
      }

      public final class a implements gg.a<er<T>> {
         final aeq<? extends hr<T>> b;

         a(aeq<? extends hr<T>> $$1) {
            this.b = $$1;
         }

         public er<T> a(dl $$0) {
            return new er<>($$0, this.b);
         }

         @Override
         public gg<er<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(he.c<T> a) implements er.c<T> {
      @Override
      public Either<he.c<T>, hi.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<er.c<E>> a(aeq<? extends hr<E>> $$0) {
         return this.a.g().b($$0) ? Optional.of((er.c<E>)this) : Optional.empty();
      }

      public boolean a(he<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.g().a().toString();
      }

      public he.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<he<T>> {
      Either<he.c<T>, hi.c<T>> a();

      <E> Optional<er.c<E>> a(aeq<? extends hr<E>> var1);

      String b();
   }

   static record d<T>(hi.c<T> a) implements er.c<T> {
      @Override
      public Either<he.c<T>, hi.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<er.c<E>> a(aeq<? extends hr<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((er.c<E>)this) : Optional.empty();
      }

      public boolean a(he<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public hi.c<T> c() {
         return this.a;
      }
   }
}
