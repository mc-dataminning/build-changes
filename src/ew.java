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

public class ew<T> implements ArgumentType<ew.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vq.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final il<T> d;
   final aix<? extends iv<T>> e;

   public ew(dq $$0, aix<? extends iv<T>> $$1) {
      this.e = $$1;
      this.d = $$0.a($$1);
   }

   public static <T> ew<T> a(dq $$0, aix<? extends iv<T>> $$1) {
      return new ew<>($$0, $$1);
   }

   public static <T> ew.c<T> a(CommandContext<du> $$0, String $$1, aix<iv<T>> $$2) throws CommandSyntaxException {
      ew.c<?> $$3 = (ew.c<?>)$$0.getArgument($$1, ew.c.class);
      Optional<ew.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            aix<?> $$2x = $$1xx.h();
            return et.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            auo<?> $$2x = $$1xx.f();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public ew.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aiy $$2 = aiy.a($$0);
            auo<T> $$3 = auo.a(this.e, $$2);
            in.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.create($$2, this.e.a()));
            return new ew.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         aiy $$6 = aiy.a($$0);
         aix<T> $$7 = aix.a(this.e, $$6);
         ij.c<T> $$8 = this.d.a($$7).orElseThrow(() -> et.a.create($$6, this.e.a()));
         return new ew.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      dz.a(this.d.e().map(auo::b), $$1, "#");
      return dz.a(this.d.c().map(aix::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hl<ew<T>, ew.a<T>.a> {
      public void a(ew.a<T>.a $$0, uq $$1) {
         $$1.b($$0.b);
      }

      public ew.a<T>.a a(uq $$0) {
         return new ew.a.a($$0.t());
      }

      public void a(ew.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ew.a<T>.a a(ew<T> $$0) {
         return new ew.a.a($$0.e);
      }

      public final class a implements hl.a<ew<T>> {
         final aix<? extends iv<T>> b;

         a(aix<? extends iv<T>> $$1) {
            this.b = $$1;
         }

         public ew<T> a(dq $$0) {
            return new ew<>($$0, this.b);
         }

         @Override
         public hl<ew<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ij.c<T> a) implements ew.c<T> {
      @Override
      public Either<ij.c<T>, in.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ew.c<E>> a(aix<? extends iv<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((ew.c<E>)this) : Optional.empty();
      }

      public boolean a(ij<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public ij.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<ij<T>> {
      Either<ij.c<T>, in.c<T>> a();

      <E> Optional<ew.c<E>> a(aix<? extends iv<E>> var1);

      String b();
   }

   static record d<T>(in.c<T> a) implements ew.c<T> {
      @Override
      public Either<ij.c<T>, in.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ew.c<E>> a(aix<? extends iv<E>> $$0) {
         return this.a.f().c($$0) ? Optional.of((ew.c<E>)this) : Optional.empty();
      }

      public boolean a(ij<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.f().b();
      }

      public in.c<T> c() {
         return this.a;
      }
   }
}
