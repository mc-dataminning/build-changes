import com.mojang.serialization.Codec;

public class efx<P extends efw> {
   public static final efx<efr> a = a("blob_foliage_placer", efr.a);
   public static final efx<egc> b = a("spruce_foliage_placer", egc.a);
   public static final efx<ega> c = a("pine_foliage_placer", ega.a);
   public static final efx<efq> d = a("acacia_foliage_placer", efq.a);
   public static final efx<efs> e = a("bush_foliage_placer", efs.c);
   public static final efx<efv> f = a("fancy_foliage_placer", efv.c);
   public static final efx<efy> g = a("jungle_foliage_placer", efy.a);
   public static final efx<efz> h = a("mega_pine_foliage_placer", efz.a);
   public static final efx<efu> i = a("dark_oak_foliage_placer", efu.a);
   public static final efx<egb> j = a("random_spread_foliage_placer", egb.a);
   public static final efx<eft> k = a("cherry_foliage_placer", eft.a);
   private final Codec<P> l;

   private static <P extends efw> efx<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.W, $$0, new efx<>($$1));
   }

   private efx(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
