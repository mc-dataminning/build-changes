import com.mojang.serialization.Codec;

public class dux<P extends duw> {
   public static final dux<duy> a = a("trunk_vine", duy.a);
   public static final dux<duv> b = a("leave_vine", duv.a);
   public static final dux<duu> c = a("cocoa", duu.a);
   public static final dux<dut> d = a("beehive", dut.a);
   public static final dux<dur> e = a("alter_ground", dur.a);
   public static final dux<dus> f = a("attached_to_leaves", dus.a);
   private final Codec<P> g;

   private static <P extends duw> dux<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.aa, $$0, new dux<>($$1));
   }

   private dux(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
