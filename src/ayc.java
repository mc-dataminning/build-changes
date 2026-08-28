import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record ayc<T>(alq<? extends jt<T>> a, alr b) {
   private static final Interner<ayc<?>> c = Interners.newWeakInterner();

   @Deprecated
   public ayc(alq<? extends jt<T>> a, alr b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<ayc<T>> a(alq<? extends jt<T>> $$0) {
      return alr.a.xmap($$1 -> a($$0, $$1), ayc::b);
   }

   public static <T> Codec<ayc<T>> b(alq<? extends jt<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alr.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> ze<ByteBuf, ayc<T>> c(alq<? extends jt<T>> $$0) {
      return alr.b.a($$1 -> a($$0, $$1), ayc::b);
   }

   public static <T> ayc<T> a(alq<? extends jt<T>> $$0, alr $$1) {
      return (ayc<T>)c.intern(new ayc<>($$0, $$1));
   }

   public boolean d(alq<? extends jt<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<ayc<E>> e(alq<? extends jt<E>> $$0) {
      return this.d($$0) ? Optional.of((ayc<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
