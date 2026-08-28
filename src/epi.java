import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class epi {
   private static final Codec<Either<eha, epi>> a = Codec.either(eha.a, mf.L.q().dispatch(epi::a, epj::codec));
   public static final Codec<epi> c = a.xmap(
      $$0 -> (epi)$$0.map(eph::a, $$0x -> $$0x), $$0 -> $$0.a() == epj.a ? Either.left(((eph)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azv var1, ehd var2);

   public abstract epj<?> a();
}
