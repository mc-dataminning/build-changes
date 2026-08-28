import com.mojang.serialization.Codec;

public abstract class efp {
   public static final Codec<efp> a = lq.T.r().dispatch(efp::a, efq::a);

   public static efy a(dsk $$0) {
      return new efy($$0);
   }

   public static efy a(dfh $$0) {
      return new efy($$0.o());
   }

   protected abstract efq<?> a();

   public abstract dsk a(ayo var1, ja var2);
}
