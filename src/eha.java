import com.mojang.serialization.MapCodec;

public class eha<P extends egz> {
   public static final eha<ehb> a = a("trunk_vine", ehb.a);
   public static final eha<egy> b = a("leave_vine", egy.a);
   public static final eha<egx> c = a("cocoa", egx.a);
   public static final eha<egw> d = a("beehive", egw.a);
   public static final eha<egu> e = a("alter_ground", egu.a);
   public static final eha<egv> f = a("attached_to_leaves", egv.a);
   private final MapCodec<P> g;

   private static <P extends egz> eha<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.X, $$0, new eha<>($$1));
   }

   private eha(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
