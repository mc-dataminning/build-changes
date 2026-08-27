import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class blb {
   private static final Codec<Either<Integer, blb>> a = Codec.either(Codec.INT, kf.M.q().dispatch(blb::c, blc::codec));
   public static final Codec<blb> c = a.xmap(
      $$0 -> (blb)$$0.map(bky::a, $$0x -> $$0x), $$0 -> $$0.c() == blc.a ? Either.left(((bky)$$0).d()) : Either.right($$0)
   );
   public static final Codec<blb> d = b(0, Integer.MAX_VALUE);
   public static final Codec<blb> e = b(1, Integer.MAX_VALUE);

   public static Codec<blb> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends blb> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return avq.a(
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

   public abstract int a(awp var1);

   public abstract int a();

   public abstract int b();

   public abstract blc<?> c();
}
