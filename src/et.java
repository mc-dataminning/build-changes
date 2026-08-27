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

public class et<T> implements ArgumentType<et.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final aeo<? extends hs<T>> b;

   public et(aeo<? extends hs<T>> $$0) {
      this.b = $$0;
   }

   public static <T> et<T> a(aeo<? extends hs<T>> $$0) {
      return new et<>($$0);
   }

   public static <T> et.c<T> a(CommandContext<ds> $$0, String $$1, aeo<hs<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      et.c<?> $$4 = (et.c<?>)$$0.getArgument($$1, et.c.class);
      Optional<et.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public et.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            aep $$2 = aep.a($$0);
            return new et.d<>(apy.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         aep $$4 = aep.a($$0);
         return new et.b<>(aeo.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dv $$2 ? $$2.a(this.b, dv.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gh<et<T>, et.a<T>.a> {
      public void a(et.a<T>.a $$0, sh $$1) {
         $$1.b($$0.b);
      }

      public et.a<T>.a a(sh $$0) {
         return new et.a.a($$0.t());
      }

      public void a(et.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public et.a<T>.a a(et<T> $$0) {
         return new et.a.a($$0.b);
      }

      public final class a implements gh.a<et<T>> {
         final aeo<? extends hs<T>> b;

         a(aeo<? extends hs<T>> $$1) {
            this.b = $$1;
         }

         public et<T> a(dm $$0) {
            return new et<>(this.b);
         }

         @Override
         public gh<et<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(aeo<T> a) implements et.c<T> {
      @Override
      public Either<aeo<T>, apy<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<et.c<E>> a(aeo<? extends hs<E>> $$0) {
         return this.a.c($$0).map(et.b::new);
      }

      public boolean a(hf<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public aeo<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<hf<T>> {
      Either<aeo<T>, apy<T>> a();

      <E> Optional<et.c<E>> a(aeo<? extends hs<E>> var1);

      String b();
   }

   static record d<T>(apy<T> a) implements et.c<T> {
      @Override
      public Either<aeo<T>, apy<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<et.c<E>> a(aeo<? extends hs<E>> $$0) {
         return this.a.d($$0).map(et.d::new);
      }

      public boolean a(hf<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public apy<T> c() {
         return this.a;
      }
   }
}
