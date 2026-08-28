import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fkf implements Runnable {
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

   public static void a(fui $$0) {
      flh $$1 = flh.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wo $$0) {
      this.b();
      flh $$1 = flh.Q();
      $$1.execute(() -> $$1.a(new fiw($$0, new fgd(new fuk()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fie $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wo.b($$0.getMessage()));
      }
   }

   protected void a(fie $$0) {
      this.a($$0.a.b());
   }

   public abstract wo a();

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
