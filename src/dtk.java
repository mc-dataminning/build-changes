import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dtk {
   private static final Codec<Either<dlh, dtk>> a = Codec.either(dlh.a, jd.O.q().dispatch(dtk::a, dtl::codec));
   public static final Codec<dtk> c = a.xmap(
      $$0 -> (dtk)$$0.map(dtj::a, $$0x -> $$0x), $$0 -> $$0.a() == dtl.a ? Either.left(((dtj)$$0).b()) : Either.right($$0)
   );

   public abstract int a(arx var1, dlk var2);

   public abstract dtl<?> a();
}
