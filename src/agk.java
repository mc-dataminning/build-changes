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

public class agk {
   public static final PrintStream a = System.out;
   private static volatile boolean c;
   private static final Logger d = LogUtils.getLogger();
   public static final AtomicLong b = new AtomicLong(-1L);

   public static void a() {
      if (!c) {
         c = true;
         Instant $$0 = Instant.now();
         if (jy.ar.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            cya.b();
            cwl.b();
            if (bku.a(bku.bt) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               cnh.a();
               gg.a();
               je.c();
               iy.a();
               jy.a();
               cjq.a();
               d();
               b.set(Duration.between($$0, Instant.now()).toMillis());
            }
         }
      }
   }

   private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
      ru $$3 = ru.a();
      $$0.forEach($$3x -> {
         String $$4 = $$1.apply((T)$$3x);
         if (!$$3.b($$4)) {
            $$2.add($$4);
         }
      });
   }

   private static void a(final Set<String> $$0) {
      final ru $$1 = ru.a();
      crw.a(new crw.c() {
         @Override
         public <T extends crw.g<T>> void a(crw.e<T> $$0x, crw.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(jy.v, bmh::c, $$0);
      a(jy.h, bku::g, $$0);
      a(jy.e, bkb::d, $$0);
      a(jy.i, cle::a, $$0);
      a(jy.g, cpu::g, $$0);
      a(jy.f, cva::h, $$0);
      a(jy.n, $$0x -> "stat." + $$0x.toString().replace(':', '.'), $$0);
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
      if (aa.aT) {
         b().forEach($$0 -> d.error("Missing translations: {}", $$0));
         dv.b();
      }

      bmn.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new agn("STDERR", System.err));
         System.setOut(new agn("STDOUT", a));
      } else {
         System.setErr(new agp("STDERR", System.err));
         System.setOut(new agp("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
