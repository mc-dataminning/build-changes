import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bjh {
   private static final Codec<Either<Integer, bjh>> a = Codec.either(Codec.INT, kd.M.q().dispatch(bjh::c, bji::codec));
   public static final Codec<bjh> c = a.xmap(
      $$0 -> (bjh)$$0.map(bje::a, $$0x -> $$0x), $$0 -> $$0.c() == bji.a ? Either.left(((bje)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bjh> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bjh> e = b(1, Integer.MAX_VALUE);

   public static Codec<bjh> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bjh> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return atx.a(
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

   public abstract int a(auw var1);

   public abstract int a();

   public abstract int b();

   public abstract bji<?> c();
}
