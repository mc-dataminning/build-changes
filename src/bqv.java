import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bqv implements bra {
   private static final Codec<Either<Float, bqv>> a = Codec.either(Codec.FLOAT, lv.J.q().dispatch(bqv::c, bqw::codec));
   public static final Codec<bqv> c = a.xmap(
      $$0 -> (bqv)$$0.map(bqt::a, $$0x -> $$0x), $$0 -> $$0.c() == bqw.a ? Either.left(((bqt)$$0).d()) : Either.right($$0)
   );

   public static Codec<bqv> a(float $$0, float $$1) {
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

   public abstract bqw<?> c();
}
