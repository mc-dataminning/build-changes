import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bot {
   private static final ThreadLocal<boy> a = ThreadLocal.withInitial(boy::new);
   private static final ThreadLocal<bou> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bot() {
   }

   public static bot.a a(bou $$0) {
      b($$0);
      return bot::b;
   }

   private static void b(bou $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bou $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bou $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bou c(bou $$0) {
      return bou.a(c(), $$0);
   }

   public static bou a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bot::c);
   }

   private static bou c() {
      return (bou)(TracyClient.isAvailable() ? a.get() : boq.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
