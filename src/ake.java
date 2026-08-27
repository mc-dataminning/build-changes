import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class ake<E> implements Codec<iw<E>> {
   private final akg<? extends jj<E>> a;

   public static <E> ake<E> a(akg<? extends jj<E>> $$0) {
      return new ake<>($$0);
   }

   private ake(akg<? extends jj<E>> $$0) {
      this.a = $$0;
   }

   public <T> DataResult<T> a(iw<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof akf<?> $$3) {
         Optional<iz<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "Element " + $$0 + " is not valid in current registry set");
            }

            return (DataResult<T>)$$0.d()
               .map(
                  $$2x -> akh.a.encode($$2x.a(), $$1, $$2),
                  $$0x -> DataResult.error(() -> "Elements from registry " + this.a + " can't be serialized to a value")
               );
         }
      }

      return DataResult.error(() -> "Can't access registry " + this.a);
   }

   public <T> DataResult<Pair<iw<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof akf<?> $$2) {
         Optional<ix<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            return akh.a
               .decode($$0, $$1)
               .flatMap(
                  $$1x -> {
                     akh $$2x = (akh)$$1x.getFirst();
                     return $$3.get()
                        .a(akg.a(this.a, $$2x))
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
