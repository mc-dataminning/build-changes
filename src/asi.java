import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asi<T>(T a, Optional<T> b) {
   public static <T> Codec<asi<T>> a(Codec<T> $$0) {
      Codec<asi<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asi::a), $$0.optionalFieldOf("filtered").forGetter(asi::b)).apply($$1x, asi::new)
      );
      Codec<asi<T>> $$2 = $$0.xmap(asi::a, asi::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yw<B, asi<T>> a(yw<B, T> $$0) {
      return yw.a($$0, asi::a, $$0.a(yu::a), asi::b, asi::new);
   }

   public static <T> asi<T> a(T $$0) {
      return new asi<>($$0, Optional.empty());
   }

   public static asi<String> a(asj $$0) {
      return new asi<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asi<U> a(Function<T, U> $$0) {
      return new asi<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asi<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asi<>($$1.get(), $$2));
      } else {
         return Optional.of(new asi<>($$1.get(), Optional.empty()));
      }
   }
}
