import com.mojang.serialization.Codec;

public class drp<P extends dro> {
   public static final drp<drj> a = a("blob_foliage_placer", drj.a);
   public static final drp<dru> b = a("spruce_foliage_placer", dru.a);
   public static final drp<drs> c = a("pine_foliage_placer", drs.a);
   public static final drp<dri> d = a("acacia_foliage_placer", dri.a);
   public static final drp<drk> e = a("bush_foliage_placer", drk.c);
   public static final drp<drn> f = a("fancy_foliage_placer", drn.c);
   public static final drp<drq> g = a("jungle_foliage_placer", drq.a);
   public static final drp<drr> h = a("mega_pine_foliage_placer", drr.a);
   public static final drp<drm> i = a("dark_oak_foliage_placer", drm.a);
   public static final drp<drt> j = a("random_spread_foliage_placer", drt.a);
   public static final drp<drl> k = a("cherry_foliage_placer", drl.a);
   private final Codec<P> l;

   private static <P extends dro> drp<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.X, $$0, new drp<>($$1));
   }

   private drp(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
