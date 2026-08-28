import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class brl implements brq {
   private static final Codec<Either<Float, brl>> a = Codec.either(Codec.FLOAT, mb.J.q().dispatch(brl::c, brm::codec));
   public static final Codec<brl> c = a.xmap(
      $$0 -> (brl)$$0.map(brj::a, $$0x -> $$0x), $$0 -> $$0.c() == brm.a ? Either.left(((brj)$$0).d()) : Either.right($$0)
   );

   public static Codec<brl> a(float $$0, float $$1) {
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

   public abstract brm<?> c();
}
