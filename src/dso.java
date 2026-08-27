import com.mojang.serialization.Codec;

public class dso<P extends dsn> {
   public static final dso<dsp> a = a("trunk_vine", dsp.a);
   public static final dso<dsm> b = a("leave_vine", dsm.a);
   public static final dso<dsl> c = a("cocoa", dsl.a);
   public static final dso<dsk> d = a("beehive", dsk.a);
   public static final dso<dsi> e = a("alter_ground", dsi.a);
   public static final dso<dsj> f = a("attached_to_leaves", dsj.a);
   private final Codec<P> g;

   private static <P extends dsn> dso<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.aa, $$0, new dso<>($$1));
   }

   private dso(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
