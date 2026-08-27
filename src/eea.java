import com.mojang.serialization.Codec;

public class eea<P extends edz> {
   public static final eea<eeb> a = a("trunk_vine", eeb.a);
   public static final eea<edy> b = a("leave_vine", edy.a);
   public static final eea<edx> c = a("cocoa", edx.a);
   public static final eea<edw> d = a("beehive", edw.a);
   public static final eea<edu> e = a("alter_ground", edu.a);
   public static final eea<edv> f = a("attached_to_leaves", edv.a);
   private final Codec<P> g;

   private static <P extends edz> eea<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.Z, $$0, new eea<>($$1));
   }

   private eea(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
