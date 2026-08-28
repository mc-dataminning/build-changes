import com.mojang.serialization.MapCodec;

public class ekw<P extends ekv> {
   public static final ekw<ekx> a = a("trunk_vine", ekx.a);
   public static final ekw<ekt> b = a("leave_vine", ekt.a);
   public static final ekw<eku> c = a("pale_moss", eku.a);
   public static final ekw<eks> d = a("creaking_heart", eks.a);
   public static final ekw<ekr> e = a("cocoa", ekr.a);
   public static final ekw<ekq> f = a("beehive", ekq.a);
   public static final ekw<eko> g = a("alter_ground", eko.a);
   public static final ekw<ekp> h = a("attached_to_leaves", ekp.a);
   private final MapCodec<P> i;

   private static <P extends ekv> ekw<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.X, $$0, new ekw<>($$1));
   }

   private ekw(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
