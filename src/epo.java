import com.mojang.serialization.MapCodec;

public class epo<P extends epn> {
   public static final epo<epp> a = a("trunk_vine", epp.a);
   public static final epo<epk> b = a("leave_vine", epk.a);
   public static final epo<epl> c = a("pale_moss", epl.a);
   public static final epo<epj> d = a("creaking_heart", epj.a);
   public static final epo<epi> e = a("cocoa", epi.a);
   public static final epo<eph> f = a("beehive", eph.a);
   public static final epo<epe> g = a("alter_ground", epe.a);
   public static final epo<epf> h = a("attached_to_leaves", epf.a);
   public static final epo<epm> i = a("place_on_ground", epm.a);
   public static final epo<epg> j = a("attached_to_logs", epg.a);
   private final MapCodec<P> k;

   private static <P extends epn> epo<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.X, $$0, new epo<>($$1));
   }

   private epo(MapCodec<P> $$0) {
      this.k = $$0;
   }

   public MapCodec<P> a() {
      return this.k;
   }
}
