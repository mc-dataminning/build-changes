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

public class agv {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (kb.ar.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            cyz.b();
            cxk.b();
            if (blj.a(blj.bv) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               cof.a();
               ge.a();
               jh.c();
               jb.a();
               kb.a();
               cko.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      se $$3 = se.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final se $$1 = se.a();
      csu.a(new csu.c() {
         @Override
         public <T extends csu.g<T>> void a(csu.e<T> $$0x, csu.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(kb.u, bmw::c, $$0);
      a(kb.g, blj::g, $$0);
      a(kb.d, bkq::d, $$0);
      a(kb.h, cmc::a, $$0);
      a(kb.f, cqs::g, $$0);
      a(kb.e, cvz::h, $$0);
      a(kb.m, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
      if (aa.aW) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         dt.b();
      }

      bnc.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new agy("STDERR", System.err));
         System.setOut(new agy("STDOUT", a));
      } else {
         System.setErr(new aha("STDERR", System.err));
         System.setOut(new aha("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
