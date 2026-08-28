import com.mojang.serialization.MapCodec;

public class eeo<P extends een> {
   public static final eeo<eei> a = a("blob_foliage_placer", eei.a);
   public static final eeo<eet> b = a("spruce_foliage_placer", eet.a);
   public static final eeo<eer> c = a("pine_foliage_placer", eer.a);
   public static final eeo<eeh> d = a("acacia_foliage_placer", eeh.a);
   public static final eeo<eej> e = a("bush_foliage_placer", eej.c);
   public static final eeo<eem> f = a("fancy_foliage_placer", eem.c);
   public static final eeo<eep> g = a("jungle_foliage_placer", eep.a);
   public static final eeo<eeq> h = a("mega_pine_foliage_placer", eeq.a);
   public static final eeo<eel> i = a("dark_oak_foliage_placer", eel.a);
   public static final eeo<ees> j = a("random_spread_foliage_placer", ees.a);
   public static final eeo<eek> k = a("cherry_foliage_placer", eek.a);
   private final MapCodec<P> l;

   private static <P extends een> eeo<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.W, $$0, new eeo<>($$1));
   }

   private eeo(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
