import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axt<T>(alh<? extends js<T>> a, ali b) {
   private static final Interner<axt<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axt(alh<? extends js<T>> a, ali b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axt<T>> a(alh<? extends js<T>> $$0) {
      return ali.a.xmap($$1 -> a($$0, $$1), axt::b);
   }

   public static <T> Codec<axt<T>> b(alh<? extends js<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ali.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> yy<ByteBuf, axt<T>> c(alh<? extends js<T>> $$0) {
      return ali.b.a($$1 -> a($$0, $$1), axt::b);
   }

   public static <T> axt<T> a(alh<? extends js<T>> $$0, ali $$1) {
      return (axt<T>)c.intern(new axt<>($$0, $$1));
   }

   public boolean d(alh<? extends js<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axt<E>> e(alh<? extends js<E>> $$0) {
      return this.d($$0) ? Optional.of((axt<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
