import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpj implements bpo {
   private static final Codec<Either<Float, bpj>> a = Codec.either(Codec.FLOAT, lq.J.r().dispatch(bpj::c, bpk::codec));
   public static final Codec<bpj> c = a.xmap(
      $$0 -> (bpj)$$0.map(bph::a, $$0x -> $$0x), $$0 -> $$0.c() == bpk.a ? Either.left(((bph)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpj> a(float $$0, float $$1) {
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

   public abstract bpk<?> c();
}
