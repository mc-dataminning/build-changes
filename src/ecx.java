import com.mojang.serialization.Codec;

public class ecx {
   public static final Codec<ecz> a = jb.G.q().dispatch(ecz::a, eda::a);
   public static final eda b = a("empty", ecu.a);
   public static final eda c = a("item", ecw.a);
   public static final eda d = a("loot_table", edc.a);
   public static final eda e = a("dynamic", ect.a);
   public static final eda f = a("tag", ede.a);
   public static final eda g = a("alternatives", ecq.a);
   public static final eda h = a("sequence", edd.a);
   public static final eda i = a("group", ecv.a);

   private static eda a(String $$0, Codec<? extends ecz> $$1) {
      return hr.a(jb.G, new aer($$0), new eda($$1));
   }
}
