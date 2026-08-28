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

public class fm<T> implements ArgumentType<fm.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final ald<? extends jr<T>> b;

   public fm(ald<? extends jr<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fm<T> a(ald<? extends jr<T>> $$0) {
      return new fm<>($$0);
   }

   public static <T> fm.c<T> a(CommandContext<ei> $$0, String $$1, ald<jr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fm.c<?> $$4 = (fm.c<?>)$$0.getArgument($$1, fm.c.class);
      Optional<fm.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fm.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ale $$2 = ale.a($$0);
            return new fm.d<>(axp.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ale $$4 = ale.a($$0);
         return new fm.b<>(ald.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof en $$2 ? $$2.a(this.b, en.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ie<fm<T>, fm.a<T>.a> {
      public void a(fm.a<T>.a $$0, vs $$1) {
         $$1.b($$0.b);
      }

      public fm.a<T>.a a(vs $$0) {
         return new fm.a.a($$0.r());
      }

      public void a(fm.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fm.a<T>.a a(fm<T> $$0) {
         return new fm.a.a($$0.b);
      }

      public final class a implements ie.a<fm<T>> {
         final ald<? extends jr<T>> b;

         a(final ald<? extends jr<T>> $$1) {
            this.b = $$1;
         }

         public fm<T> a(ee $$0) {
            return new fm<>(this.b);
         }

         @Override
         public ie<fm<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ald<T> a) implements fm.c<T> {
      @Override
      public Either<ald<T>, axp<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fm.c<E>> a(ald<? extends jr<E>> $$0) {
         return this.a.d($$0).map(fm.b::new);
      }

      public boolean a(je<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public ald<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<je<T>> {
      Either<ald<T>, axp<T>> a();

      <E> Optional<fm.c<E>> a(ald<? extends jr<E>> var1);

      String b();
   }

   static record d<T>(axp<T> a) implements fm.c<T> {
      @Override
      public Either<ald<T>, axp<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fm.c<E>> a(ald<? extends jr<E>> $$0) {
         return this.a.e($$0).map(fm.d::new);
      }

      public boolean a(je<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axp<T> c() {
         return this.a;
      }
   }
}
