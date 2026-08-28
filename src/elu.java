import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class elu {
   private static final Codec<Either<edn, elu>> a = Codec.either(edn.a, mb.L.q().dispatch(elu::a, elv::codec));
   public static final Codec<elu> c = a.xmap(
      $$0 -> (elu)$$0.map(elt::a, $$0x -> $$0x), $$0 -> $$0.a() == elv.a ? Either.left(((elt)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azh var1, edq var2);

   public abstract elv<?> a();
}
