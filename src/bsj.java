import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bsj {
   private static final Codec<Either<Integer, bsj>> a = Codec.either(Codec.INT, ma.K.q().dispatch(bsj::c, bsk::codec));
   public static final Codec<bsj> c = a.xmap(
      $$0 -> (bsj)$$0.map(bsg::a, $$0x -> $$0x), $$0 -> $$0.c() == bsk.a ? Either.left(((bsg)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bsj> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bsj> e = b(1, Integer.MAX_VALUE);

   public static Codec<bsj> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bsj> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return $$2.validate($$2x -> a($$0, $$1, $$2x));
   }

   private static <T extends bsj> DataResult<T> a(int $$0, int $$1, T $$2) {
      if ($$2.a() < $$0) {
         return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
      } else {
         return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
      }
   }

   public abstract int a(bam var1);

   public abstract int a();

   public abstract int b();

   public abstract bsk<?> c();
}
