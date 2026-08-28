import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axq<T>(alh<? extends kd<T>> a, ali b) {
   private static final Interner<axq<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axq(alh<? extends kd<T>> a, ali b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axq<T>> a(alh<? extends kd<T>> $$0) {
      return ali.a.xmap($$1 -> a($$0, $$1), axq::b);
   }

   public static <T> Codec<axq<T>> b(alh<? extends kd<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ali.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> zg<ByteBuf, axq<T>> c(alh<? extends kd<T>> $$0) {
      return ali.b.a($$1 -> a($$0, $$1), axq::b);
   }

   public static <T> axq<T> a(alh<? extends kd<T>> $$0, ali $$1) {
      return (axq<T>)c.intern(new axq<>($$0, $$1));
   }

   public boolean d(alh<? extends kd<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axq<E>> e(alh<? extends kd<E>> $$0) {
      return this.d($$0) ? Optional.of((axq<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
