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

public class aja {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (kf.as.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            dbs.b();
            dad.b();
            if (bnw.a(bnw.bw) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               cra.a();
               gi.a();
               jl.c();
               jf.a();
               kf.a();
               cnk.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      sr $$3 = sr.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final sr $$1 = sr.a();
      cvn.a(new cvn.c() {
         @Override
         public <T extends cvn.g<T>> void a(cvn.e<T> $$0x, cvn.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(kf.u, bpk::c, $$0);
      a(kf.g, bnw::g, $$0);
      a(kf.d, bnb::d, $$0);
      a(kf.h, coy::a, $$0);
      a(kf.f, ctm::h, $$0);
      a(kf.e, cys::h, $$0);
      a(kf.m, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
      if (aa.aU) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         dv.b();
      }

      bpq.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new ajd("STDERR", System.err));
         System.setOut(new ajd("STDOUT", a));
      } else {
         System.setErr(new ajf("STDERR", System.err));
         System.setOut(new ajf("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
