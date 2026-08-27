import com.mojang.serialization.Codec;

public class dtl<P extends dtk> {
   public static final dtl<dtm> a = a("trunk_vine", dtm.a);
   public static final dtl<dtj> b = a("leave_vine", dtj.a);
   public static final dtl<dti> c = a("cocoa", dti.a);
   public static final dtl<dth> d = a("beehive", dth.a);
   public static final dtl<dtf> e = a("alter_ground", dtf.a);
   public static final dtl<dtg> f = a("attached_to_leaves", dtg.a);
   private final Codec<P> g;

   private static <P extends dtk> dtl<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.aa, $$0, new dtl<>($$1));
   }

   private dtl(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
