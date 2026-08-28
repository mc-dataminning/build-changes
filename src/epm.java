import com.mojang.serialization.MapCodec;

public class epm<P extends epl> {
   public static final epm<epn> a = a("trunk_vine", epn.a);
   public static final epm<epi> b = a("leave_vine", epi.a);
   public static final epm<epj> c = a("pale_moss", epj.a);
   public static final epm<eph> d = a("creaking_heart", eph.a);
   public static final epm<epg> e = a("cocoa", epg.a);
   public static final epm<epf> f = a("beehive", epf.a);
   public static final epm<epc> g = a("alter_ground", epc.a);
   public static final epm<epd> h = a("attached_to_leaves", epd.a);
   public static final epm<epk> i = a("place_on_ground", epk.a);
   public static final epm<epe> j = a("attached_to_logs", epe.a);
   private final MapCodec<P> k;

   private static <P extends epl> epm<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.X, $$0, new epm<>($$1));
   }

   private epm(MapCodec<P> $$0) {
      this.k = $$0;
   }

   public MapCodec<P> a() {
      return this.k;
   }
}
