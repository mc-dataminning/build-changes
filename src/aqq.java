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

public class aqq extends eml implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger d = LogUtils.getLogger();
   private final bop<Runnable> e;
   private final ObjectList<Pair<aqq.a, Runnable>> f = new ObjectArrayList();
   private final apw g;
   private final boo<apz.a<Runnable>> h;
   private final int i = 1000;
   private final AtomicBoolean j = new AtomicBoolean();

   public aqq(dtm $$0, apw $$1, boolean $$2, bop<Runnable> $$3, boo<apz.a<Runnable>> $$4) {
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
   public void a(io $$0) {
      io $$1 = $$0.i();
      this.a(jq.a($$0.u()), jq.a($$0.w()), aqq.a.a, ac.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(dag $$0) {
      this.a($$0.e, $$0.f, () -> 0, aqq.a.a, ac.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(dbi.b, jq.a($$0, $$1), null);
            super.a(dbi.a, jq.a($$0, $$1), null);
         }

         for (int $$2 = this.c.an(); $$2 < this.c.ao(); $$2++) {
            super.a(jq.a($$0, $$2), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(jq $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, aqq.a.a, ac.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void b(dag $$0) {
      this.a($$0.e, $$0.f, aqq.a.a, ac.a((Runnable)(() -> super.b($$0)), (Supplier<String>)(() -> "propagateLight " + $$0)));
   }

   @Override
   public void a(dag $$0, boolean $$1) {
      this.a($$0.e, $$0.f, aqq.a.a, ac.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(dbi $$0, jq $$1, @Nullable dte $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, aqq.a.a, ac.a((Runnable)(() -> super.a($$0, $$1, $$2)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, aqq.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.g.c(dag.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, aqq.a $$3, Runnable $$4) {
      this.h.a(apz.a(() -> {
         this.f.add(Pair.of($$3, $$4));
         if (this.f.size() >= 1000) {
            this.f();
         }
      }, dag.c($$0, $$1), $$2));
   }

   @Override
   public void b(dag $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, aqq.a.a, ac.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<dsz> a(dsz $$0, boolean $$1) {
      dag $$2 = $$0.f();
      this.a($$2.e, $$2.f, aqq.a.a, ac.a((Runnable)(() -> {
         dtk[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.am(); $$3++) {
            dtk $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.c.g($$3);
               super.a(jq.a($$2, $$5), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + $$2)));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, aqq.a.b, $$1x));
   }

   public CompletableFuture<dsz> b(dsz $$0, boolean $$1) {
      dag $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, aqq.a.a, ac.a((Runnable)(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         this.g.b($$2);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, aqq.a.b, $$1x));
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
      ObjectListIterator<Pair<aqq.a, Runnable>> $$1 = this.f.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<aqq.a, Runnable> $$3 = (Pair<aqq.a, Runnable>)$$1.next();
         if ($$3.getFirst() == aqq.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<aqq.a, Runnable> $$4 = (Pair<aqq.a, Runnable>)$$1.next();
         if ($$4.getFirst() == aqq.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, aqq.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
