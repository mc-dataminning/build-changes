import com.mojang.serialization.MapCodec;

public class eil<P extends eik> {
   public static final eil<eij> a = a("straight_trunk_placer", eij.a);
   public static final eil<eig> b = a("forking_trunk_placer", eig.a);
   public static final eil<eih> c = a("giant_trunk_placer", eih.a);
   public static final eil<eii> d = a("mega_jungle_trunk_placer", eii.b);
   public static final eil<eie> e = a("dark_oak_trunk_placer", eie.a);
   public static final eil<eif> f = a("fancy_trunk_placer", eif.a);
   public static final eil<eic> g = a("bending_trunk_placer", eic.a);
   public static final eil<eim> h = a("upwards_branching_trunk_placer", eim.a);
   public static final eil<eid> i = a("cherry_trunk_placer", eid.a);
   private final MapCodec<P> j;

   private static <P extends eik> eil<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.V, $$0, new eil<>($$1));
   }

   private eil(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
