import com.mojang.serialization.Codec;

public class dxj<P extends dxi> {
   public static final dxj<dxd> a = a("blob_foliage_placer", dxd.a);
   public static final dxj<dxo> b = a("spruce_foliage_placer", dxo.a);
   public static final dxj<dxm> c = a("pine_foliage_placer", dxm.a);
   public static final dxj<dxc> d = a("acacia_foliage_placer", dxc.a);
   public static final dxj<dxe> e = a("bush_foliage_placer", dxe.c);
   public static final dxj<dxh> f = a("fancy_foliage_placer", dxh.c);
   public static final dxj<dxk> g = a("jungle_foliage_placer", dxk.a);
   public static final dxj<dxl> h = a("mega_pine_foliage_placer", dxl.a);
   public static final dxj<dxg> i = a("dark_oak_foliage_placer", dxg.a);
   public static final dxj<dxn> j = a("random_spread_foliage_placer", dxn.a);
   public static final dxj<dxf> k = a("cherry_foliage_placer", dxf.a);
   private final Codec<P> l;

   private static <P extends dxi> dxj<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.W, $$0, new dxj<>($$1));
   }

   private dxj(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}
