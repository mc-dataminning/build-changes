import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aqa<T>(aeq<? extends hr<T>> a, aer b) {
   private static final Interner<aqa<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aqa(aeq<? extends hr<T>> a, aer b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aqa<T>> a(aeq<? extends hr<T>> $$0) {
      return aer.a.xmap($$1 -> a($$0, $$1), aqa::b);
   }

   public static <T> Codec<aqa<T>> b(aeq<? extends hr<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aer.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aqa<T> a(aeq<? extends hr<T>> $$0, aer $$1) {
      return (aqa<T>)c.intern(new aqa<>($$0, $$1));
   }

   public boolean c(aeq<? extends hr<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aqa<E>> d(aeq<? extends hr<E>> $$0) {
      return this.c($$0) ? Optional.of((aqa<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
