import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dvt {
   private static final Codec<Either<dnq, dvt>> a = Codec.either(dnq.a, kc.O.q().dispatch(dvt::a, dvu::codec));
   public static final Codec<dvt> c = a.xmap(
      $$0 -> (dvt)$$0.map(dvs::a, $$0x -> $$0x), $$0 -> $$0.a() == dvu.a ? Either.left(((dvs)$$0).b()) : Either.right($$0)
   );

   public abstract int a(atw var1, dnt var2);

   public abstract dvu<?> a();
}
