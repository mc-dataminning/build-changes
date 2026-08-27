import com.mojang.serialization.Codec;

public class edr<P extends edq> {
   public static final edr<eds> a = a("trunk_vine", eds.a);
   public static final edr<edp> b = a("leave_vine", edp.a);
   public static final edr<edo> c = a("cocoa", edo.a);
   public static final edr<edn> d = a("beehive", edn.a);
   public static final edr<edl> e = a("alter_ground", edl.a);
   public static final edr<edm> f = a("attached_to_leaves", edm.a);
   private final Codec<P> g;

   private static <P extends edq> edr<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.Z, $$0, new edr<>($$1));
   }

   private edr(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
