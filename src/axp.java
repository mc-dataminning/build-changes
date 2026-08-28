import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record axp<T>(alg<? extends kc<T>> a, alh b) {
   private static final Interner<axp<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axp(alg<? extends kc<T>> a, alh b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axp<T>> a(alg<? extends kc<T>> $$0) {
      return alh.a.xmap($$1 -> a($$0, $$1), axp::b);
   }

   public static <T> Codec<axp<T>> b(alg<? extends kc<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alh.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> axp<T> a(alg<? extends kc<T>> $$0, alh $$1) {
      return (axp<T>)c.intern(new axp<>($$0, $$1));
   }

   public boolean c(alg<? extends kc<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axp<E>> d(alg<? extends kc<E>> $$0) {
      return this.c($$0) ? Optional.of((axp<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
