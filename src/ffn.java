import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ffn implements Runnable {
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

   public static void a(fod $$0) {
      fgo $$1 = fgo.Q();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(wz $$0) {
      this.b();
      fgo $$1 = fgo.Q();
      $$1.execute(() -> $$1.a(new feb($$0, new fbt(new fof()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fdj $$1) {
         this.a($$1.a.b());
      } else {
         this.a(wz.b($$0.getMessage()));
      }
   }

   protected void a(fdj $$0) {
      this.a($$0.a.b());
   }

   public abstract wz a();

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
