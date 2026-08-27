import com.mojang.serialization.Codec;

public abstract class dsd {
   public static final Codec<dsd> a = jd.W.q().dispatch(dsd::a, dse::a);

   public static dsm a(dfl $$0) {
      return new dsm($$0);
   }

   public static dsm a(csx $$0) {
      return new dsm($$0.n());
   }

   protected abstract dse<?> a();

   public abstract dfl a(ase var1, gw var2);
}
