import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpy implements bqd {
   private static final Codec<Either<Float, bpy>> a = Codec.either(Codec.FLOAT, lp.L.q().dispatch(bpy::c, bpz::codec));
   public static final Codec<bpy> c = a.xmap(
      $$0 -> (bpy)$$0.map(bpw::a, $$0x -> $$0x), $$0 -> $$0.c() == bpz.a ? Either.left(((bpw)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpy> a(float $$0, float $$1) {
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

   public abstract bpz<?> c();
}
