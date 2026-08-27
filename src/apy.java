import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record apy<T>(aeo<? extends hs<T>> a, aep b) {
   private static final Interner<apy<?>> c = Interners.newWeakInterner();

   @Deprecated
   public apy(aeo<? extends hs<T>> a, aep b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<apy<T>> a(aeo<? extends hs<T>> $$0) {
      return aep.a.xmap($$1 -> a($$0, $$1), apy::b);
   }

   public static <T> Codec<apy<T>> b(aeo<? extends hs<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aep.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> apy<T> a(aeo<? extends hs<T>> $$0, aep $$1) {
      return (apy<T>)c.intern(new apy<>($$0, $$1));
   }

   public boolean c(aeo<? extends hs<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<apy<E>> d(aeo<? extends hs<E>> $$0) {
      return this.c($$0) ? Optional.of((apy<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
