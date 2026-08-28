import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class equ {
   private static final Codec<Either<eij, equ>> a = Codec.either(eij.a, mh.L.q().dispatch(equ::a, eqv::codec));
   public static final Codec<equ> c = a.xmap(
      $$0 -> (equ)$$0.map(eqt::a, $$0x -> $$0x), $$0 -> $$0.a() == eqv.a ? Either.left(((eqt)$$0).b()) : Either.right($$0)
   );

   public abstract int a(bai var1, eim var2);

   public abstract eqv<?> a();
}
