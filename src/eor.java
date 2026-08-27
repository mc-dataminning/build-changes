import com.mojang.serialization.Codec;

public class eor {
   public static final Codec<eot> a = lc.F.q().dispatch(eot::a, eou::a);
   public static final eou b = a("empty", eoo.a);
   public static final eou c = a("item", eoq.a);
   public static final eou d = a("loot_table", eow.a);
   public static final eou e = a("dynamic", eon.a);
   public static final eou f = a("tag", eoy.a);
   public static final eou g = a("alternatives", eok.a);
   public static final eou h = a("sequence", eox.a);
   public static final eou i = a("group", eop.a);

   private static eou a(String $$0, Codec<? extends eot> $$1) {
      return ji.a(lc.F, new akf($$0), new eou($$1));
   }
}
