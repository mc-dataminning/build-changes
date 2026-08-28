import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class emq {
   private static final Codec<Either<eej, emq>> a = Codec.either(eej.a, ma.L.q().dispatch(emq::a, emr::codec));
   public static final Codec<emq> c = a.xmap(
      $$0 -> (emq)$$0.map(emp::a, $$0x -> $$0x), $$0 -> $$0.a() == emr.a ? Either.left(((emp)$$0).b()) : Either.right($$0)
   );

   public abstract int a(bam var1, eem var2);

   public abstract emr<?> a();
}
