import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egr {
   private static final Codec<Either<dyo, egr>> a = Codec.either(dyo.a, lp.N.q().dispatch(egr::a, egs::codec));
   public static final Codec<egr> c = a.xmap(
      $$0 -> (egr)$$0.map(egq::a, $$0x -> $$0x), $$0 -> $$0.a() == egs.a ? Either.left(((egq)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azh var1, dyr var2);

   public abstract egs<?> a();
}
