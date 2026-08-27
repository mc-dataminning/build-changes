import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ffj implements Runnable {
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

   public static void a(fon $$0) {
      fgj $$1 = fgj.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xe $$0) {
      this.b();
      fgj $$1 = fgj.Q();
      $$1.execute(() -> $$1.a(new fdw($$0, new fbn(new fou()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fdf $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xe.b($$0.getMessage()));
      }
   }

   protected void a(fdf $$0) {
      this.a($$0.a.b());
   }

   public abstract xe a();

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
