import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record aql<T>(T a, Optional<T> b) {
   public static <T> Codec<aql<T>> a(Codec<T> $$0) {
      Codec<aql<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("text").forGetter(aql::a), awu.a($$0, "filtered").forGetter(aql::b)).apply($$1x, aql::new)
      );
      Codec<aql<T>> $$2 = $$0.xmap(aql::a, aql::a);
      return awu.e($$1, $$2);
   }

   public static <B extends ByteBuf, T> yg<B, aql<T>> a(yg<B, T> $$0) {
      return yg.a($$0, aql::a, $$0.a(ye::a), aql::b, aql::new);
   }

   public static <T> aql<T> a(T $$0) {
      return new aql<>($$0, Optional.empty());
   }

   public static aql<String> a(aqm $$0) {
      return new aql<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> aql<U> a(Function<T, U> $$0) {
      return new aql<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<aql<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new aql<>($$1.get(), $$2));
      } else {
         return Optional.of(new aql<>($$1.get(), Optional.empty()));
      }
   }
}
