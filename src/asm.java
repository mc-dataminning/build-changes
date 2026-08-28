import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asm<T>(T a, Optional<T> b) {
   public static <T> Codec<asm<T>> a(Codec<T> $$0) {
      Codec<asm<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asm::a), $$0.optionalFieldOf("filtered").forGetter(asm::b)).apply($$1x, asm::new)
      );
      Codec<asm<T>> $$2 = $$0.xmap(asm::a, asm::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> za<B, asm<T>> a(za<B, T> $$0) {
      return za.a($$0, asm::a, $$0.a(yy::a), asm::b, asm::new);
   }

   public static <T> asm<T> a(T $$0) {
      return new asm<>($$0, Optional.empty());
   }

   public static asm<String> a(asn $$0) {
      return new asm<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asm<U> a(Function<T, U> $$0) {
      return new asm<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asm<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asm<>($$1.get(), $$2));
      } else {
         return Optional.of(new asm<>($$1.get(), Optional.empty()));
      }
   }
}
