import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class brq {
   private static final Codec<Either<Integer, brq>> a = Codec.either(Codec.INT, mb.K.q().dispatch(brq::c, brr::codec));
   public static final Codec<brq> c = a.xmap(
      $$0 -> (brq)$$0.map(brn::a, $$0x -> $$0x), $$0 -> $$0.c() == brr.a ? Either.left(((brn)$$0).d()) : Either.right($$0)
   );
   public static final Codec<brq> d = b(0, Integer.MAX_VALUE);
   public static final Codec<brq> e = b(1, Integer.MAX_VALUE);

   public static Codec<brq> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends brq> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return $$2.validate($$2x -> a($$0, $$1, $$2x));
   }

   private static <T extends brq> DataResult<T> a(int $$0, int $$1, T $$2) {
      if ($$2.a() < $$0) {
         return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
      } else {
         return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
      }
   }

   public abstract int a(azh var1);

   public abstract int a();

   public abstract int b();

   public abstract brr<?> c();
}
