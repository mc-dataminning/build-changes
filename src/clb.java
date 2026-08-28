import java.lang.reflect.Constructor;
import java.util.Arrays;

public class clb<T extends ckv> {
   private static clb<?>[] l = new clb[0];
   public static final clb<ckr> a = a(ckr.class, "HoldingPattern");
   public static final clb<ckz> b = a(ckz.class, "StrafePlayer");
   public static final clb<ckt> c = a(ckt.class, "LandingApproach");
   public static final clb<cku> d = a(cku.class, "Landing");
   public static final clb<cla> e = a(cla.class, "Takeoff");
   public static final clb<ckx> f = a(ckx.class, "SittingFlaming");
   public static final clb<cky> g = a(cky.class, "SittingScanning");
   public static final clb<ckw> h = a(ckw.class, "SittingAttacking");
   public static final clb<ckp> i = a(ckp.class, "ChargingPlayer");
   public static final clb<ckq> j = a(ckq.class, "Dying");
   public static final clb<cks> k = a(cks.class, "Hover");
   private final Class<? extends ckv> m;
   private final int n;
   private final String o;

   private clb(int $$0, Class<? extends ckv> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ckv a(ckl $$0) {
      try {
         Constructor<? extends ckv> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ckv> a() throws NoSuchMethodException {
      return this.m.getConstructor(ckl.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static clb<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ckv> clb<T> a(Class<T> $$0, String $$1) {
      clb<T> $$2 = new clb<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
