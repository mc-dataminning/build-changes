import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cmx<T extends cmr> {
   private static cmx<?>[] l = new cmx[0];
   public static final cmx<cmn> a = a(cmn.class, "HoldingPattern");
   public static final cmx<cmv> b = a(cmv.class, "StrafePlayer");
   public static final cmx<cmp> c = a(cmp.class, "LandingApproach");
   public static final cmx<cmq> d = a(cmq.class, "Landing");
   public static final cmx<cmw> e = a(cmw.class, "Takeoff");
   public static final cmx<cmt> f = a(cmt.class, "SittingFlaming");
   public static final cmx<cmu> g = a(cmu.class, "SittingScanning");
   public static final cmx<cms> h = a(cms.class, "SittingAttacking");
   public static final cmx<cml> i = a(cml.class, "ChargingPlayer");
   public static final cmx<cmm> j = a(cmm.class, "Dying");
   public static final cmx<cmo> k = a(cmo.class, "Hover");
   private final Class<? extends cmr> m;
   private final int n;
   private final String o;

   private cmx(int $$0, Class<? extends cmr> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cmr a(cmh $$0) {
      try {
         Constructor<? extends cmr> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cmr> a() throws NoSuchMethodException {
      return this.m.getConstructor(cmh.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cmx<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cmr> cmx<T> a(Class<T> $$0, String $$1) {
      cmx<T> $$2 = new cmx<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
