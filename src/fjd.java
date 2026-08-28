import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fjd implements Runnable {
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

   public static void a(frw $$0) {
      fke $$1 = fke.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xj $$0) {
      this.b();
      fke $$1 = fke.Q();
      $$1.execute(() -> $$1.a(new fhu($$0, new ffc(new fry()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fhc $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xj.b($$0.getMessage()));
      }
   }

   protected void a(fhc $$0) {
      this.a($$0.a.b());
   }

   public abstract xj a();

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
