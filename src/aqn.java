import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqn extends enq implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger d = LogUtils.getLogger();
   private final bow<Runnable> e;
   private final ObjectList<Pair<aqn.a, Runnable>> f = new ObjectArrayList();
   private final apt g;
   private final bov<apw.a<Runnable>> h;
   private final int i = 1000;
   private final AtomicBoolean j = new AtomicBoolean();

   public aqn(duq $$0, apt $$1, boolean $$2, bow<Runnable> $$3, bov<apw.a<Runnable>> $$4) {
      super($$0, true, $$2);
      this.g = $$1;
      this.h = $$4;
      this.e = $$3;
   }

   @Override
   public void close() {
   }

   @Override
   public int a() {
      throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Ran automatically on a different thread!"));
   }

   @Override
   public void a(ja $$0) {
      ja $$1 = $$0.i();
      this.a(kc.a($$0.u()), kc.a($$0.w()), aqn.a.a, ac.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(dbk $$0) {
      this.a($$0.e, $$0.f, () -> 0, aqn.a.a, ac.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(dcm.b, kc.a($$0, $$1), null);
            super.a(dcm.a, kc.a($$0, $$1), null);
         }

         for (int $$2 = this.c.ao(); $$2 < this.c.ap(); $$2++) {
            super.a(kc.a($$0, $$2), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(kc $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, aqn.a.a, ac.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void b(dbk $$0) {
      this.a($$0.e, $$0.f, aqn.a.a, ac.a((Runnable)(() -> super.b($$0)), (Supplier<String>)(() -> "propagateLight " + $$0)));
   }

   @Override
   public void a(dbk $$0, boolean $$1) {
      this.a($$0.e, $$0.f, aqn.a.a, ac.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(dcm $$0, kc $$1, @Nullable dui $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, aqn.a.a, ac.a((Runnable)(() -> super.a($$0, $$1, $$2)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, aqn.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.g.c(dbk.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, aqn.a $$3, Runnable $$4) {
      this.h.a(apw.a(() -> {
         this.f.add(Pair.of($$3, $$4));
         if (this.f.size() >= 1000) {
            this.f();
         }
      }, dbk.c($$0, $$1), $$2));
   }

   @Override
   public void b(dbk $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, aqn.a.a, ac.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<dud> a(dud $$0, boolean $$1) {
      dbk $$2 = $$0.f();
      this.a($$2.e, $$2.f, aqn.a.a, ac.a((Runnable)(() -> {
         duo[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.an(); $$3++) {
            duo $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.c.g($$3);
               super.a(kc.a($$2, $$5), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + $$2)));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, aqn.a.b, $$1x));
   }

   public CompletableFuture<dud> b(dud $$0, boolean $$1) {
      dbk $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, aqn.a.a, ac.a((Runnable)(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         this.g.b($$2);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, aqn.a.b, $$1x));
   }

   public void b() {
      if ((!this.f.isEmpty() || super.K_()) && this.j.compareAndSet(false, true)) {
         this.e.a(() -> {
            this.f();
            this.j.set(false);
         });
      }
   }

   private void f() {
      int $$0 = Math.min(this.f.size(), 1000);
      ObjectListIterator<Pair<aqn.a, Runnable>> $$1 = this.f.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<aqn.a, Runnable> $$3 = (Pair<aqn.a, Runnable>)$$1.next();
         if ($$3.getFirst() == aqn.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<aqn.a, Runnable> $$4 = (Pair<aqn.a, Runnable>)$$1.next();
         if ($$4.getFirst() == aqn.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, aqn.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
