import com.mojang.serialization.MapCodec;

public class efx<P extends efw> {
   public static final efx<efy> a = a("trunk_vine", efy.a);
   public static final efx<efv> b = a("leave_vine", efv.a);
   public static final efx<efu> c = a("cocoa", efu.a);
   public static final efx<eft> d = a("beehive", eft.a);
   public static final efx<efr> e = a("alter_ground", efr.a);
   public static final efx<efs> f = a("attached_to_leaves", efs.a);
   private final MapCodec<P> g;

   private static <P extends efw> efx<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Z, $$0, new efx<>($$1));
   }

   private efx(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
