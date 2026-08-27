import com.mojang.serialization.Codec;

public class ehd<P extends ehc> {
   public static final ehd<ehe> a = a("trunk_vine", ehe.a);
   public static final ehd<ehb> b = a("leave_vine", ehb.a);
   public static final ehd<eha> c = a("cocoa", eha.a);
   public static final ehd<egz> d = a("beehive", egz.a);
   public static final ehd<egx> e = a("alter_ground", egx.a);
   public static final ehd<egy> f = a("attached_to_leaves", egy.a);
   private final Codec<P> g;

   private static <P extends ehc> ehd<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.Z, $$0, new ehd<>($$1));
   }

   private ehd(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
