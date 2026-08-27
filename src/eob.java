import com.mojang.serialization.Codec;

public class eob {
   public static final Codec<eod> a = kt.F.q().dispatch(eod::a, eoe::a);
   public static final eoe b = a("empty", eny.a);
   public static final eoe c = a("item", eoa.a);
   public static final eoe d = a("loot_table", eog.a);
   public static final eoe e = a("dynamic", enx.a);
   public static final eoe f = a("tag", eoi.a);
   public static final eoe g = a("alternatives", enu.a);
   public static final eoe h = a("sequence", eoh.a);
   public static final eoe i = a("group", enz.a);

   private static eoe a(String $$0, Codec<? extends eod> $$1) {
      return ja.a(kt.F, new ajv($$0), new eoe($$1));
   }
}
