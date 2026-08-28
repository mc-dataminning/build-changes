import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ckm<T extends ckg> {
   private static ckm<?>[] l = new ckm[0];
   public static final ckm<ckc> a = a(ckc.class, "HoldingPattern");
   public static final ckm<ckk> b = a(ckk.class, "StrafePlayer");
   public static final ckm<cke> c = a(cke.class, "LandingApproach");
   public static final ckm<ckf> d = a(ckf.class, "Landing");
   public static final ckm<ckl> e = a(ckl.class, "Takeoff");
   public static final ckm<cki> f = a(cki.class, "SittingFlaming");
   public static final ckm<ckj> g = a(ckj.class, "SittingScanning");
   public static final ckm<ckh> h = a(ckh.class, "SittingAttacking");
   public static final ckm<cka> i = a(cka.class, "ChargingPlayer");
   public static final ckm<ckb> j = a(ckb.class, "Dying");
   public static final ckm<ckd> k = a(ckd.class, "Hover");
   private final Class<? extends ckg> m;
   private final int n;
   private final String o;

   private ckm(int $$0, Class<? extends ckg> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ckg a(cjw $$0) {
      try {
         Constructor<? extends ckg> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ckg> a() throws NoSuchMethodException {
      return this.m.getConstructor(cjw.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static ckm<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ckg> ckm<T> a(Class<T> $$0, String $$1) {
      ckm<T> $$2 = new ckm<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
