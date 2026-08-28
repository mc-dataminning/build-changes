import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bpn {
   private static final ThreadLocal<bps> a = ThreadLocal.withInitial(bps::new);
   private static final ThreadLocal<bpo> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bpn() {
   }

   public static bpn.a a(bpo $$0) {
      b($$0);
      return bpn::b;
   }

   private static void b(bpo $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bpo $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bpo $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bpo c(bpo $$0) {
      return bpo.a(c(), $$0);
   }

   public static bpo a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bpn::c);
   }

   private static bpo c() {
      return (bpo)(TracyClient.isAvailable() ? a.get() : bpk.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
