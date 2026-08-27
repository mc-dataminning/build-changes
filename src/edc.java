import com.mojang.serialization.Codec;

public class edc {
   public static final Codec<ede> a = jd.G.q().dispatch(ede::a, edf::a);
   public static final edf b = a("empty", ecz.a);
   public static final edf c = a("item", edb.a);
   public static final edf d = a("loot_table", edh.a);
   public static final edf e = a("dynamic", ecy.a);
   public static final edf f = a("tag", edj.a);
   public static final edf g = a("alternatives", ecv.a);
   public static final edf h = a("sequence", edi.a);
   public static final edf i = a("group", eda.a);

   private static edf a(String $$0, Codec<? extends ede> $$1) {
      return ht.a(jd.G, new aeu($$0), new edf($$1));
   }
}
