import com.mojang.serialization.MapCodec;

public class ekf<P extends eke> {
   public static final ekf<ejz> a = a("blob_foliage_placer", ejz.a);
   public static final ekf<ekk> b = a("spruce_foliage_placer", ekk.a);
   public static final ekf<eki> c = a("pine_foliage_placer", eki.a);
   public static final ekf<ejy> d = a("acacia_foliage_placer", ejy.a);
   public static final ekf<eka> e = a("bush_foliage_placer", eka.c);
   public static final ekf<ekd> f = a("fancy_foliage_placer", ekd.c);
   public static final ekf<ekg> g = a("jungle_foliage_placer", ekg.a);
   public static final ekf<ekh> h = a("mega_pine_foliage_placer", ekh.a);
   public static final ekf<ekc> i = a("dark_oak_foliage_placer", ekc.a);
   public static final ekf<ekj> j = a("random_spread_foliage_placer", ekj.a);
   public static final ekf<ekb> k = a("cherry_foliage_placer", ekb.a);
   private final MapCodec<P> l;

   private static <P extends eke> ekf<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.U, $$0, new ekf<>($$1));
   }

   private ekf(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
