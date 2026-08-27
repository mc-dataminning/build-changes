import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cfn<T extends cfh> {
   private static cfn<?>[] l = new cfn[0];
   public static final cfn<cfd> a = a(cfd.class, "HoldingPattern");
   public static final cfn<cfl> b = a(cfl.class, "StrafePlayer");
   public static final cfn<cff> c = a(cff.class, "LandingApproach");
   public static final cfn<cfg> d = a(cfg.class, "Landing");
   public static final cfn<cfm> e = a(cfm.class, "Takeoff");
   public static final cfn<cfj> f = a(cfj.class, "SittingFlaming");
   public static final cfn<cfk> g = a(cfk.class, "SittingScanning");
   public static final cfn<cfi> h = a(cfi.class, "SittingAttacking");
   public static final cfn<cfb> i = a(cfb.class, "ChargingPlayer");
   public static final cfn<cfc> j = a(cfc.class, "Dying");
   public static final cfn<cfe> k = a(cfe.class, "Hover");
   private final Class<? extends cfh> m;
   private final int n;
   private final String o;

   private cfn(int $$0, Class<? extends cfh> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cfh a(cex $$0) {
      try {
         Constructor<? extends cfh> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cfh> a() throws NoSuchMethodException {
      return this.m.getConstructor(cex.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cfn<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cfh> cfn<T> a(Class<T> $$0, String $$1) {
      cfn<T> $$2 = new cfn<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
