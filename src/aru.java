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

public class aru extends ewd implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger e = LogUtils.getLogger();
   private final bst f;
   private final ObjectList<Pair<aru.a, Runnable>> g = new ObjectArrayList();
   private final aqu h;
   private final aqw i;
   private final int j = 1000;
   private final AtomicBoolean k = new AtomicBoolean();

   public aru(ecr $$0, aqu $$1, boolean $$2, bst $$3, aqw $$4) {
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
   public void a(iu $$0) {
      iu $$1 = $$0.j();
      this.a(jx.a($$0.u()), jx.a($$0.w()), aru.a.a, af.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(dih $$0) {
      this.a($$0.h, $$0.i, () -> 0, aru.a.a, af.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(djj.b, jx.a($$0, $$1), null);
            super.a(djj.a, jx.a($$0, $$1), null);
         }

         for (int $$2 = this.d.aq(); $$2 <= this.d.ar(); $$2++) {
            super.a(jx.a($$0, $$2), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(jx $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, aru.a.a, af.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void b(dih $$0) {
      this.a($$0.h, $$0.i, aru.a.a, af.a((Runnable)(() -> super.b($$0)), (Supplier<String>)(() -> "propagateLight " + $$0)));
   }

   @Override
   public void a(dih $$0, boolean $$1) {
      this.a($$0.h, $$0.i, aru.a.a, af.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(djj $$0, jx $$1, @Nullable ecj $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, aru.a.a, af.a((Runnable)(() -> super.a($$0, $$1, $$2)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, aru.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.h.c(dih.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, aru.a $$3, Runnable $$4) {
      this.i.a(() -> {
         this.g.add(Pair.of($$3, $$4));
         if (this.g.size() >= 1000) {
            this.f();
         }
      }, dih.c($$0, $$1), $$2);
   }

   @Override
   public void b(dih $$0, boolean $$1) {
      this.a($$0.h, $$0.i, () -> 0, aru.a.a, af.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<ece> a(ece $$0, boolean $$1) {
      dih $$2 = $$0.f();
      this.a($$2.h, $$2.i, aru.a.a, af.a((Runnable)(() -> {
         ecp[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.ap(); $$3++) {
            ecp $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.d.h($$3);
               super.a(jx.a($$2, $$5), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + $$2)));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.h, $$2.i, aru.a.b, $$1x));
   }

   public CompletableFuture<ece> b(ece $$0, boolean $$1) {
      dih $$2 = $$0.f();
      $$0.a(false);
      this.a($$2.h, $$2.i, aru.a.a, af.a((Runnable)(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.a(true);
         return $$0;
      }, $$1x -> this.a($$2.h, $$2.i, aru.a.b, $$1x));
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
      ObjectListIterator<Pair<aru.a, Runnable>> $$1 = this.g.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<aru.a, Runnable> $$3 = (Pair<aru.a, Runnable>)$$1.next();
         if ($$3.getFirst() == aru.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<aru.a, Runnable> $$4 = (Pair<aru.a, Runnable>)$$1.next();
         if ($$4.getFirst() == aru.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, aru.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
