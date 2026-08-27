import com.mojang.serialization.Codec;

public class dxq<P extends dxp> {
   public static final dxq<dxk> a = a("blob_foliage_placer", dxk.a);
   public static final dxq<dxv> b = a("spruce_foliage_placer", dxv.a);
   public static final dxq<dxt> c = a("pine_foliage_placer", dxt.a);
   public static final dxq<dxj> d = a("acacia_foliage_placer", dxj.a);
   public static final dxq<dxl> e = a("bush_foliage_placer", dxl.c);
   public static final dxq<dxo> f = a("fancy_foliage_placer", dxo.c);
   public static final dxq<dxr> g = a("jungle_foliage_placer", dxr.a);
   public static final dxq<dxs> h = a("mega_pine_foliage_placer", dxs.a);
   public static final dxq<dxn> i = a("dark_oak_foliage_placer", dxn.a);
   public static final dxq<dxu> j = a("random_spread_foliage_placer", dxu.a);
   public static final dxq<dxm> k = a("cherry_foliage_placer", dxm.a);
   private final Codec<P> l;

   private static <P extends dxp> dxq<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.W, $$0, new dxq<>($$1));
   }

   private dxq(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
