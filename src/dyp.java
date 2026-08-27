import com.mojang.serialization.Codec;

public class dyp<P extends dyo> {
   public static final dyp<dyq> a = a("trunk_vine", dyq.a);
   public static final dyp<dyn> b = a("leave_vine", dyn.a);
   public static final dyp<dym> c = a("cocoa", dym.a);
   public static final dyp<dyl> d = a("beehive", dyl.a);
   public static final dyp<dyj> e = a("alter_ground", dyj.a);
   public static final dyp<dyk> f = a("attached_to_leaves", dyk.a);
   private final Codec<P> g;

   private static <P extends dyo> dyp<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.Z, $$0, new dyp<>($$1));
   }

   private dyp(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
