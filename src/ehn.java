import com.mojang.serialization.Codec;

public class ehn {
   public static final Codec<ehp> a = kd.F.q().dispatch(ehp::a, ehq::a);
   public static final ehq b = a("empty", ehk.a);
   public static final ehq c = a("item", ehm.a);
   public static final ehq d = a("loot_table", ehs.a);
   public static final ehq e = a("dynamic", ehj.a);
   public static final ehq f = a("tag", ehu.a);
   public static final ehq g = a("alternatives", ehg.a);
   public static final ehq h = a("sequence", eht.a);
   public static final ehq i = a("group", ehl.a);

   private static ehq a(String $$0, Codec<? extends ehp> $$1) {
      return it.a(kd.F, new ahg($$0), new ehq($$1));
   }
}
