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

public class eu<T> implements ArgumentType<eu.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final aev<? extends hq<T>> b;

   public eu(aev<? extends hq<T>> $$0) {
      this.b = $$0;
   }

   public static <T> eu<T> a(aev<? extends hq<T>> $$0) {
      return new eu<>($$0);
   }

   public static <T> eu.c<T> a(CommandContext<dt> $$0, String $$1, aev<hq<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      eu.c<?> $$4 = (eu.c<?>)$$0.getArgument($$1, eu.c.class);
      Optional<eu.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public eu.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aew $$2 = aew.a($$0);
            return new eu.d<>(aqh.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         aew $$4 = aew.a($$0);
         return new eu.b<>(aev.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw $$2 ? $$2.a(this.b, dw.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gi<eu<T>, eu.a<T>.a> {
      public void a(eu.a<T>.a $$0, so $$1) {
         $$1.b($$0.b);
      }

      public eu.a<T>.a a(so $$0) {
         return new eu.a.a($$0.t());
      }

      public void a(eu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eu.a<T>.a a(eu<T> $$0) {
         return new eu.a.a($$0.b);
      }

      public final class a implements gi.a<eu<T>> {
         final aev<? extends hq<T>> b;

         a(aev<? extends hq<T>> $$1) {
            this.b = $$1;
         }

         public eu<T> a(dn $$0) {
            return new eu<>(this.b);
         }

         @Override
         public gi<eu<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(aev<T> a) implements eu.c<T> {
      @Override
      public Either<aev<T>, aqh<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<eu.c<E>> a(aev<? extends hq<E>> $$0) {
         return this.a.c($$0).map(eu.b::new);
      }

      public boolean a(he<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public aev<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<he<T>> {
      Either<aev<T>, aqh<T>> a();

      <E> Optional<eu.c<E>> a(aev<? extends hq<E>> var1);

      String b();
   }

   static record d<T>(aqh<T> a) implements eu.c<T> {
      @Override
      public Either<aev<T>, aqh<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<eu.c<E>> a(aev<? extends hq<E>> $$0) {
         return this.a.d($$0).map(eu.d::new);
      }

      public boolean a(he<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public aqh<T> c() {
         return this.a;
      }
   }
}
