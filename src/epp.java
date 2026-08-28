import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class epp {
   private static final Codec<Either<ehh, epp>> a = Codec.either(ehh.a, mg.L.q().dispatch(epp::a, epq::codec));
   public static final Codec<epp> c = a.xmap(
      $$0 -> (epp)$$0.map(epo::a, $$0x -> $$0x), $$0 -> $$0.a() == epq.a ? Either.left(((epo)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azv var1, ehk var2);

   public abstract epq<?> a();
}
