import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class euh implements Runnable {
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

   public static void a(fda $$0) {
      evh $$1 = evh.O();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(vf $$0) {
      this.b();
      evh $$1 = evh.O();
      $$1.execute(() -> $$1.a(new esu($$0, new eql(new fdf()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof esd $$1) {
         this.a($$1.a.b());
      } else {
         this.a(vf.b($$0.getMessage()));
      }
   }

   protected void a(esd $$0) {
      this.a($$0.a.b());
   }

   public abstract vf a();

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
