import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awg<T>(akg<? extends jj<T>> a, akh b) {
   private static final Interner<awg<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awg(akg<? extends jj<T>> a, akh b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awg<T>> a(akg<? extends jj<T>> $$0) {
      return akh.a.xmap($$1 -> a($$0, $$1), awg::b);
   }

   public static <T> Codec<awg<T>> b(akg<? extends jj<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akh.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awg<T> a(akg<? extends jj<T>> $$0, akh $$1) {
      return (awg<T>)c.intern(new awg<>($$0, $$1));
   }

   public boolean c(akg<? extends jj<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awg<E>> d(akg<? extends jj<E>> $$0) {
      return this.c($$0) ? Optional.of((awg<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
