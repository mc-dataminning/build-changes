import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record axl<T>(ald<? extends kb<T>> a, ale b) {
   private static final Interner<axl<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axl(ald<? extends kb<T>> a, ale b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axl<T>> a(ald<? extends kb<T>> $$0) {
      return ale.a.xmap($$1 -> a($$0, $$1), axl::b);
   }

   public static <T> Codec<axl<T>> b(ald<? extends kb<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ale.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> axl<T> a(ald<? extends kb<T>> $$0, ale $$1) {
      return (axl<T>)c.intern(new axl<>($$0, $$1));
   }

   public boolean c(ald<? extends kb<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axl<E>> d(ald<? extends kb<E>> $$0) {
      return this.c($$0) ? Optional.of((axl<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
