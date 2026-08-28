import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ala<E> implements Codec<jj<E>> {
   private final alf<? extends js<E>> a;
   private final Codec<jf<E>> b;
   private final Codec<List<jf<E>>> c;
   private final Codec<Either<axr<E>, List<jf<E>>>> d;

   private static <E> Codec<List<jf<E>>> a(Codec<jf<E>> $$0, boolean $$1) {
      Codec<List<jf<E>>> $$2 = $$0.listOf().validate(ayu.b(jf::f));
      return $$1 ? $$2 : ayu.c($$0, $$2);
   }

   public static <E> Codec<jj<E>> a(alf<? extends js<E>> $$0, Codec<jf<E>> $$1, boolean $$2) {
      return new ala<>($$0, $$1, $$2);
   }

   private ala(alf<? extends js<E>> $$0, Codec<jf<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(axr.b($$0), this.c);
   }

   public <T> DataResult<Pair<jj<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof ale<T> $$2) {
         Optional<jg<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            jg<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jj<E>> $$2x = (DataResult<jj<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jj.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jj<E>> a(jg<E> $$0, axr<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jj<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jj<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof ale<T> $$3) {
         Optional<ji<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jj<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<jf.a<E>> $$1x = new ArrayList<>();

         for (jf<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof jf.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jj.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jj<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
