import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axr<T>(alf<? extends js<T>> a, alg b) {
   private static final Interner<axr<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axr(alf<? extends js<T>> a, alg b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axr<T>> a(alf<? extends js<T>> $$0) {
      return alg.a.xmap($$1 -> a($$0, $$1), axr::b);
   }

   public static <T> Codec<axr<T>> b(alf<? extends js<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alg.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> yw<ByteBuf, axr<T>> c(alf<? extends js<T>> $$0) {
      return alg.b.a($$1 -> a($$0, $$1), axr::b);
   }

   public static <T> axr<T> a(alf<? extends js<T>> $$0, alg $$1) {
      return (axr<T>)c.intern(new axr<>($$0, $$1));
   }

   public boolean d(alf<? extends js<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axr<E>> e(alf<? extends js<E>> $$0) {
      return this.d($$0) ? Optional.of((axr<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
