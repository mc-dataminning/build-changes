import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axp<T>(alc<? extends kf<T>> a, ald b) {
   private static final Interner<axp<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axp(alc<? extends kf<T>> a, ald b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axp<T>> a(alc<? extends kf<T>> $$0) {
      return ald.a.xmap($$1 -> a($$0, $$1), axp::b);
   }

   public static <T> Codec<axp<T>> b(alc<? extends kf<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ald.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> yt<ByteBuf, axp<T>> c(alc<? extends kf<T>> $$0) {
      return ald.b.a($$1 -> a($$0, $$1), axp::b);
   }

   public static <T> axp<T> a(alc<? extends kf<T>> $$0, ald $$1) {
      return (axp<T>)c.intern(new axp<>($$0, $$1));
   }

   public boolean d(alc<? extends kf<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axp<E>> e(alc<? extends kf<E>> $$0) {
      return this.d($$0) ? Optional.of((axp<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
