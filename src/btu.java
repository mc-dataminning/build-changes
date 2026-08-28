import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class btu implements btz {
   private static final Codec<Either<Float, btu>> a = Codec.either(Codec.FLOAT, mg.J.q().dispatch(btu::c, btv::codec));
   public static final Codec<btu> c = a.xmap(
      $$0 -> (btu)$$0.map(bts::a, $$0x -> $$0x), $$0 -> $$0.c() == btv.a ? Either.left(((bts)$$0).d()) : Either.right($$0)
   );

   public static Codec<btu> a(float $$0, float $$1) {
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

   public abstract btv<?> c();
}
