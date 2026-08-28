import com.mojang.serialization.MapCodec;

public class egu<P extends egt> {
   public static final egu<egs> a = a("straight_trunk_placer", egs.a);
   public static final egu<egp> b = a("forking_trunk_placer", egp.a);
   public static final egu<egq> c = a("giant_trunk_placer", egq.a);
   public static final egu<egr> d = a("mega_jungle_trunk_placer", egr.b);
   public static final egu<egn> e = a("dark_oak_trunk_placer", egn.a);
   public static final egu<ego> f = a("fancy_trunk_placer", ego.a);
   public static final egu<egl> g = a("bending_trunk_placer", egl.a);
   public static final egu<egv> h = a("upwards_branching_trunk_placer", egv.a);
   public static final egu<egm> i = a("cherry_trunk_placer", egm.a);
   private final MapCodec<P> j;

   private static <P extends egt> egu<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.V, $$0, new egu<>($$1));
   }

   private egu(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
