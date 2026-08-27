import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bnf {
   private static final Codec<Either<Integer, bnf>> a = Codec.either(Codec.INT, kr.M.q().dispatch(bnf::c, bng::codec));
   public static final Codec<bnf> c = a.xmap(
      $$0 -> (bnf)$$0.map(bnc::a, $$0x -> $$0x), $$0 -> $$0.c() == bng.a ? Either.left(((bnc)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bnf> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bnf> e = b(1, Integer.MAX_VALUE);

   public static Codec<bnf> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bnf> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return aws.b(
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

   public abstract int a(axr var1);

   public abstract int a();

   public abstract int b();

   public abstract bng<?> c();
}
