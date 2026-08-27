import com.mojang.serialization.Codec;

public class dwq<P extends dwp> {
   public static final dwq<dwr> a = a("trunk_vine", dwr.a);
   public static final dwq<dwo> b = a("leave_vine", dwo.a);
   public static final dwq<dwn> c = a("cocoa", dwn.a);
   public static final dwq<dwm> d = a("beehive", dwm.a);
   public static final dwq<dwk> e = a("alter_ground", dwk.a);
   public static final dwq<dwl> f = a("attached_to_leaves", dwl.a);
   private final Codec<P> g;

   private static <P extends dwp> dwq<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Z, $$0, new dwq<>($$1));
   }

   private dwq(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
