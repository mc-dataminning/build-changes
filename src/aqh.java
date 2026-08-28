import com.google.common.collect.Streams;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class aqh implements Runnable {
   private static final Logger a = LogUtils.getLogger();
   private static final long b = 10000L;
   private static final int c = 1;
   private final aqe d;
   private final long e;

   public aqh(aqe $$0) {
      this.d = $$0;
      this.e = $$0.bw() * bak.b;
   }

   @Override
   public void run() {
      while (this.d.x()) {
         long $$0 = this.d.aB();
         long $$1 = ad.d();
         long $$2 = $$1 - $$0;
         if ($$2 > this.e) {
            a.error(
               LogUtils.FATAL_MARKER,
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)$$2 / (float)bak.a),
               String.format(Locale.ROOT, "%.2f", this.d.aP().g() / (float)bak.c)
            );
            a.error(LogUtils.FATAL_MARKER, "Considering it to be crashed, server will forcibly shutdown.");
            o $$3 = a("Watching Server", this.d.ay().threadId());
            this.d.b($$3.f());
            p $$4 = $$3.a("Performance stats");
            $$4.a("Random tick rate", () -> this.d.ba().o().a(der.o).toString());
            $$4.a("Level stats", () -> Streams.stream(this.d.L()).map($$0x -> $$0x.ag() + ": " + $$0x.F()).collect(Collectors.joining(",\n")));
            alj.a("Crash report:\n" + $$3.a(y.a));
            Path $$5 = this.d.D().resolve("crash-reports").resolve("crash-" + ad.f() + "-server.txt");
            if ($$3.a($$5, y.a)) {
               a.error("This crash report has been saved to: {}", $$5.toAbsolutePath());
            } else {
               a.error("We were unable to save this crash report to disk.");
            }

            this.a();
         }

         try {
            Thread.sleep(($$0 + this.e - $$1) / bak.b);
         } catch (InterruptedException var10) {
         }
      }
   }

   public static o a(String $$0, long $$1) {
      ThreadMXBean $$2 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$3 = $$2.dumpAllThreads(true, true);
      StringBuilder $$4 = new StringBuilder();
      Error $$5 = new Error("Watchdog");

      for (ThreadInfo $$6 : $$3) {
         if ($$6.getThreadId() == $$1) {
            $$5.setStackTrace($$6.getStackTrace());
         }

         $$4.append($$6);
         $$4.append("\n");
      }

      o $$7 = new o($$0, $$5);
      p $$8 = $$7.a("Thread Dump");
      $$8.a("Threads", $$4);
      return $$7;
   }

   private void a() {
      try {
         Timer $$0 = new Timer();
         $$0.schedule(new TimerTask() {
            @Override
            public void run() {
               Runtime.getRuntime().halt(1);
            }
         }, 10000L);
         System.exit(1);
      } catch (Throwable var2) {
         Runtime.getRuntime().halt(1);
      }
   }
}
