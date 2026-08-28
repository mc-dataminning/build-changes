import com.mojang.serialization.MapCodec;

public class eir<P extends eiq> {
   public static final eir<eis> a = a("trunk_vine", eis.a);
   public static final eir<eip> b = a("leave_vine", eip.a);
   public static final eir<eio> c = a("cocoa", eio.a);
   public static final eir<ein> d = a("beehive", ein.a);
   public static final eir<eil> e = a("alter_ground", eil.a);
   public static final eir<eim> f = a("attached_to_leaves", eim.a);
   private final MapCodec<P> g;

   private static <P extends eiq> eir<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.X, $$0, new eir<>($$1));
   }

   private eir(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
