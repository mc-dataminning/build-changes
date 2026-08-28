import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bps {
   private static final ThreadLocal<bpx> a = ThreadLocal.withInitial(bpx::new);
   private static final ThreadLocal<bpt> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bps() {
   }

   public static bps.a a(bpt $$0) {
      b($$0);
      return bps::b;
   }

   private static void b(bpt $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bpt $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bpt $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bpt c(bpt $$0) {
      return bpt.a(c(), $$0);
   }

   public static bpt a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bps::c);
   }

   private static bpt c() {
      return (bpt)(TracyClient.isAvailable() ? a.get() : bpp.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
