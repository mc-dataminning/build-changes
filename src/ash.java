import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record ash<T>(T a, Optional<T> b) {
   public static <T> Codec<ash<T>> a(Codec<T> $$0) {
      Codec<ash<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(ash::a), $$0.optionalFieldOf("filtered").forGetter(ash::b)).apply($$1x, ash::new)
      );
      Codec<ash<T>> $$2 = $$0.xmap(ash::a, ash::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zh<B, ash<T>> a(zh<B, T> $$0) {
      return zh.a($$0, ash::a, $$0.a(zf::a), ash::b, ash::new);
   }

   public static <T> ash<T> a(T $$0) {
      return new ash<>($$0, Optional.empty());
   }

   public static ash<String> a(asi $$0) {
      return new ash<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> ash<U> a(Function<T, U> $$0) {
      return new ash<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<ash<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new ash<>($$1.get(), $$2));
      } else {
         return Optional.of(new ash<>($$1.get(), Optional.empty()));
      }
   }
}
