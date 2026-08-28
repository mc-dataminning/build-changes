import com.mojang.serialization.MapCodec;

public class efv<P extends efu> {
   public static final efv<efw> a = a("trunk_vine", efw.a);
   public static final efv<eft> b = a("leave_vine", eft.a);
   public static final efv<efs> c = a("cocoa", efs.a);
   public static final efv<efr> d = a("beehive", efr.a);
   public static final efv<efp> e = a("alter_ground", efp.a);
   public static final efv<efq> f = a("attached_to_leaves", efq.a);
   private final MapCodec<P> g;

   private static <P extends efu> efv<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Z, $$0, new efv<>($$1));
   }

   private efv(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
