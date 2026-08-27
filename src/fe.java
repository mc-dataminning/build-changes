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

public class fe<T> implements ArgumentType<fe.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ws.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final ix<T> d;
   final ake<? extends ji<T>> e;

   public fe(dy $$0, ake<? extends ji<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fe<T> a(dy $$0, ake<? extends ji<T>> $$1) {
      return new fe<>($$0, $$1);
   }

   public static <T> fe.c<T> a(CommandContext<ec> $$0, String $$1, ake<ji<T>> $$2) throws CommandSyntaxException {
      fe.c<?> $$3 = (fe.c<?>)$$0.getArgument($$1, fe.c.class);
      Optional<fe.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            ake<?> $$2x = $$1xx.h();
            return fb.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            awd<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fe.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akf $$2 = akf.a($$0);
            awd<T> $$3 = awd.a(this.e, $$2);
            iz.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fe.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         akf $$6 = akf.a($$0);
         ake<T> $$7 = ake.a(this.e, $$6);
         iv.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fb.a.createWithContext($$0, $$6, this.e.a()));
         return new fe.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      eh.a(this.d.e().map(awd::b), $$1, "#");
      return eh.a(this.d.c().map(ake::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hw<fe<T>, fe.a<T>.a> {
      public void a(fe.a<T>.a $$0, vs $$1) {
         $$1.b($$0.b);
      }

      public fe.a<T>.a a(vs $$0) {
         return new fe.a.a($$0.r());
      }

      public void a(fe.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fe.a<T>.a a(fe<T> $$0) {
         return new fe.a.a($$0.e);
      }

      public final class a implements hw.a<fe<T>> {
         final ake<? extends ji<T>> b;

         a(ake<? extends ji<T>> $$1) {
            this.b = $$1;
         }

         public fe<T> a(dy $$0) {
            return new fe<>($$0, this.b);
         }

         @Override
         public hw<fe<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(iv.c<T> a) implements fe.c<T> {
      @Override
      public Either<iv.c<T>, iz.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fe.c<E>> a(ake<? extends ji<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fe.c<E>)this) : Optional.empty();
      }

      public boolean a(iv<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public iv.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<iv<T>> {
      Either<iv.c<T>, iz.c<T>> a();

      <E> Optional<fe.c<E>> a(ake<? extends ji<E>> var1);

      String b();
   }

   static record d<T>(iz.c<T> a) implements fe.c<T> {
      @Override
      public Either<iv.c<T>, iz.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fe.c<E>> a(ake<? extends ji<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((fe.c<E>)this) : Optional.empty();
      }

      public boolean a(iv<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public iz.c<T> c() {
         return this.a;
      }
   }
}
