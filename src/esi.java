import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class esi implements Runnable {
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

   public static void a(faz $$0) {
      eti $$1 = eti.N();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(uv $$0) {
      this.b();
      eti $$1 = eti.N();
      $$1.execute(() -> $$1.a(new eqv($$0, new eom(new fbe()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof eqe $$1) {
         this.a($$1.a.b());
      } else {
         this.a(uv.b($$0.getMessage()));
      }
   }

   protected void a(eqe $$0) {
      this.a($$0.a.b());
   }

   public abstract uv a();

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
