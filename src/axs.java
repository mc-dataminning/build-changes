import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axs<T>(ali<? extends kd<T>> a, alj b) {
   private static final Interner<axs<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axs(ali<? extends kd<T>> a, alj b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axs<T>> a(ali<? extends kd<T>> $$0) {
      return alj.a.xmap($$1 -> a($$0, $$1), axs::b);
   }

   public static <T> Codec<axs<T>> b(ali<? extends kd<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alj.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> zh<ByteBuf, axs<T>> c(ali<? extends kd<T>> $$0) {
      return alj.b.a($$1 -> a($$0, $$1), axs::b);
   }

   public static <T> axs<T> a(ali<? extends kd<T>> $$0, alj $$1) {
      return (axs<T>)c.intern(new axs<>($$0, $$1));
   }

   public boolean d(ali<? extends kd<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axs<E>> e(ali<? extends kd<E>> $$0) {
      return this.d($$0) ? Optional.of((axs<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
