import com.mojang.serialization.Codec;

public class edb {
   public static final Codec<edd> a = jb.G.q().dispatch(edd::a, ede::a);
   public static final ede b = a("empty", ecy.a);
   public static final ede c = a("item", eda.a);
   public static final ede d = a("loot_table", edg.a);
   public static final ede e = a("dynamic", ecx.a);
   public static final ede f = a("tag", edi.a);
   public static final ede g = a("alternatives", ecu.a);
   public static final ede h = a("sequence", edh.a);
   public static final ede i = a("group", ecz.a);

   private static ede a(String $$0, Codec<? extends edd> $$1) {
      return hq.a(jb.G, new aez($$0), new ede($$1));
   }
}
