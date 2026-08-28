import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpu {
   private static final Codec<Either<Integer, bpu>> a = Codec.either(Codec.INT, lp.M.q().dispatch(bpu::c, bpv::codec));
   public static final Codec<bpu> c = a.xmap(
      $$0 -> (bpu)$$0.map(bpr::a, $$0x -> $$0x), $$0 -> $$0.c() == bpv.a ? Either.left(((bpr)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bpu> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bpu> e = b(1, Integer.MAX_VALUE);

   public static Codec<bpu> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bpu> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return $$2.validate($$2x -> a($$0, $$1, $$2x));
   }

   private static <T extends bpu> DataResult<T> a(int $$0, int $$1, T $$2) {
      if ($$2.a() < $$0) {
         return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
      } else {
         return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
      }
   }

   public abstract int a(azc var1);

   public abstract int a();

   public abstract int b();

   public abstract bpv<?> c();
}
