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

public class aet {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (jb.ap.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            cvh.a();
            ctu.a();
            if (bim.a(bim.bt) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               ckv.a();
               gc.a();
               ih.c();
               ib.b();
               jb.a();
               che.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      qm $$3 = qm.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final qm $$1 = qm.a();
      cph.a(new cph.c() {
         @Override
         public <T extends cph.g<T>> void a(cph.e<T> $$0x, cph.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(jb.v, bjz::c, $$0);
      a(jb.h, bim::g, $$0);
      a(jb.e, bht::d, $$0);
      a(jb.i, cis::a, $$0);
      a(jb.g, cne::g, $$0);
      a(jb.f, csl::f, $$0);
      a(jb.n, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
      if (aa.aS) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         ds.b();
      }

      bkf.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new aew("STDERR", System.err));
         System.setOut(new aew("STDOUT", a));
      } else {
         System.setErr(new aey("STDERR", System.err));
         System.setOut(new aey("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
