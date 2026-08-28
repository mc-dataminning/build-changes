import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class foq implements Runnable {
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

   public static void a(fys $$0) {
      fpt $$1 = fpt.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wy $$0) {
      this.b();
      fpt $$1 = fpt.Q();
      $$1.execute(() -> $$1.a(new fnh($$0, new fko(new fyu()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fmp $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wy.b($$0.getMessage()));
      }
   }

   protected void a(fmp $$0) {
      this.a($$0.a.b());
   }

   public abstract wy a();

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
