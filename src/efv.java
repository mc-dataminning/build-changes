import com.mojang.serialization.MapCodec;

public class efv<P extends efu> {
   public static final efv<efp> a = a("blob_foliage_placer", efp.a);
   public static final efv<ega> b = a("spruce_foliage_placer", ega.a);
   public static final efv<efy> c = a("pine_foliage_placer", efy.a);
   public static final efv<efo> d = a("acacia_foliage_placer", efo.a);
   public static final efv<efq> e = a("bush_foliage_placer", efq.c);
   public static final efv<eft> f = a("fancy_foliage_placer", eft.c);
   public static final efv<efw> g = a("jungle_foliage_placer", efw.a);
   public static final efv<efx> h = a("mega_pine_foliage_placer", efx.a);
   public static final efv<efs> i = a("dark_oak_foliage_placer", efs.a);
   public static final efv<efz> j = a("random_spread_foliage_placer", efz.a);
   public static final efv<efr> k = a("cherry_foliage_placer", efr.a);
   private final MapCodec<P> l;

   private static <P extends efu> efv<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.U, $$0, new efv<>($$1));
   }

   private efv(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
