import com.mojang.serialization.Codec;

public abstract class egl {
   public static final Codec<egl> a = lh.V.q().dispatch(egl::a, egm::a);

   public static egu a(dtc $$0) {
      return new egu($$0);
   }

   public static egu a(dfc $$0) {
      return new egu($$0.n());
   }

   protected abstract egm<?> a();

   public abstract dtc a(ayt var1, ir var2);
}
