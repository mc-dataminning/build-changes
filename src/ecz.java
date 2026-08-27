import com.mojang.serialization.Codec;

public abstract class ecz {
   public static final Codec<ecz> a = lc.V.q().dispatch(ecz::a, eda::a);

   public static edi a(dpy $$0) {
      return new edi($$0);
   }

   public static edi a(dcv $$0) {
      return new edi($$0.n());
   }

   protected abstract eda<?> a();

   public abstract dpy a(ayd var1, im var2);
}
