import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class epl implements enl, Runnable {
   protected static final int a = 25;
   private static final Logger c = LogUtils.getLogger();
   protected eod b;

   protected static void a(long $$0) {
      try {
         Thread.sleep($$0 * 1000L);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
         c.error("", var3);
      }
   }

   public static void a(eya $$0) {
      eql $$1 = eql.O();
      $$1.execute(() -> $$1.a($$0));
   }

   public void a(eod $$0) {
      this.b = $$0;
   }

   @Override
   public void a(tf $$0) {
      this.b.a($$0);
   }

   public void b(tf $$0) {
      this.b.b($$0);
   }

   public boolean c() {
      return this.b.f();
   }

   public void b() {
   }

   public void d() {
   }

   public void a() {
   }
}
