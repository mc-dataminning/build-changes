import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class eyi implements Runnable {
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

   public static void a(fhh $$0) {
      ezi $$1 = ezi.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(vu $$0) {
      this.b();
      ezi $$1 = ezi.Q();
      $$1.execute(() -> $$1.a(new ewv($$0, new eum(new fhm()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof ewe $$1) {
         this.a($$1.a.b());
      } else {
         this.a(vu.b($$0.getMessage()));
      }
   }

   protected void a(ewe $$0) {
      this.a($$0.a.b());
   }

   public abstract vu a();

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
