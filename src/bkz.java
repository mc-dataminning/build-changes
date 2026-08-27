import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bkz {
   private static final Codec<Either<Integer, bkz>> a = Codec.either(Codec.INT, kf.M.q().dispatch(bkz::c, bla::codec));
   public static final Codec<bkz> c = a.xmap(
      $$0 -> (bkz)$$0.map(bkw::a, $$0x -> $$0x), $$0 -> $$0.c() == bla.a ? Either.left(((bkw)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bkz> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bkz> e = b(1, Integer.MAX_VALUE);

   public static Codec<bkz> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bkz> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return avp.a(
         $$2,
         (Function<T, DataResult<T>>)($$2x -> {
            if ($$2x.a() < $$0) {
               return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2x.a() + "-" + $$2x.b() + "]");
            } else {
               return $$2x.b() > $$1
                  ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2x.a() + "-" + $$2x.b() + "]")
                  : DataResult.success($$2x);
            }
         })
      );
   }

   public abstract int a(awo var1);

   public abstract int a();

   public abstract int b();

   public abstract bla<?> c();
}
