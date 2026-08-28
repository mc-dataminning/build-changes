import com.mojang.serialization.MapCodec;

public class epy<P extends epx> {
   public static final epy<epz> a = a("trunk_vine", epz.a);
   public static final epy<epu> b = a("leave_vine", epu.a);
   public static final epy<epv> c = a("pale_moss", epv.a);
   public static final epy<ept> d = a("creaking_heart", ept.a);
   public static final epy<eps> e = a("cocoa", eps.a);
   public static final epy<epr> f = a("beehive", epr.a);
   public static final epy<epo> g = a("alter_ground", epo.a);
   public static final epy<epp> h = a("attached_to_leaves", epp.a);
   public static final epy<epw> i = a("place_on_ground", epw.a);
   public static final epy<epq> j = a("attached_to_logs", epq.a);
   private final MapCodec<P> k;

   private static <P extends epx> epy<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.X, $$0, new epy<>($$1));
   }

   private epy(MapCodec<P> $$0) {
      this.k = $$0;
   }

   public MapCodec<P> a() {
      return this.k;
   }
}
