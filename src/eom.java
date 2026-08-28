import com.mojang.serialization.MapCodec;

public class eom<P extends eol> {
   public static final eom<eon> a = a("trunk_vine", eon.a);
   public static final eom<eoi> b = a("leave_vine", eoi.a);
   public static final eom<eoj> c = a("pale_moss", eoj.a);
   public static final eom<eoh> d = a("creaking_heart", eoh.a);
   public static final eom<eog> e = a("cocoa", eog.a);
   public static final eom<eof> f = a("beehive", eof.a);
   public static final eom<eod> g = a("alter_ground", eod.a);
   public static final eom<eoe> h = a("attached_to_leaves", eoe.a);
   public static final eom<eok> i = a("place_on_ground", eok.a);
   private final MapCodec<P> j;

   private static <P extends eol> eom<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.X, $$0, new eom<>($$1));
   }

   private eom(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
