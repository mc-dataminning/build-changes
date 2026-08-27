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

public class ev<T> implements ArgumentType<ev.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ur.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final id<T> d;
   final agf<? extends io<T>> e;

   public ev(dp $$0, agf<? extends io<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> ev<T> a(dp $$0, agf<? extends io<T>> $$1) {
      return new ev<>($$0, $$1);
   }

   public static <T> ev.c<T> a(CommandContext<du> $$0, String $$1, agf<io<T>> $$2) throws CommandSyntaxException {
      ev.c<?> $$3 = (ev.c<?>)$$0.getArgument($$1, ev.c.class);
      Optional<ev.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            agf<?> $$2x = $$1xx.g();
            return es.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            arr<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public ev.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            agg $$2 = agg.a($$0);
            arr<T> $$3 = arr.a(this.e, $$2);
            ig.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new ev.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         agg $$6 = agg.a($$0);
         agf<T> $$7 = agf.a(this.e, $$6);
         ib.c<T> $$8 = this.d.a($$7).orElseThrow(() -> es.a.create($$6, this.e.a()));
         return new ev.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      dy.a(this.d.e().map(arr::b), $$1, "#");
      return dy.a(this.d.c().map(agf::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hf<ev<T>, ev.a<T>.a> {
      public void a(ev.a<T>.a $$0, tu $$1) {
         $$1.b($$0.b);
      }

      public ev.a<T>.a a(tu $$0) {
         return new ev.a.a($$0.u());
      }

      public void a(ev.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ev.a<T>.a a(ev<T> $$0) {
         return new ev.a.a($$0.e);
      }

      public final class a implements hf.a<ev<T>> {
         final agf<? extends io<T>> b;

         a(agf<? extends io<T>> $$1) {
            this.b = $$1;
         }

         public ev<T> a(dp $$0) {
            return new ev<>($$0, this.b);
         }

         @Override
         public hf<ev<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ib.c<T> a) implements ev.c<T> {
      @Override
      public Either<ib.c<T>, ig.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ev.c<E>> a(agf<? extends io<E>> $$0) {
         return this.a.g().b($$0) ? Optional.of((ev.c<E>)this) : Optional.empty();
      }

      public boolean a(ib<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.g().a().toString();
      }

      public ib.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ib<T>> {
      Either<ib.c<T>, ig.c<T>> a();

      <E> Optional<ev.c<E>> a(agf<? extends io<E>> var1);

      String b();
   }

   static record d<T>(ig.c<T> a) implements ev.c<T> {
      @Override
      public Either<ib.c<T>, ig.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ev.c<E>> a(agf<? extends io<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((ev.c<E>)this) : Optional.empty();
      }

      public boolean a(ib<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public ig.c<T> c() {
         return this.a;
      }
   }
}
