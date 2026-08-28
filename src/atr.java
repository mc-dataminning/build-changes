import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class atr extends auc<atr.a> {
   private static final Logger c = LogUtils.getLogger();
   private final Stopwatch d = Stopwatch.createUnstarted();

   public atr(atw $$0, List<atq> $$1, Executor $$2, Executor $$3, CompletableFuture<azk> $$4) {
      super($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5) -> {
         AtomicLong $$6 = new AtomicLong();
         AtomicLong $$7 = new AtomicLong();
         bmo $$8 = new bmo(ac.c, () -> 0, false);
         bmo $$9 = new bmo(ac.c, () -> 0, false);
         CompletableFuture<Void> $$10 = $$3x.a($$1x, $$2x, $$8, $$9, $$2xx -> $$4x.execute(() -> {
               long $$2xxx = ac.d();
               $$2xx.run();
               $$6.addAndGet(ac.d() - $$2xxx);
            }), $$2xx -> $$5.execute(() -> {
               long $$2xxx = ac.d();
               $$2xx.run();
               $$7.addAndGet(ac.d() - $$2xxx);
            }));
         return $$10.thenApplyAsync($$5x -> {
            c.debug("Finished reloading " + $$3x.c());
            return new atr.a($$3x.c(), $$8.d(), $$9.d(), $$6, $$7);
         }, $$3);
      }, $$4);
      this.d.start();
      this.b = this.b.thenApplyAsync(this::a, $$3);
   }

   private List<atr.a> a(List<atr.a> $$0) {
      this.d.stop();
      long $$1 = 0L;
      c.info("Resource reload finished after {} ms", this.d.elapsed(TimeUnit.MILLISECONDS));

      for (atr.a $$2 : $$0) {
         bmu $$3 = $$2.b;
         bmu $$4 = $$2.c;
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
      final bmu b;
      final bmu c;
      final AtomicLong d;
      final AtomicLong e;

      a(String $$0, bmu $$1, bmu $$2, AtomicLong $$3, AtomicLong $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }
   }
}
