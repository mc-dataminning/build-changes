import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aqi<T>(aew<? extends ht<T>> a, aex b) {
   private static final Interner<aqi<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aqi(aew<? extends ht<T>> a, aex b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aqi<T>> a(aew<? extends ht<T>> $$0) {
      return aex.a.xmap($$1 -> a($$0, $$1), aqi::b);
   }

   public static <T> Codec<aqi<T>> b(aew<? extends ht<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aex.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aqi<T> a(aew<? extends ht<T>> $$0, aex $$1) {
      return (aqi<T>)c.intern(new aqi<>($$0, $$1));
   }

   public boolean c(aew<? extends ht<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aqi<E>> d(aew<? extends ht<E>> $$0) {
      return this.c($$0) ? Optional.of((aqi<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
