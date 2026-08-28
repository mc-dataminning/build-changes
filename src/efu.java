import com.mojang.serialization.MapCodec;

public class efu<P extends eft> {
   public static final efu<efv> a = a("trunk_vine", efv.a);
   public static final efu<efs> b = a("leave_vine", efs.a);
   public static final efu<efr> c = a("cocoa", efr.a);
   public static final efu<efq> d = a("beehive", efq.a);
   public static final efu<efo> e = a("alter_ground", efo.a);
   public static final efu<efp> f = a("attached_to_leaves", efp.a);
   private final MapCodec<P> g;

   private static <P extends eft> efu<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Z, $$0, new efu<>($$1));
   }

   private efu(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
