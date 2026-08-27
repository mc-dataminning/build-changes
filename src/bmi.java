import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bmi {
   private static final Codec<Either<Integer, bmi>> a = Codec.either(Codec.INT, ki.M.q().dispatch(bmi::c, bmj::codec));
   public static final Codec<bmi> c = a.xmap(
      $$0 -> (bmi)$$0.map(bmf::a, $$0x -> $$0x), $$0 -> $$0.c() == bmj.a ? Either.left(((bmf)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bmi> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bmi> e = b(1, Integer.MAX_VALUE);

   public static Codec<bmi> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bmi> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return awe.b(
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

   public abstract int a(axd var1);

   public abstract int a();

   public abstract int b();

   public abstract bmj<?> c();
}
