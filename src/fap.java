import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fap implements Runnable {
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

   public static void a(fjo $$0) {
      fbp $$1 = fbp.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wg $$0) {
      this.b();
      fbp $$1 = fbp.Q();
      $$1.execute(() -> $$1.a(new ezc($$0, new ewt(new fjt()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof eyl $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wg.b($$0.getMessage()));
      }
   }

   protected void a(eyl $$0) {
      this.a($$0.a.b());
   }

   public abstract wg a();

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
