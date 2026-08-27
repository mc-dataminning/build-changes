import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class etk implements Runnable {
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

   public static void a(fcc $$0) {
      euk $$1 = euk.N();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(vb $$0) {
      this.b();
      euk $$1 = euk.N();
      $$1.execute(() -> $$1.a(new erx($$0, new epo(new fch()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof erg $$1) {
         this.a($$1.a.b());
      } else {
         this.a(vb.b($$0.getMessage()));
      }
   }

   protected void a(erg $$0) {
      this.a($$0.a.b());
   }

   public abstract vb a();

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
