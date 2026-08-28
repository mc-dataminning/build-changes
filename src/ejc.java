import com.mojang.serialization.MapCodec;

public class ejc<P extends ejb> {
   public static final ejc<ejd> a = a("trunk_vine", ejd.a);
   public static final ejc<eja> b = a("leave_vine", eja.a);
   public static final ejc<eiz> c = a("cocoa", eiz.a);
   public static final ejc<eiy> d = a("beehive", eiy.a);
   public static final ejc<eiw> e = a("alter_ground", eiw.a);
   public static final ejc<eix> f = a("attached_to_leaves", eix.a);
   private final MapCodec<P> g;

   private static <P extends ejb> ejc<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.X, $$0, new ejc<>($$1));
   }

   private ejc(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
