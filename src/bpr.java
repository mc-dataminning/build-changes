import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bpr {
   private static final ThreadLocal<bpw> a = ThreadLocal.withInitial(bpw::new);
   private static final ThreadLocal<bps> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bpr() {
   }

   public static bpr.a a(bps $$0) {
      b($$0);
      return bpr::b;
   }

   private static void b(bps $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bps $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bps $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bps c(bps $$0) {
      return bps.a(c(), $$0);
   }

   public static bps a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bpr::c);
   }

   private static bps c() {
      return (bps)(TracyClient.isAvailable() ? a.get() : bpo.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
