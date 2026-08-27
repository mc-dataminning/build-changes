import com.mojang.serialization.Codec;

public class edb<P extends eda> {
   public static final edb<edc> a = a("trunk_vine", edc.a);
   public static final edb<ecz> b = a("leave_vine", ecz.a);
   public static final edb<ecy> c = a("cocoa", ecy.a);
   public static final edb<ecx> d = a("beehive", ecx.a);
   public static final edb<ecv> e = a("alter_ground", ecv.a);
   public static final edb<ecw> f = a("attached_to_leaves", ecw.a);
   private final Codec<P> g;

   private static <P extends eda> edb<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.Z, $$0, new edb<>($$1));
   }

   private edb(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
