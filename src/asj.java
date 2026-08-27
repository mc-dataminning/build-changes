import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class asj extends asu<asj.a> {
   private static final Logger c = LogUtils.getLogger();
   private final Stopwatch d = Stopwatch.createUnstarted();

   public asj(aso $$0, List<asi> $$1, Executor $$2, Executor $$3, CompletableFuture<axy> $$4) {
      super($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5) -> {
         AtomicLong $$6 = new AtomicLong();
         AtomicLong $$7 = new AtomicLong();
         bjj $$8 = new bjj(ac.b, () -> 0, false);
         bjj $$9 = new bjj(ac.b, () -> 0, false);
         CompletableFuture<Void> $$10 = $$3x.a($$1x, $$2x, $$8, $$9, $$2xx -> $$4x.execute(() -> {
               long $$2xxx = ac.c();
               $$2xx.run();
               $$6.addAndGet(ac.c() - $$2xxx);
            }), $$2xx -> $$5.execute(() -> {
               long $$2xxx = ac.c();
               $$2xx.run();
               $$7.addAndGet(ac.c() - $$2xxx);
            }));
         return $$10.thenApplyAsync($$5x -> {
            c.debug("Finished reloading " + $$3x.c());
            return new asj.a($$3x.c(), $$8.d(), $$9.d(), $$6, $$7);
         }, $$3);
      }, $$4);
      this.d.start();
      this.b = this.b.thenApplyAsync(this::a, $$3);
   }

   private List<asj.a> a(List<asj.a> $$0) {
      this.d.stop();
      long $$1 = 0L;
      c.info("Resource reload finished after {} ms", this.d.elapsed(TimeUnit.MILLISECONDS));

      for (asj.a $$2 : $$0) {
         bjp $$3 = $$2.b;
         bjp $$4 = $$2.c;
         long $$5 = TimeUnit.NANOSECONDS.toMillis($$2.d.get());
         long $$6 = TimeUnit.NANOSECONDS.toMillis($$2.e.get());
         long $$7 = $$5 + $$6;
         String $$8 = $$2.a;
         c.info("{} took approximately {} ms ({} ms preparing, {} ms applying)", new Object[]{$$8, $$7, $$5, $$6});
         $$1 += $$6;
      }

      c.info("Total blocking time: {} ms", $$1);
      return $$0;
   }

   public static class a {
      final String a;
      final bjp b;
      final bjp c;
      final AtomicLong d;
      final AtomicLong e;

      a(String $$0, bjp $$1, bjp $$2, AtomicLong $$3, AtomicLong $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }
   }
}
