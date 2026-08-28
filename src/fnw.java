import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fnw implements Runnable {
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

   public static void a(fyb $$0) {
      foz $$1 = foz.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wy $$0) {
      this.b();
      foz $$1 = foz.Q();
      $$1.execute(() -> $$1.a(new fmn($$0, new fju(new fyd()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof flv $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wy.b($$0.getMessage()));
      }
   }

   protected void a(flv $$0) {
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
