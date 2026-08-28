import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpg implements bpl {
   private static final Codec<Either<Float, bpg>> a = Codec.either(Codec.FLOAT, lq.J.r().dispatch(bpg::c, bph::codec));
   public static final Codec<bpg> c = a.xmap(
      $$0 -> (bpg)$$0.map(bpe::a, $$0x -> $$0x), $$0 -> $$0.c() == bph.a ? Either.left(((bpe)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpg> a(float $$0, float $$1) {
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

   public abstract bph<?> c();
}
