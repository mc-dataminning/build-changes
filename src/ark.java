import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record ark<T>(T a, Optional<T> b) {
   public static <T> Codec<ark<T>> a(Codec<T> $$0) {
      Codec<ark<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(ark::a), $$0.optionalFieldOf("filtered").forGetter(ark::b)).apply($$1x, ark::new)
      );
      Codec<ark<T>> $$2 = $$0.xmap(ark::a, ark::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yw<B, ark<T>> a(yw<B, T> $$0) {
      return yw.a($$0, ark::a, $$0.a(yu::a), ark::b, ark::new);
   }

   public static <T> ark<T> a(T $$0) {
      return new ark<>($$0, Optional.empty());
   }

   public static ark<String> a(arl $$0) {
      return new ark<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> ark<U> a(Function<T, U> $$0) {
      return new ark<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<ark<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new ark<>($$1.get(), $$2));
      } else {
         return Optional.of(new ark<>($$1.get(), Optional.empty()));
      }
   }
}
