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

public class aks {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (lt.aA.f().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            diw.b();
            dhh.b();
            if (bsw.a(bsw.by) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               hk.a();
               kx.a();
               kj.a();
               lt.a();
               csz.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      tv $$3 = tv.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final tv $$1 = tv.a();
      dcq.a(new dcq.c() {
         @Override
         public <T extends dcq.g<T>> void a(dcq.e<T> $$0x, dcq.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(lt.s, bup::c, $$0);
      a(lt.f, bsw::g, $$0);
      a(lt.d, brw::d, $$0);
      a(lt.g, cuj::a, $$0);
      a(lt.e, dfw::g, $$0);
      a(lt.k, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
      if (ab.aV) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         eu.b();
      }

      buv.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new akv("STDERR", System.err));
         System.setOut(new akv("STDOUT", a));
      } else {
         System.setErr(new akx("STDERR", System.err));
         System.setOut(new akx("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
