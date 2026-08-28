import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asa<T>(T a, Optional<T> b) {
   public static <T> Codec<asa<T>> a(Codec<T> $$0) {
      Codec<asa<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asa::a), $$0.optionalFieldOf("filtered").forGetter(asa::b)).apply($$1x, asa::new)
      );
      Codec<asa<T>> $$2 = $$0.xmap(asa::a, asa::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zc<B, asa<T>> a(zc<B, T> $$0) {
      return zc.a($$0, asa::a, $$0.a(za::a), asa::b, asa::new);
   }

   public static <T> asa<T> a(T $$0) {
      return new asa<>($$0, Optional.empty());
   }

   public static asa<String> a(asb $$0) {
      return new asa<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asa<U> a(Function<T, U> $$0) {
      return new asa<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asa<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asa<>($$1.get(), $$2));
      } else {
         return Optional.of(new asa<>($$1.get(), Optional.empty()));
      }
   }
}
