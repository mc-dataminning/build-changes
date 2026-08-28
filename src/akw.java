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
public class akw {
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
            dmn.b();
            dkx.b();
            if (bur.a(bur.bS) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               hp.a();
               lc.a();
               ko.a();
               mb.a();
               cvf.a();
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
      dge $$2 = new dge(crv.e.a());
      $$2.a(new dge.c() {
         @Override
         public <T extends dge.g<T>> void a(dge.e<T> $$0x, dge.f<T> $$1x) {
            if (!$$1.b($$0.b())) {
               $$0.add($$0.a());
            }
         }
      });
   }

   public static Set<String> b() {
      Set<String> $$0 = new TreeSet<>();
      a(mb.s, bwj::c, $$0);
      a(mb.f, bur::g, $$0);
      a(mb.d, btn::d, $$0);
      a(mb.g, cwl::l, $$0);
      a(mb.e, dww::v, $$0);
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

      bwp.a();
   }

   private static void d() {
      if (d.isDebugEnabled()) {
         System.setErr(new akz("STDERR", System.err));
         System.setOut(new akz("STDOUT", a));
      } else {
         System.setErr(new alb("STDERR", System.err));
         System.setOut(new alb("STDOUT", a));
      }
   }

   public static void a(String $$0) {
      a.println($$0);
   }
}
