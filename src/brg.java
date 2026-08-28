import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class brg implements brl {
   private static final Codec<Either<Float, brg>> a = Codec.either(Codec.FLOAT, ly.J.q().dispatch(brg::c, brh::codec));
   public static final Codec<brg> c = a.xmap(
      $$0 -> (brg)$$0.map(bre::a, $$0x -> $$0x), $$0 -> $$0.c() == brh.a ? Either.left(((bre)$$0).d()) : Either.right($$0)
   );

   public static Codec<brg> a(float $$0, float $$1) {
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

   public abstract brh<?> c();
}
