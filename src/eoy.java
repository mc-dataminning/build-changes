import com.mojang.serialization.MapCodec;

public class eoy<P extends eox> {
   public static final eoy<eoz> a = a("trunk_vine", eoz.a);
   public static final eoy<eou> b = a("leave_vine", eou.a);
   public static final eoy<eov> c = a("pale_moss", eov.a);
   public static final eoy<eot> d = a("creaking_heart", eot.a);
   public static final eoy<eos> e = a("cocoa", eos.a);
   public static final eoy<eor> f = a("beehive", eor.a);
   public static final eoy<eop> g = a("alter_ground", eop.a);
   public static final eoy<eoq> h = a("attached_to_leaves", eoq.a);
   public static final eoy<eow> i = a("place_on_ground", eow.a);
   private final MapCodec<P> j;

   private static <P extends eox> eoy<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.X, $$0, new eoy<>($$1));
   }

   private eoy(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
