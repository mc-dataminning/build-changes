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

public class ajv {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (kr.au.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            dey.b();
            ddj.b();
            if (bqb.a(bqb.bx) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               ctg.a();
               gk.a();
               jx.c();
               ji.a();
               kr.a();
               cpv.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      th $$3 = th.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final th $$1 = th.a();
      cyt.a(new cyt.c() {
         @Override
         public <T extends cyt.g<T>> void a(cyt.e<T> $$0x, cyt.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(kr.u, brq::c, $$0);
      a(kr.g, bqb::g, $$0);
      a(kr.d, bpf::d, $$0);
      a(kr.h, cre::a, $$0);
      a(kr.f, cwq::h, $$0);
      a(kr.e, dby::g, $$0);
      a(kr.m, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
         dv.b();
      }

      brw.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new ajy("STDERR", System.err));
         System.setOut(new ajy("STDOUT", a));
      } else {
         System.setErr(new aka("STDERR", System.err));
         System.setOut(new aka("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
