import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class box implements bpc {
   private static final Codec<Either<Float, box>> a = Codec.either(Codec.FLOAT, le.L.q().dispatch(box::c, boy::codec));
   public static final Codec<box> c = a.xmap(
      $$0 -> (box)$$0.map(bov::a, $$0x -> $$0x), $$0 -> $$0.c() == boy.a ? Either.left(((bov)$$0).d()) : Either.right($$0)
   );

   public static Codec<box> a(float $$0, float $$1) {
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

   public abstract boy<?> c();
}
