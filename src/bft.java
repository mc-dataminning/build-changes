import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bft implements bfy {
   private static final Codec<Either<Float, bft>> a = Codec.either(Codec.FLOAT, jb.M.q().dispatch(bft::c, bfu::codec));
   public static final Codec<bft> c = a.xmap(
      $$0 -> (bft)$$0.map(bfr::a, $$0x -> $$0x), $$0 -> $$0.c() == bfu.a ? Either.left(((bfr)$$0).d()) : Either.right($$0)
   );

   public static Codec<bft> a(float $$0, float $$1) {
      return aqy.a(c, (Function<bft, DataResult<bft>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bfu<?> c();
}
