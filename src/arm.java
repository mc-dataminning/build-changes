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

public class arm extends eqi implements AutoCloseable {
   public static final int a = 1000;
   private static final Logger e = LogUtils.getLogger();
   private final bql<Runnable> f;
   private final ObjectList<Pair<arm.a, Runnable>> g = new ObjectArrayList();
   private final aqp h;
   private final bqk<aqs.a<Runnable>> i;
   private final int j = 1000;
   private final AtomicBoolean k = new AtomicBoolean();

   public arm(dxb $$0, aqp $$1, boolean $$2, bql<Runnable> $$3, bqk<aqs.a<Runnable>> $$4) {
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
   public void a(jf $$0) {
      jf $$1 = $$0.j();
      this.a(kh.a($$0.u()), kh.a($$0.w()), arm.a.a, ad.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(ddp $$0) {
      this.a($$0.e, $$0.f, () -> 0, arm.a.a, ad.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for (int $$1 = this.d(); $$1 < this.e(); $$1++) {
            super.a(des.b, kh.a($$0, $$1), null);
            super.a(des.a, kh.a($$0, $$1), null);
         }

         for (int $$2 = this.d.ap(); $$2 <= this.d.aq(); $$2++) {
            super.a(kh.a($$0, $$2), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(kh $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, arm.a.a, ad.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void b(ddp $$0) {
      this.a($$0.e, $$0.f, arm.a.a, ad.a((Runnable)(() -> super.b($$0)), (Supplier<String>)(() -> "propagateLight " + $$0)));
   }

   @Override
   public void a(ddp $$0, boolean $$1) {
      this.a($$0.e, $$0.f, arm.a.a, ad.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(des $$0, kh $$1, @Nullable dwt $$2) {
      this.a($$1.a(), $$1.c(), () -> 0, arm.a.a, ad.a((Runnable)(() -> super.a($$0, $$1, $$2)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, arm.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.h.c(ddp.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, arm.a $$3, Runnable $$4) {
      this.i.a(aqs.a(() -> {
         this.g.add(Pair.of($$3, $$4));
         if (this.g.size() >= 1000) {
            this.f();
         }
      }, ddp.c($$0, $$1), $$2));
   }

   @Override
   public void b(ddp $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, arm.a.a, ad.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<dwo> a(dwo $$0, boolean $$1) {
      ddp $$2 = $$0.f();
      this.a($$2.e, $$2.f, arm.a.a, ad.a((Runnable)(() -> {
         dwz[] $$2x = $$0.d();

         for (int $$3 = 0; $$3 < $$0.ao(); $$3++) {
            dwz $$4 = $$2x[$$3];
            if (!$$4.c()) {
               int $$5 = this.d.h($$3);
               super.a(kh.a($$2, $$5), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + $$2)));
      return CompletableFuture.supplyAsync(() -> {
         super.a($$2, $$1);
         super.b($$2, false);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, arm.a.b, $$1x));
   }

   public CompletableFuture<dwo> b(dwo $$0, boolean $$1) {
      ddp $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, arm.a.a, ad.a((Runnable)(() -> {
         if (!$$1) {
            super.b($$2);
         }
      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, arm.a.b, $$1x));
   }

   public void b() {
      if ((!this.g.isEmpty() || super.J_()) && this.k.compareAndSet(false, true)) {
         this.f.a(() -> {
            this.f();
            this.k.set(false);
         });
      }
   }

   private void f() {
      int $$0 = Math.min(this.g.size(), 1000);
      ObjectListIterator<Pair<arm.a, Runnable>> $$1 = this.g.iterator();

      int $$2;
      for ($$2 = 0; $$1.hasNext() && $$2 < $$0; $$2++) {
         Pair<arm.a, Runnable> $$3 = (Pair<arm.a, Runnable>)$$1.next();
         if ($$3.getFirst() == arm.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a();

      for (int var5 = 0; $$1.hasNext() && var5 < $$0; var5++) {
         Pair<arm.a, Runnable> $$4 = (Pair<arm.a, Runnable>)$$1.next();
         if ($$4.getFirst() == arm.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }
   }

   public CompletableFuture<?> a(int $$0, int $$1) {
      return CompletableFuture.runAsync(() -> {
      }, $$2 -> this.a($$0, $$1, arm.a.b, $$2));
   }

   static enum a {
      a,
      b;
   }
}
