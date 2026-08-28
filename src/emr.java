import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class emr {
   private static final Codec<Either<eek, emr>> a = Codec.either(eek.a, ma.L.q().dispatch(emr::a, ems::codec));
   public static final Codec<emr> c = a.xmap(
      $$0 -> (emr)$$0.map(emq::a, $$0x -> $$0x), $$0 -> $$0.a() == ems.a ? Either.left(((emq)$$0).b()) : Either.right($$0)
   );

   public abstract int a(bam var1, een var2);

   public abstract ems<?> a();
}
