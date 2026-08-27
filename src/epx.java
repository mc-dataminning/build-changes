import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class epx implements Runnable {
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

   public static void a(eym $$0) {
      eqx $$1 = eqx.O();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(tn $$0) {
      this.b();
      eqx $$1 = eqx.O();
      $$1.execute(() -> $$1.a(new eol($$0, new emc(new eyr()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof enu $$1) {
         this.a($$1.a.b());
      } else {
         this.a(tn.b($$0.getMessage()));
      }
   }

   protected void a(enu $$0) {
      this.a($$0.a.b());
   }

   public abstract tn a();

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
