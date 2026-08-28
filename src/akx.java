import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class akx<E> implements Codec<jw<E>> {
   private final alc<? extends kf<E>> a;
   private final Codec<js<E>> b;
   private final Codec<List<js<E>>> c;
   private final Codec<Either<axp<E>, List<js<E>>>> d;

   private static <E> Codec<List<js<E>>> a(Codec<js<E>> $$0, boolean $$1) {
      Codec<List<js<E>>> $$2 = $$0.listOf().validate(ays.b(js::f));
      return $$1 ? $$2 : ays.c($$0, $$2);
   }

   public static <E> Codec<jw<E>> a(alc<? extends kf<E>> $$0, Codec<js<E>> $$1, boolean $$2) {
      return new akx<>($$0, $$1, $$2);
   }

   private akx(alc<? extends kf<E>> $$0, Codec<js<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(axp.b($$0), this.c);
   }

   public <T> DataResult<Pair<jw<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof alb<T> $$2) {
         Optional<jt<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            jt<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jw<E>> $$2x = (DataResult<jw<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jw.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jw<E>> a(jt<E> $$0, axp<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jw<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jw<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof alb<T> $$3) {
         Optional<jv<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jw<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<js.a<E>> $$1x = new ArrayList<>();

         for (js<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof js.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jw.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jw<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
