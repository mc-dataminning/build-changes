import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record asq<T>(ahc<? extends it<T>> a, ahd b) {
   private static final Interner<asq<?>> c = Interners.newWeakInterner();

   @Deprecated
   public asq(ahc<? extends it<T>> a, ahd b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<asq<T>> a(ahc<? extends it<T>> $$0) {
      return ahd.a.xmap($$1 -> a($$0, $$1), asq::b);
   }

   public static <T> Codec<asq<T>> b(ahc<? extends it<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ahd.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> asq<T> a(ahc<? extends it<T>> $$0, ahd $$1) {
      return (asq<T>)c.intern(new asq<>($$0, $$1));
   }

   public boolean c(ahc<? extends it<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<asq<E>> d(ahc<? extends it<E>> $$0) {
      return this.c($$0) ? Optional.of((asq<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
