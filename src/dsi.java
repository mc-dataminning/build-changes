import com.mojang.serialization.Codec;

public class dsi<P extends dsh> {
   public static final dsi<dsj> a = a("trunk_vine", dsj.a);
   public static final dsi<dsg> b = a("leave_vine", dsg.a);
   public static final dsi<dsf> c = a("cocoa", dsf.a);
   public static final dsi<dse> d = a("beehive", dse.a);
   public static final dsi<dsc> e = a("alter_ground", dsc.a);
   public static final dsi<dsd> f = a("attached_to_leaves", dsd.a);
   private final Codec<P> g;

   private static <P extends dsh> dsi<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.aa, $$0, new dsi<>($$1));
   }

   private dsi(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
