import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class alf<E> implements Codec<jq<E>> {
   private final ali<? extends kd<E>> a;
   private final Codec<E> b;
   private final boolean c;

   public static <E> alf<E> a(ali<? extends kd<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, true);
   }

   public static <E> alf<E> a(ali<? extends kd<E>> $$0, Codec<E> $$1, boolean $$2) {
      return new alf<>($$0, $$1, $$2);
   }

   private alf(ali<? extends kd<E>> $$0, Codec<E> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public <T> DataResult<T> a(jq<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof alh<?> $$3) {
         Optional<jt<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "Element " + $$0 + " is not valid in current registry set");
            }

            return (DataResult<T>)$$0.d().map($$2x -> alj.a.encode($$2x.a(), $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
         }
      }

      return this.b.encode($$0.a(), $$1, $$2);
   }

   public <T> DataResult<Pair<jq<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof alh<?> $$2) {
         Optional<jr<E>> $$3 = $$2.b(this.a);
         if ($$3.isEmpty()) {
            return DataResult.error(() -> "Registry does not exist: " + this.a);
         } else {
            jr<E> $$4 = $$3.get();
            DataResult<Pair<alj, T>> $$5 = alj.a.decode($$0, $$1);
            if ($$5.result().isEmpty()) {
               return !this.c ? DataResult.error(() -> "Inline definitions not allowed here") : this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(jq::a));
            } else {
               Pair<alj, T> $$6 = (Pair<alj, T>)$$5.result().get();
               ali<E> $$7 = ali.a(this.a, (alj)$$6.getFirst());
               return $$4.a($$7)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Failed to get element " + $$7))
                  .map($$1x -> Pair.of($$1x, $$6.getSecond()))
                  .setLifecycle(Lifecycle.stable());
            }
         }
      } else {
         return this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(jq::a));
      }
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.a + " " + this.b + "]";
   }
}
