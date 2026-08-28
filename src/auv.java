import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class auv extends avh<auv.a> {
   private static final Logger c = LogUtils.getLogger();
   private final Stopwatch d = Stopwatch.createUnstarted();

   public auv(avb $$0, List<auu> $$1, Executor $$2, Executor $$3, CompletableFuture<bap> $$4) {
      super($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5) -> {
         AtomicLong $$6 = new AtomicLong();
         AtomicLong $$7 = new AtomicLong();
         CompletableFuture<Void> $$8 = $$3x.a($$1x, $$2x, a($$4x, $$6, $$3x.c()), a($$5, $$7, $$3x.c()));
         return $$8.thenApplyAsync($$3xx -> {
            c.debug("Finished reloading {}", $$3x.c());
            return new auv.a($$3x.c(), $$6, $$7);
         }, $$3);
      }, $$4);
      this.d.start();
      this.b = this.b.thenApplyAsync(this::a, $$3);
   }

   private static Executor a(Executor $$0, AtomicLong $$1, String $$2) {
      return $$3 -> $$0.execute(() -> {
            bon $$3x = bom.a();
            $$3x.a($$2);
            long $$4 = ae.d();
            $$3.run();
            $$1.addAndGet(ae.d() - $$4);
            $$3x.c();
         });
   }

   private List<auv.a> a(List<auv.a> $$0) {
      this.d.stop();
      long $$1 = 0L;
      c.info("Resource reload finished after {} ms", this.d.elapsed(TimeUnit.MILLISECONDS));

      for (auv.a $$2 : $$0) {
         long $$3 = TimeUnit.NANOSECONDS.toMillis($$2.b.get());
         long $$4 = TimeUnit.NANOSECONDS.toMillis($$2.c.get());
         long $$5 = $$3 + $$4;
         String $$6 = $$2.a;
         c.info("{} took approximately {} ms ({} ms preparing, {} ms applying)", new Object[]{$$6, $$5, $$3, $$4});
         $$1 += $$4;
      }

      c.info("Total blocking time: {} ms", $$1);
      return $$0;
   }

   public static record a(String a, AtomicLong b, AtomicLong c) {
   }
}
