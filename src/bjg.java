import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bjg {
   private static final Codec<Either<Integer, bjg>> a = Codec.either(Codec.INT, kd.M.q().dispatch(bjg::c, bjh::codec));
   public static final Codec<bjg> c = a.xmap(
      $$0 -> (bjg)$$0.map(bjd::a, $$0x -> $$0x), $$0 -> $$0.c() == bjh.a ? Either.left(((bjd)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bjg> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bjg> e = b(1, Integer.MAX_VALUE);

   public static Codec<bjg> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bjg> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return atw.a(
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

   public abstract int a(auv var1);

   public abstract int a();

   public abstract int b();

   public abstract bjh<?> c();
}
