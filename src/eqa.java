import com.mojang.serialization.MapCodec;

public class eqa<P extends epz> {
   public static final eqa<epy> a = a("straight_trunk_placer", epy.a);
   public static final eqa<epv> b = a("forking_trunk_placer", epv.a);
   public static final eqa<epw> c = a("giant_trunk_placer", epw.a);
   public static final eqa<epx> d = a("mega_jungle_trunk_placer", epx.b);
   public static final eqa<ept> e = a("dark_oak_trunk_placer", ept.a);
   public static final eqa<epu> f = a("fancy_trunk_placer", epu.a);
   public static final eqa<epr> g = a("bending_trunk_placer", epr.a);
   public static final eqa<eqb> h = a("upwards_branching_trunk_placer", eqb.a);
   public static final eqa<eps> i = a("cherry_trunk_placer", eps.a);
   private final MapCodec<P> j;

   private static <P extends epz> eqa<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.V, $$0, new eqa<>($$1));
   }

   private eqa(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
