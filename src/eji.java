import com.mojang.serialization.MapCodec;

public class eji<P extends ejh> {
   public static final eji<ejj> a = a("trunk_vine", ejj.a);
   public static final eji<ejg> b = a("leave_vine", ejg.a);
   public static final eji<ejf> c = a("cocoa", ejf.a);
   public static final eji<eje> d = a("beehive", eje.a);
   public static final eji<ejc> e = a("alter_ground", ejc.a);
   public static final eji<ejd> f = a("attached_to_leaves", ejd.a);
   private final MapCodec<P> g;

   private static <P extends ejh> eji<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.X, $$0, new eji<>($$1));
   }

   private eji(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
