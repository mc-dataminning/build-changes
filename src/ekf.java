import com.mojang.serialization.MapCodec;

public class ekf<P extends eke> {
   public static final ekf<ekd> a = a("straight_trunk_placer", ekd.a);
   public static final ekf<eka> b = a("forking_trunk_placer", eka.a);
   public static final ekf<ekb> c = a("giant_trunk_placer", ekb.a);
   public static final ekf<ekc> d = a("mega_jungle_trunk_placer", ekc.b);
   public static final ekf<ejy> e = a("dark_oak_trunk_placer", ejy.a);
   public static final ekf<ejz> f = a("fancy_trunk_placer", ejz.a);
   public static final ekf<ejw> g = a("bending_trunk_placer", ejw.a);
   public static final ekf<ekg> h = a("upwards_branching_trunk_placer", ekg.a);
   public static final ekf<ejx> i = a("cherry_trunk_placer", ejx.a);
   private final MapCodec<P> j;

   private static <P extends eke> ekf<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.V, $$0, new ekf<>($$1));
   }

   private ekf(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
