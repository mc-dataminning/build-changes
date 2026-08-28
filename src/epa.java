import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class epa {
   private static final Codec<Either<egs, epa>> a = Codec.either(egs.a, mf.L.q().dispatch(epa::a, epb::codec));
   public static final Codec<epa> c = a.xmap(
      $$0 -> (epa)$$0.map(eoz::a, $$0x -> $$0x), $$0 -> $$0.a() == epb.a ? Either.left(((eoz)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azv var1, egv var2);

   public abstract epb<?> a();
}
