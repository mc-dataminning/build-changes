import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewv {
   public static final Codec<ewx> a = ma.D.q().dispatch(ewx::a, ewy::a);
   public static final ewy b = a("empty", ews.a);
   public static final ewy c = a("item", ewu.a);
   public static final ewy d = a("loot_table", exa.a);
   public static final ewy e = a("dynamic", ewr.a);
   public static final ewy f = a("tag", exc.a);
   public static final ewy g = a("alternatives", ewo.a);
   public static final ewy h = a("sequence", exb.a);
   public static final ewy i = a("group", ewt.a);

   private static ewy a(String $$0, MapCodec<? extends ewx> $$1) {
      return kd.a(ma.D, alz.b($$0), new ewy($$1));
   }
}
