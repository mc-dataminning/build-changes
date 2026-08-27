import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class eur implements Runnable {
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

   public static void a(fdm $$0) {
      evr $$1 = evr.O();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(vg $$0) {
      this.b();
      evr $$1 = evr.O();
      $$1.execute(() -> $$1.a(new ete($$0, new eqv(new fdr()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof esn $$1) {
         this.a($$1.a.b());
      } else {
         this.a(vg.b($$0.getMessage()));
      }
   }

   protected void a(esn $$0) {
      this.a($$0.a.b());
   }

   public abstract vg a();

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
