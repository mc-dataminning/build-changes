import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ckk<T extends cke> {
   private static ckk<?>[] l = new ckk[0];
   public static final ckk<cka> a = a(cka.class, "HoldingPattern");
   public static final ckk<cki> b = a(cki.class, "StrafePlayer");
   public static final ckk<ckc> c = a(ckc.class, "LandingApproach");
   public static final ckk<ckd> d = a(ckd.class, "Landing");
   public static final ckk<ckj> e = a(ckj.class, "Takeoff");
   public static final ckk<ckg> f = a(ckg.class, "SittingFlaming");
   public static final ckk<ckh> g = a(ckh.class, "SittingScanning");
   public static final ckk<ckf> h = a(ckf.class, "SittingAttacking");
   public static final ckk<cjy> i = a(cjy.class, "ChargingPlayer");
   public static final ckk<cjz> j = a(cjz.class, "Dying");
   public static final ckk<ckb> k = a(ckb.class, "Hover");
   private final Class<? extends cke> m;
   private final int n;
   private final String o;

   private ckk(int $$0, Class<? extends cke> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cke a(cju $$0) {
      try {
         Constructor<? extends cke> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cke> a() throws NoSuchMethodException {
      return this.m.getConstructor(cju.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static ckk<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cke> ckk<T> a(Class<T> $$0, String $$1) {
      ckk<T> $$2 = new ckk<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
