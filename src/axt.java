import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axt<T>(alk<? extends kd<T>> a, all b) {
   private static final Interner<axt<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axt(alk<? extends kd<T>> a, all b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axt<T>> a(alk<? extends kd<T>> $$0) {
      return all.a.xmap($$1 -> a($$0, $$1), axt::b);
   }

   public static <T> Codec<axt<T>> b(alk<? extends kd<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? all.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> zj<ByteBuf, axt<T>> c(alk<? extends kd<T>> $$0) {
      return all.b.a($$1 -> a($$0, $$1), axt::b);
   }

   public static <T> axt<T> a(alk<? extends kd<T>> $$0, all $$1) {
      return (axt<T>)c.intern(new axt<>($$0, $$1));
   }

   public boolean d(alk<? extends kd<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axt<E>> e(alk<? extends kd<E>> $$0) {
      return this.d($$0) ? Optional.of((axt<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
