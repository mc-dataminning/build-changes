import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class eqo implements Runnable {
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

   public static void a(ezd $$0) {
      ero $$1 = ero.O();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(ui $$0) {
      this.b();
      ero $$1 = ero.O();
      $$1.execute(() -> $$1.a(new epb($$0, new ems(new ezi()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof eok $$1) {
         this.a($$1.a.b());
      } else {
         this.a(ui.b($$0.getMessage()));
      }
   }

   protected void a(eok $$0) {
      this.a($$0.a.b());
   }

   public abstract ui a();

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
