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

public class arh extends etl implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger e = LogUtils.getLogger();
   private final bro f;
   private final ObjectList<Pair<arh.a, Runnable>> g = new ObjectArrayList();
   private final aqh h;
   private final aqj i;
   private final int j = 1000;
   private final AtomicBoolean k = new AtomicBoolean();

   public arh(dzz $$0, aqh $$1, boolean $$2, bro $$3, aqj $$4) {
      super($$0, true, $$2);
      this.h = $$1;
      this.i = $$4;
      this.f = $$3;
   }

   @Override
   public void close() {
   }

   @Override
   public int a() {
      throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("Ran automatically on a different thread!"));
   }

   @Override
   public void a(ji $$0) {
      ji $$1 = $$0.j();
      this.a(kk.a($$0.u()), kk.a($$0.w()), arh.a.a, af.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(dgg $$0) {
      this.a($$0.h, $$0.i, () -> 0, arh.a.a, af.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(dhi.b, kk.a($$0, $$1), null);
            super.a(dhi.a, kk.a($$0, $$1), null);
         }

         for (int $$2 = this.d.aq(); $$2 <= this.d.ar(); $$2++) {
            super.a(kk.a($$0, $$2), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(kk $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, arh.a.a, af.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void b(dgg $$0) {
      this.a($$0.h, $$0.i, arh.a.a, af.a((Runnable)(() -> super.b($$0)), (Supplier<String>)(() -> "propagateLight " + $$0)));
   }

   @Override
   public void a(dgg $$0, boolean $$1) {
      this.a($$0.h, $$0.i, arh.a.a, af.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(dhi $$0, kk $$1, @Nullable dzr $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, arh.a.a, af.a((Runnable)(() -> super.a($$0, $$1, $$2)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, arh.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.h.c(dgg.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, arh.a $$3, Runnable $$4) {
      this.i.a(() -> {
         this.g.add(Pair.of($$3, $$4));
         if (this.g.size() >= 1000) {
            this.f();
         }
      }, dgg.c($$0, $$1), $$2);
   }

   @Override
   public void b(dgg $$0, boolean $$1) {
      this.a($$0.h, $$0.i, () -> 0, arh.a.a, af.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<dzm> a(dzm $$0, boolean $$1) {
      dgg $$2 = $$0.f();
      this.a($$2.h, $$2.i, arh.a.a, af.a((Runnable)(() -> {
         dzx[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.ap(); $$3++) {
            dzx $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.d.h($$3);
               super.a(kk.a($$2, $$5), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + $$2)));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.h, $$2.i, arh.a.b, $$1x));
   }

   public CompletableFuture<dzm> b(dzm $$0, boolean $$1) {
      dgg $$2 = $$0.f();
      $$0.a(false);
      this.a($$2.h, $$2.i, arh.a.a, af.a((Runnable)(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.a(true);
         return $$0;
      }, $$1x -> this.a($$2.h, $$2.i, arh.a.b, $$1x));
   }

   public void b() {
      if ((!this.g.isEmpty() || super.I_()) && this.k.compareAndSet(false, true)) {
         this.f.a_(() -> {
            this.f();
            this.k.set(false);
         });
      }
   }

   private void f() {
      int $$0 = Math.min(this.g.size(), 1000);
      ObjectListIterator<Pair<arh.a, Runnable>> $$1 = this.g.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<arh.a, Runnable> $$3 = (Pair<arh.a, Runnable>)$$1.next();
         if ($$3.getFirst() == arh.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<arh.a, Runnable> $$4 = (Pair<arh.a, Runnable>)$$1.next();
         if ($$4.getFirst() == arh.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, arh.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
