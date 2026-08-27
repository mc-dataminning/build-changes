import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bfr implements bfw {
   private static final Codec<Either<Float, bfr>> a = Codec.either(Codec.FLOAT, jc.M.q().dispatch(bfr::c, bfs::codec));
   public static final Codec<bfr> c = a.xmap(
      $$0 -> (bfr)$$0.map(bfp::a, $$0x -> $$0x), $$0 -> $$0.c() == bfs.a ? Either.left(((bfp)$$0).d()) : Either.right($$0)
   );

   public static Codec<bfr> a(float $$0, float $$1) {
      return aqw.a(c, (Function<bfr, DataResult<bfr>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bfs<?> c();
}
