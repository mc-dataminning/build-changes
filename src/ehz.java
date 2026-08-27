import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ehz {
   private static final Codec<Either<dzo, ehz>> a = Codec.either(dzo.a, lh.N.q().dispatch(ehz::a, eia::codec));
   public static final Codec<ehz> c = a.xmap(
      $$0 -> (ehz)$$0.map(ehy::a, $$0x -> $$0x), $$0 -> $$0.a() == eia.a ? Either.left(((ehy)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayt var1, dzr var2);

   public abstract eia<?> a();
}
