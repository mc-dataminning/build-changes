import java.lang.reflect.Constructor;
import java.util.Arrays;

public class clk<T extends cle> {
   private static clk<?>[] l = new clk[0];
   public static final clk<cla> a = a(cla.class, "HoldingPattern");
   public static final clk<cli> b = a(cli.class, "StrafePlayer");
   public static final clk<clc> c = a(clc.class, "LandingApproach");
   public static final clk<cld> d = a(cld.class, "Landing");
   public static final clk<clj> e = a(clj.class, "Takeoff");
   public static final clk<clg> f = a(clg.class, "SittingFlaming");
   public static final clk<clh> g = a(clh.class, "SittingScanning");
   public static final clk<clf> h = a(clf.class, "SittingAttacking");
   public static final clk<cky> i = a(cky.class, "ChargingPlayer");
   public static final clk<ckz> j = a(ckz.class, "Dying");
   public static final clk<clb> k = a(clb.class, "Hover");
   private final Class<? extends cle> m;
   private final int n;
   private final String o;

   private clk(int $$0, Class<? extends cle> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cle a(cku $$0) {
      try {
         Constructor<? extends cle> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cle> a() throws NoSuchMethodException {
      return this.m.getConstructor(cku.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static clk<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cle> clk<T> a(Class<T> $$0, String $$1) {
      clk<T> $$2 = new clk<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
