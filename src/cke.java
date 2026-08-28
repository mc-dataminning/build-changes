import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cke<T extends cjy> {
   private static cke<?>[] l = new cke[0];
   public static final cke<cju> a = a(cju.class, "HoldingPattern");
   public static final cke<ckc> b = a(ckc.class, "StrafePlayer");
   public static final cke<cjw> c = a(cjw.class, "LandingApproach");
   public static final cke<cjx> d = a(cjx.class, "Landing");
   public static final cke<ckd> e = a(ckd.class, "Takeoff");
   public static final cke<cka> f = a(cka.class, "SittingFlaming");
   public static final cke<ckb> g = a(ckb.class, "SittingScanning");
   public static final cke<cjz> h = a(cjz.class, "SittingAttacking");
   public static final cke<cjs> i = a(cjs.class, "ChargingPlayer");
   public static final cke<cjt> j = a(cjt.class, "Dying");
   public static final cke<cjv> k = a(cjv.class, "Hover");
   private final Class<? extends cjy> m;
   private final int n;
   private final String o;

   private cke(int $$0, Class<? extends cjy> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cjy a(cjo $$0) {
      try {
         Constructor<? extends cjy> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cjy> a() throws NoSuchMethodException {
      return this.m.getConstructor(cjo.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cke<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cjy> cke<T> a(Class<T> $$0, String $$1) {
      cke<T> $$2 = new cke<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
