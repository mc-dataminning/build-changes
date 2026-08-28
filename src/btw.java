import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class btw implements bub {
   private static final Codec<Either<Float, btw>> a = Codec.either(Codec.FLOAT, mh.J.q().dispatch(btw::c, btx::codec));
   public static final Codec<btw> c = a.xmap(
      $$0 -> (btw)$$0.map(btu::a, $$0x -> $$0x), $$0 -> $$0.c() == btx.a ? Either.left(((btu)$$0).d()) : Either.right($$0)
   );

   public static Codec<btw> a(float $$0, float $$1) {
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

   public abstract btx<?> c();
}
