import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ewh implements Runnable {
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

   public static void a(ffe $$0) {
      exh $$1 = exh.O();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(vq $$0) {
      this.b();
      exh $$1 = exh.O();
      $$1.execute(() -> $$1.a(new euu($$0, new esl(new ffj()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof eud $$1) {
         this.a($$1.a.b());
      } else {
         this.a(vq.b($$0.getMessage()));
      }
   }

   protected void a(eud $$0) {
      this.a($$0.a.b());
   }

   public abstract vq a();

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
