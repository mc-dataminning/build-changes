import com.mojang.serialization.Codec;

public abstract class dsb {
   public static final Codec<dsb> a = jd.W.q().dispatch(dsb::a, dsc::a);

   public static dsk a(dfj $$0) {
      return new dsk($$0);
   }

   public static dsk a(csv $$0) {
      return new dsk($$0.n());
   }

   protected abstract dsc<?> a();

   public abstract dfj a(asc var1, gw var2);
}
