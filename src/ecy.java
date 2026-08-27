import com.mojang.serialization.Codec;

public class ecy {
   public static final Codec<eda> a = jb.G.q().dispatch(eda::a, edb::a);
   public static final edb b = a("empty", ecv.a);
   public static final edb c = a("item", ecx.a);
   public static final edb d = a("loot_table", edd.a);
   public static final edb e = a("dynamic", ecu.a);
   public static final edb f = a("tag", edf.a);
   public static final edb g = a("alternatives", ecr.a);
   public static final edb h = a("sequence", ede.a);
   public static final edb i = a("group", ecw.a);

   private static edb a(String $$0, Codec<? extends eda> $$1) {
      return hr.a(jb.G, new aer($$0), new edb($$1));
   }
}
