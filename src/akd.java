import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class akd<E> implements Codec<iw<E>> {
   private final akg<? extends jj<E>> a;
   private final Codec<E> b;
   private final boolean c;

   public static <E> akd<E> a(akg<? extends jj<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, true);
   }

   public static <E> akd<E> a(akg<? extends jj<E>> $$0, Codec<E> $$1, boolean $$2) {
      return new akd<>($$0, $$1, $$2);
   }

   private akd(akg<? extends jj<E>> $$0, Codec<E> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public <T> DataResult<T> a(iw<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof akf<?> $$3) {
         Optional<iz<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "Element " + $$0 + " is not valid in current registry set");
            }

            return (DataResult<T>)$$0.d().map($$2x -> akh.a.encode($$2x.a(), $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
         }
      }

      return this.b.encode($$0.a(), $$1, $$2);
   }

   public <T> DataResult<Pair<iw<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof akf<?> $$2) {
         Optional<ix<E>> $$3 = $$2.b(this.a);
         if ($$3.isEmpty()) {
            return DataResult.error(() -> "Registry does not exist: " + this.a);
         } else {
            ix<E> $$4 = $$3.get();
            DataResult<Pair<akh, T>> $$5 = akh.a.decode($$0, $$1);
            if ($$5.result().isEmpty()) {
               return !this.c ? DataResult.error(() -> "Inline definitions not allowed here") : this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(iw::a));
            } else {
               Pair<akh, T> $$6 = (Pair<akh, T>)$$5.result().get();
               akg<E> $$7 = akg.a(this.a, (akh)$$6.getFirst());
               return $$4.a($$7)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Failed to get element " + $$7))
                  .map($$1x -> Pair.of($$1x, $$6.getSecond()))
                  .setLifecycle(Lifecycle.stable());
            }
         }
      } else {
         return this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(iw::a));
      }
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.a + " " + this.b + "]";
   }
}
