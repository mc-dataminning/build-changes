import com.mojang.serialization.MapCodec;

public class ejm<P extends ejl> {
   public static final ejm<ejn> a = a("trunk_vine", ejn.a);
   public static final ejm<ejk> b = a("leave_vine", ejk.a);
   public static final ejm<ejj> c = a("cocoa", ejj.a);
   public static final ejm<eji> d = a("beehive", eji.a);
   public static final ejm<ejg> e = a("alter_ground", ejg.a);
   public static final ejm<ejh> f = a("attached_to_leaves", ejh.a);
   private final MapCodec<P> g;

   private static <P extends ejl> ejm<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.X, $$0, new ejm<>($$1));
   }

   private ejm(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
