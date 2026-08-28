import com.mojang.serialization.MapCodec;

public class eoq<P extends eop> {
   public static final eoq<eoo> a = a("straight_trunk_placer", eoo.a);
   public static final eoq<eol> b = a("forking_trunk_placer", eol.a);
   public static final eoq<eom> c = a("giant_trunk_placer", eom.a);
   public static final eoq<eon> d = a("mega_jungle_trunk_placer", eon.b);
   public static final eoq<eoj> e = a("dark_oak_trunk_placer", eoj.a);
   public static final eoq<eok> f = a("fancy_trunk_placer", eok.a);
   public static final eoq<eoh> g = a("bending_trunk_placer", eoh.a);
   public static final eoq<eor> h = a("upwards_branching_trunk_placer", eor.a);
   public static final eoq<eoi> i = a("cherry_trunk_placer", eoi.a);
   private final MapCodec<P> j;

   private static <P extends eop> eoq<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.V, $$0, new eoq<>($$1));
   }

   private eoq(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
