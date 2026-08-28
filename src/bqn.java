import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bqn implements bqs {
   private static final Codec<Either<Float, bqn>> a = Codec.either(Codec.FLOAT, lu.J.q().dispatch(bqn::c, bqo::codec));
   public static final Codec<bqn> c = a.xmap(
      $$0 -> (bqn)$$0.map(bql::a, $$0x -> $$0x), $$0 -> $$0.c() == bqo.a ? Either.left(((bql)$$0).d()) : Either.right($$0)
   );

   public static Codec<bqn> a(float $$0, float $$1) {
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

   public abstract bqo<?> c();
}
