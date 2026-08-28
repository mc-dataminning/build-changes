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

@ac(
   a = "System.out setup"
)
public class akx {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (mb.aC.i().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            dmo.b();
            dky.b();
            if (but.a(but.bR) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               hp.a();
               lc.a();
               ko.a();
               mb.a();
               cvg.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      tl $$3 = tl.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final tl $$1 = tl.a();
      dgf $$2 = new dgf(crw.e.a());
      $$2.a(new dgf.c() {
         @Override
         public <T extends dgf.g<T>> void a(dgf.e<T> $$0x, dgf.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(mb.s, bwl::c, $$0);
      a(mb.f, but::g, $$0);
      a(mb.d, btp::d, $$0);
      a(mb.g, cwm::l, $$0);
      a(mb.e, dwx::v, $$0);
      a(mb.k, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
         ey.b();
      }

      bwr.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new ala("STDERR", System.err));
         System.setOut(new ala("STDOUT", a));
      } else {
         System.setErr(new alc("STDERR", System.err));
         System.setOut(new alc("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
