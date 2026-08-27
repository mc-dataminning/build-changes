import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cgf<T extends cfz> {
   private static cgf<?>[] l = new cgf[0];
   public static final cgf<cfv> a = a(cfv.class, "HoldingPattern");
   public static final cgf<cgd> b = a(cgd.class, "StrafePlayer");
   public static final cgf<cfx> c = a(cfx.class, "LandingApproach");
   public static final cgf<cfy> d = a(cfy.class, "Landing");
   public static final cgf<cge> e = a(cge.class, "Takeoff");
   public static final cgf<cgb> f = a(cgb.class, "SittingFlaming");
   public static final cgf<cgc> g = a(cgc.class, "SittingScanning");
   public static final cgf<cga> h = a(cga.class, "SittingAttacking");
   public static final cgf<cft> i = a(cft.class, "ChargingPlayer");
   public static final cgf<cfu> j = a(cfu.class, "Dying");
   public static final cgf<cfw> k = a(cfw.class, "Hover");
   private final Class<? extends cfz> m;
   private final int n;
   private final String o;

   private cgf(int $$0, Class<? extends cfz> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cfz a(cfp $$0) {
      try {
         Constructor<? extends cfz> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cfz> a() throws NoSuchMethodException {
      return this.m.getConstructor(cfp.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cgf<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cfz> cgf<T> a(Class<T> $$0, String $$1) {
      cgf<T> $$2 = new cgf<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
