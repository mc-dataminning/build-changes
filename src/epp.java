import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class epp implements Runnable {
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

   public static void a(eye $$0) {
      eqp $$1 = eqp.O();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(tl $$0) {
      this.b();
      eqp $$1 = eqp.O();
      $$1.execute(() -> $$1.a(new eod($$0, new elu(new eyj()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof enm $$1) {
         this.a($$1.a.b());
      } else {
         this.a(tl.b($$0.getMessage()));
      }
   }

   protected void a(enm $$0) {
      this.a($$0.a.b());
   }

   public abstract tl a();

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
