import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record ase<T>(T a, Optional<T> b) {
   public static <T> Codec<ase<T>> a(Codec<T> $$0) {
      Codec<ase<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(ase::a), $$0.optionalFieldOf("filtered").forGetter(ase::b)).apply($$1x, ase::new)
      );
      Codec<ase<T>> $$2 = $$0.xmap(ase::a, ase::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zf<B, ase<T>> a(zf<B, T> $$0) {
      return zf.a($$0, ase::a, $$0.a(zd::a), ase::b, ase::new);
   }

   public static <T> ase<T> a(T $$0) {
      return new ase<>($$0, Optional.empty());
   }

   public static ase<String> a(asf $$0) {
      return new ase<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> ase<U> a(Function<T, U> $$0) {
      return new ase<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<ase<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new ase<>($$1.get(), $$2));
      } else {
         return Optional.of(new ase<>($$1.get(), Optional.empty()));
      }
   }
}
