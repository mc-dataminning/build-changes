import com.mojang.serialization.MapCodec;

public class epy<P extends epx> {
   public static final epy<epw> a = a("straight_trunk_placer", epw.a);
   public static final epy<ept> b = a("forking_trunk_placer", ept.a);
   public static final epy<epu> c = a("giant_trunk_placer", epu.a);
   public static final epy<epv> d = a("mega_jungle_trunk_placer", epv.b);
   public static final epy<epr> e = a("dark_oak_trunk_placer", epr.a);
   public static final epy<eps> f = a("fancy_trunk_placer", eps.a);
   public static final epy<epp> g = a("bending_trunk_placer", epp.a);
   public static final epy<epz> h = a("upwards_branching_trunk_placer", epz.a);
   public static final epy<epq> i = a("cherry_trunk_placer", epq.a);
   private final MapCodec<P> j;

   private static <P extends epx> epy<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.V, $$0, new epy<>($$1));
   }

   private epy(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
