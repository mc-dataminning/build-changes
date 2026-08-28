import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aya<T>(alo<? extends kd<T>> a, alp b) {
   private static final Interner<aya<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aya(alo<? extends kd<T>> a, alp b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aya<T>> a(alo<? extends kd<T>> $$0) {
      return alp.a.xmap($$1 -> a($$0, $$1), aya::b);
   }

   public static <T> Codec<aya<T>> b(alo<? extends kd<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alp.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> zi<ByteBuf, aya<T>> c(alo<? extends kd<T>> $$0) {
      return alp.b.a($$1 -> a($$0, $$1), aya::b);
   }

   public static <T> aya<T> a(alo<? extends kd<T>> $$0, alp $$1) {
      return (aya<T>)c.intern(new aya<>($$0, $$1));
   }

   public boolean d(alo<? extends kd<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aya<E>> e(alo<? extends kd<E>> $$0) {
      return this.d($$0) ? Optional.of((aya<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
