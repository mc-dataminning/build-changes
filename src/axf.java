import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axf<T>(aku<? extends ke<T>> a, akv b) {
   private static final Interner<axf<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axf(aku<? extends ke<T>> a, akv b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axf<T>> a(aku<? extends ke<T>> $$0) {
      return akv.a.xmap($$1 -> a($$0, $$1), axf::b);
   }

   public static <T> Codec<axf<T>> b(aku<? extends ke<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akv.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> yn<ByteBuf, axf<T>> c(aku<? extends ke<T>> $$0) {
      return akv.b.a($$1 -> a($$0, $$1), axf::b);
   }

   public static <T> axf<T> a(aku<? extends ke<T>> $$0, akv $$1) {
      return (axf<T>)c.intern(new axf<>($$0, $$1));
   }

   public boolean d(aku<? extends ke<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axf<E>> e(aku<? extends ke<E>> $$0) {
      return this.d($$0) ? Optional.of((axf<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
