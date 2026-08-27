import com.mojang.serialization.Codec;

public class ehm {
   public static final Codec<eho> a = kd.F.q().dispatch(eho::a, ehp::a);
   public static final ehp b = a("empty", ehj.a);
   public static final ehp c = a("item", ehl.a);
   public static final ehp d = a("loot_table", ehr.a);
   public static final ehp e = a("dynamic", ehi.a);
   public static final ehp f = a("tag", eht.a);
   public static final ehp g = a("alternatives", ehf.a);
   public static final ehp h = a("sequence", ehs.a);
   public static final ehp i = a("group", ehk.a);

   private static ehp a(String $$0, Codec<? extends eho> $$1) {
      return it.a(kd.F, new ahg($$0), new ehp($$1));
   }
}
