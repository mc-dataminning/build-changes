import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egs {
   private static final Codec<Either<dyp, egs>> a = Codec.either(dyp.a, lp.N.q().dispatch(egs::a, egt::codec));
   public static final Codec<egs> c = a.xmap(
      $$0 -> (egs)$$0.map(egr::a, $$0x -> $$0x), $$0 -> $$0.a() == egt.a ? Either.left(((egr)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azh var1, dys var2);

   public abstract egt<?> a();
}
