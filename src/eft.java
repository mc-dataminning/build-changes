import com.mojang.serialization.Codec;

public class eft {
   public static final Codec<efv> a = kc.G.q().dispatch(efv::a, efw::a);
   public static final efw b = a("empty", efq.a);
   public static final efw c = a("item", efs.a);
   public static final efw d = a("loot_table", efy.a);
   public static final efw e = a("dynamic", efp.a);
   public static final efw f = a("tag", ega.a);
   public static final efw g = a("alternatives", efm.a);
   public static final efw h = a("sequence", efz.a);
   public static final efw i = a("group", efr.a);

   private static efw a(String $$0, Codec<? extends efv> $$1) {
      return is.a(kc.G, new agm($$0), new efw($$1));
   }
}
