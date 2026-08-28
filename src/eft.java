import com.mojang.serialization.MapCodec;

public class eft<P extends efs> {
   public static final eft<efu> a = a("trunk_vine", efu.a);
   public static final eft<efr> b = a("leave_vine", efr.a);
   public static final eft<efq> c = a("cocoa", efq.a);
   public static final eft<efp> d = a("beehive", efp.a);
   public static final eft<efn> e = a("alter_ground", efn.a);
   public static final eft<efo> f = a("attached_to_leaves", efo.a);
   private final MapCodec<P> g;

   private static <P extends efs> eft<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Z, $$0, new eft<>($$1));
   }

   private eft(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
