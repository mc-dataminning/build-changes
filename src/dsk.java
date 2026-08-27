import com.mojang.serialization.Codec;

public class dsk<P extends dsj> {
   public static final dsk<dsl> a = a("trunk_vine", dsl.a);
   public static final dsk<dsi> b = a("leave_vine", dsi.a);
   public static final dsk<dsh> c = a("cocoa", dsh.a);
   public static final dsk<dsg> d = a("beehive", dsg.a);
   public static final dsk<dse> e = a("alter_ground", dse.a);
   public static final dsk<dsf> f = a("attached_to_leaves", dsf.a);
   private final Codec<P> g;

   private static <P extends dsj> dsk<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.aa, $$0, new dsk<>($$1));
   }

   private dsk(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
