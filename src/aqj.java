import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record aqj<T>(T a, Optional<T> b) {
   public static <T> Codec<aqj<T>> a(Codec<T> $$0) {
      Codec<aqj<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("text").forGetter(aqj::a), aws.a($$0, "filtered").forGetter(aqj::b)).apply($$1x, aqj::new)
      );
      Codec<aqj<T>> $$2 = $$0.xmap(aqj::a, aqj::a);
      return aws.e($$1, $$2);
   }

   public static <B extends ByteBuf, T> ye<B, aqj<T>> a(ye<B, T> $$0) {
      return ye.a($$0, aqj::a, $$0.a(yc::a), aqj::b, aqj::new);
   }

   public static <T> aqj<T> a(T $$0) {
      return new aqj<>($$0, Optional.empty());
   }

   public static aqj<String> a(aqk $$0) {
      return new aqj<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> aqj<U> a(Function<T, U> $$0) {
      return new aqj<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<aqj<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new aqj<>($$1.get(), $$2));
      } else {
         return Optional.of(new aqj<>($$1.get(), Optional.empty()));
      }
   }
}
