import com.mojang.serialization.MapCodec;

public class egb<P extends ega> {
   public static final egb<egc> a = a("trunk_vine", egc.a);
   public static final egb<efz> b = a("leave_vine", efz.a);
   public static final egb<efy> c = a("cocoa", efy.a);
   public static final egb<efx> d = a("beehive", efx.a);
   public static final egb<efv> e = a("alter_ground", efv.a);
   public static final egb<efw> f = a("attached_to_leaves", efw.a);
   private final MapCodec<P> g;

   private static <P extends ega> egb<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.X, $$0, new egb<>($$1));
   }

   private egb(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
