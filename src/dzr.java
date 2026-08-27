import com.mojang.serialization.Codec;

public class dzr<P extends dzq> {
   public static final dzr<dzs> a = a("trunk_vine", dzs.a);
   public static final dzr<dzp> b = a("leave_vine", dzp.a);
   public static final dzr<dzo> c = a("cocoa", dzo.a);
   public static final dzr<dzn> d = a("beehive", dzn.a);
   public static final dzr<dzl> e = a("alter_ground", dzl.a);
   public static final dzr<dzm> f = a("attached_to_leaves", dzm.a);
   private final Codec<P> g;

   private static <P extends dzq> dzr<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.Z, $$0, new dzr<>($$1));
   }

   private dzr(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
