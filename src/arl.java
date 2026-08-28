import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record arl<T>(T a, Optional<T> b) {
   public static <T> Codec<arl<T>> a(Codec<T> $$0) {
      Codec<arl<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(arl::a), $$0.optionalFieldOf("filtered").forGetter(arl::b)).apply($$1x, arl::new)
      );
      Codec<arl<T>> $$2 = $$0.xmap(arl::a, arl::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> yx<B, arl<T>> a(yx<B, T> $$0) {
      return yx.a($$0, arl::a, $$0.a(yv::a), arl::b, arl::new);
   }

   public static <T> arl<T> a(T $$0) {
      return new arl<>($$0, Optional.empty());
   }

   public static arl<String> a(arm $$0) {
      return new arl<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> arl<U> a(Function<T, U> $$0) {
      return new arl<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<arl<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new arl<>($$1.get(), $$2));
      } else {
         return Optional.of(new arl<>($$1.get(), Optional.empty()));
      }
   }
}
