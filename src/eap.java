import com.mojang.serialization.Codec;

public class eap<P extends eao> {
   public static final eap<eaq> a = a("trunk_vine", eaq.a);
   public static final eap<ean> b = a("leave_vine", ean.a);
   public static final eap<eam> c = a("cocoa", eam.a);
   public static final eap<eal> d = a("beehive", eal.a);
   public static final eap<eaj> e = a("alter_ground", eaj.a);
   public static final eap<eak> f = a("attached_to_leaves", eak.a);
   private final Codec<P> g;

   private static <P extends eao> eap<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.Z, $$0, new eap<>($$1));
   }

   private eap(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
