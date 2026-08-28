import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class brb implements brg {
   private static final Codec<Either<Float, brb>> a = Codec.either(Codec.FLOAT, lx.J.q().dispatch(brb::c, brc::codec));
   public static final Codec<brb> c = a.xmap(
      $$0 -> (brb)$$0.map(bqz::a, $$0x -> $$0x), $$0 -> $$0.c() == brc.a ? Either.left(((bqz)$$0).d()) : Either.right($$0)
   );

   public static Codec<brb> a(float $$0, float $$1) {
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

   public abstract brc<?> c();
}
