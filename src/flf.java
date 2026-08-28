import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class flf implements Runnable {
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

   public static void a(fty $$0) {
      fmg $$1 = fmg.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xv $$0) {
      this.b();
      fmg $$1 = fmg.Q();
      $$1.execute(() -> $$1.a(new fjw($$0, new fhd(new fua()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fje $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xv.b($$0.getMessage()));
      }
   }

   protected void a(fje $$0) {
      this.a($$0.a.b());
   }

   public abstract xv a();

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
