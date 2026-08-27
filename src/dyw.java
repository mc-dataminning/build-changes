import com.mojang.serialization.Codec;

public class dyw<P extends dyv> {
   public static final dyw<dyx> a = a("trunk_vine", dyx.a);
   public static final dyw<dyu> b = a("leave_vine", dyu.a);
   public static final dyw<dyt> c = a("cocoa", dyt.a);
   public static final dyw<dys> d = a("beehive", dys.a);
   public static final dyw<dyq> e = a("alter_ground", dyq.a);
   public static final dyw<dyr> f = a("attached_to_leaves", dyr.a);
   private final Codec<P> g;

   private static <P extends dyv> dyw<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.Z, $$0, new dyw<>($$1));
   }

   private dyw(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
