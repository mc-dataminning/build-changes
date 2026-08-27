import com.mojang.logging.LogUtils;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class aue implements Runnable {
   private static final Logger d = LogUtils.getLogger();
   private static final AtomicInteger e = new AtomicInteger(0);
   private static final int f = 5;
   protected volatile boolean a;
   protected final String b;
   @Nullable
   protected Thread c;

   protected aue(String $$0) {
      this.b = $$0;
   }

   public synchronized boolean a() {
      if (this.a) {
         return true;
      } else {
         this.a = true;
         this.c = new Thread(this, this.b + " #" + e.incrementAndGet());
         this.c.setUncaughtExceptionHandler(new s(d));
         this.c.start();
         d.info("Thread {} started", this.b);
         return true;
      }
   }

   public synchronized void b() {
      this.a = false;
      if (null != this.c) {
         int $$0 = 0;

         while (this.c.isAlive()) {
            try {
               this.c.join(1000L);
               if (++$$0 >= 5) {
                  d.warn("Waited {} seconds attempting force stop!", $$0);
               } else if (this.c.isAlive()) {
                  d.warn("Thread {} ({}) failed to exit after {} second(s)", new Object[]{this, this.c.getState(), $$0, new Exception("Stack:")});
                  this.c.interrupt();
               }
            } catch (InterruptedException var3) {
            }
         }

         d.info("Thread {} stopped", this.b);
         this.c = null;
      }
   }

   public boolean c() {
      return this.a;
   }
}
