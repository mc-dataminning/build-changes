import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akl extends dzq implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger d = LogUtils.getLogger();
   private final bfh<Runnable> e;
   private final ObjectList<Pair<akl.a, Runnable>> f = new ObjectArrayList();
   private final ajt g;
   private final bfg<ajv.a<Runnable>> h;
   private final int i = 1000;
   private final AtomicBoolean j = new AtomicBoolean();

   public akl(dhi $$0, ajt $$1, boolean $$2, bfh<Runnable> $$3, bfg<ajv.a<Runnable>> $$4) {
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
   public void a(gv $$0) {
      gv $$1 = $$0.i();
      this.a(hy.a($$0.u()), hy.a($$0.w()), akl.a.a, ac.a(() -> super.a($$1), () -> "checkBlock " + $$1));
   }

   protected void a(cor $$0) {
      this.a($$0.e, $$0.f, () -> 0, akl.a.a, ac.a(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(cpt.b, hy.a($$0, $$1), null);
            super.a(cpt.a, hy.a($$0, $$1), null);
         }

         for (int $$2 = this.c.al(); $$2 < this.c.am(); $$2++) {
            super.a(hy.a($$0, $$2), true);
         }
      }, () -> "updateChunkStatus " + $$0 + " true"));
   }

   @Override
   public void a(hy $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, akl.a.a, ac.a(() -> super.a($$0, $$1), () -> "updateSectionStatus " + $$0 + " " + $$1));
   }

   @Override
   public void b(cor $$0) {
      this.a($$0.e, $$0.f, akl.a.a, ac.a(() -> super.b($$0), () -> "propagateLight " + $$0));
   }

   @Override
   public void a(cor $$0, boolean $$1) {
      this.a($$0.e, $$0.f, akl.a.a, ac.a(() -> super.a($$0, $$1), () -> "enableLight " + $$0 + " " + $$1));
   }

   @Override
   public void a(cpt $$0, hy $$1, @Nullable dha $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, akl.a.a, ac.a(() -> super.a($$0, $$1, $$2), () -> "queueData " + $$1));
   }

   private void a(int $$0, int $$1, akl.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.g.c(cor.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, akl.a $$3, Runnable $$4) {
      this.h.a(ajv.a(() -> {
         this.f.add(Pair.of($$3, $$4));
         if (this.f.size() >= 1000) {
            this.f();
         }
      }, cor.c($$0, $$1), $$2));
   }

   @Override
   public void b(cor $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, akl.a.a, ac.a(() -> super.b($$0, $$1), () -> "retainData " + $$0));
   }

   public CompletableFuture<dgu> a(dgu $$0, boolean $$1) {
      cor $$2 = $$0.f();
      this.a($$2.e, $$2.f, akl.a.a, ac.a(() -> {
         dhg[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.ak(); $$3++) {
            dhg $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.c.g($$3);
               super.a(hy.a($$2, $$5), false);
            }
         }
      }, () -> "initializeLight: " + $$2));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, akl.a.b, $$1x));
   }

   public CompletableFuture<dgu> b(dgu $$0, boolean $$1) {
      cor $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, akl.a.a, ac.a(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }, () -> "lightChunk " + $$2 + " " + $$1));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         this.g.b($$2);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, akl.a.b, $$1x));
   }

   public void b() {
      if ((!this.f.isEmpty() || super.E_()) && this.j.compareAndSet(false, true)) {
         this.e.a(() -> {
            this.f();
            this.j.set(false);
         });
      }
   }

   private void f() {
      int $$0 = Math.min(this.f.size(), 1000);
      ObjectListIterator<Pair<akl.a, Runnable>> $$1 = this.f.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<akl.a, Runnable> $$3 = (Pair<akl.a, Runnable>)$$1.next();
         if ($$3.getFirst() == akl.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<akl.a, Runnable> $$4 = (Pair<akl.a, Runnable>)$$1.next();
         if ($$4.getFirst() == akl.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   static enum a {
      a,
      b;
   }
}
