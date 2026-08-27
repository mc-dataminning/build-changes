import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record aqy<T>(T a, Optional<T> b) {
   public static <T> Codec<aqy<T>> a(Codec<T> $$0) {
      Codec<aqy<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("text").forGetter(aqy::a), axh.a($$0, "filtered").forGetter(aqy::b)).apply($$1x, aqy::new)
      );
      Codec<aqy<T>> $$2 = $$0.xmap(aqy::a, aqy::a);
      return axh.e($$1, $$2);
   }

   public static <B extends ByteBuf, T> ys<B, aqy<T>> a(ys<B, T> $$0) {
      return ys.a($$0, aqy::a, $$0.a(yq::a), aqy::b, aqy::new);
   }

   public static <T> aqy<T> a(T $$0) {
      return new aqy<>($$0, Optional.empty());
   }

   public static aqy<String> a(aqz $$0) {
      return new aqy<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> aqy<U> a(Function<T, U> $$0) {
      return new aqy<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<aqy<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new aqy<>($$1.get(), $$2));
      } else {
         return Optional.of(new aqy<>($$1.get(), Optional.empty()));
      }
   }
}
