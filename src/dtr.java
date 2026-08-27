import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dtr {
   private static final Codec<Either<dlo, dtr>> a = Codec.either(dlo.a, jd.O.q().dispatch(dtr::a, dts::codec));
   public static final Codec<dtr> c = a.xmap(
      $$0 -> (dtr)$$0.map(dtq::a, $$0x -> $$0x), $$0 -> $$0.a() == dts.a ? Either.left(((dtq)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ase var1, dlr var2);

   public abstract dts<?> a();
}
