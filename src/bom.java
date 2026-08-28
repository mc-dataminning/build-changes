import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bom {
   private static final ThreadLocal<bor> a = ThreadLocal.withInitial(bor::new);
   private static final ThreadLocal<bon> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bom() {
   }

   public static bom.a a(bon $$0) {
      b($$0);
      return bom::b;
   }

   private static void b(bon $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bon $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bon $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bon c(bon $$0) {
      return bon.a(c(), $$0);
   }

   public static bon a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bom::c);
   }

   private static bon c() {
      return (bon)(TracyClient.isAvailable() ? a.get() : boj.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
