import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axe<T>(akt<? extends ke<T>> a, aku b) {
   private static final Interner<axe<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axe(akt<? extends ke<T>> a, aku b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axe<T>> a(akt<? extends ke<T>> $$0) {
      return aku.a.xmap($$1 -> a($$0, $$1), axe::b);
   }

   public static <T> Codec<axe<T>> b(akt<? extends ke<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aku.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> ym<ByteBuf, axe<T>> c(akt<? extends ke<T>> $$0) {
      return aku.b.a($$1 -> a($$0, $$1), axe::b);
   }

   public static <T> axe<T> a(akt<? extends ke<T>> $$0, aku $$1) {
      return (axe<T>)c.intern(new axe<>($$0, $$1));
   }

   public boolean d(akt<? extends ke<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axe<E>> e(akt<? extends ke<E>> $$0) {
      return this.d($$0) ? Optional.of((axe<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
