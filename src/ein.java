import com.mojang.serialization.MapCodec;

public class ein<P extends eim> {
   public static final ein<eio> a = a("trunk_vine", eio.a);
   public static final ein<eil> b = a("leave_vine", eil.a);
   public static final ein<eik> c = a("cocoa", eik.a);
   public static final ein<eij> d = a("beehive", eij.a);
   public static final ein<eih> e = a("alter_ground", eih.a);
   public static final ein<eii> f = a("attached_to_leaves", eii.a);
   private final MapCodec<P> g;

   private static <P extends eim> ein<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.X, $$0, new ein<>($$1));
   }

   private ein(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
