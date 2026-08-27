import com.mojang.serialization.Codec;

public class dsv<P extends dsu> {
   public static final dsv<dst> a = a("straight_trunk_placer", dst.a);
   public static final dsv<dsq> b = a("forking_trunk_placer", dsq.a);
   public static final dsv<dsr> c = a("giant_trunk_placer", dsr.a);
   public static final dsv<dss> d = a("mega_jungle_trunk_placer", dss.b);
   public static final dsv<dso> e = a("dark_oak_trunk_placer", dso.a);
   public static final dsv<dsp> f = a("fancy_trunk_placer", dsp.a);
   public static final dsv<dsm> g = a("bending_trunk_placer", dsm.a);
   public static final dsv<dsw> h = a("upwards_branching_trunk_placer", dsw.a);
   public static final dsv<dsn> i = a("cherry_trunk_placer", dsn.a);
   private final Codec<P> j;

   private static <P extends dsu> dsv<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.Y, $$0, new dsv<>($$1));
   }

   private dsv(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
