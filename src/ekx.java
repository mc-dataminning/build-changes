import com.mojang.serialization.MapCodec;

public class ekx<P extends ekw> {
   public static final ekx<eky> a = a("trunk_vine", eky.a);
   public static final ekx<eku> b = a("leave_vine", eku.a);
   public static final ekx<ekv> c = a("pale_moss", ekv.a);
   public static final ekx<ekt> d = a("creaking_heart", ekt.a);
   public static final ekx<eks> e = a("cocoa", eks.a);
   public static final ekx<ekr> f = a("beehive", ekr.a);
   public static final ekx<ekp> g = a("alter_ground", ekp.a);
   public static final ekx<ekq> h = a("attached_to_leaves", ekq.a);
   private final MapCodec<P> i;

   private static <P extends ekw> ekx<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.X, $$0, new ekx<>($$1));
   }

   private ekx(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
