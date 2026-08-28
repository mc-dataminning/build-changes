import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eqk {
   private static final Codec<Either<ehz, eqk>> a = Codec.either(ehz.a, mh.L.q().dispatch(eqk::a, eql::codec));
   public static final Codec<eqk> c = a.xmap(
      $$0 -> (eqk)$$0.map(eqj::a, $$0x -> $$0x), $$0 -> $$0.a() == eql.a ? Either.left(((eqj)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azz var1, eic var2);

   public abstract eql<?> a();
}
