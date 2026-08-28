import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fig implements Runnable {
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

   public static void a(fra $$0) {
      fji $$1 = fji.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xi $$0) {
      this.b();
      fji $$1 = fji.Q();
      $$1.execute(() -> $$1.a(new fgu($$0, new fem(new frc()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fgc $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xi.b($$0.getMessage()));
      }
   }

   protected void a(fgc $$0) {
      this.a($$0.a.b());
   }

   public abstract xi a();

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
