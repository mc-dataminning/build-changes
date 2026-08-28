import com.mojang.serialization.MapCodec;

public class egx<P extends egw> {
   public static final egx<egy> a = a("trunk_vine", egy.a);
   public static final egx<egv> b = a("leave_vine", egv.a);
   public static final egx<egu> c = a("cocoa", egu.a);
   public static final egx<egt> d = a("beehive", egt.a);
   public static final egx<egr> e = a("alter_ground", egr.a);
   public static final egx<egs> f = a("attached_to_leaves", egs.a);
   private final MapCodec<P> g;

   private static <P extends egw> egx<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.X, $$0, new egx<>($$1));
   }

   private egx(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
