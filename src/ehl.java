import com.mojang.serialization.MapCodec;

public class ehl<P extends ehk> {
   public static final ehl<ehf> a = a("blob_foliage_placer", ehf.a);
   public static final ehl<ehq> b = a("spruce_foliage_placer", ehq.a);
   public static final ehl<eho> c = a("pine_foliage_placer", eho.a);
   public static final ehl<ehe> d = a("acacia_foliage_placer", ehe.a);
   public static final ehl<ehg> e = a("bush_foliage_placer", ehg.c);
   public static final ehl<ehj> f = a("fancy_foliage_placer", ehj.c);
   public static final ehl<ehm> g = a("jungle_foliage_placer", ehm.a);
   public static final ehl<ehn> h = a("mega_pine_foliage_placer", ehn.a);
   public static final ehl<ehi> i = a("dark_oak_foliage_placer", ehi.a);
   public static final ehl<ehp> j = a("random_spread_foliage_placer", ehp.a);
   public static final ehl<ehh> k = a("cherry_foliage_placer", ehh.a);
   private final MapCodec<P> l;

   private static <P extends ehk> ehl<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.U, $$0, new ehl<>($$1));
   }

   private ehl(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
