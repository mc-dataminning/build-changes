import java.lang.reflect.Constructor;
import java.util.Arrays;

public class clf<T extends ckz> {
   private static clf<?>[] l = new clf[0];
   public static final clf<ckv> a = a(ckv.class, "HoldingPattern");
   public static final clf<cld> b = a(cld.class, "StrafePlayer");
   public static final clf<ckx> c = a(ckx.class, "LandingApproach");
   public static final clf<cky> d = a(cky.class, "Landing");
   public static final clf<cle> e = a(cle.class, "Takeoff");
   public static final clf<clb> f = a(clb.class, "SittingFlaming");
   public static final clf<clc> g = a(clc.class, "SittingScanning");
   public static final clf<cla> h = a(cla.class, "SittingAttacking");
   public static final clf<ckt> i = a(ckt.class, "ChargingPlayer");
   public static final clf<cku> j = a(cku.class, "Dying");
   public static final clf<ckw> k = a(ckw.class, "Hover");
   private final Class<? extends ckz> m;
   private final int n;
   private final String o;

   private clf(int $$0, Class<? extends ckz> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ckz a(ckp $$0) {
      try {
         Constructor<? extends ckz> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ckz> a() throws NoSuchMethodException {
      return this.m.getConstructor(ckp.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static clf<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ckz> clf<T> a(Class<T> $$0, String $$1) {
      clf<T> $$2 = new clf<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
