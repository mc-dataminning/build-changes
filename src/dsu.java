import com.mojang.serialization.Codec;

public class dsu<P extends dst> {
   public static final dsu<dss> a = a("straight_trunk_placer", dss.a);
   public static final dsu<dsp> b = a("forking_trunk_placer", dsp.a);
   public static final dsu<dsq> c = a("giant_trunk_placer", dsq.a);
   public static final dsu<dsr> d = a("mega_jungle_trunk_placer", dsr.b);
   public static final dsu<dsn> e = a("dark_oak_trunk_placer", dsn.a);
   public static final dsu<dso> f = a("fancy_trunk_placer", dso.a);
   public static final dsu<dsl> g = a("bending_trunk_placer", dsl.a);
   public static final dsu<dsv> h = a("upwards_branching_trunk_placer", dsv.a);
   public static final dsu<dsm> i = a("cherry_trunk_placer", dsm.a);
   private final Codec<P> j;

   private static <P extends dst> dsu<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.Y, $$0, new dsu<>($$1));
   }

   private dsu(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
