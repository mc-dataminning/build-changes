import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bnk {
   private static final Codec<Either<Integer, bnk>> a = Codec.either(Codec.INT, kt.M.q().dispatch(bnk::c, bnl::codec));
   public static final Codec<bnk> c = a.xmap(
      $$0 -> (bnk)$$0.map(bnh::a, $$0x -> $$0x), $$0 -> $$0.c() == bnl.a ? Either.left(((bnh)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bnk> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bnk> e = b(1, Integer.MAX_VALUE);

   public static Codec<bnk> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bnk> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return awu.b(
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

   public abstract int a(axt var1);

   public abstract int a();

   public abstract int b();

   public abstract bnl<?> c();
}
