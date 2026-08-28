import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bqn {
   private static final ThreadLocal<bqs> a = ThreadLocal.withInitial(bqs::new);
   private static final ThreadLocal<bqo> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bqn() {
   }

   public static bqn.a a(bqo $$0) {
      b($$0);
      return bqn::b;
   }

   private static void b(bqo $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bqo $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bqo $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bqo c(bqo $$0) {
      return bqo.a(c(), $$0);
   }

   public static bqo a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bqn::c);
   }

   private static bqo c() {
      return (bqo)(TracyClient.isAvailable() ? a.get() : bqk.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
