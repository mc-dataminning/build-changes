import com.mojang.serialization.MapCodec;

public class egt<P extends egs> {
   public static final egt<egr> a = a("straight_trunk_placer", egr.a);
   public static final egt<ego> b = a("forking_trunk_placer", ego.a);
   public static final egt<egp> c = a("giant_trunk_placer", egp.a);
   public static final egt<egq> d = a("mega_jungle_trunk_placer", egq.b);
   public static final egt<egm> e = a("dark_oak_trunk_placer", egm.a);
   public static final egt<egn> f = a("fancy_trunk_placer", egn.a);
   public static final egt<egk> g = a("bending_trunk_placer", egk.a);
   public static final egt<egu> h = a("upwards_branching_trunk_placer", egu.a);
   public static final egt<egl> i = a("cherry_trunk_placer", egl.a);
   private final MapCodec<P> j;

   private static <P extends egs> egt<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.V, $$0, new egt<>($$1));
   }

   private egt(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
