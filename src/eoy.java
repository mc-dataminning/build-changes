import com.mojang.serialization.MapCodec;

public class eoy<P extends eox> {
   public static final eoy<eow> a = a("straight_trunk_placer", eow.a);
   public static final eoy<eot> b = a("forking_trunk_placer", eot.a);
   public static final eoy<eou> c = a("giant_trunk_placer", eou.a);
   public static final eoy<eov> d = a("mega_jungle_trunk_placer", eov.b);
   public static final eoy<eor> e = a("dark_oak_trunk_placer", eor.a);
   public static final eoy<eos> f = a("fancy_trunk_placer", eos.a);
   public static final eoy<eop> g = a("bending_trunk_placer", eop.a);
   public static final eoy<eoz> h = a("upwards_branching_trunk_placer", eoz.a);
   public static final eoy<eoq> i = a("cherry_trunk_placer", eoq.a);
   private final MapCodec<P> j;

   private static <P extends eox> eoy<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.V, $$0, new eoy<>($$1));
   }

   private eoy(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
