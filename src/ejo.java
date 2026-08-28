import com.mojang.serialization.MapCodec;

public class ejo<P extends ejn> {
   public static final ejo<ejm> a = a("straight_trunk_placer", ejm.a);
   public static final ejo<ejj> b = a("forking_trunk_placer", ejj.a);
   public static final ejo<ejk> c = a("giant_trunk_placer", ejk.a);
   public static final ejo<ejl> d = a("mega_jungle_trunk_placer", ejl.b);
   public static final ejo<ejh> e = a("dark_oak_trunk_placer", ejh.a);
   public static final ejo<eji> f = a("fancy_trunk_placer", eji.a);
   public static final ejo<ejf> g = a("bending_trunk_placer", ejf.a);
   public static final ejo<ejp> h = a("upwards_branching_trunk_placer", ejp.a);
   public static final ejo<ejg> i = a("cherry_trunk_placer", ejg.a);
   private final MapCodec<P> j;

   private static <P extends ejn> ejo<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.V, $$0, new ejo<>($$1));
   }

   private ejo(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
