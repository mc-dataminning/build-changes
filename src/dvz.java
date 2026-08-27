import com.mojang.serialization.Codec;

public class dvz<P extends dvy> {
   public static final dvz<dwa> a = a("trunk_vine", dwa.a);
   public static final dvz<dvx> b = a("leave_vine", dvx.a);
   public static final dvz<dvw> c = a("cocoa", dvw.a);
   public static final dvz<dvv> d = a("beehive", dvv.a);
   public static final dvz<dvt> e = a("alter_ground", dvt.a);
   public static final dvz<dvu> f = a("attached_to_leaves", dvu.a);
   private final Codec<P> g;

   private static <P extends dvy> dvz<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.Z, $$0, new dvz<>($$1));
   }

   private dvz(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
