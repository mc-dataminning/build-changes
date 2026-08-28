import com.mojang.serialization.MapCodec;

public class eky<P extends ekx> {
   public static final eky<ekz> a = a("trunk_vine", ekz.a);
   public static final eky<ekv> b = a("leave_vine", ekv.a);
   public static final eky<ekw> c = a("pale_moss", ekw.a);
   public static final eky<eku> d = a("creaking_heart", eku.a);
   public static final eky<ekt> e = a("cocoa", ekt.a);
   public static final eky<eks> f = a("beehive", eks.a);
   public static final eky<ekq> g = a("alter_ground", ekq.a);
   public static final eky<ekr> h = a("attached_to_leaves", ekr.a);
   private final MapCodec<P> i;

   private static <P extends ekx> eky<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.X, $$0, new eky<>($$1));
   }

   private eky(MapCodec<P> $$0) {
      this.i = $$0;
   }

   public MapCodec<P> a() {
      return this.i;
   }
}
