import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bql {
   private static final ThreadLocal<bqq> a = ThreadLocal.withInitial(bqq::new);
   private static final ThreadLocal<bqm> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bql() {
   }

   public static bql.a a(bqm $$0) {
      b($$0);
      return bql::b;
   }

   private static void b(bqm $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bqm $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bqm $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bqm c(bqm $$0) {
      return bqm.a(c(), $$0);
   }

   public static bqm a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bql::c);
   }

   private static bqm c() {
      return (bqm)(TracyClient.isAvailable() ? a.get() : bqi.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
