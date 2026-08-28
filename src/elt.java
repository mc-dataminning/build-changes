import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class elt {
   private static final Codec<Either<edm, elt>> a = Codec.either(edm.a, mb.L.q().dispatch(elt::a, elu::codec));
   public static final Codec<elt> c = a.xmap(
      $$0 -> (elt)$$0.map(els::a, $$0x -> $$0x), $$0 -> $$0.a() == elu.a ? Either.left(((els)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azh var1, edp var2);

   public abstract elu<?> a();
}
