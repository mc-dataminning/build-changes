import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fen implements Runnable {
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

   public static void a(fnd $$0) {
      ffn $$1 = ffn.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wu $$0) {
      this.b();
      ffn $$1 = ffn.Q();
      $$1.execute(() -> $$1.a(new fdb($$0, new far(new fnf()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fcj $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wu.b($$0.getMessage()));
      }
   }

   protected void a(fcj $$0) {
      this.a($$0.a.b());
   }

   public abstract wu a();

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
