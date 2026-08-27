import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bnv {
   private static final Codec<Either<Integer, bnv>> a = Codec.either(Codec.INT, lc.M.q().dispatch(bnv::c, bnw::codec));
   public static final Codec<bnv> c = a.xmap(
      $$0 -> (bnv)$$0.map(bns::a, $$0x -> $$0x), $$0 -> $$0.c() == bnw.a ? Either.left(((bns)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bnv> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bnv> e = b(1, Integer.MAX_VALUE);

   public static Codec<bnv> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bnv> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return axe.b(
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

   public abstract int a(ayd var1);

   public abstract int a();

   public abstract int b();

   public abstract bnw<?> c();
}
