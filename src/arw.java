import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record arw<T>(T a, Optional<T> b) {
   public static <T> Codec<arw<T>> a(Codec<T> $$0) {
      Codec<arw<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(arw::a), $$0.optionalFieldOf("filtered").forGetter(arw::b)).apply($$1x, arw::new)
      );
      Codec<arw<T>> $$2 = $$0.xmap(arw::a, arw::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zn<B, arw<T>> a(zn<B, T> $$0) {
      return zn.a($$0, arw::a, $$0.a(zl::a), arw::b, arw::new);
   }

   public static <T> arw<T> a(T $$0) {
      return new arw<>($$0, Optional.empty());
   }

   public static arw<String> a(arx $$0) {
      return new arw<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> arw<U> a(Function<T, U> $$0) {
      return new arw<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<arw<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new arw<>($$1.get(), $$2));
      } else {
         return Optional.of(new arw<>($$1.get(), Optional.empty()));
      }
   }
}
