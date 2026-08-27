import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record are<T>(T a, Optional<T> b) {
   public static <T> Codec<are<T>> a(Codec<T> $$0) {
      Codec<are<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(are::a), $$0.optionalFieldOf("filtered").forGetter(are::b)).apply($$1x, are::new)
      );
      Codec<are<T>> $$2 = $$0.xmap(are::a, are::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yv<B, are<T>> a(yv<B, T> $$0) {
      return yv.a($$0, are::a, $$0.a(yt::a), are::b, are::new);
   }

   public static <T> are<T> a(T $$0) {
      return new are<>($$0, Optional.empty());
   }

   public static are<String> a(arf $$0) {
      return new are<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> are<U> a(Function<T, U> $$0) {
      return new are<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<are<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new are<>($$1.get(), $$2));
      } else {
         return Optional.of(new are<>($$1.get(), Optional.empty()));
      }
   }
}
