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

public class fg<T> implements ArgumentType<fg.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final iy<T> d;
   final akg<? extends jj<T>> e;

   public fg(dz $$0, akg<? extends jj<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fg<T> a(dz $$0, akg<? extends jj<T>> $$1) {
      return new fg<>($$0, $$1);
   }

   public static <T> fg.c<T> a(CommandContext<ed> $$0, String $$1, akg<jj<T>> $$2) throws CommandSyntaxException {
      fg.c<?> $$3 = (fg.c<?>)$$0.getArgument($$1, fg.c.class);
      Optional<fg.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            akg<?> $$2x = $$1xx.h();
            return fc.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            awg<?> $$2x = $$1xx.g();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fg.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akh $$2 = akh.a($$0);
            awg<T> $$3 = awg.a(this.e, $$2);
            ja.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fg.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         akh $$6 = akh.a($$0);
         akg<T> $$7 = akg.a(this.e, $$6);
         iw.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fc.a.createWithContext($$0, $$6, this.e.a()));
         return new fg.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ei.a(this.d.e().map(awg::b), $$1, "#");
      return ei.a(this.d.c().map(akg::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hx<fg<T>, fg.a<T>.a> {
      public void a(fg.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fg.a<T>.a a(vu $$0) {
         return new fg.a.a($$0.r());
      }

      public void a(fg.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fg.a<T>.a a(fg<T> $$0) {
         return new fg.a.a($$0.e);
      }

      public final class a implements hx.a<fg<T>> {
         final akg<? extends jj<T>> b;

         a(akg<? extends jj<T>> $$1) {
            this.b = $$1;
         }

         public fg<T> a(dz $$0) {
            return new fg<>($$0, this.b);
         }

         @Override
         public hx<fg<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(iw.c<T> a) implements fg.c<T> {
      @Override
      public Either<iw.c<T>, ja.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fg.c<E>> a(akg<? extends jj<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fg.c<E>)this) : Optional.empty();
      }

      public boolean a(iw<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public iw.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<iw<T>> {
      Either<iw.c<T>, ja.c<T>> a();

      <E> Optional<fg.c<E>> a(akg<? extends jj<E>> var1);

      String b();
   }

   static record d<T>(ja.c<T> a) implements fg.c<T> {
      @Override
      public Either<iw.c<T>, ja.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fg.c<E>> a(akg<? extends jj<E>> $$0) {
         return this.a.g().c($$0) ? Optional.of((fg.c<E>)this) : Optional.empty();
      }

      public boolean a(iw<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.g().b();
      }

      public ja.c<T> c() {
         return this.a;
      }
   }
}
