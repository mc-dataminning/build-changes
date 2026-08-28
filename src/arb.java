import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record arb<T>(T a, Optional<T> b) {
   public static <T> Codec<arb<T>> a(Codec<T> $$0) {
      Codec<arb<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(arb::a), $$0.optionalFieldOf("filtered").forGetter(arb::b)).apply($$1x, arb::new)
      );
      Codec<arb<T>> $$2 = $$0.xmap(arb::a, arb::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> ys<B, arb<T>> a(ys<B, T> $$0) {
      return ys.a($$0, arb::a, $$0.a(yq::a), arb::b, arb::new);
   }

   public static <T> arb<T> a(T $$0) {
      return new arb<>($$0, Optional.empty());
   }

   public static arb<String> a(arc $$0) {
      return new arb<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> arb<U> a(Function<T, U> $$0) {
      return new arb<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<arb<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new arb<>($$1.get(), $$2));
      } else {
         return Optional.of(new arb<>($$1.get(), Optional.empty()));
      }
   }
}
