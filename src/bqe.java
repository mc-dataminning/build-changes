import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface bqe<T> {
   T a(StringReader var1) throws CommandSyntaxException;

   CompletableFuture<Suggestions> a(SuggestionsBuilder var1);

   default <S> bqe<S> a(final Function<T, S> $$0) {
      return new bqe<S>() {
         @Override
         public S a(StringReader $$0x) throws CommandSyntaxException {
            return $$0.apply((T)bqe.this.a($$0));
         }

         @Override
         public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0x) {
            return bqe.this.a($$0);
         }
      };
   }

   default <T, O> bqe<T> a(final DynamicOps<O> $$0, final bqe<O> $$1, final Codec<T> $$2, final DynamicCommandExceptionType $$3) {
      return new bqe<T>() {
         @Override
         public T a(StringReader $$0x) throws CommandSyntaxException {
            int $$1 = $$0.getCursor();
            O $$2 = $$1.a($$0);
            DataResult<T> $$3 = $$2.parse($$0, $$2);
            return (T)$$3.getOrThrow($$3xxx -> {
               $$0.setCursor($$1);
               return $$3.createWithContext($$0, $$3xxx);
            });
         }

         @Override
         public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0x) {
            return bqe.this.a($$0);
         }
      };
   }
}
