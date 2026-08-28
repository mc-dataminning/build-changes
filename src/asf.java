import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asf<T>(T a, Optional<T> b) {
   public static <T> Codec<asf<T>> a(Codec<T> $$0) {
      Codec<asf<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asf::a), $$0.optionalFieldOf("filtered").forGetter(asf::b)).apply($$1x, asf::new)
      );
      Codec<asf<T>> $$2 = $$0.xmap(asf::a, asf::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zg<B, asf<T>> a(zg<B, T> $$0) {
      return zg.a($$0, asf::a, $$0.a(ze::a), asf::b, asf::new);
   }

   public static <T> asf<T> a(T $$0) {
      return new asf<>($$0, Optional.empty());
   }

   public static asf<String> a(asg $$0) {
      return new asf<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asf<U> a(Function<T, U> $$0) {
      return new asf<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asf<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asf<>($$1.get(), $$2));
      } else {
         return Optional.of(new asf<>($$1.get(), Optional.empty()));
      }
   }
}
