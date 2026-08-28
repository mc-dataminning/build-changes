import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fiw implements Runnable {
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

   public static void a(frp $$0) {
      fjx $$1 = fjx.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xl $$0) {
      this.b();
      fjx $$1 = fjx.Q();
      $$1.execute(() -> $$1.a(new fhn($$0, new fev(new frr()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fgv $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xl.b($$0.getMessage()));
      }
   }

   protected void a(fgv $$0) {
      this.a($$0.a.b());
   }

   public abstract xl a();

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
