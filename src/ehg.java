import com.mojang.serialization.Codec;

public class ehg {
   public static final Codec<ehi> a = kd.F.q().dispatch(ehi::a, ehj::a);
   public static final ehj b = a("empty", ehd.a);
   public static final ehj c = a("item", ehf.a);
   public static final ehj d = a("loot_table", ehl.a);
   public static final ehj e = a("dynamic", ehc.a);
   public static final ehj f = a("tag", ehn.a);
   public static final ehj g = a("alternatives", egz.a);
   public static final ehj h = a("sequence", ehm.a);
   public static final ehj i = a("group", ehe.a);

   private static ehj a(String $$0, Codec<? extends ehi> $$1) {
      return it.a(kd.F, new ahd($$0), new ehj($$1));
   }
}
