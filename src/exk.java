import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class exk implements Runnable {
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

   public static void a(fgh $$0) {
      eyk $$1 = eyk.P();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(vs $$0) {
      this.b();
      eyk $$1 = eyk.P();
      $$1.execute(() -> $$1.a(new evx($$0, new eto(new fgm()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof evg $$1) {
         this.a($$1.a.b());
      } else {
         this.a(vs.b($$0.getMessage()));
      }
   }

   protected void a(evg $$0) {
      this.a($$0.a.b());
   }

   public abstract vs a();

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
