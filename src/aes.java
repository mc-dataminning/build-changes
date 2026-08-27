import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class aes<E> implements Codec<he<E>> {
   private final aev<? extends hq<E>> a;
   private final Codec<E> b;
   private final boolean c;

   public static <E> aes<E> a(aev<? extends hq<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, true);
   }

   public static <E> aes<E> a(aev<? extends hq<E>> $$0, Codec<E> $$1, boolean $$2) {
      return new aes<>($$0, $$1, $$2);
   }

   private aes(aev<? extends hq<E>> $$0, Codec<E> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public <T> DataResult<T> a(he<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof aeu<?> $$3) {
         Optional<hh<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "Element " + $$0 + " is not valid in current registry set");
            }

            return (DataResult<T>)$$0.d().map($$2x -> aew.a.encode($$2x.a(), $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
         }
      }

      return this.b.encode($$0.a(), $$1, $$2);
   }

   public <T> DataResult<Pair<he<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof aeu<?> $$2) {
         Optional<hf<E>> $$3 = $$2.b(this.a);
         if ($$3.isEmpty()) {
            return DataResult.error(() -> "Registry does not exist: " + this.a);
         } else {
            hf<E> $$4 = $$3.get();
            DataResult<Pair<aew, T>> $$5 = aew.a.decode($$0, $$1);
            if ($$5.result().isEmpty()) {
               return !this.c ? DataResult.error(() -> "Inline definitions not allowed here") : this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(he::a));
            } else {
               Pair<aew, T> $$6 = (Pair<aew, T>)$$5.result().get();
               aev<E> $$7 = aev.a(this.a, (aew)$$6.getFirst());
               return $$4.a($$7)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Failed to get element " + $$7))
                  .map($$1x -> Pair.of($$1x, $$6.getSecond()))
                  .setLifecycle(Lifecycle.stable());
            }
         }
      } else {
         return this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(he::a));
      }
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.a + " " + this.b + "]";
   }
}
