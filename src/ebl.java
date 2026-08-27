import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ebl {
   private static final Codec<Either<dti, ebl>> a = Codec.either(dti.a, ki.N.q().dispatch(ebl::a, ebm::codec));
   public static final Codec<ebl> c = a.xmap(
      $$0 -> (ebl)$$0.map(ebk::a, $$0x -> $$0x), $$0 -> $$0.a() == ebm.a ? Either.left(((ebk)$$0).b()) : Either.right($$0)
   );

   public abstract int a(axd var1, dtl var2);

   public abstract ebm<?> a();
}
