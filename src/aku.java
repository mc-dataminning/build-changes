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

public class aku extends eab implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger d = LogUtils.getLogger();
   private final bfr<Runnable> e;
   private final ObjectList<Pair<aku.a, Runnable>> f = new ObjectArrayList();
   private final akb g;
   private final bfq<akd.a<Runnable>> h;
   private final int i = 1000;
   private final AtomicBoolean j = new AtomicBoolean();

   public aku(dht $$0, akb $$1, boolean $$2, bfr<Runnable> $$3, bfq<akd.a<Runnable>> $$4) {
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
   public void a(gw $$0) {
      gw $$1 = $$0.i();
      this.a(hz.a($$0.u()), hz.a($$0.w()), aku.a.a, ac.a(() -> super.a($$1), () -> "checkBlock " + $$1));
   }

   protected void a(cpc $$0) {
      this.a($$0.e, $$0.f, () -> 0, aku.a.a, ac.a(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(cqe.b, hz.a($$0, $$1), null);
            super.a(cqe.a, hz.a($$0, $$1), null);
         }

         for (int $$2 = this.c.al(); $$2 < this.c.am(); $$2++) {
            super.a(hz.a($$0, $$2), true);
         }
      }, () -> "updateChunkStatus " + $$0 + " true"));
   }

   @Override
   public void a(hz $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, aku.a.a, ac.a(() -> super.a($$0, $$1), () -> "updateSectionStatus " + $$0 + " " + $$1));
   }

   @Override
   public void b(cpc $$0) {
      this.a($$0.e, $$0.f, aku.a.a, ac.a(() -> super.b($$0), () -> "propagateLight " + $$0));
   }

   @Override
   public void a(cpc $$0, boolean $$1) {
      this.a($$0.e, $$0.f, aku.a.a, ac.a(() -> super.a($$0, $$1), () -> "enableLight " + $$0 + " " + $$1));
   }

   @Override
   public void a(cqe $$0, hz $$1, @Nullable dhl $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, aku.a.a, ac.a(() -> super.a($$0, $$1, $$2), () -> "queueData " + $$1));
   }

   private void a(int $$0, int $$1, aku.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.g.c(cpc.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, aku.a $$3, Runnable $$4) {
      this.h.a(akd.a(() -> {
         this.f.add(Pair.of($$3, $$4));
         if (this.f.size() >= 1000) {
            this.f();
         }
      }, cpc.c($$0, $$1), $$2));
   }

   @Override
   public void b(cpc $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, aku.a.a, ac.a(() -> super.b($$0, $$1), () -> "retainData " + $$0));
   }

   public CompletableFuture<dhf> a(dhf $$0, boolean $$1) {
      cpc $$2 = $$0.f();
      this.a($$2.e, $$2.f, aku.a.a, ac.a(() -> {
         dhr[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.ak(); $$3++) {
            dhr $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.c.g($$3);
               super.a(hz.a($$2, $$5), false);
            }
         }
      }, () -> "initializeLight: " + $$2));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, aku.a.b, $$1x));
   }

   public CompletableFuture<dhf> b(dhf $$0, boolean $$1) {
      cpc $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, aku.a.a, ac.a(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }, () -> "lightChunk " + $$2 + " " + $$1));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         this.g.b($$2);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, aku.a.b, $$1x));
   }

   public void b() {
      if ((!this.f.isEmpty() || super.J_()) && this.j.compareAndSet(false, true)) {
         this.e.a(() -> {
            this.f();
            this.j.set(false);
         });
      }
   }

   private void f() {
      int $$0 = Math.min(this.f.size(), 1000);
      ObjectListIterator<Pair<aku.a, Runnable>> $$1 = this.f.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<aku.a, Runnable> $$3 = (Pair<aku.a, Runnable>)$$1.next();
         if ($$3.getFirst() == aku.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<aku.a, Runnable> $$4 = (Pair<aku.a, Runnable>)$$1.next();
         if ($$4.getFirst() == aku.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, aku.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
