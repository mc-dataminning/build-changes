import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fkh implements Runnable {
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

   public static void a(fuk $$0) {
      flj $$1 = flj.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wo $$0) {
      this.b();
      flj $$1 = flj.Q();
      $$1.execute(() -> $$1.a(new fiy($$0, new fgf(new fum()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fig $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wo.b($$0.getMessage()));
      }
   }

   protected void a(fig $$0) {
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
