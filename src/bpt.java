import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpt implements bpy {
   private static final Codec<Either<Float, bpt>> a = Codec.either(Codec.FLOAT, lt.J.r().dispatch(bpt::c, bpu::codec));
   public static final Codec<bpt> c = a.xmap(
      $$0 -> (bpt)$$0.map(bpr::a, $$0x -> $$0x), $$0 -> $$0.c() == bpu.a ? Either.left(((bpr)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpt> a(float $$0, float $$1) {
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

   public abstract bpu<?> c();
}
