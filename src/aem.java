import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class aem<E> implements Codec<hf<E>> {
   private final aeo<? extends hs<E>> a;

   public static <E> aem<E> a(aeo<? extends hs<E>> $$0) {
      return new aem<>($$0);
   }

   private aem(aeo<? extends hs<E>> $$0) {
      this.a = $$0;
   }

   public <T> DataResult<T> a(hf<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof aen<?> $$3) {
         Optional<hi<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "Element " + $$0 + " is not valid in current registry set");
            }

            return (DataResult<T>)$$0.d()
               .map(
                  $$2x -> aep.a.encode($$2x.a(), $$1, $$2),
                  $$0x -> DataResult.error(() -> "Elements from registry " + this.a + " can't be serialized to a value")
               );
         }
      }

      return DataResult.error(() -> "Can't access registry " + this.a);
   }

   public <T> DataResult<Pair<hf<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof aen<?> $$2) {
         Optional<hg<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            return aep.a
               .decode($$0, $$1)
               .flatMap(
                  $$1x -> {
                     aep $$2x = (aep)$$1x.getFirst();
                     return $$3.get()
                        .a(aeo.a(this.a, $$2x))
                        .<DataResult>map(DataResult::success)
                        .orElseGet(() -> DataResult.error(() -> "Failed to get element " + $$2x))
                        .map($$1xx -> Pair.of($$1xx, $$1x.getSecond()))
                        .setLifecycle(Lifecycle.stable());
                  }
               );
         }
      }

      return DataResult.error(() -> "Can't access registry " + this.a);
   }

   @Override
   public String toString() {
      return "RegistryFixedCodec[" + this.a + "]";
   }
}
