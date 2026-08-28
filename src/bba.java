import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bba {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final Semaphore c = new Semaphore(1);
   private final Lock d = new ReentrantLock();
   @Nullable
   private volatile Thread e;
   @Nullable
   private volatile aa f;

   public bba(String $$0) {
      this.b = $$0;
   }

   public void a() {
      boolean $$0 = false;

      try {
         this.d.lock();
         if (!this.c.tryAcquire()) {
            this.e = Thread.currentThread();
            $$0 = true;
            this.d.unlock();

            try {
               this.c.acquire();
            } catch (InterruptedException var6) {
               Thread.currentThread().interrupt();
            }

            throw this.f;
         }
      } finally {
         if (!$$0) {
            this.d.unlock();
         }
      }
   }

   public void b() {
      try {
         this.d.lock();
         Thread $$0 = this.e;
         if ($$0 != null) {
            aa $$1 = a(this.b, $$0);
            this.f = $$1;
            this.c.release();
            throw $$1;
         }

         this.c.release();
      } finally {
         this.d.unlock();
      }
   }

   public static aa a(String $$0, @Nullable Thread $$1) {
      String $$2 = Stream.of(Thread.currentThread(), $$1).filter(Objects::nonNull).map(bba::a).collect(Collectors.joining("\n"));
      String $$3 = "Accessing " + $$0 + " from multiple threads";
      p $$4 = new p($$3, new IllegalStateException($$3));
      q $$5 = $$4.a("Thread dumps");
      $$5.a("Thread dumps", $$2);
      a.error("Thread dumps: \n" + $$2);
      return new aa($$4);
   }

   private static String a(Thread $$0) {
      return $$0.getName() + ": \n\tat " + Arrays.stream($$0.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "));
   }
}
