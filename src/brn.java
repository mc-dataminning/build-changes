import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class brn implements brs {
   private static final Codec<Either<Float, brn>> a = Codec.either(Codec.FLOAT, mb.J.q().dispatch(brn::c, bro::codec));
   public static final Codec<brn> c = a.xmap(
      $$0 -> (brn)$$0.map(brl::a, $$0x -> $$0x), $$0 -> $$0.c() == bro.a ? Either.left(((brl)$$0).d()) : Either.right($$0)
   );

   public static Codec<brn> a(float $$0, float $$1) {
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

   public abstract bro<?> c();
}
