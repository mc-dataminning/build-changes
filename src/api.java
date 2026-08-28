import com.google.common.collect.Streams;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class api implements Runnable {
   private static final Logger a = LogUtils.getLogger();
   private static final long b = 10000L;
   private static final int c = 1;
   private final apf d;
   private final long e;

   public api(apf $$0) {
      this.d = $$0;
      this.e = $$0.bv() * azh.b;
   }

   @Override
   public void run() {
      while (this.d.x()) {
         long $$0 = this.d.aD();
         long $$1 = ac.d();
         long $$2 = $$1 - $$0;
         if ($$2 > this.e) {
            a.error(
               LogUtils.FATAL_MARKER,
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)$$2 / (float)azh.a),
               String.format(Locale.ROOT, "%.2f", this.d.aR().g() / (float)azh.c)
            );
            a.error(LogUtils.FATAL_MARKER, "Considering it to be crashed, server will forcibly shutdown.");
            ThreadMXBean $$3 = ManagementFactory.getThreadMXBean();
            ThreadInfo[] $$4 = $$3.dumpAllThreads(true, true);
            StringBuilder $$5 = new StringBuilder();
            Error $$6 = new Error("Watchdog");

            for (ThreadInfo $$7 : $$4) {
               if ($$7.getThreadId() == this.d.aA().getId()) {
                  $$6.setStackTrace($$7.getStackTrace());
               }

               $$5.append($$7);
               $$5.append("\n");
            }

            o $$8 = new o("Watching Server", $$6);
            this.d.b($$8.g());
            p $$9 = $$8.a("Thread Dump");
            $$9.a("Threads", $$5);
            p $$10 = $$8.a("Performance stats");
            $$10.a("Random tick rate", () -> this.d.bc().o().a(dcc.o).toString());
            $$10.a("Level stats", () -> Streams.stream(this.d.L()).map($$0x -> $$0x.af() + ": " + $$0x.F()).collect(Collectors.joining(",\n")));
            akm.a("Crash report:\n" + $$8.e());
            File $$11 = new File(new File(this.d.D(), "crash-reports"), "crash-" + ac.f() + "-server.txt");
            if ($$8.a($$11)) {
               a.error("This crash report has been saved to: {}", $$11.getAbsolutePath());
            } else {
               a.error("We were unable to save this crash report to disk.");
            }

            this.a();
         }

         try {
            Thread.sleep(($$0 + this.e - $$1) / azh.b);
         } catch (InterruptedException var15) {
         }
      }
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
