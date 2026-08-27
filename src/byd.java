import java.lang.reflect.Constructor;
import java.util.Arrays;

public class byd<T extends bxx> {
   private static byd<?>[] l = new byd[0];
   public static final byd<bxt> a = a(bxt.class, "HoldingPattern");
   public static final byd<byb> b = a(byb.class, "StrafePlayer");
   public static final byd<bxv> c = a(bxv.class, "LandingApproach");
   public static final byd<bxw> d = a(bxw.class, "Landing");
   public static final byd<byc> e = a(byc.class, "Takeoff");
   public static final byd<bxz> f = a(bxz.class, "SittingFlaming");
   public static final byd<bya> g = a(bya.class, "SittingScanning");
   public static final byd<bxy> h = a(bxy.class, "SittingAttacking");
   public static final byd<bxr> i = a(bxr.class, "ChargingPlayer");
   public static final byd<bxs> j = a(bxs.class, "Dying");
   public static final byd<bxu> k = a(bxu.class, "Hover");
   private final Class<? extends bxx> m;
   private final int n;
   private final String o;

   private byd(int $$0, Class<? extends bxx> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxx a(bxn $$0) {
      try {
         Constructor<? extends bxx> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxx> a() throws NoSuchMethodException {
      return this.m.getConstructor(bxn.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static byd<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxx> byd<T> a(Class<T> $$0, String $$1) {
      byd<T> $$2 = new byd<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
