import com.mojang.serialization.MapCodec;

public class egg<P extends egf> {
   public static final egg<ege> a = a("straight_trunk_placer", ege.a);
   public static final egg<egb> b = a("forking_trunk_placer", egb.a);
   public static final egg<egc> c = a("giant_trunk_placer", egc.a);
   public static final egg<egd> d = a("mega_jungle_trunk_placer", egd.b);
   public static final egg<efz> e = a("dark_oak_trunk_placer", efz.a);
   public static final egg<ega> f = a("fancy_trunk_placer", ega.a);
   public static final egg<efx> g = a("bending_trunk_placer", efx.a);
   public static final egg<egh> h = a("upwards_branching_trunk_placer", egh.a);
   public static final egg<efy> i = a("cherry_trunk_placer", efy.a);
   private final MapCodec<P> j;

   private static <P extends egf> egg<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.X, $$0, new egg<>($$1));
   }

   private egg(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
