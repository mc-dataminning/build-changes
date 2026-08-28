import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bos {
   private static final ThreadLocal<box> a = ThreadLocal.withInitial(box::new);
   private static final ThreadLocal<bot> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bos() {
   }

   public static bos.a a(bot $$0) {
      b($$0);
      return bos::b;
   }

   private static void b(bot $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bot $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bot $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bot c(bot $$0) {
      return bot.a(c(), $$0);
   }

   public static bot a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bos::c);
   }

   private static bot c() {
      return (bot)(TracyClient.isAvailable() ? a.get() : bop.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
