import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class boq {
   private static final ThreadLocal<bov> a = ThreadLocal.withInitial(bov::new);
   private static final ThreadLocal<bor> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private boq() {
   }

   public static boq.a a(bor $$0) {
      b($$0);
      return boq::b;
   }

   private static void b(bor $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bor $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bor $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bor c(bor $$0) {
      return bor.a(c(), $$0);
   }

   public static bor a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), boq::c);
   }

   private static bor c() {
      return (bor)(TracyClient.isAvailable() ? a.get() : bon.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
