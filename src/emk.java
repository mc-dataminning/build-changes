import com.mojang.serialization.MapCodec;

public class emk<P extends emj> {
   public static final emk<eme> a = a("blob_foliage_placer", eme.a);
   public static final emk<emp> b = a("spruce_foliage_placer", emp.a);
   public static final emk<emn> c = a("pine_foliage_placer", emn.a);
   public static final emk<emd> d = a("acacia_foliage_placer", emd.a);
   public static final emk<emf> e = a("bush_foliage_placer", emf.c);
   public static final emk<emi> f = a("fancy_foliage_placer", emi.c);
   public static final emk<eml> g = a("jungle_foliage_placer", eml.a);
   public static final emk<emm> h = a("mega_pine_foliage_placer", emm.a);
   public static final emk<emh> i = a("dark_oak_foliage_placer", emh.a);
   public static final emk<emo> j = a("random_spread_foliage_placer", emo.a);
   public static final emk<emg> k = a("cherry_foliage_placer", emg.a);
   private final MapCodec<P> l;

   private static <P extends emj> emk<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.U, $$0, new emk<>($$1));
   }

   private emk(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
