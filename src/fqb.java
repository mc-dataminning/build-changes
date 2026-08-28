import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fqb implements Runnable {
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

   public static void a(gad $$0) {
      frd $$1 = frd.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xa $$0) {
      this.b();
      frd $$1 = frd.Q();
      $$1.execute(() -> $$1.a(new fos($$0, new fly(new gaf()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fnz $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xa.b($$0.getMessage()));
      }
   }

   protected void a(fnz $$0) {
      this.a($$0.a.b());
   }

   public abstract xa a();

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
