import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record asv<T>(ahf<? extends it<T>> a, ahg b) {
   private static final Interner<asv<?>> c = Interners.newWeakInterner();

   @Deprecated
   public asv(ahf<? extends it<T>> a, ahg b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<asv<T>> a(ahf<? extends it<T>> $$0) {
      return ahg.a.xmap($$1 -> a($$0, $$1), asv::b);
   }

   public static <T> Codec<asv<T>> b(ahf<? extends it<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ahg.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> asv<T> a(ahf<? extends it<T>> $$0, ahg $$1) {
      return (asv<T>)c.intern(new asv<>($$0, $$1));
   }

   public boolean c(ahf<? extends it<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<asv<E>> d(ahf<? extends it<E>> $$0) {
      return this.c($$0) ? Optional.of((asv<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
