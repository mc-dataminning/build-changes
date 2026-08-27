import com.mojang.serialization.Codec;

public class dus<P extends dur> {
   public static final dus<dut> a = a("trunk_vine", dut.a);
   public static final dus<duq> b = a("leave_vine", duq.a);
   public static final dus<dup> c = a("cocoa", dup.a);
   public static final dus<duo> d = a("beehive", duo.a);
   public static final dus<dum> e = a("alter_ground", dum.a);
   public static final dus<dun> f = a("attached_to_leaves", dun.a);
   private final Codec<P> g;

   private static <P extends dur> dus<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.aa, $$0, new dus<>($$1));
   }

   private dus(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
