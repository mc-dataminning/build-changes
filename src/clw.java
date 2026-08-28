import java.lang.reflect.Constructor;
import java.util.Arrays;

public class clw<T extends clq> {
   private static clw<?>[] l = new clw[0];
   public static final clw<clm> a = a(clm.class, "HoldingPattern");
   public static final clw<clu> b = a(clu.class, "StrafePlayer");
   public static final clw<clo> c = a(clo.class, "LandingApproach");
   public static final clw<clp> d = a(clp.class, "Landing");
   public static final clw<clv> e = a(clv.class, "Takeoff");
   public static final clw<cls> f = a(cls.class, "SittingFlaming");
   public static final clw<clt> g = a(clt.class, "SittingScanning");
   public static final clw<clr> h = a(clr.class, "SittingAttacking");
   public static final clw<clk> i = a(clk.class, "ChargingPlayer");
   public static final clw<cll> j = a(cll.class, "Dying");
   public static final clw<cln> k = a(cln.class, "Hover");
   private final Class<? extends clq> m;
   private final int n;
   private final String o;

   private clw(int $$0, Class<? extends clq> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public clq a(clg $$0) {
      try {
         Constructor<? extends clq> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends clq> a() throws NoSuchMethodException {
      return this.m.getConstructor(clg.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static clw<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends clq> clw<T> a(Class<T> $$0, String $$1) {
      clw<T> $$2 = new clw<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
