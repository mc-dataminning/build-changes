import com.mojang.serialization.MapCodec;

public class edo<P extends edn> {
   public static final edo<edi> a = a("blob_foliage_placer", edi.a);
   public static final edo<edt> b = a("spruce_foliage_placer", edt.a);
   public static final edo<edr> c = a("pine_foliage_placer", edr.a);
   public static final edo<edh> d = a("acacia_foliage_placer", edh.a);
   public static final edo<edj> e = a("bush_foliage_placer", edj.c);
   public static final edo<edm> f = a("fancy_foliage_placer", edm.c);
   public static final edo<edp> g = a("jungle_foliage_placer", edp.a);
   public static final edo<edq> h = a("mega_pine_foliage_placer", edq.a);
   public static final edo<edl> i = a("dark_oak_foliage_placer", edl.a);
   public static final edo<eds> j = a("random_spread_foliage_placer", eds.a);
   public static final edo<edk> k = a("cherry_foliage_placer", edk.a);
   private final MapCodec<P> l;

   private static <P extends edn> edo<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.W, $$0, new edo<>($$1));
   }

   private edo(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
