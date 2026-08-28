import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record arx<T>(T a, Optional<T> b) {
   public static <T> Codec<arx<T>> a(Codec<T> $$0) {
      Codec<arx<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(arx::a), $$0.optionalFieldOf("filtered").forGetter(arx::b)).apply($$1x, arx::new)
      );
      Codec<arx<T>> $$2 = $$0.xmap(arx::a, arx::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zb<B, arx<T>> a(zb<B, T> $$0) {
      return zb.a($$0, arx::a, $$0.a(yz::a), arx::b, arx::new);
   }

   public static <T> arx<T> a(T $$0) {
      return new arx<>($$0, Optional.empty());
   }

   public static arx<String> a(ary $$0) {
      return new arx<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> arx<U> a(Function<T, U> $$0) {
      return new arx<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<arx<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new arx<>($$1.get(), $$2));
      } else {
         return Optional.of(new arx<>($$1.get(), Optional.empty()));
      }
   }
}
