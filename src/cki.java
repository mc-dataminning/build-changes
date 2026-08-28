import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cki<T extends ckc> {
   private static cki<?>[] l = new cki[0];
   public static final cki<cjy> a = a(cjy.class, "HoldingPattern");
   public static final cki<ckg> b = a(ckg.class, "StrafePlayer");
   public static final cki<cka> c = a(cka.class, "LandingApproach");
   public static final cki<ckb> d = a(ckb.class, "Landing");
   public static final cki<ckh> e = a(ckh.class, "Takeoff");
   public static final cki<cke> f = a(cke.class, "SittingFlaming");
   public static final cki<ckf> g = a(ckf.class, "SittingScanning");
   public static final cki<ckd> h = a(ckd.class, "SittingAttacking");
   public static final cki<cjw> i = a(cjw.class, "ChargingPlayer");
   public static final cki<cjx> j = a(cjx.class, "Dying");
   public static final cki<cjz> k = a(cjz.class, "Hover");
   private final Class<? extends ckc> m;
   private final int n;
   private final String o;

   private cki(int $$0, Class<? extends ckc> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ckc a(cjs $$0) {
      try {
         Constructor<? extends ckc> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ckc> a() throws NoSuchMethodException {
      return this.m.getConstructor(cjs.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cki<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ckc> cki<T> a(Class<T> $$0, String $$1) {
      cki<T> $$2 = new cki<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
