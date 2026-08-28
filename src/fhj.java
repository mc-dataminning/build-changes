import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fhj implements Runnable {
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

   public static void a(fqd $$0) {
      fil $$1 = fil.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xd $$0) {
      this.b();
      fil $$1 = fil.Q();
      $$1.execute(() -> $$1.a(new ffx($$0, new fdp(new fqf()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fff $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xd.b($$0.getMessage()));
      }
   }

   protected void a(fff $$0) {
      this.a($$0.a.b());
   }

   public abstract xd a();

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
