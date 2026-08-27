import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record ard<T>(T a, Optional<T> b) {
   public static <T> Codec<ard<T>> a(Codec<T> $$0) {
      Codec<ard<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("text").forGetter(ard::a), $$0.optionalFieldOf("filtered").forGetter(ard::b)).apply($$1x, ard::new)
      );
      Codec<ard<T>> $$2 = $$0.xmap(ard::a, ard::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yv<B, ard<T>> a(yv<B, T> $$0) {
      return yv.a($$0, ard::a, $$0.a(yt::a), ard::b, ard::new);
   }

   public static <T> ard<T> a(T $$0) {
      return new ard<>($$0, Optional.empty());
   }

   public static ard<String> a(are $$0) {
      return new ard<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> ard<U> a(Function<T, U> $$0) {
      return new ard<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<ard<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new ard<>($$1.get(), $$2));
      } else {
         return Optional.of(new ard<>($$1.get(), Optional.empty()));
      }
   }
}
