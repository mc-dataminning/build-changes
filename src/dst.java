import com.mojang.serialization.Codec;

public class dst<P extends dss> {
   public static final dst<dsu> a = a("trunk_vine", dsu.a);
   public static final dst<dsr> b = a("leave_vine", dsr.a);
   public static final dst<dsq> c = a("cocoa", dsq.a);
   public static final dst<dsp> d = a("beehive", dsp.a);
   public static final dst<dsn> e = a("alter_ground", dsn.a);
   public static final dst<dso> f = a("attached_to_leaves", dso.a);
   private final Codec<P> g;

   private static <P extends dss> dst<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.aa, $$0, new dst<>($$1));
   }

   private dst(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
