import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fmb implements Runnable {
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

   public static void a(fwf $$0) {
      fnd $$1 = fnd.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wv $$0) {
      this.b();
      fnd $$1 = fnd.Q();
      $$1.execute(() -> $$1.a(new fks($$0, new fhz(new fwh()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fka $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wv.b($$0.getMessage()));
      }
   }

   protected void a(fka $$0) {
      this.a($$0.a.b());
   }

   public abstract wv a();

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
