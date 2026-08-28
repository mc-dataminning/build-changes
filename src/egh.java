import com.mojang.serialization.MapCodec;

public class egh<P extends egg> {
   public static final egh<egf> a = a("straight_trunk_placer", egf.a);
   public static final egh<egc> b = a("forking_trunk_placer", egc.a);
   public static final egh<egd> c = a("giant_trunk_placer", egd.a);
   public static final egh<ege> d = a("mega_jungle_trunk_placer", ege.b);
   public static final egh<ega> e = a("dark_oak_trunk_placer", ega.a);
   public static final egh<egb> f = a("fancy_trunk_placer", egb.a);
   public static final egh<efy> g = a("bending_trunk_placer", efy.a);
   public static final egh<egi> h = a("upwards_branching_trunk_placer", egi.a);
   public static final egh<efz> i = a("cherry_trunk_placer", efz.a);
   private final MapCodec<P> j;

   private static <P extends egg> egh<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.X, $$0, new egh<>($$1));
   }

   private egh(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
