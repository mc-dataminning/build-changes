import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dvc {
   private static final Codec<Either<dmz, dvc>> a = Codec.either(dmz.a, jy.O.q().dispatch(dvc::a, dvd::codec));
   public static final Codec<dvc> c = a.xmap(
      $$0 -> (dvc)$$0.map(dvb::a, $$0x -> $$0x), $$0 -> $$0.a() == dvd.a ? Either.left(((dvb)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ato var1, dnc var2);

   public abstract dvd<?> a();
}
