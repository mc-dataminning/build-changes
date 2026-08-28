import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ckj<T extends ckd> {
   private static ckj<?>[] l = new ckj[0];
   public static final ckj<cjz> a = a(cjz.class, "HoldingPattern");
   public static final ckj<ckh> b = a(ckh.class, "StrafePlayer");
   public static final ckj<ckb> c = a(ckb.class, "LandingApproach");
   public static final ckj<ckc> d = a(ckc.class, "Landing");
   public static final ckj<cki> e = a(cki.class, "Takeoff");
   public static final ckj<ckf> f = a(ckf.class, "SittingFlaming");
   public static final ckj<ckg> g = a(ckg.class, "SittingScanning");
   public static final ckj<cke> h = a(cke.class, "SittingAttacking");
   public static final ckj<cjx> i = a(cjx.class, "ChargingPlayer");
   public static final ckj<cjy> j = a(cjy.class, "Dying");
   public static final ckj<cka> k = a(cka.class, "Hover");
   private final Class<? extends ckd> m;
   private final int n;
   private final String o;

   private ckj(int $$0, Class<? extends ckd> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ckd a(cjt $$0) {
      try {
         Constructor<? extends ckd> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ckd> a() throws NoSuchMethodException {
      return this.m.getConstructor(cjt.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static ckj<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ckd> ckj<T> a(Class<T> $$0, String $$1) {
      ckj<T> $$2 = new ckj<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
