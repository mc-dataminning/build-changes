import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record asx<T>(ahg<? extends it<T>> a, ahh b) {
   private static final Interner<asx<?>> c = Interners.newWeakInterner();

   @Deprecated
   public asx(ahg<? extends it<T>> a, ahh b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<asx<T>> a(ahg<? extends it<T>> $$0) {
      return ahh.a.xmap($$1 -> a($$0, $$1), asx::b);
   }

   public static <T> Codec<asx<T>> b(ahg<? extends it<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ahh.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> asx<T> a(ahg<? extends it<T>> $$0, ahh $$1) {
      return (asx<T>)c.intern(new asx<>($$0, $$1));
   }

   public boolean c(ahg<? extends it<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<asx<E>> d(ahg<? extends it<E>> $$0) {
      return this.c($$0) ? Optional.of((asx<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
