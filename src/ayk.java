import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record ayk<T>(aly<? extends kd<T>> a, alz b) {
   private static final Interner<ayk<?>> c = Interners.newWeakInterner();

   @Deprecated
   public ayk(aly<? extends kd<T>> a, alz b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<ayk<T>> a(aly<? extends kd<T>> $$0) {
      return alz.a.xmap($$1 -> a($$0, $$1), ayk::b);
   }

   public static <T> Codec<ayk<T>> b(aly<? extends kd<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alz.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> zt<ByteBuf, ayk<T>> c(aly<? extends kd<T>> $$0) {
      return alz.b.a($$1 -> a($$0, $$1), ayk::b);
   }

   public static <T> ayk<T> a(aly<? extends kd<T>> $$0, alz $$1) {
      return (ayk<T>)c.intern(new ayk<>($$0, $$1));
   }

   public boolean d(aly<? extends kd<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<ayk<E>> e(aly<? extends kd<E>> $$0) {
      return this.d($$0) ? Optional.of((ayk<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
