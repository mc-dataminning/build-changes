import com.mojang.serialization.MapCodec;

public class efg<P extends eff> {
   public static final efg<efe> a = a("straight_trunk_placer", efe.a);
   public static final efg<efb> b = a("forking_trunk_placer", efb.a);
   public static final efg<efc> c = a("giant_trunk_placer", efc.a);
   public static final efg<efd> d = a("mega_jungle_trunk_placer", efd.b);
   public static final efg<eez> e = a("dark_oak_trunk_placer", eez.a);
   public static final efg<efa> f = a("fancy_trunk_placer", efa.a);
   public static final efg<eex> g = a("bending_trunk_placer", eex.a);
   public static final efg<efh> h = a("upwards_branching_trunk_placer", efh.a);
   public static final efg<eey> i = a("cherry_trunk_placer", eey.a);
   private final MapCodec<P> j;

   private static <P extends eff> efg<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.X, $$0, new efg<>($$1));
   }

   private efg(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
