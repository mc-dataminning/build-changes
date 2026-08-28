import com.mojang.logging.LogUtils;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class amb {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (ma.aC.i().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            dnn.b();
            dly.b();
            if (bvr.a(bvr.bS) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               ho.a();
               lb.a();
               kn.a();
               ma.a();
               cwf.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      us $$3 = us.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final us $$1 = us.a();
      dhe $$2 = new dhe(csv.f.a());
      $$2.a(new dhe.c() {
         @Override
         public <T extends dhe.g<T>> void a(dhe.e<T> $$0x, dhe.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(ma.s, bxj::c, $$0);
      a(ma.f, bvr::g, $$0);
      a(ma.d, bun::d, $$0);
      a(ma.g, cxl::l, $$0);
      a(ma.e, dxu::v, $$0);
      a(ma.k, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
      a($$0);
      return $$0;
   }

   public static void a(Supplier<String> $$0) {
      if (!c) {
         throw b($$0);
      }
   }

   private static RuntimeException b(Supplier<String> $$0) {
      try {
         String $$1 = $$0.get();
         return new IllegalArgumentException("Not bootstrapped (called from " + $$1 + ")");
      } catch (Exception var3) {
         RuntimeException $$3 = new IllegalArgumentException("Not bootstrapped (failed to resolve location)");
         $$3.addSuppressed(var3);
         return $$3;
      }
   }

   public static void c() {
      a(() -> "validate");
      if (ab.aU) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         ex.b();
      }

      bxp.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new ame("STDERR", System.err));
         System.setOut(new ame("STDOUT", a));
      } else {
         System.setErr(new amg("STDERR", System.err));
         System.setOut(new amg("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
