import com.mojang.serialization.MapCodec;

public class efr<P extends efq> {
   public static final efr<efl> a = a("blob_foliage_placer", efl.a);
   public static final efr<efw> b = a("spruce_foliage_placer", efw.a);
   public static final efr<efu> c = a("pine_foliage_placer", efu.a);
   public static final efr<efk> d = a("acacia_foliage_placer", efk.a);
   public static final efr<efm> e = a("bush_foliage_placer", efm.c);
   public static final efr<efp> f = a("fancy_foliage_placer", efp.c);
   public static final efr<efs> g = a("jungle_foliage_placer", efs.a);
   public static final efr<eft> h = a("mega_pine_foliage_placer", eft.a);
   public static final efr<efo> i = a("dark_oak_foliage_placer", efo.a);
   public static final efr<efv> j = a("random_spread_foliage_placer", efv.a);
   public static final efr<efn> k = a("cherry_foliage_placer", efn.a);
   private final MapCodec<P> l;

   private static <P extends efq> efr<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.U, $$0, new efr<>($$1));
   }

   private efr(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
