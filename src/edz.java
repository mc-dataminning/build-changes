import com.mojang.serialization.Codec;

public class edz {
   public static final Codec<eeb> a = jy.G.q().dispatch(eeb::a, eec::a);
   public static final eec b = a("empty", edw.a);
   public static final eec c = a("item", edy.a);
   public static final eec d = a("loot_table", eee.a);
   public static final eec e = a("dynamic", edv.a);
   public static final eec f = a("tag", eeg.a);
   public static final eec g = a("alternatives", eds.a);
   public static final eec h = a("sequence", eef.a);
   public static final eec i = a("group", edx.a);

   private static eec a(String $$0, Codec<? extends eeb> $$1) {
      return io.a(jy.G, new afw($$0), new eec($$1));
   }
}
