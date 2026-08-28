import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cnw<T extends cnq> {
   private static cnw<?>[] l = new cnw[0];
   public static final cnw<cnm> a = a(cnm.class, "HoldingPattern");
   public static final cnw<cnu> b = a(cnu.class, "StrafePlayer");
   public static final cnw<cno> c = a(cno.class, "LandingApproach");
   public static final cnw<cnp> d = a(cnp.class, "Landing");
   public static final cnw<cnv> e = a(cnv.class, "Takeoff");
   public static final cnw<cns> f = a(cns.class, "SittingFlaming");
   public static final cnw<cnt> g = a(cnt.class, "SittingScanning");
   public static final cnw<cnr> h = a(cnr.class, "SittingAttacking");
   public static final cnw<cnk> i = a(cnk.class, "ChargingPlayer");
   public static final cnw<cnl> j = a(cnl.class, "Dying");
   public static final cnw<cnn> k = a(cnn.class, "Hover");
   private final Class<? extends cnq> m;
   private final int n;
   private final String o;

   private cnw(int $$0, Class<? extends cnq> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cnq a(cng $$0) {
      try {
         Constructor<? extends cnq> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cnq> a() throws NoSuchMethodException {
      return this.m.getConstructor(cng.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cnw<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cnq> cnw<T> a(Class<T> $$0, String $$1) {
      cnw<T> $$2 = new cnw<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
