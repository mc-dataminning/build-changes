import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axv<T>(alj<? extends jt<T>> a, alk b) {
   private static final Interner<axv<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axv(alj<? extends jt<T>> a, alk b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axv<T>> a(alj<? extends jt<T>> $$0) {
      return alk.a.xmap($$1 -> a($$0, $$1), axv::b);
   }

   public static <T> Codec<axv<T>> b(alj<? extends jt<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alk.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> za<ByteBuf, axv<T>> c(alj<? extends jt<T>> $$0) {
      return alk.b.a($$1 -> a($$0, $$1), axv::b);
   }

   public static <T> axv<T> a(alj<? extends jt<T>> $$0, alk $$1) {
      return (axv<T>)c.intern(new axv<>($$0, $$1));
   }

   public boolean d(alj<? extends jt<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axv<E>> e(alj<? extends jt<E>> $$0) {
      return this.d($$0) ? Optional.of((axv<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
