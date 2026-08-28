import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eop {
   private static final Codec<Either<egh, eop>> a = Codec.either(egh.a, mf.L.q().dispatch(eop::a, eoq::codec));
   public static final Codec<eop> c = a.xmap(
      $$0 -> (eop)$$0.map(eoo::a, $$0x -> $$0x), $$0 -> $$0.a() == eoq.a ? Either.left(((eoo)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azt var1, egk var2);

   public abstract eoq<?> a();
}
