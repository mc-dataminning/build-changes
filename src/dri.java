import com.mojang.serialization.Codec;

public class dri<P extends drh> {
   public static final dri<drc> a = a("blob_foliage_placer", drc.a);
   public static final dri<drn> b = a("spruce_foliage_placer", drn.a);
   public static final dri<drl> c = a("pine_foliage_placer", drl.a);
   public static final dri<drb> d = a("acacia_foliage_placer", drb.a);
   public static final dri<drd> e = a("bush_foliage_placer", drd.c);
   public static final dri<drg> f = a("fancy_foliage_placer", drg.c);
   public static final dri<drj> g = a("jungle_foliage_placer", drj.a);
   public static final dri<drk> h = a("mega_pine_foliage_placer", drk.a);
   public static final dri<drf> i = a("dark_oak_foliage_placer", drf.a);
   public static final dri<drm> j = a("random_spread_foliage_placer", drm.a);
   public static final dri<dre> k = a("cherry_foliage_placer", dre.a);
   private final Codec<P> l;

   private static <P extends drh> dri<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.X, $$0, new dri<>($$1));
   }

   private dri(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
