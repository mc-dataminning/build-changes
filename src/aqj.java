import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aqj<T>(aex<? extends ht<T>> a, aey b) {
   private static final Interner<aqj<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aqj(aex<? extends ht<T>> a, aey b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aqj<T>> a(aex<? extends ht<T>> $$0) {
      return aey.a.xmap($$1 -> a($$0, $$1), aqj::b);
   }

   public static <T> Codec<aqj<T>> b(aex<? extends ht<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aey.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aqj<T> a(aex<? extends ht<T>> $$0, aey $$1) {
      return (aqj<T>)c.intern(new aqj<>($$0, $$1));
   }

   public boolean c(aex<? extends ht<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aqj<E>> d(aex<? extends ht<E>> $$0) {
      return this.c($$0) ? Optional.of((aqj<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
