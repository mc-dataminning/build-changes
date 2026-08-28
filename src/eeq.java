import com.mojang.serialization.MapCodec;

public class eeq<P extends eep> {
   public static final eeq<eek> a = a("blob_foliage_placer", eek.a);
   public static final eeq<eev> b = a("spruce_foliage_placer", eev.a);
   public static final eeq<eet> c = a("pine_foliage_placer", eet.a);
   public static final eeq<eej> d = a("acacia_foliage_placer", eej.a);
   public static final eeq<eel> e = a("bush_foliage_placer", eel.c);
   public static final eeq<eeo> f = a("fancy_foliage_placer", eeo.c);
   public static final eeq<eer> g = a("jungle_foliage_placer", eer.a);
   public static final eeq<ees> h = a("mega_pine_foliage_placer", ees.a);
   public static final eeq<een> i = a("dark_oak_foliage_placer", een.a);
   public static final eeq<eeu> j = a("random_spread_foliage_placer", eeu.a);
   public static final eeq<eem> k = a("cherry_foliage_placer", eem.a);
   private final MapCodec<P> l;

   private static <P extends eep> eeq<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.W, $$0, new eeq<>($$1));
   }

   private eeq(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
