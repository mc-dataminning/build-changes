import com.mojang.serialization.Codec;

public class dwr<P extends dwq> {
   public static final dwr<dws> a = a("trunk_vine", dws.a);
   public static final dwr<dwp> b = a("leave_vine", dwp.a);
   public static final dwr<dwo> c = a("cocoa", dwo.a);
   public static final dwr<dwn> d = a("beehive", dwn.a);
   public static final dwr<dwl> e = a("alter_ground", dwl.a);
   public static final dwr<dwm> f = a("attached_to_leaves", dwm.a);
   private final Codec<P> g;

   private static <P extends dwq> dwr<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Z, $$0, new dwr<>($$1));
   }

   private dwr(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
