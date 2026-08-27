import com.mojang.serialization.Codec;

public class dwk<P extends dwj> {
   public static final dwk<dwl> a = a("trunk_vine", dwl.a);
   public static final dwk<dwi> b = a("leave_vine", dwi.a);
   public static final dwk<dwh> c = a("cocoa", dwh.a);
   public static final dwk<dwg> d = a("beehive", dwg.a);
   public static final dwk<dwe> e = a("alter_ground", dwe.a);
   public static final dwk<dwf> f = a("attached_to_leaves", dwf.a);
   private final Codec<P> g;

   private static <P extends dwj> dwk<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.Z, $$0, new dwk<>($$1));
   }

   private dwk(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
