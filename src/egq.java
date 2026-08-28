import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egq {
   private static final Codec<Either<dyn, egq>> a = Codec.either(dyn.a, lp.N.q().dispatch(egq::a, egr::codec));
   public static final Codec<egq> c = a.xmap(
      $$0 -> (egq)$$0.map(egp::a, $$0x -> $$0x), $$0 -> $$0.a() == egr.a ? Either.left(((egp)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azg var1, dyq var2);

   public abstract egr<?> a();
}
