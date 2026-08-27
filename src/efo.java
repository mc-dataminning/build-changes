import com.mojang.serialization.Codec;

public class efo {
   public static final Codec<efq> a = jy.G.q().dispatch(efq::a, efr::a);
   public static final efr b = a("empty", efl.a);
   public static final efr c = a("item", efn.a);
   public static final efr d = a("loot_table", eft.a);
   public static final efr e = a("dynamic", efk.a);
   public static final efr f = a("tag", efv.a);
   public static final efr g = a("alternatives", efh.a);
   public static final efr h = a("sequence", efu.a);
   public static final efr i = a("group", efm.a);

   private static efr a(String $$0, Codec<? extends efq> $$1) {
      return io.a(jy.G, new agi($$0), new efr($$1));
   }
}
