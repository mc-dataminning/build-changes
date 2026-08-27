import com.mojang.serialization.Codec;

public class dsv<P extends dsu> {
   public static final dsv<dsw> a = a("trunk_vine", dsw.a);
   public static final dsv<dst> b = a("leave_vine", dst.a);
   public static final dsv<dss> c = a("cocoa", dss.a);
   public static final dsv<dsr> d = a("beehive", dsr.a);
   public static final dsv<dsp> e = a("alter_ground", dsp.a);
   public static final dsv<dsq> f = a("attached_to_leaves", dsq.a);
   private final Codec<P> g;

   private static <P extends dsu> dsv<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.aa, $$0, new dsv<>($$1));
   }

   private dsv(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
