import com.mojang.serialization.Codec;

public class edj {
   public static final Codec<edl> a = jd.G.q().dispatch(edl::a, edm::a);
   public static final edm b = a("empty", edg.a);
   public static final edm c = a("item", edi.a);
   public static final edm d = a("loot_table", edo.a);
   public static final edm e = a("dynamic", edf.a);
   public static final edm f = a("tag", edq.a);
   public static final edm g = a("alternatives", edc.a);
   public static final edm h = a("sequence", edp.a);
   public static final edm i = a("group", edh.a);

   private static edm a(String $$0, Codec<? extends edl> $$1) {
      return ht.a(jd.G, new aey($$0), new edm($$1));
   }
}
