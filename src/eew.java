import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eew {
   private static final Codec<Either<dwt, eew>> a = Codec.either(dwt.a, ld.N.q().dispatch(eew::a, eex::codec));
   public static final Codec<eew> c = a.xmap(
      $$0 -> (eew)$$0.map(eev::a, $$0x -> $$0x), $$0 -> $$0.a() == eex.a ? Either.left(((eev)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayg var1, dww var2);

   public abstract eex<?> a();
}
