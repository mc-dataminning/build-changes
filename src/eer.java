import com.mojang.serialization.MapCodec;

public class eer<P extends eeq> {
   public static final eer<eel> a = a("blob_foliage_placer", eel.a);
   public static final eer<eew> b = a("spruce_foliage_placer", eew.a);
   public static final eer<eeu> c = a("pine_foliage_placer", eeu.a);
   public static final eer<eek> d = a("acacia_foliage_placer", eek.a);
   public static final eer<eem> e = a("bush_foliage_placer", eem.c);
   public static final eer<eep> f = a("fancy_foliage_placer", eep.c);
   public static final eer<ees> g = a("jungle_foliage_placer", ees.a);
   public static final eer<eet> h = a("mega_pine_foliage_placer", eet.a);
   public static final eer<eeo> i = a("dark_oak_foliage_placer", eeo.a);
   public static final eer<eev> j = a("random_spread_foliage_placer", eev.a);
   public static final eer<een> k = a("cherry_foliage_placer", een.a);
   private final MapCodec<P> l;

   private static <P extends eeq> eer<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.W, $$0, new eer<>($$1));
   }

   private eer(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
