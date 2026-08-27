import com.mojang.serialization.Codec;

public abstract class edi {
   public static final Codec<edi> a = ld.V.q().dispatch(edi::a, edj::a);

   public static edr a(dqh $$0) {
      return new edr($$0);
   }

   public static edr a(dde $$0) {
      return new edr($$0.n());
   }

   protected abstract edj<?> a();

   public abstract dqh a(ayg var1, in var2);
}
