import com.mojang.serialization.MapCodec;

public class eep<P extends eeo> {
   public static final eep<eej> a = a("blob_foliage_placer", eej.a);
   public static final eep<eeu> b = a("spruce_foliage_placer", eeu.a);
   public static final eep<ees> c = a("pine_foliage_placer", ees.a);
   public static final eep<eei> d = a("acacia_foliage_placer", eei.a);
   public static final eep<eek> e = a("bush_foliage_placer", eek.c);
   public static final eep<een> f = a("fancy_foliage_placer", een.c);
   public static final eep<eeq> g = a("jungle_foliage_placer", eeq.a);
   public static final eep<eer> h = a("mega_pine_foliage_placer", eer.a);
   public static final eep<eem> i = a("dark_oak_foliage_placer", eem.a);
   public static final eep<eet> j = a("random_spread_foliage_placer", eet.a);
   public static final eep<eel> k = a("cherry_foliage_placer", eel.a);
   private final MapCodec<P> l;

   private static <P extends eeo> eep<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.W, $$0, new eep<>($$1));
   }

   private eep(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
