import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record asp<T>(T a, Optional<T> b) {
   public static <T> Codec<asp<T>> a(Codec<T> $$0) {
      Codec<asp<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(asp::a), $$0.optionalFieldOf("filtered").forGetter(asp::b)).apply($$1x, asp::new)
      );
      Codec<asp<T>> $$2 = $$0.xmap(asp::a, asp::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zi<B, asp<T>> a(zi<B, T> $$0) {
      return zi.a($$0, asp::a, $$0.a(zg::a), asp::b, asp::new);
   }

   public static <T> asp<T> a(T $$0) {
      return new asp<>($$0, Optional.empty());
   }

   public static asp<String> a(asq $$0) {
      return new asp<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> asp<U> a(Function<T, U> $$0) {
      return new asp<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<asp<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new asp<>($$1.get(), $$2));
      } else {
         return Optional.of(new asp<>($$1.get(), Optional.empty()));
      }
   }
}
