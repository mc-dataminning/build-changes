import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class brc {
   private static final ThreadLocal<brh> a = ThreadLocal.withInitial(brh::new);
   private static final ThreadLocal<brd> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private brc() {
   }

   public static brc.a a(brd $$0) {
      b($$0);
      return brc::b;
   }

   private static void b(brd $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         brd $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      brd $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static brd c(brd $$0) {
      return brd.a(c(), $$0);
   }

   public static brd a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), brc::c);
   }

   private static brd c() {
      return (brd)(TracyClient.isAvailable() ? a.get() : bqz.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
