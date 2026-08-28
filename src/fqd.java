import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fqd implements Runnable {
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

   public static void a(gaf $$0) {
      frf $$1 = frf.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xc $$0) {
      this.b();
      frf $$1 = frf.Q();
      $$1.execute(() -> $$1.a(new fou($$0, new fma(new gah()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fob $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xc.b($$0.getMessage()));
      }
   }

   protected void a(fob $$0) {
      this.a($$0.a.b());
   }

   public abstract xc a();

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
