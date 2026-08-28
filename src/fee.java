import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fee implements Runnable {
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

   public static void a(fnc $$0) {
      ffe $$1 = ffe.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xo $$0) {
      this.b();
      ffe $$1 = ffe.Q();
      $$1.execute(() -> $$1.a(new fcr($$0, new fai(new fnh()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fca $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xo.b($$0.getMessage()));
      }
   }

   protected void a(fca $$0) {
      this.a($$0.a.b());
   }

   public abstract xo a();

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
