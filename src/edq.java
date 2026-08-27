import com.mojang.serialization.MapCodec;

public class edq<P extends edp> {
   public static final edq<edk> a = a("blob_foliage_placer", edk.a);
   public static final edq<edv> b = a("spruce_foliage_placer", edv.a);
   public static final edq<edt> c = a("pine_foliage_placer", edt.a);
   public static final edq<edj> d = a("acacia_foliage_placer", edj.a);
   public static final edq<edl> e = a("bush_foliage_placer", edl.c);
   public static final edq<edo> f = a("fancy_foliage_placer", edo.c);
   public static final edq<edr> g = a("jungle_foliage_placer", edr.a);
   public static final edq<eds> h = a("mega_pine_foliage_placer", eds.a);
   public static final edq<edn> i = a("dark_oak_foliage_placer", edn.a);
   public static final edq<edu> j = a("random_spread_foliage_placer", edu.a);
   public static final edq<edm> k = a("cherry_foliage_placer", edm.a);
   private final MapCodec<P> l;

   private static <P extends edp> edq<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.W, $$0, new edq<>($$1));
   }

   private edq(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
