import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ckl<T extends ckf> {
   private static ckl<?>[] l = new ckl[0];
   public static final ckl<ckb> a = a(ckb.class, "HoldingPattern");
   public static final ckl<ckj> b = a(ckj.class, "StrafePlayer");
   public static final ckl<ckd> c = a(ckd.class, "LandingApproach");
   public static final ckl<cke> d = a(cke.class, "Landing");
   public static final ckl<ckk> e = a(ckk.class, "Takeoff");
   public static final ckl<ckh> f = a(ckh.class, "SittingFlaming");
   public static final ckl<cki> g = a(cki.class, "SittingScanning");
   public static final ckl<ckg> h = a(ckg.class, "SittingAttacking");
   public static final ckl<cjz> i = a(cjz.class, "ChargingPlayer");
   public static final ckl<cka> j = a(cka.class, "Dying");
   public static final ckl<ckc> k = a(ckc.class, "Hover");
   private final Class<? extends ckf> m;
   private final int n;
   private final String o;

   private ckl(int $$0, Class<? extends ckf> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ckf a(cjv $$0) {
      try {
         Constructor<? extends ckf> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ckf> a() throws NoSuchMethodException {
      return this.m.getConstructor(cjv.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static ckl<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ckf> ckl<T> a(Class<T> $$0, String $$1) {
      ckl<T> $$2 = new ckl<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
