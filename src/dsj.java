import com.mojang.serialization.Codec;

public class dsj<P extends dsi> {
   public static final dsj<dsk> a = a("trunk_vine", dsk.a);
   public static final dsj<dsh> b = a("leave_vine", dsh.a);
   public static final dsj<dsg> c = a("cocoa", dsg.a);
   public static final dsj<dsf> d = a("beehive", dsf.a);
   public static final dsj<dsd> e = a("alter_ground", dsd.a);
   public static final dsj<dse> f = a("attached_to_leaves", dse.a);
   private final Codec<P> g;

   private static <P extends dsi> dsj<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.aa, $$0, new dsj<>($$1));
   }

   private dsj(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
