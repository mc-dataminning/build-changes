import com.mojang.serialization.MapCodec;

public class eek<P extends eej> {
   public static final eek<eee> a = a("blob_foliage_placer", eee.a);
   public static final eek<eep> b = a("spruce_foliage_placer", eep.a);
   public static final eek<een> c = a("pine_foliage_placer", een.a);
   public static final eek<eed> d = a("acacia_foliage_placer", eed.a);
   public static final eek<eef> e = a("bush_foliage_placer", eef.c);
   public static final eek<eei> f = a("fancy_foliage_placer", eei.c);
   public static final eek<eel> g = a("jungle_foliage_placer", eel.a);
   public static final eek<eem> h = a("mega_pine_foliage_placer", eem.a);
   public static final eek<eeh> i = a("dark_oak_foliage_placer", eeh.a);
   public static final eek<eeo> j = a("random_spread_foliage_placer", eeo.a);
   public static final eek<eeg> k = a("cherry_foliage_placer", eeg.a);
   private final MapCodec<P> l;

   private static <P extends eej> eek<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.W, $$0, new eek<>($$1));
   }

   private eek(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
