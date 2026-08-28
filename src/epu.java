import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class epu {
   private static final Codec<Either<ehm, epu>> a = Codec.either(ehm.a, mg.L.q().dispatch(epu::a, epv::codec));
   public static final Codec<epu> c = a.xmap(
      $$0 -> (epu)$$0.map(ept::a, $$0x -> $$0x), $$0 -> $$0.a() == epv.a ? Either.left(((ept)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azv var1, ehp var2);

   public abstract epv<?> a();
}
