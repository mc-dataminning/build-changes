import com.mojang.serialization.Codec;

public class esd {
   public static final Codec<esf> a = lh.F.q().dispatch(esf::a, esg::a);
   public static final esg b = a("empty", esa.a);
   public static final esg c = a("item", esc.a);
   public static final esg d = a("loot_table", esi.a);
   public static final esg e = a("dynamic", erz.a);
   public static final esg f = a("tag", esk.a);
   public static final esg g = a("alternatives", erw.a);
   public static final esg h = a("sequence", esj.a);
   public static final esg i = a("group", esb.a);

   private static esg a(String $$0, Codec<? extends esf> $$1) {
      return jn.a(lh.F, new akt($$0), new esg($$1));
   }
}
