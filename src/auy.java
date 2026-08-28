import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class auy extends avj<auy.a> {
   private static final Logger a = LogUtils.getLogger();
   private final Stopwatch b = Stopwatch.createUnstarted();

   public static auz a(avd $$0, List<auw> $$1, Executor $$2, Executor $$3, CompletableFuture<bau> $$4) {
      auy $$5 = new auy($$1);
      $$5.b($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5x) -> {
         AtomicLong $$6 = new AtomicLong();
         AtomicLong $$7 = new AtomicLong();
         AtomicLong $$8 = new AtomicLong();
         AtomicLong $$9 = new AtomicLong();
         CompletableFuture<Void> $$10 = $$3x.reload($$1x, $$2x, a($$4x, $$6, $$7, $$3x.getName()), a($$5x, $$8, $$9, $$3x.getName()));
         return $$10.thenApplyAsync($$5xx -> {
            a.debug("Finished reloading {}", $$3x.getName());
            return new auy.a($$3x.getName(), $$6, $$7, $$8, $$9);
         }, $$3);
      }, $$4);
      return $$5;
   }

   private auy(List<auw> $$0) {
      super($$0);
      this.b.start();
   }

   @Override
   protected CompletableFuture<List<auy.a>> a(Executor $$0, Executor $$1, avd $$2, List<auw> $$3, avj.a<auy.a> $$4, CompletableFuture<?> $$5) {
      return super.a($$0, $$1, $$2, $$3, $$4, $$5).thenApplyAsync(this::a, $$1);
   }

   private static Executor a(Executor $$0, AtomicLong $$1, AtomicLong $$2, String $$3) {
      return $$4 -> $$0.execute(() -> {
            bqq $$4x = bqp.a();
            $$4x.a($$3);
            long $$5 = ag.d();
            $$4.run();
            $$1.addAndGet(ag.d() - $$5);
            $$2.incrementAndGet();
            $$4x.c();
         });
   }

   private List<auy.a> a(List<auy.a> $$0) {
      this.b.stop();
      long $$1 = 0L;
      a.info("Resource reload finished after {} ms", this.b.elapsed(TimeUnit.MILLISECONDS));

      for (auy.a $$2 : $$0) {
         long $$3 = TimeUnit.NANOSECONDS.toMillis($$2.b.get());
         long $$4 = $$2.c.get();
         long $$5 = TimeUnit.NANOSECONDS.toMillis($$2.d.get());
         long $$6 = $$2.e.get();
         long $$7 = $$3 + $$5;
         long $$8 = $$4 + $$6;
         String $$9 = $$2.a;
         a.info("{} took approximately {} tasks/{} ms ({} tasks/{} ms preparing, {} tasks/{} ms applying)", new Object[]{$$9, $$8, $$7, $$4, $$3, $$6, $$5});
         $$1 += $$5;
      }

      a.info("Total blocking time: {} ms", $$1);
      return $$0;
   }

   public static record a(String a, AtomicLong b, AtomicLong c, AtomicLong d, AtomicLong e) {
   }
}
