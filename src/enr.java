import com.mojang.serialization.Codec;

public abstract class enr {
   public static final Codec<enr> a = mf.T.q().dispatch(enr::a, ens::a);

   public static eoa a(eah $$0) {
      return new eoa($$0);
   }

   public static eoa a(dmf $$0) {
      return new eoa($$0.m());
   }

   protected abstract ens<?> a();

   public abstract eah a(azv var1, iu var2);
}
