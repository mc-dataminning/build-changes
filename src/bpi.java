import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bpi {
   private static final ThreadLocal<bpn> a = ThreadLocal.withInitial(bpn::new);
   private static final ThreadLocal<bpj> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bpi() {
   }

   public static bpi.a a(bpj $$0) {
      b($$0);
      return bpi::b;
   }

   private static void b(bpj $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         bpj $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      bpj $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static bpj c(bpj $$0) {
      return bpj.a(c(), $$0);
   }

   public static bpj a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bpi::c);
   }

   private static bpj c() {
      return (bpj)(TracyClient.isAvailable() ? a.get() : bpf.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
