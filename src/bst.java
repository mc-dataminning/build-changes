import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bst implements bsy {
   private static final Codec<Either<Float, bst>> a = Codec.either(Codec.FLOAT, md.J.q().dispatch(bst::c, bsu::codec));
   public static final Codec<bst> c = a.xmap(
      $$0 -> (bst)$$0.map(bsr::a, $$0x -> $$0x), $$0 -> $$0.c() == bsu.a ? Either.left(((bsr)$$0).d()) : Either.right($$0)
   );

   public static Codec<bst> a(float $$0, float $$1) {
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

   public abstract bsu<?> c();
}
