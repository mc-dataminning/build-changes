import com.mojang.serialization.Codec;

public class dwz<P extends dwy> {
   public static final dwz<dxa> a = a("trunk_vine", dxa.a);
   public static final dwz<dwx> b = a("leave_vine", dwx.a);
   public static final dwz<dww> c = a("cocoa", dww.a);
   public static final dwz<dwv> d = a("beehive", dwv.a);
   public static final dwz<dwt> e = a("alter_ground", dwt.a);
   public static final dwz<dwu> f = a("attached_to_leaves", dwu.a);
   private final Codec<P> g;

   private static <P extends dwy> dwz<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Z, $$0, new dwz<>($$1));
   }

   private dwz(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
