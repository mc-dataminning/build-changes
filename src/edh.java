import com.mojang.serialization.Codec;

public class edh {
   public static final Codec<edj> a = jb.G.q().dispatch(edj::a, edk::a);
   public static final edk b = a("empty", ede.a);
   public static final edk c = a("item", edg.a);
   public static final edk d = a("loot_table", edm.a);
   public static final edk e = a("dynamic", edd.a);
   public static final edk f = a("tag", edo.a);
   public static final edk g = a("alternatives", eda.a);
   public static final edk h = a("sequence", edn.a);
   public static final edk i = a("group", edf.a);

   private static edk a(String $$0, Codec<? extends edj> $$1) {
      return hq.a(jb.G, new aew($$0), new edk($$1));
   }
}
