import com.mojang.serialization.MapCodec;

public class eqk<P extends eqj> {
   public static final eqk<eqi> a = a("straight_trunk_placer", eqi.a);
   public static final eqk<eqf> b = a("forking_trunk_placer", eqf.a);
   public static final eqk<eqg> c = a("giant_trunk_placer", eqg.a);
   public static final eqk<eqh> d = a("mega_jungle_trunk_placer", eqh.b);
   public static final eqk<eqd> e = a("dark_oak_trunk_placer", eqd.a);
   public static final eqk<eqe> f = a("fancy_trunk_placer", eqe.a);
   public static final eqk<eqb> g = a("bending_trunk_placer", eqb.a);
   public static final eqk<eql> h = a("upwards_branching_trunk_placer", eql.a);
   public static final eqk<eqc> i = a("cherry_trunk_placer", eqc.a);
   private final MapCodec<P> j;

   private static <P extends eqj> eqk<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.V, $$0, new eqk<>($$1));
   }

   private eqk(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
