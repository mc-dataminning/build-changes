import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record aru<T>(T a, Optional<T> b) {
   public static <T> Codec<aru<T>> a(Codec<T> $$0) {
      Codec<aru<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(aru::a), $$0.optionalFieldOf("filtered").forGetter(aru::b)).apply($$1x, aru::new)
      );
      Codec<aru<T>> $$2 = $$0.xmap(aru::a, aru::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> ym<B, aru<T>> a(ym<B, T> $$0) {
      return ym.a($$0, aru::a, $$0.a(yk::a), aru::b, aru::new);
   }

   public static <T> aru<T> a(T $$0) {
      return new aru<>($$0, Optional.empty());
   }

   public static aru<String> a(arv $$0) {
      return new aru<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> aru<U> a(Function<T, U> $$0) {
      return new aru<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<aru<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new aru<>($$1.get(), $$2));
      } else {
         return Optional.of(new aru<>($$1.get(), Optional.empty()));
      }
   }
}
