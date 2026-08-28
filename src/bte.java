import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bte implements btj {
   private static final Codec<Either<Float, bte>> a = Codec.either(Codec.FLOAT, mf.J.q().dispatch(bte::c, btf::codec));
   public static final Codec<bte> c = a.xmap(
      $$0 -> (bte)$$0.map(btc::a, $$0x -> $$0x), $$0 -> $$0.c() == btf.a ? Either.left(((btc)$$0).d()) : Either.right($$0)
   );

   public static Codec<bte> a(float $$0, float $$1) {
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

   public abstract btf<?> c();
}
