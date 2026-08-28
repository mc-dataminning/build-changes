import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class buf implements buk {
   private static final Codec<Either<Float, buf>> a = Codec.either(Codec.FLOAT, mh.J.q().dispatch(buf::c, bug::codec));
   public static final Codec<buf> c = a.xmap(
      $$0 -> (buf)$$0.map(bud::a, $$0x -> $$0x), $$0 -> $$0.c() == bug.a ? Either.left(((bud)$$0).d()) : Either.right($$0)
   );

   public static Codec<buf> a(float $$0, float $$1) {
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

   public abstract bug<?> c();
}
