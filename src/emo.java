import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class emo implements ekp, Runnable {
   protected static final int a = 25;
   private static final Logger c = LogUtils.getLogger();
   protected elh b;

   protected static void a(long $$0) {
      try {
         Thread.sleep($$0 * 1000L);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
         c.error("", var3);
      }
   }

   public static void a(euq $$0) {
      enn $$1 = enn.N();
      $$1.execute(() -> $$1.a($$0));
   }

   public void a(elh $$0) {
      this.b = $$0;
   }

   @Override
   public void a(sw $$0) {
      this.b.a($$0);
   }

   public void b(sw $$0) {
      this.b.b($$0);
   }

   public boolean c() {
      return this.b.c();
   }

   public void b() {
   }

   public void d() {
   }

   public void a() {
   }
}
