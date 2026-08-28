import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fef implements Runnable {
   protected static final int a = 25;
   private static final Logger b = LogUtils.getLogger();
   private boolean c = false;

   protected static void a(long $$0) {
      try {
         Thread.sleep($$0 * 1000L);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
         b.error("", var3);
      }
   }

   public static void a(fnd $$0) {
      fff $$1 = fff.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xp $$0) {
      this.b();
      fff $$1 = fff.Q();
      $$1.execute(() -> $$1.a(new fcs($$0, new faj(new fni()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fcb $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xp.b($$0.getMessage()));
      }
   }

   protected void a(fcb $$0) {
      this.a($$0.a.b());
   }

   public abstract xp a();

   public boolean d() {
      return this.c;
   }

   public void c() {
   }

   public void e() {
   }

   public void b() {
      this.c = true;
   }
}
