import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axp<T>(ald<? extends jr<T>> a, ale b) {
   private static final Interner<axp<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axp(ald<? extends jr<T>> a, ale b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axp<T>> a(ald<? extends jr<T>> $$0) {
      return ale.a.xmap($$1 -> a($$0, $$1), axp::b);
   }

   public static <T> Codec<axp<T>> b(ald<? extends jr<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ale.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> yu<ByteBuf, axp<T>> c(ald<? extends jr<T>> $$0) {
      return ale.b.a($$1 -> a($$0, $$1), axp::b);
   }

   public static <T> axp<T> a(ald<? extends jr<T>> $$0, ale $$1) {
      return (axp<T>)c.intern(new axp<>($$0, $$1));
   }

   public boolean d(ald<? extends jr<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axp<E>> e(ald<? extends jr<E>> $$0) {
      return this.d($$0) ? Optional.of((axp<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
