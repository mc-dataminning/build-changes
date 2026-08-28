import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class btb implements btg {
   private static final Codec<Either<Float, btb>> a = Codec.either(Codec.FLOAT, mf.J.q().dispatch(btb::c, btc::codec));
   public static final Codec<btb> c = a.xmap(
      $$0 -> (btb)$$0.map(bsz::a, $$0x -> $$0x), $$0 -> $$0.c() == btc.a ? Either.left(((bsz)$$0).d()) : Either.right($$0)
   );

   public static Codec<btb> a(float $$0, float $$1) {
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

   public abstract btc<?> c();
}
