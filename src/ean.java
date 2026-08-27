import com.mojang.serialization.Codec;

public class ean<P extends eam> {
   public static final ean<eao> a = a("trunk_vine", eao.a);
   public static final ean<eal> b = a("leave_vine", eal.a);
   public static final ean<eak> c = a("cocoa", eak.a);
   public static final ean<eaj> d = a("beehive", eaj.a);
   public static final ean<eah> e = a("alter_ground", eah.a);
   public static final ean<eai> f = a("attached_to_leaves", eai.a);
   private final Codec<P> g;

   private static <P extends eam> ean<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.Z, $$0, new ean<>($$1));
   }

   private ean(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
