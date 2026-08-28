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

public class ald {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (lp.aw.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            dhu.b();
            dgf.b();
            if (bsv.a(bsv.by) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               hg.a();
               kt.a();
               kf.a();
               lp.a();
               csw.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      um $$3 = um.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final um $$1 = um.a();
      dbp.a(new dbp.c() {
         @Override
         public <T extends dbp.g<T>> void a(dbp.e<T> $$0x, dbp.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(lp.u, bun::c, $$0);
      a(lp.g, bsv::g, $$0);
      a(lp.d, brv::d, $$0);
      a(lp.h, cuf::a, $$0);
      a(lp.f, czv::j, $$0);
      a(lp.e, deu::g, $$0);
      a(lp.m, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
      if (aa.aX) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         eq.b();
      }

      but.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new alg("STDERR", System.err));
         System.setOut(new alg("STDOUT", a));
      } else {
         System.setErr(new ali("STDERR", System.err));
         System.setOut(new ali("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
