import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record aqv<T>(T a, Optional<T> b) {
   public static <T> Codec<aqv<T>> a(Codec<T> $$0) {
      Codec<aqv<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("text").forGetter(aqv::a), axe.a($$0, "filtered").forGetter(aqv::b)).apply($$1x, aqv::new)
      );
      Codec<aqv<T>> $$2 = $$0.xmap(aqv::a, aqv::a);
      return axe.e($$1, $$2);
   }

   public static <B extends ByteBuf, T> yq<B, aqv<T>> a(yq<B, T> $$0) {
      return yq.a($$0, aqv::a, $$0.a(yo::a), aqv::b, aqv::new);
   }

   public static <T> aqv<T> a(T $$0) {
      return new aqv<>($$0, Optional.empty());
   }

   public static aqv<String> a(aqw $$0) {
      return new aqv<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> aqv<U> a(Function<T, U> $$0) {
      return new aqv<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<aqv<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new aqv<>($$1.get(), $$2));
      } else {
         return Optional.of(new aqv<>($$1.get(), Optional.empty()));
      }
   }
}
