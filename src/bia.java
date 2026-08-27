import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bia implements bif {
   private static final Codec<Either<Float, bia>> a = Codec.either(Codec.FLOAT, jy.M.q().dispatch(bia::c, bib::codec));
   public static final Codec<bia> c = a.xmap(
      $$0 -> (bia)$$0.map(bhy::a, $$0x -> $$0x), $$0 -> $$0.c() == bib.a ? Either.left(((bhy)$$0).d()) : Either.right($$0)
   );

   public static Codec<bia> a(float $$0, float $$1) {
      return asu.a(c, (Function<bia, DataResult<bia>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bib<?> c();
}
