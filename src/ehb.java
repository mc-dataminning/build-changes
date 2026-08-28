import com.mojang.serialization.MapCodec;

public class ehb<P extends eha> {
   public static final ehb<ehc> a = a("trunk_vine", ehc.a);
   public static final ehb<egz> b = a("leave_vine", egz.a);
   public static final ehb<egy> c = a("cocoa", egy.a);
   public static final ehb<egx> d = a("beehive", egx.a);
   public static final ehb<egv> e = a("alter_ground", egv.a);
   public static final ehb<egw> f = a("attached_to_leaves", egw.a);
   private final MapCodec<P> g;

   private static <P extends eha> ehb<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.X, $$0, new ehb<>($$1));
   }

   private ehb(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
