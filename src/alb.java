import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class alb<E> implements Codec<ji<E>> {
   private final ale<? extends jv<E>> a;
   private final Codec<E> b;
   private final boolean c;

   public static <E> alb<E> a(ale<? extends jv<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, true);
   }

   public static <E> alb<E> a(ale<? extends jv<E>> $$0, Codec<E> $$1, boolean $$2) {
      return new alb<>($$0, $$1, $$2);
   }

   private alb(ale<? extends jv<E>> $$0, Codec<E> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public <T> DataResult<T> a(ji<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof ald<?> $$3) {
         Optional<jl<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "Element " + $$0 + " is not valid in current registry set");
            }

            return (DataResult<T>)$$0.d().map($$2x -> alf.a.encode($$2x.a(), $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
         }
      }

      return this.b.encode($$0.a(), $$1, $$2);
   }

   public <T> DataResult<Pair<ji<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof ald<?> $$2) {
         Optional<jj<E>> $$3 = $$2.b(this.a);
         if ($$3.isEmpty()) {
            return DataResult.error(() -> "Registry does not exist: " + this.a);
         } else {
            jj<E> $$4 = $$3.get();
            DataResult<Pair<alf, T>> $$5 = alf.a.decode($$0, $$1);
            if ($$5.result().isEmpty()) {
               return !this.c ? DataResult.error(() -> "Inline definitions not allowed here") : this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(ji::a));
            } else {
               Pair<alf, T> $$6 = (Pair<alf, T>)$$5.result().get();
               ale<E> $$7 = ale.a(this.a, (alf)$$6.getFirst());
               return $$4.a($$7)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Failed to get element " + $$7))
                  .map($$1x -> Pair.of($$1x, $$6.getSecond()))
                  .setLifecycle(Lifecycle.stable());
            }
         }
      } else {
         return this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(ji::a));
      }
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.a + " " + this.b + "]";
   }
}
