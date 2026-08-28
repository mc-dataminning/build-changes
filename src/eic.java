import com.mojang.serialization.MapCodec;

public class eic<P extends eib> {
   public static final eic<ehw> a = a("blob_foliage_placer", ehw.a);
   public static final eic<eih> b = a("spruce_foliage_placer", eih.a);
   public static final eic<eif> c = a("pine_foliage_placer", eif.a);
   public static final eic<ehv> d = a("acacia_foliage_placer", ehv.a);
   public static final eic<ehx> e = a("bush_foliage_placer", ehx.c);
   public static final eic<eia> f = a("fancy_foliage_placer", eia.c);
   public static final eic<eid> g = a("jungle_foliage_placer", eid.a);
   public static final eic<eie> h = a("mega_pine_foliage_placer", eie.a);
   public static final eic<ehz> i = a("dark_oak_foliage_placer", ehz.a);
   public static final eic<eig> j = a("random_spread_foliage_placer", eig.a);
   public static final eic<ehy> k = a("cherry_foliage_placer", ehy.a);
   private final MapCodec<P> l;

   private static <P extends eib> eic<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.U, $$0, new eic<>($$1));
   }

   private eic(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
