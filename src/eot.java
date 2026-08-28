import com.mojang.serialization.MapCodec;

public class eot<P extends eos> {
   public static final eot<eou> a = a("trunk_vine", eou.a);
   public static final eot<eop> b = a("leave_vine", eop.a);
   public static final eot<eoq> c = a("pale_moss", eoq.a);
   public static final eot<eoo> d = a("creaking_heart", eoo.a);
   public static final eot<eon> e = a("cocoa", eon.a);
   public static final eot<eom> f = a("beehive", eom.a);
   public static final eot<eok> g = a("alter_ground", eok.a);
   public static final eot<eol> h = a("attached_to_leaves", eol.a);
   public static final eot<eor> i = a("place_on_ground", eor.a);
   private final MapCodec<P> j;

   private static <P extends eos> eot<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.X, $$0, new eot<>($$1));
   }

   private eot(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
