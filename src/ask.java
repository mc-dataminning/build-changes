import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record ask<T>(T a, Optional<T> b) {
   public static <T> Codec<ask<T>> a(Codec<T> $$0) {
      Codec<ask<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(ask::a), $$0.optionalFieldOf("filtered").forGetter(ask::b)).apply($$1x, ask::new)
      );
      Codec<ask<T>> $$2 = $$0.xmap(ask::a, ask::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yy<B, ask<T>> a(yy<B, T> $$0) {
      return yy.a($$0, ask::a, $$0.a(yw::a), ask::b, ask::new);
   }

   public static <T> ask<T> a(T $$0) {
      return new ask<>($$0, Optional.empty());
   }

   public static ask<String> a(asl $$0) {
      return new ask<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> ask<U> a(Function<T, U> $$0) {
      return new ask<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<ask<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new ask<>($$1.get(), $$2));
      } else {
         return Optional.of(new ask<>($$1.get(), Optional.empty()));
      }
   }
}
