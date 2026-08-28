import com.mojang.serialization.MapCodec;

public class ejt<P extends ejs> {
   public static final ejt<eju> a = a("trunk_vine", eju.a);
   public static final ejt<ejr> b = a("leave_vine", ejr.a);
   public static final ejt<ejq> c = a("cocoa", ejq.a);
   public static final ejt<ejp> d = a("beehive", ejp.a);
   public static final ejt<ejn> e = a("alter_ground", ejn.a);
   public static final ejt<ejo> f = a("attached_to_leaves", ejo.a);
   private final MapCodec<P> g;

   private static <P extends ejs> ejt<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.X, $$0, new ejt<>($$1));
   }

   private ejt(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
