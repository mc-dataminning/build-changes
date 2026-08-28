import com.mojang.serialization.MapCodec;

public class eoe<P extends eod> {
   public static final eoe<eof> a = a("trunk_vine", eof.a);
   public static final eoe<eoa> b = a("leave_vine", eoa.a);
   public static final eoe<eob> c = a("pale_moss", eob.a);
   public static final eoe<enz> d = a("creaking_heart", enz.a);
   public static final eoe<eny> e = a("cocoa", eny.a);
   public static final eoe<enx> f = a("beehive", enx.a);
   public static final eoe<env> g = a("alter_ground", env.a);
   public static final eoe<enw> h = a("attached_to_leaves", enw.a);
   public static final eoe<eoc> i = a("place_on_ground", eoc.a);
   private final MapCodec<P> j;

   private static <P extends eod> eoe<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.X, $$0, new eoe<>($$1));
   }

   private eoe(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
