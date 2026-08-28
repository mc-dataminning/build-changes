import com.mojang.serialization.Codec;

public abstract class elb {
   public static final Codec<elb> a = ma.T.q().dispatch(elb::a, elc::a);

   public static elk a(dxv $$0) {
      return new elk($$0);
   }

   public static elk a(dkm $$0) {
      return new elk($$0.m());
   }

   protected abstract elc<?> a();

   public abstract dxv a(bam var1, jh var2);
}
