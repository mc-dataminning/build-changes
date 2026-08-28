import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bor {
   private static final ThreadLocal<bow> a = ThreadLocal.withInitial(bow::new);
   private static final ThreadLocal<bos> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bor() {
   }

   public static bor.a a(bos $$0) {
      b($$0);
      return bor::b;
   }

   private static void b(bos $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bos $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bos $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bos c(bos $$0) {
      return bos.a(c(), $$0);
   }

   public static bos a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bor::c);
   }

   private static bos c() {
      return (bos)(TracyClient.isAvailable() ? a.get() : boo.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
