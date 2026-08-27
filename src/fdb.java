import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fdb implements Runnable {
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

   public static void a(flz $$0) {
      feb $$1 = feb.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wx $$0) {
      this.b();
      feb $$1 = feb.Q();
      $$1.execute(() -> $$1.a(new fbo($$0, new ezf(new fme()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fax $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wx.b($$0.getMessage()));
      }
   }

   protected void a(fax $$0) {
      this.a($$0.a.b());
   }

   public abstract wx a();

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
