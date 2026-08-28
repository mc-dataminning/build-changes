import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egp {
   private static final Codec<Either<dym, egp>> a = Codec.either(dym.a, lp.N.q().dispatch(egp::a, egq::codec));
   public static final Codec<egp> c = a.xmap(
      $$0 -> (egp)$$0.map(ego::a, $$0x -> $$0x), $$0 -> $$0.a() == egq.a ? Either.left(((ego)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azf var1, dyp var2);

   public abstract egq<?> a();
}
