import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bqp {
   private static final ThreadLocal<bqu> a = ThreadLocal.withInitial(bqu::new);
   private static final ThreadLocal<bqq> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bqp() {
   }

   public static bqp.a a(bqq $$0) {
      b($$0);
      return bqp::b;
   }

   private static void b(bqq $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bqq $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bqq $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bqq c(bqq $$0) {
      return bqq.a(c(), $$0);
   }

   public static bqq a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bqp::c);
   }

   private static bqq c() {
      return (bqq)(TracyClient.isAvailable() ? a.get() : bqm.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
