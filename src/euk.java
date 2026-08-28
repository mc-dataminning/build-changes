import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euk {
   public static final Codec<eum> a = lx.D.q().dispatch(eum::a, eun::a);
   public static final eun b = a("empty", euh.a);
   public static final eun c = a("item", euj.a);
   public static final eun d = a("loot_table", eup.a);
   public static final eun e = a("dynamic", eug.a);
   public static final eun f = a("tag", eur.a);
   public static final eun g = a("alternatives", eud.a);
   public static final eun h = a("sequence", euq.a);
   public static final eun i = a("group", eui.a);

   private static eun a(String $$0, MapCodec<? extends eum> $$1) {
      return kc.a(lx.D, alh.b($$0), new eun($$1));
   }
}
