import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record ary<T>(T a, Optional<T> b) {
   public static <T> Codec<ary<T>> a(Codec<T> $$0) {
      Codec<ary<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(ary::a), $$0.optionalFieldOf("filtered").forGetter(ary::b)).apply($$1x, ary::new)
      );
      Codec<ary<T>> $$2 = $$0.xmap(ary::a, ary::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zb<B, ary<T>> a(zb<B, T> $$0) {
      return zb.a($$0, ary::a, $$0.a(yz::a), ary::b, ary::new);
   }

   public static <T> ary<T> a(T $$0) {
      return new ary<>($$0, Optional.empty());
   }

   public static ary<String> a(arz $$0) {
      return new ary<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> ary<U> a(Function<T, U> $$0) {
      return new ary<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<ary<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new ary<>($$1.get(), $$2));
      } else {
         return Optional.of(new ary<>($$1.get(), Optional.empty()));
      }
   }
}
