import com.mojang.serialization.MapCodec;

public class efw<P extends efv> {
   public static final efw<efx> a = a("trunk_vine", efx.a);
   public static final efw<efu> b = a("leave_vine", efu.a);
   public static final efw<eft> c = a("cocoa", eft.a);
   public static final efw<efs> d = a("beehive", efs.a);
   public static final efw<efq> e = a("alter_ground", efq.a);
   public static final efw<efr> f = a("attached_to_leaves", efr.a);
   private final MapCodec<P> g;

   private static <P extends efv> efw<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Z, $$0, new efw<>($$1));
   }

   private efw(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
