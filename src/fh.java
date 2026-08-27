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

public class fh<T> implements ArgumentType<fh.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wx.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final iz<T> d;
   final akm<? extends jk<T>> e;

   public fh(ea $$0, akm<? extends jk<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fh<T> a(ea $$0, akm<? extends jk<T>> $$1) {
      return new fh<>($$0, $$1);
   }

   public static <T> fh.c<T> a(CommandContext<ee> $$0, String $$1, akm<jk<T>> $$2) throws CommandSyntaxException {
      fh.c<?> $$3 = (fh.c<?>)$$0.getArgument($$1, fh.c.class);
      Optional<fh.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            akm<?> $$2x = $$1xx.h();
            return fd.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            awm<?> $$2x = $$1xx.g();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fh.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akn $$2 = akn.a($$0);
            awm<T> $$3 = awm.a(this.e, $$2);
            jb.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fh.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         akn $$6 = akn.a($$0);
         akm<T> $$7 = akm.a(this.e, $$6);
         ix.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fd.a.createWithContext($$0, $$6, this.e.a()));
         return new fh.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ej.a(this.d.e().map(awm::b), $$1, "#");
      return ej.a(this.d.c().map(akm::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hy<fh<T>, fh.a<T>.a> {
      public void a(fh.a<T>.a $$0, vx $$1) {
         $$1.b($$0.b);
      }

      public fh.a<T>.a a(vx $$0) {
         return new fh.a.a($$0.r());
      }

      public void a(fh.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fh.a<T>.a a(fh<T> $$0) {
         return new fh.a.a($$0.e);
      }

      public final class a implements hy.a<fh<T>> {
         final akm<? extends jk<T>> b;

         a(akm<? extends jk<T>> $$1) {
            this.b = $$1;
         }

         public fh<T> a(ea $$0) {
            return new fh<>($$0, this.b);
         }

         @Override
         public hy<fh<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ix.c<T> a) implements fh.c<T> {
      @Override
      public Either<ix.c<T>, jb.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fh.c<E>> a(akm<? extends jk<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fh.c<E>)this) : Optional.empty();
      }

      public boolean a(ix<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public ix.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ix<T>> {
      Either<ix.c<T>, jb.c<T>> a();

      <E> Optional<fh.c<E>> a(akm<? extends jk<E>> var1);

      String b();
   }

   static record d<T>(jb.c<T> a) implements fh.c<T> {
      @Override
      public Either<ix.c<T>, jb.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fh.c<E>> a(akm<? extends jk<E>> $$0) {
         return this.a.g().c($$0) ? Optional.of((fh.c<E>)this) : Optional.empty();
      }

      public boolean a(ix<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.g().b();
      }

      public jb.c<T> c() {
         return this.a;
      }
   }
}
