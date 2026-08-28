import com.mojang.serialization.MapCodec;

public class een<P extends eem> {
   public static final een<eeh> a = a("blob_foliage_placer", eeh.a);
   public static final een<ees> b = a("spruce_foliage_placer", ees.a);
   public static final een<eeq> c = a("pine_foliage_placer", eeq.a);
   public static final een<eeg> d = a("acacia_foliage_placer", eeg.a);
   public static final een<eei> e = a("bush_foliage_placer", eei.c);
   public static final een<eel> f = a("fancy_foliage_placer", eel.c);
   public static final een<eeo> g = a("jungle_foliage_placer", eeo.a);
   public static final een<eep> h = a("mega_pine_foliage_placer", eep.a);
   public static final een<eek> i = a("dark_oak_foliage_placer", eek.a);
   public static final een<eer> j = a("random_spread_foliage_placer", eer.a);
   public static final een<eej> k = a("cherry_foliage_placer", eej.a);
   private final MapCodec<P> l;

   private static <P extends eem> een<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.W, $$0, new een<>($$1));
   }

   private een(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
