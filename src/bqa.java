import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bqa {
   private static final ThreadLocal<bqf> a = ThreadLocal.withInitial(bqf::new);
   private static final ThreadLocal<bqb> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bqa() {
   }

   public static bqa.a a(bqb $$0) {
      b($$0);
      return bqa::b;
   }

   private static void b(bqb $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bqb $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bqb $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bqb c(bqb $$0) {
      return bqb.a(c(), $$0);
   }

   public static bqb a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bqa::c);
   }

   private static bqb c() {
      return (bqb)(TracyClient.isAvailable() ? a.get() : bpx.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
