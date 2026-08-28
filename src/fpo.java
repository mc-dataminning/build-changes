import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fpo implements Runnable {
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

   public static void a(fzq $$0) {
      fqq $$1 = fqq.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xg $$0) {
      this.b();
      fqq $$1 = fqq.Q();
      $$1.execute(() -> $$1.a(new foe($$0, new fll(new fzs()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fnm $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xg.b($$0.getMessage()));
      }
   }

   protected void a(fnm $$0) {
      this.a($$0.a.b());
   }

   public abstract xg a();

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
