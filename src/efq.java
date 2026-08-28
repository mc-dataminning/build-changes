import com.mojang.serialization.MapCodec;

public class efq<P extends efp> {
   public static final efq<efr> a = a("trunk_vine", efr.a);
   public static final efq<efo> b = a("leave_vine", efo.a);
   public static final efq<efn> c = a("cocoa", efn.a);
   public static final efq<efm> d = a("beehive", efm.a);
   public static final efq<efk> e = a("alter_ground", efk.a);
   public static final efq<efl> f = a("attached_to_leaves", efl.a);
   private final MapCodec<P> g;

   private static <P extends efp> efq<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.Z, $$0, new efq<>($$1));
   }

   private efq(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
