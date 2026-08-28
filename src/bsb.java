import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bsb implements bsg {
   private static final Codec<Either<Float, bsb>> a = Codec.either(Codec.FLOAT, mb.J.q().dispatch(bsb::c, bsc::codec));
   public static final Codec<bsb> c = a.xmap(
      $$0 -> (bsb)$$0.map(brz::a, $$0x -> $$0x), $$0 -> $$0.c() == bsc.a ? Either.left(((brz)$$0).d()) : Either.right($$0)
   );

   public static Codec<bsb> a(float $$0, float $$1) {
      return c.validate($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      });
   }

   public abstract float a();

   public abstract float b();

   public abstract bsc<?> c();
}
