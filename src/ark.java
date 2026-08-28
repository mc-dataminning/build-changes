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

public class ark extends eqe implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger e = LogUtils.getLogger();
   private final bqi<Runnable> f;
   private final ObjectList<Pair<ark.a, Runnable>> g = new ObjectArrayList();
   private final aqn h;
   private final bqh<aqq.a<Runnable>> i;
   private final int j = 1000;
   private final AtomicBoolean k = new AtomicBoolean();

   public ark(dwx $$0, aqn $$1, boolean $$2, bqi<Runnable> $$3, bqh<aqq.a<Runnable>> $$4) {
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
      throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("Ran automatically on a different thread!"));
   }

   @Override
   public void a(je $$0) {
      je $$1 = $$0.j();
      this.a(kg.a($$0.u()), kg.a($$0.w()), ark.a.a, ad.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(ddm $$0) {
      this.a($$0.e, $$0.f, () -> 0, ark.a.a, ad.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(dep.b, kg.a($$0, $$1), null);
            super.a(dep.a, kg.a($$0, $$1), null);
         }

         for (int $$2 = this.d.ap(); $$2 <= this.d.aq(); $$2++) {
            super.a(kg.a($$0, $$2), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(kg $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, ark.a.a, ad.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void b(ddm $$0) {
      this.a($$0.e, $$0.f, ark.a.a, ad.a((Runnable)(() -> super.b($$0)), (Supplier<String>)(() -> "propagateLight " + $$0)));
   }

   @Override
   public void a(ddm $$0, boolean $$1) {
      this.a($$0.e, $$0.f, ark.a.a, ad.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(dep $$0, kg $$1, @Nullable dwp $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, ark.a.a, ad.a((Runnable)(() -> super.a($$0, $$1, $$2)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, ark.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.h.c(ddm.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, ark.a $$3, Runnable $$4) {
      this.i.a(aqq.a(() -> {
         this.g.add(Pair.of($$3, $$4));
         if (this.g.size() >= 1000) {
            this.f();
         }
      }, ddm.c($$0, $$1), $$2));
   }

   @Override
   public void b(ddm $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, ark.a.a, ad.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<dwk> a(dwk $$0, boolean $$1) {
      ddm $$2 = $$0.f();
      this.a($$2.e, $$2.f, ark.a.a, ad.a((Runnable)(() -> {
         dwv[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.ao(); $$3++) {
            dwv $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.d.h($$3);
               super.a(kg.a($$2, $$5), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + $$2)));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, ark.a.b, $$1x));
   }

   public CompletableFuture<dwk> b(dwk $$0, boolean $$1) {
      ddm $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, ark.a.a, ad.a((Runnable)(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, ark.a.b, $$1x));
   }

   public void b() {
      if ((!this.g.isEmpty() || super.I_()) && this.k.compareAndSet(false, true)) {
         this.f.a(() -> {
            this.f();
            this.k.set(false);
         });
      }
   }

   private void f() {
      int $$0 = Math.min(this.g.size(), 1000);
      ObjectListIterator<Pair<ark.a, Runnable>> $$1 = this.g.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<ark.a, Runnable> $$3 = (Pair<ark.a, Runnable>)$$1.next();
         if ($$3.getFirst() == ark.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<ark.a, Runnable> $$4 = (Pair<ark.a, Runnable>)$$1.next();
         if ($$4.getFirst() == ark.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, ark.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
