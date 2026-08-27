import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record arh<T>(afv<? extends io<T>> a, afw b) {
   private static final Interner<arh<?>> c = Interners.newWeakInterner();

   @Deprecated
   public arh(afv<? extends io<T>> a, afw b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<arh<T>> a(afv<? extends io<T>> $$0) {
      return afw.a.xmap($$1 -> a($$0, $$1), arh::b);
   }

   public static <T> Codec<arh<T>> b(afv<? extends io<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? afw.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> arh<T> a(afv<? extends io<T>> $$0, afw $$1) {
      return (arh<T>)c.intern(new arh<>($$0, $$1));
   }

   public boolean c(afv<? extends io<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<arh<E>> d(afv<? extends io<E>> $$0) {
      return this.c($$0) ? Optional.of((arh<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
