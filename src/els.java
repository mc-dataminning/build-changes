import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class els {
   private static final Codec<Either<edl, els>> a = Codec.either(edl.a, mb.L.q().dispatch(els::a, elt::codec));
   public static final Codec<els> c = a.xmap(
      $$0 -> (els)$$0.map(elr::a, $$0x -> $$0x), $$0 -> $$0.a() == elt.a ? Either.left(((elr)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azh var1, edo var2);

   public abstract elt<?> a();
}
