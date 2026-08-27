import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class boz implements bpe {
   private static final Codec<Either<Float, boz>> a = Codec.either(Codec.FLOAT, le.L.q().dispatch(boz::c, bpa::codec));
   public static final Codec<boz> c = a.xmap(
      $$0 -> (boz)$$0.map(box::a, $$0x -> $$0x), $$0 -> $$0.c() == bpa.a ? Either.left(((box)$$0).d()) : Either.right($$0)
   );

   public static Codec<boz> a(float $$0, float $$1) {
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

   public abstract bpa<?> c();
}
