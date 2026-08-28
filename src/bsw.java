import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class bsw implements bsp {
   private static final Logger a = LogUtils.getLogger();
   private final Set<bsn> b = new ObjectOpenHashSet();
   private final bsv c = new bsv();

   public bsw(LongSupplier $$0, boolean $$1) {
      this.b.add(a($$0));
      if ($$1) {
         this.b.addAll(a());
      }
   }

   public static Set<bsn> a() {
      Builder<bsn> $$0 = ImmutableSet.builder();

      try {
         bsw.a $$1 = new bsw.a();
         IntStream.range(0, $$1.a).mapToObj($$1x -> bsn.a("cpu#" + $$1x, bsm.h, () -> $$1.a($$1))).forEach($$0::add);
      } catch (Throwable var2) {
         a.warn("Failed to query cpu, no cpu stats will be recorded", var2);
      }

      $$0.add(bsn.a("heap MiB", bsm.e, () -> (double)ae.a(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())));
      $$0.addAll(bso.a.a());
      return $$0.build();
   }

   @Override
   public Set<bsn> a(Supplier<bra> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }

   public static bsn a(final LongSupplier $$0) {
      Stopwatch $$1 = Stopwatch.createUnstarted(new Ticker() {
         public long read() {
            return $$0.getAsLong();
         }
      });
      ToDoubleFunction<Stopwatch> $$2 = $$0x -> {
         if ($$0x.isRunning()) {
            $$0x.stop();
         }

         long $$1x = $$0x.elapsed(TimeUnit.NANOSECONDS);
         $$0x.reset();
         return (double)$$1x;
      };
      bsn.d $$3 = new bsn.d(2.0F);
      return bsn.a("ticktime", bsm.d, $$2, $$1).a(Stopwatch::start).a($$3).a();
   }

   static class a {
      private final SystemInfo b = new SystemInfo();
      private final CentralProcessor c = this.b.getHardware().getProcessor();
      public final int a = this.c.getLogicalProcessorCount();
      private long[][] d = this.c.getProcessorCpuLoadTicks();
      private double[] e = this.c.getProcessorCpuLoadBetweenTicks(this.d);
      private long f;

      public double a(int $$0) {
         long $$1 = System.currentTimeMillis();
         if (this.f == 0L || this.f + 501L < $$1) {
            this.e = this.c.getProcessorCpuLoadBetweenTicks(this.d);
            this.d = this.c.getProcessorCpuLoadTicks();
            this.f = $$1;
         }

         return this.e[$$0] * 100.0;
      }
   }
}
