import com.mojang.serialization.Codec;

public class dsw<P extends dsv> {
   public static final dsw<dsu> a = a("straight_trunk_placer", dsu.a);
   public static final dsw<dsr> b = a("forking_trunk_placer", dsr.a);
   public static final dsw<dss> c = a("giant_trunk_placer", dss.a);
   public static final dsw<dst> d = a("mega_jungle_trunk_placer", dst.b);
   public static final dsw<dsp> e = a("dark_oak_trunk_placer", dsp.a);
   public static final dsw<dsq> f = a("fancy_trunk_placer", dsq.a);
   public static final dsw<dsn> g = a("bending_trunk_placer", dsn.a);
   public static final dsw<dsx> h = a("upwards_branching_trunk_placer", dsx.a);
   public static final dsw<dso> i = a("cherry_trunk_placer", dso.a);
   private final Codec<P> j;

   private static <P extends dsv> dsw<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.Y, $$0, new dsw<>($$1));
   }

   private dsw(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
