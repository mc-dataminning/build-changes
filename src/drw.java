import com.mojang.serialization.Codec;

public abstract class drw {
   public static final Codec<drw> a = jd.W.q().dispatch(drw::a, drx::a);

   public static dsf a(dfe $$0) {
      return new dsf($$0);
   }

   public static dsf a(csq $$0) {
      return new dsf($$0.n());
   }

   protected abstract drx<?> a();

   public abstract dfe a(arx var1, gw var2);
}
