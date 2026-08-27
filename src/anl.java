import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record anl<T>(acp<? extends hr<T>> a, acq b) {
   private static final Interner<anl<?>> c = Interners.newWeakInterner();

   @Deprecated
   public anl(acp<? extends hr<T>> a, acq b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<anl<T>> a(acp<? extends hr<T>> $$0) {
      return acq.a.xmap($$1 -> a($$0, $$1), anl::b);
   }

   public static <T> Codec<anl<T>> b(acp<? extends hr<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? acq.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> anl<T> a(acp<? extends hr<T>> $$0, acq $$1) {
      return (anl<T>)c.intern(new anl<>($$0, $$1));
   }

   public boolean c(acp<? extends hr<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<anl<E>> d(acp<? extends hr<E>> $$0) {
      return this.c($$0) ? Optional.of((anl<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
