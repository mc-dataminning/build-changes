import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.primitives.Doubles;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqy {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final int c = 2;
   private final PriorityBlockingQueue<fqy.b.a> d = Queues.newPriorityBlockingQueue();
   private final Queue<fqy.b.a> e = Queues.newLinkedBlockingDeque();
   private int f = 2;
   private final Queue<fol> g;
   private final Queue<Runnable> h = Queues.newConcurrentLinkedQueue();
   private volatile int i;
   private volatile int j;
   final fol k;
   private final bfx<Runnable> l;
   private final Executor m;
   fis n;
   final fny o;
   private ehh p = ehh.b;

   public fqy(fis $$0, fny $$1, Executor $$2, boolean $$3, fol $$4) {
      this.n = $$0;
      this.o = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (foi.G().stream().mapToInt(foi::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.k = $$4;
      List<fol> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fol());
         }
      } catch (OutOfMemoryError var14) {
         a.warn("Allocated only {}/{} buffers", $$9.size(), $$8);
         int $$12 = Math.min($$9.size() * 2 / 3, $$9.size() - 1);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            $$9.remove($$9.size() - 1);
         }

         System.gc();
      }

      this.g = Queues.newArrayDeque($$9);
      this.j = this.g.size();
      this.m = $$2;
      this.l = bfx.a($$2, "Section Renderer");
      this.l.a(this::j);
   }

   public void a(fis $$0) {
      this.n = $$0;
   }

   private void j() {
      if (!this.g.isEmpty()) {
         fqy.b.a $$0 = this.k();
         if ($$0 != null) {
            fol $$1 = this.g.poll();
            this.i = this.d.size() + this.e.size();
            this.j = this.g.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.m).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  eqp.O().a(o.a($$2, "Batching sections"));
               } else {
                  this.l.a(() -> {
                     if ($$1x == fqy.c.a) {
                        $$1.a();
                     } else {
                        $$1.b();
                     }

                     this.g.add($$1);
                     this.j = this.g.size();
                     this.j();
                  });
               }
            });
         }
      }
   }

   @Nullable
   private fqy.b.a k() {
      if (this.f <= 0) {
         fqy.b.a $$0 = this.e.poll();
         if ($$0 != null) {
            this.f = 2;
            return $$0;
         }
      }

      fqy.b.a $$1 = this.d.poll();
      if ($$1 != null) {
         this.f--;
         return $$1;
      } else {
         this.f = 2;
         return this.e.poll();
      }
   }

   public String a() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.i, this.h.size(), this.j);
   }

   public int b() {
      return this.i;
   }

   public int c() {
      return this.h.size();
   }

   public int d() {
      return this.j;
   }

   public void a(ehh $$0) {
      this.p = $$0;
   }

   public ehh e() {
      return this.p;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.h.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fqy.b $$0, fqx $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fqy.b.a $$0) {
      this.l.a(() -> {
         if ($$0.c) {
            this.d.offer($$0);
         } else {
            this.e.offer($$0);
         }

         this.i = this.d.size() + this.e.size();
         this.j();
      });
   }

   public CompletableFuture<Void> a(ele.b $$0, elm $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            elm.b();
         }
      }, this.h::add);
   }

   private void l() {
      while (!this.d.isEmpty()) {
         fqy.b.a $$0 = this.d.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.e.isEmpty()) {
         fqy.b.a $$1 = this.e.poll();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.i = 0;
   }

   public boolean h() {
      return this.i == 0 && this.h.isEmpty();
   }

   public void i() {
      this.l();
      this.l.close();
      this.g.clear();
   }

   public static class a {
      public static final fqy.a a = new fqy.a() {
         @Override
         public boolean a(ha $$0, ha $$1) {
            return false;
         }
      };
      final Set<foi> b = new ObjectArraySet(foi.G().size());
      final List<dcz> c = Lists.newArrayList();
      fra d = new fra();
      @Nullable
      ele.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(foi $$0) {
         return !this.b.contains($$0);
      }

      public List<dcz> b() {
         return this.c;
      }

      public boolean a(ha $$0, ha $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fqy.a> c = new AtomicReference<>(fqy.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fqy.b.b f;
      @Nullable
      private fqy.b.c g;
      private final Set<dcz> h = Sets.newHashSet();
      private final Map<foi, elm> i = foi.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new elm(elm.a.a)));
      private ehc j;
      private boolean k = true;
      final gw.a l = new gw.a(-1, -1, -1);
      private final gw.a[] m = ac.a(new gw.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new gw.a();
         }
      });
      private boolean n;

      public b(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(gw $$0) {
         return fqy.this.n.a(hw.a($$0.u()), hw.a($$0.w()), dhe.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ha.e.ordinal()]) && this.a(this.m[ha.c.ordinal()]) && this.a(this.m[ha.f.ordinal()]) && this.a(this.m[ha.d.ordinal()]);
      }

      public ehc b() {
         return this.j;
      }

      public elm a(foi $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new ehc((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ha $$3 : ha.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         eqa $$0 = eqp.O().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(ele $$0) {
         $$0.a(elo.b.h, elh.j);
      }

      public fqy.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fqy.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(elm::close);
      }

      public gw f() {
         return this.l;
      }

      public void a(boolean $$0) {
         boolean $$1 = this.k;
         this.k = true;
         this.n = $$0 | ($$1 && this.n);
      }

      public void g() {
         this.k = false;
         this.n = false;
      }

      public boolean h() {
         return this.k;
      }

      public boolean i() {
         return this.k && this.n;
      }

      public gw a(ha $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(foi $$0, fqy $$1) {
         fqy.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fqy.b.c(this.c(), $$2);
            $$1.a(this.g);
            return true;
         }
      }

      protected boolean j() {
         boolean $$0 = false;
         if (this.f != null) {
            this.f.a();
            this.f = null;
            $$0 = true;
         }

         if (this.g != null) {
            this.g.a();
            this.g = null;
         }

         return $$0;
      }

      public fqy.b.a a(fqx $$0) {
         boolean $$1 = this.j();
         gw $$2 = this.l.i();
         int $$3 = 1;
         fqw $$4 = $$0.a(fqy.this.n, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fqy.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fqy.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fqy $$0, fqx $$1) {
         fqy.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dcz> $$0) {
         Set<dcz> $$1 = Sets.newHashSet($$0);
         Set<dcz> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fqy.this.o.a($$2, $$1);
      }

      public void b(fqx $$0) {
         fqy.b.a $$1 = this.a($$0);
         $$1.a(fqy.this.k);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         gw $$3 = this.f();
         return $$0 == hw.a($$3.u()) || $$2 == hw.a($$3.w()) || $$1 == hw.a($$3.v());
      }

      abstract class a implements Comparable<fqy.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fqy.c> a(fol var1);

         public abstract void a();

         protected abstract String b();

         public int a(fqy.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fqy.b.a {
         @Nullable
         protected fqw e;

         public b(double $$0, @Nullable fqw $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fqy.c> a(fol $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqy.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fqy.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqy.c.b);
            } else {
               ehh $$1 = fqy.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fqy.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(ele.b::e);
                  return CompletableFuture.completedFuture(fqy.c.b);
               } else {
                  fqy.a $$6 = new fqy.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fqy.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        eqp.O().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fqy.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fqy.this.o.a(b.this);
                        return fqy.c.a;
                     }
                  });
               }
            }
         }

         private fqy.b.b.a a(float $$0, float $$1, float $$2, fol $$3) {
            fqy.b.b.a $$4 = new fqy.b.b.a();
            int $$5 = 1;
            gw $$6 = b.this.l.i();
            gw $$7 = $$6.b(15, 15, 15);
            fqz $$8 = new fqz();
            fqw $$9 = this.e;
            this.e = null;
            elj $$10 = new elj();
            if ($$9 != null) {
               fow.a();
               Set<foi> $$11 = new ReferenceArraySet(foi.G().size());
               ash $$12 = ash.a();
               fou $$13 = eqp.O().an();

               for (gw $$14 : gw.a($$6, $$7)) {
                  dfd $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dcz $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eag $$17 = $$15.u();
                  if (!$$17.c()) {
                     foi $$18 = fnv.a($$17);
                     ele $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != czg.a) {
                     foi $$20 = fnv.a($$15);
                     ele $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(foi.f())) {
                  ele $$22 = $$3.a(foi.f());
                  if (!$$22.b()) {
                     $$22.a(elr.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (foi $$23 : $$11) {
                  ele.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fow.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dcz> void a(fqy.b.b.a $$0, E $$1) {
            fqa<E> $$2 = eqp.O().ap().a($$1);
            if ($$2 != null) {
               $$0.b.add($$1);
               if ($$2.a($$1)) {
                  $$0.a.add($$1);
               }
            }
         }

         @Override
         public void a() {
            this.e = null;
            if (this.b.compareAndSet(false, true)) {
               b.this.a(false);
            }
         }

         static final class a {
            public final List<dcz> a = new ArrayList<>();
            public final List<dcz> b = new ArrayList<>();
            public final Map<foi, ele.b> c = new Reference2ObjectArrayMap();
            public fra d = new fra();
            @Nullable
            public ele.c e;
         }
      }

      class c extends fqy.b.a {
         private final fqy.a f;

         public c(double $$0, fqy.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fqy.c> a(fol $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqy.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fqy.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqy.c.b);
            } else {
               ehh $$1 = fqy.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               ele.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(foi.f())) {
                  ele $$6 = $$0.a(foi.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(elr.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  ele.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fqy.c.b);
                  } else {
                     CompletableFuture<fqy.c> $$8 = fqy.this.a($$7, b.this.a(foi.f())).thenApply($$0x -> fqy.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           eqp.O().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fqy.c.b : fqy.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fqy.c.b);
               }
            }
         }

         @Override
         public void a() {
            this.b.set(true);
         }
      }
   }

   static enum c {
      a,
      b;
   }
}
