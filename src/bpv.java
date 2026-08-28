import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpv implements bqa {
   private static final Codec<Either<Float, bpv>> a = Codec.either(Codec.FLOAT, lp.L.q().dispatch(bpv::c, bpw::codec));
   public static final Codec<bpv> c = a.xmap(
      $$0 -> (bpv)$$0.map(bpt::a, $$0x -> $$0x), $$0 -> $$0.c() == bpw.a ? Either.left(((bpt)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpv> a(float $$0, float $$1) {
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

   public abstract bpw<?> c();
}
