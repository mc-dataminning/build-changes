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

public class fm<T> implements ArgumentType<fm.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xa.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jh<T> d;
   final alh<? extends js<T>> e;

   public fm(ef $$0, alh<? extends js<T>> $$1) {
      this.e = $$1;
      this.d = $$0.e($$1);
   }

   public static <T> fm<T> a(ef $$0, alh<? extends js<T>> $$1) {
      return new fm<>($$0, $$1);
   }

   public static <T> fm.c<T> a(CommandContext<ej> $$0, String $$1, alh<js<T>> $$2) throws CommandSyntaxException {
      fm.c<?> $$3 = (fm.c<?>)$$0.getArgument($$1, fm.c.class);
      Optional<fm.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            alh<?> $$2x = $$1xx.h();
            return fi.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axt<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fm.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ali $$2 = ali.a($$0);
            axt<T> $$3 = axt.a(this.e, $$2);
            jj.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fm.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ali $$6 = ali.a($$0);
         alh<T> $$7 = alh.a(this.e, $$6);
         jf.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fi.a.createWithContext($$0, $$6, this.e.a()));
         return new fm.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      eo.a(this.d.f().map(axt::b), $$1, "#");
      return eo.a(this.d.c_().map(alh::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ig<fm<T>, fm.a<T>.a> {
      public void a(fm.a<T>.a $$0, vw $$1) {
         $$1.b($$0.b);
      }

      public fm.a<T>.a a(vw $$0) {
         return new fm.a.a($$0.r());
      }

      public void a(fm.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fm.a<T>.a a(fm<T> $$0) {
         return new fm.a.a($$0.e);
      }

      public final class a implements ig.a<fm<T>> {
         final alh<? extends js<T>> b;

         a(final alh<? extends js<T>> $$1) {
            this.b = $$1;
         }

         public fm<T> a(ef $$0) {
            return new fm<>($$0, this.b);
         }

         @Override
         public ig<fm<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jf.c<T> a) implements fm.c<T> {
      @Override
      public Either<jf.c<T>, jj.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fm.c<E>> a(alh<? extends js<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fm.c<E>)this) : Optional.empty();
      }

      public boolean a(jf<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jf.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jf<T>> {
      Either<jf.c<T>, jj.c<T>> a();

      <E> Optional<fm.c<E>> a(alh<? extends js<E>> var1);

      String b();
   }

   static record d<T>(jj.c<T> a) implements fm.c<T> {
      @Override
      public Either<jf.c<T>, jj.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fm.c<E>> a(alh<? extends js<E>> $$0) {
         return this.a.h().d($$0) ? Optional.of((fm.c<E>)this) : Optional.empty();
      }

      public boolean a(jf<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public jj.c<T> c() {
         return this.a;
      }
   }
}
