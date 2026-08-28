import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class brl {
   private static final ThreadLocal<brq> a = ThreadLocal.withInitial(brq::new);
   private static final ThreadLocal<brm> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private brl() {
   }

   public static brl.a a(brm $$0) {
      b($$0);
      return brl::b;
   }

   private static void b(brm $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         brm $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      brm $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static brm c(brm $$0) {
      return brm.a(c(), $$0);
   }

   public static brm a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), brl::c);
   }

   private static brm c() {
      return (brm)(TracyClient.isAvailable() ? a.get() : bri.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
