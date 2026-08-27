import com.mojang.serialization.Codec;

public class drh<P extends drg> {
   public static final drh<drb> a = a("blob_foliage_placer", drb.a);
   public static final drh<drm> b = a("spruce_foliage_placer", drm.a);
   public static final drh<drk> c = a("pine_foliage_placer", drk.a);
   public static final drh<dra> d = a("acacia_foliage_placer", dra.a);
   public static final drh<drc> e = a("bush_foliage_placer", drc.c);
   public static final drh<drf> f = a("fancy_foliage_placer", drf.c);
   public static final drh<dri> g = a("jungle_foliage_placer", dri.a);
   public static final drh<drj> h = a("mega_pine_foliage_placer", drj.a);
   public static final drh<dre> i = a("dark_oak_foliage_placer", dre.a);
   public static final drh<drl> j = a("random_spread_foliage_placer", drl.a);
   public static final drh<drd> k = a("cherry_foliage_placer", drd.a);
   private final Codec<P> l;

   private static <P extends drg> drh<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.X, $$0, new drh<>($$1));
   }

   private drh(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
