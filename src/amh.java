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

public class amh extends ech implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger d = LogUtils.getLogger();
   private final bhq<Runnable> e;
   private final ObjectList<Pair<amh.a, Runnable>> f = new ObjectArrayList();
   private final alo g;
   private final bhp<alq.a<Runnable>> h;
   private final int i = 1000;
   private final AtomicBoolean j = new AtomicBoolean();

   public amh(djs $$0, alo $$1, boolean $$2, bhq<Runnable> $$3, bhp<alq.a<Runnable>> $$4) {
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
   public void a(ht $$0) {
      ht $$1 = $$0.i();
      this.a(iu.a($$0.u()), iu.a($$0.w()), amh.a.a, ac.a(() -> super.a($$1), () -> "checkBlock " + $$1));
   }

   protected void a(crh $$0) {
      this.a($$0.e, $$0.f, () -> 0, amh.a.a, ac.a(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(csj.b, iu.a($$0, $$1), null);
            super.a(csj.a, iu.a($$0, $$1), null);
         }

         for (int $$2 = this.c.am(); $$2 < this.c.an(); $$2++) {
            super.a(iu.a($$0, $$2), true);
         }
      }, () -> "updateChunkStatus " + $$0 + " true"));
   }

   @Override
   public void a(iu $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, amh.a.a, ac.a(() -> super.a($$0, $$1), () -> "updateSectionStatus " + $$0 + " " + $$1));
   }

   @Override
   public void b(crh $$0) {
      this.a($$0.e, $$0.f, amh.a.a, ac.a(() -> super.b($$0), () -> "propagateLight " + $$0));
   }

   @Override
   public void a(crh $$0, boolean $$1) {
      this.a($$0.e, $$0.f, amh.a.a, ac.a(() -> super.a($$0, $$1), () -> "enableLight " + $$0 + " " + $$1));
   }

   @Override
   public void a(csj $$0, iu $$1, @Nullable djk $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, amh.a.a, ac.a(() -> super.a($$0, $$1, $$2), () -> "queueData " + $$1));
   }

   private void a(int $$0, int $$1, amh.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.g.c(crh.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, amh.a $$3, Runnable $$4) {
      this.h.a(alq.a(() -> {
         this.f.add(Pair.of($$3, $$4));
         if (this.f.size() >= 1000) {
            this.f();
         }
      }, crh.c($$0, $$1), $$2));
   }

   @Override
   public void b(crh $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, amh.a.a, ac.a(() -> super.b($$0, $$1), () -> "retainData " + $$0));
   }

   public CompletableFuture<dje> a(dje $$0, boolean $$1) {
      crh $$2 = $$0.f();
      this.a($$2.e, $$2.f, amh.a.a, ac.a(() -> {
         djq[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.al(); $$3++) {
            djq $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.c.g($$3);
               super.a(iu.a($$2, $$5), false);
            }
         }
      }, () -> "initializeLight: " + $$2));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, amh.a.b, $$1x));
   }

   public CompletableFuture<dje> b(dje $$0, boolean $$1) {
      crh $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, amh.a.a, ac.a(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }, () -> "lightChunk " + $$2 + " " + $$1));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         this.g.b($$2);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, amh.a.b, $$1x));
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
      ObjectListIterator<Pair<amh.a, Runnable>> $$1 = this.f.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<amh.a, Runnable> $$3 = (Pair<amh.a, Runnable>)$$1.next();
         if ($$3.getFirst() == amh.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<amh.a, Runnable> $$4 = (Pair<amh.a, Runnable>)$$1.next();
         if ($$4.getFirst() == amh.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, amh.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
