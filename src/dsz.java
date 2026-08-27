import com.mojang.serialization.Codec;

public class dsz<P extends dsy> {
   public static final dsz<dsx> a = a("straight_trunk_placer", dsx.a);
   public static final dsz<dsu> b = a("forking_trunk_placer", dsu.a);
   public static final dsz<dsv> c = a("giant_trunk_placer", dsv.a);
   public static final dsz<dsw> d = a("mega_jungle_trunk_placer", dsw.b);
   public static final dsz<dss> e = a("dark_oak_trunk_placer", dss.a);
   public static final dsz<dst> f = a("fancy_trunk_placer", dst.a);
   public static final dsz<dsq> g = a("bending_trunk_placer", dsq.a);
   public static final dsz<dta> h = a("upwards_branching_trunk_placer", dta.a);
   public static final dsz<dsr> i = a("cherry_trunk_placer", dsr.a);
   private final Codec<P> j;

   private static <P extends dsy> dsz<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.Y, $$0, new dsz<>($$1));
   }

   private dsz(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}
