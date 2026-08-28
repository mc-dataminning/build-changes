import com.mojang.serialization.MapCodec;

public class ekv<P extends eku> {
   public static final ekv<ekw> a = a("trunk_vine", ekw.a);
   public static final ekv<eks> b = a("leave_vine", eks.a);
   public static final ekv<ekt> c = a("pale_moss", ekt.a);
   public static final ekv<ekr> d = a("creaking_heart", ekr.a);
   public static final ekv<ekq> e = a("cocoa", ekq.a);
   public static final ekv<ekp> f = a("beehive", ekp.a);
   public static final ekv<ekn> g = a("alter_ground", ekn.a);
   public static final ekv<eko> h = a("attached_to_leaves", eko.a);
   private final MapCodec<P> i;

   private static <P extends eku> ekv<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.X, $$0, new ekv<>($$1));
   }

   private ekv(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
