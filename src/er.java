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
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> sw.a("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final hg<T> d;
   final acp<? extends hr<T>> e;

   public er(dm $$0, acp<? extends hr<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> er<T> a(dm $$0, acp<? extends hr<T>> $$1) {
      return new er<>($$0, $$1);
   }

   public static <T> er.c<T> a(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2) throws CommandSyntaxException {
      er.c<?> $$3 = (er.c<?>)$$0.getArgument($$1, er.c.class);
      Optional<er.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            acp<?> $$2x = $$1xx.g();
            return eo.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            anl<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public er.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            acq $$2 = acq.a($$0);
            anl<T> $$3 = anl.a(this.e, $$2);
            hi.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new er.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         acq $$6 = acq.a($$0);
         acp<T> $$7 = acp.a(this.e, $$6);
         he.c<T> $$8 = this.d.a($$7).orElseThrow(() -> eo.a.create($$6, this.e.a()));
         return new er.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      du.a(this.d.e().map(anl::b), $$1, "#");
      return du.a(this.d.c().map(acp::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gg<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, sf $$1) {
         $$1.a($$0.b.a());
      }

      public er.a<T>.a a(sf $$0) {
         acq $$1 = $$0.t();
         return new er.a.a(acp.a($$1));
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.e);
      }

      public final class a implements gg.a<er<T>> {
         final acp<? extends hr<T>> b;

         a(acp<? extends hr<T>> $$1) {
            this.b = $$1;
         }

         public er<T> a(dm $$0) {
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
      public <E> Optional<er.c<E>> a(acp<? extends hr<E>> $$0) {
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

      <E> Optional<er.c<E>> a(acp<? extends hr<E>> var1);

      String b();
   }

   static record d<T>(hi.c<T> a) implements er.c<T> {
      @Override
      public Either<he.c<T>, hi.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<er.c<E>> a(acp<? extends hr<E>> $$0) {
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
