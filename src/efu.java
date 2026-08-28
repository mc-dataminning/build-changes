import com.mojang.serialization.MapCodec;

public class efu<P extends eft> {
   public static final efu<efo> a = a("blob_foliage_placer", efo.a);
   public static final efu<efz> b = a("spruce_foliage_placer", efz.a);
   public static final efu<efx> c = a("pine_foliage_placer", efx.a);
   public static final efu<efn> d = a("acacia_foliage_placer", efn.a);
   public static final efu<efp> e = a("bush_foliage_placer", efp.c);
   public static final efu<efs> f = a("fancy_foliage_placer", efs.c);
   public static final efu<efv> g = a("jungle_foliage_placer", efv.a);
   public static final efu<efw> h = a("mega_pine_foliage_placer", efw.a);
   public static final efu<efr> i = a("dark_oak_foliage_placer", efr.a);
   public static final efu<efy> j = a("random_spread_foliage_placer", efy.a);
   public static final efu<efq> k = a("cherry_foliage_placer", efq.a);
   private final MapCodec<P> l;

   private static <P extends eft> efu<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.U, $$0, new efu<>($$1));
   }

   private efu(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
