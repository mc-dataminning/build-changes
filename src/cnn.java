import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cnn<T extends cnh> {
   private static cnn<?>[] l = new cnn[0];
   public static final cnn<cnd> a = a(cnd.class, "HoldingPattern");
   public static final cnn<cnl> b = a(cnl.class, "StrafePlayer");
   public static final cnn<cnf> c = a(cnf.class, "LandingApproach");
   public static final cnn<cng> d = a(cng.class, "Landing");
   public static final cnn<cnm> e = a(cnm.class, "Takeoff");
   public static final cnn<cnj> f = a(cnj.class, "SittingFlaming");
   public static final cnn<cnk> g = a(cnk.class, "SittingScanning");
   public static final cnn<cni> h = a(cni.class, "SittingAttacking");
   public static final cnn<cnb> i = a(cnb.class, "ChargingPlayer");
   public static final cnn<cnc> j = a(cnc.class, "Dying");
   public static final cnn<cne> k = a(cne.class, "Hover");
   private final Class<? extends cnh> m;
   private final int n;
   private final String o;

   private cnn(int $$0, Class<? extends cnh> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cnh a(cmx $$0) {
      try {
         Constructor<? extends cnh> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cnh> a() throws NoSuchMethodException {
      return this.m.getConstructor(cmx.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cnn<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cnh> cnn<T> a(Class<T> $$0, String $$1) {
      cnn<T> $$2 = new cnn<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
