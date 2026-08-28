import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asz<T>(T a, Optional<T> b) {
   public static <T> Codec<asz<T>> a(Codec<T> $$0) {
      Codec<asz<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asz::a), $$0.optionalFieldOf("filtered").forGetter(asz::b)).apply($$1x, asz::new)
      );
      Codec<asz<T>> $$2 = $$0.xmap(asz::a, asz::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zt<B, asz<T>> a(zt<B, T> $$0) {
      return zt.a($$0, asz::a, $$0.a(zr::a), asz::b, asz::new);
   }

   public static <T> asz<T> a(T $$0) {
      return new asz<>($$0, Optional.empty());
   }

   public static asz<String> a(ata $$0) {
      return new asz<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asz<U> a(Function<T, U> $$0) {
      return new asz<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asz<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asz<>($$1.get(), $$2));
      } else {
         return Optional.of(new asz<>($$1.get(), Optional.empty()));
      }
   }
}
