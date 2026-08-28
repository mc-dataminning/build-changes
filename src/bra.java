import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bra {
   private static final ThreadLocal<brf> a = ThreadLocal.withInitial(brf::new);
   private static final ThreadLocal<brb> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bra() {
   }

   public static bra.a a(brb $$0) {
      b($$0);
      return bra::b;
   }

   private static void b(brb $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         brb $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      brb $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static brb c(brb $$0) {
      return brb.a(c(), $$0);
   }

   public static brb a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bra::c);
   }

   private static brb c() {
      return (brb)(TracyClient.isAvailable() ? a.get() : bqx.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
