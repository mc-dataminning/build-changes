import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dvo {
   private static final Codec<Either<dnl, dvo>> a = Codec.either(dnl.a, jy.O.q().dispatch(dvo::a, dvp::codec));
   public static final Codec<dvo> c = a.xmap(
      $$0 -> (dvo)$$0.map(dvn::a, $$0x -> $$0x), $$0 -> $$0.a() == dvp.a ? Either.left(((dvn)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ats var1, dno var2);

   public abstract dvp<?> a();
}
