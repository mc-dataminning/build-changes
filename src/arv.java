import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record arv<T>(T a, Optional<T> b) {
   public static <T> Codec<arv<T>> a(Codec<T> $$0) {
      Codec<arv<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(arv::a), $$0.optionalFieldOf("filtered").forGetter(arv::b)).apply($$1x, arv::new)
      );
      Codec<arv<T>> $$2 = $$0.xmap(arv::a, arv::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zm<B, arv<T>> a(zm<B, T> $$0) {
      return zm.a($$0, arv::a, $$0.a(zk::a), arv::b, arv::new);
   }

   public static <T> arv<T> a(T $$0) {
      return new arv<>($$0, Optional.empty());
   }

   public static arv<String> a(arw $$0) {
      return new arv<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> arv<U> a(Function<T, U> $$0) {
      return new arv<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<arv<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new arv<>($$1.get(), $$2));
      } else {
         return Optional.of(new arv<>($$1.get(), Optional.empty()));
      }
   }
}
