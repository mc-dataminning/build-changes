import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bqi {
   private static final ThreadLocal<bqn> a = ThreadLocal.withInitial(bqn::new);
   private static final ThreadLocal<bqj> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bqi() {
   }

   public static bqi.a a(bqj $$0) {
      b($$0);
      return bqi::b;
   }

   private static void b(bqj $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bqj $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bqj $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bqj c(bqj $$0) {
      return bqj.a(c(), $$0);
   }

   public static bqj a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bqi::c);
   }

   private static bqj c() {
      return (bqj)(TracyClient.isAvailable() ? a.get() : bqf.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
