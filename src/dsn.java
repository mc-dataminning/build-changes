import com.mojang.serialization.Codec;

public class dsn<P extends dsm> {
   public static final dsn<dso> a = a("trunk_vine", dso.a);
   public static final dsn<dsl> b = a("leave_vine", dsl.a);
   public static final dsn<dsk> c = a("cocoa", dsk.a);
   public static final dsn<dsj> d = a("beehive", dsj.a);
   public static final dsn<dsh> e = a("alter_ground", dsh.a);
   public static final dsn<dsi> f = a("attached_to_leaves", dsi.a);
   private final Codec<P> g;

   private static <P extends dsm> dsn<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.aa, $$0, new dsn<>($$1));
   }

   private dsn(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
