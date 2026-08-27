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

public class ff<T> implements ArgumentType<ff.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final ake<? extends ji<T>> b;

   public ff(ake<? extends ji<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ff<T> a(ake<? extends ji<T>> $$0) {
      return new ff<>($$0);
   }

   public static <T> ff.c<T> a(CommandContext<ec> $$0, String $$1, ake<ji<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ff.c<?> $$4 = (ff.c<?>)$$0.getArgument($$1, ff.c.class);
      Optional<ff.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ff.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akf $$2 = akf.a($$0);
            return new ff.d<>(awd.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         akf $$4 = akf.a($$0);
         return new ff.b<>(ake.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eh $$2 ? $$2.a(this.b, eh.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hw<ff<T>, ff.a<T>.a> {
      public void a(ff.a<T>.a $$0, vs $$1) {
         $$1.b($$0.b);
      }

      public ff.a<T>.a a(vs $$0) {
         return new ff.a.a($$0.r());
      }

      public void a(ff.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ff.a<T>.a a(ff<T> $$0) {
         return new ff.a.a($$0.b);
      }

      public final class a implements hw.a<ff<T>> {
         final ake<? extends ji<T>> b;

         a(ake<? extends ji<T>> $$1) {
            this.b = $$1;
         }

         public ff<T> a(dy $$0) {
            return new ff<>(this.b);
         }

         @Override
         public hw<ff<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ake<T> a) implements ff.c<T> {
      @Override
      public Either<ake<T>, awd<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ff.c<E>> a(ake<? extends ji<E>> $$0) {
         return this.a.d($$0).map(ff.b::new);
      }

      public boolean a(iv<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public ake<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<iv<T>> {
      Either<ake<T>, awd<T>> a();

      <E> Optional<ff.c<E>> a(ake<? extends ji<E>> var1);

      String b();
   }

   static record d<T>(awd<T> a) implements ff.c<T> {
      @Override
      public Either<ake<T>, awd<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ff.c<E>> a(ake<? extends ji<E>> $$0) {
         return this.a.d($$0).map(ff.d::new);
      }

      public boolean a(iv<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public awd<T> c() {
         return this.a;
      }
   }
}
