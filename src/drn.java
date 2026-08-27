import com.mojang.serialization.Codec;

public class drn<P extends drm> {
   public static final drn<drh> a = a("blob_foliage_placer", drh.a);
   public static final drn<drs> b = a("spruce_foliage_placer", drs.a);
   public static final drn<drq> c = a("pine_foliage_placer", drq.a);
   public static final drn<drg> d = a("acacia_foliage_placer", drg.a);
   public static final drn<dri> e = a("bush_foliage_placer", dri.c);
   public static final drn<drl> f = a("fancy_foliage_placer", drl.c);
   public static final drn<dro> g = a("jungle_foliage_placer", dro.a);
   public static final drn<drp> h = a("mega_pine_foliage_placer", drp.a);
   public static final drn<drk> i = a("dark_oak_foliage_placer", drk.a);
   public static final drn<drr> j = a("random_spread_foliage_placer", drr.a);
   public static final drn<drj> k = a("cherry_foliage_placer", drj.a);
   private final Codec<P> l;

   private static <P extends drm> drn<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.X, $$0, new drn<>($$1));
   }

   private drn(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
