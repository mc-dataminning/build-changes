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

public class fqe {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final int c = 2;
   private final PriorityBlockingQueue<fqe.b.a> d = Queues.newPriorityBlockingQueue();
   private final Queue<fqe.b.a> e = Queues.newLinkedBlockingDeque();
   private int f = 2;
   private final Queue<fnr> g;
   private final Queue<Runnable> h = Queues.newConcurrentLinkedQueue();
   private volatile int i;
   private volatile int j;
   final fnr k;
   private final bfh<Runnable> l;
   private final Executor m;
   fie n;
   final fne o;
   private ehf p = ehf.b;

   public fqe(fie $$0, fne $$1, Executor $$2, boolean $$3, fnr $$4) {
      this.n = $$0;
      this.o = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (fno.G().stream().mapToInt(fno::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.k = $$4;
      List<fnr> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fnr());
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
      this.l = bfh.a($$2, "Section Renderer");
      this.l.a(this::j);
   }

   public void a(fie $$0) {
      this.n = $$0;
   }

   private void j() {
      if (!this.g.isEmpty()) {
         fqe.b.a $$0 = this.k();
         if ($$0 != null) {
            fnr $$1 = this.g.poll();
            this.i = this.d.size() + this.e.size();
            this.j = this.g.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.m).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  eqn.N().a(o.a($$2, "Batching sections"));
               } else {
                  this.l.a(() -> {
                     if ($$1x == fqe.c.a) {
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
   private fqe.b.a k() {
      if (this.f <= 0) {
         fqe.b.a $$0 = this.e.poll();
         if ($$0 != null) {
            this.f = 2;
            return $$0;
         }
      }

      fqe.b.a $$1 = this.d.poll();
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

   public void a(ehf $$0) {
      this.p = $$0;
   }

   public ehf e() {
      return this.p;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.h.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fqe.b $$0, fqd $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fqe.b.a $$0) {
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

   public CompletableFuture<Void> a(elc.b $$0, elk $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            elk.b();
         }
      }, this.h::add);
   }

   private void l() {
      while (!this.d.isEmpty()) {
         fqe.b.a $$0 = this.d.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.e.isEmpty()) {
         fqe.b.a $$1 = this.e.poll();
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
      public static final fqe.a a = new fqe.a() {
         @Override
         public boolean a(hb $$0, hb $$1) {
            return false;
         }
      };
      final Set<fno> b = new ObjectArraySet(fno.G().size());
      final List<dck> c = Lists.newArrayList();
      fqg d = new fqg();
      @Nullable
      elc.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(fno $$0) {
         return !this.b.contains($$0);
      }

      public List<dck> b() {
         return this.c;
      }

      public boolean a(hb $$0, hb $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fqe.a> c = new AtomicReference<>(fqe.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fqe.b.b f;
      @Nullable
      private fqe.b.c g;
      private final Set<dck> h = Sets.newHashSet();
      private final Map<fno, elk> i = fno.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new elk(elk.a.a)));
      private eha j;
      private boolean k = true;
      final gv.a l = new gv.a(-1, -1, -1);
      private final gv.a[] m = ac.a(new gv.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new gv.a();
         }
      });
      private boolean n;

      public b(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(gv $$0) {
         return fqe.this.n.a(hy.a($$0.u()), hy.a($$0.w()), dgz.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[hb.e.ordinal()]) && this.a(this.m[hb.c.ordinal()]) && this.a(this.m[hb.f.ordinal()]) && this.a(this.m[hb.d.ordinal()]);
      }

      public eha b() {
         return this.j;
      }

      public elk a(fno $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new eha((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (hb $$3 : hb.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         epy $$0 = eqn.N().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(elc $$0) {
         $$0.a(elm.b.h, elf.j);
      }

      public fqe.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fqe.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(elk::close);
      }

      public gv f() {
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

      public gv a(hb $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(fno $$0, fqe $$1) {
         fqe.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fqe.b.c(this.c(), $$2);
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

      public fqe.b.a a(fqd $$0) {
         boolean $$1 = this.j();
         gv $$2 = this.l.i();
         int $$3 = 1;
         fqc $$4 = $$0.a(fqe.this.n, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fqe.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fqe.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fqe $$0, fqd $$1) {
         fqe.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dck> $$0) {
         Set<dck> $$1 = Sets.newHashSet($$0);
         Set<dck> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fqe.this.o.a($$2, $$1);
      }

      public void b(fqd $$0) {
         fqe.b.a $$1 = this.a($$0);
         $$1.a(fqe.this.k);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         gv $$3 = this.f();
         return $$0 == hy.a($$3.u()) || $$2 == hy.a($$3.w()) || $$1 == hy.a($$3.v());
      }

      abstract class a implements Comparable<fqe.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fqe.c> a(fnr var1);

         public abstract void a();

         protected abstract String b();

         public int a(fqe.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fqe.b.a {
         @Nullable
         protected fqc e;

         public b(double $$0, @Nullable fqc $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fqe.c> a(fnr $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqe.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fqe.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqe.c.b);
            } else {
               ehf $$1 = fqe.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fqe.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(elc.b::e);
                  return CompletableFuture.completedFuture(fqe.c.b);
               } else {
                  fqe.a $$6 = new fqe.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fqe.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        eqn.N().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fqe.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fqe.this.o.a(b.this);
                        return fqe.c.a;
                     }
                  });
               }
            }
         }

         private fqe.b.b.a a(float $$0, float $$1, float $$2, fnr $$3) {
            fqe.b.b.a $$4 = new fqe.b.b.a();
            int $$5 = 1;
            gv $$6 = b.this.l.i();
            gv $$7 = $$6.b(15, 15, 15);
            fqf $$8 = new fqf();
            fqc $$9 = this.e;
            this.e = null;
            elh $$10 = new elh();
            if ($$9 != null) {
               fob.a();
               Set<fno> $$11 = new ReferenceArraySet(fno.G().size());
               art $$12 = art.a();
               fnz $$13 = eqn.N().am();

               for (gv $$14 : gv.a($$6, $$7)) {
                  dey $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dck $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eab $$17 = $$15.u();
                  if (!$$17.c()) {
                     fno $$18 = fnb.a($$17);
                     elc $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != cyp.a) {
                     fno $$20 = fnb.a($$15);
                     elc $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(fno.f())) {
                  elc $$22 = $$3.a(fno.f());
                  if (!$$22.b()) {
                     $$22.a(elp.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (fno $$23 : $$11) {
                  elc.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fob.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dck> void a(fqe.b.b.a $$0, E $$1) {
            fpg<E> $$2 = eqn.N().ao().a($$1);
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
            public final List<dck> a = new ArrayList<>();
            public final List<dck> b = new ArrayList<>();
            public final Map<fno, elc.b> c = new Reference2ObjectArrayMap();
            public fqg d = new fqg();
            @Nullable
            public elc.c e;
         }
      }

      class c extends fqe.b.a {
         private final fqe.a f;

         public c(double $$0, fqe.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fqe.c> a(fnr $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqe.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fqe.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqe.c.b);
            } else {
               ehf $$1 = fqe.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               elc.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(fno.f())) {
                  elc $$6 = $$0.a(fno.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(elp.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  elc.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fqe.c.b);
                  } else {
                     CompletableFuture<fqe.c> $$8 = fqe.this.a($$7, b.this.a(fno.f())).thenApply($$0x -> fqe.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           eqn.N().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fqe.c.b : fqe.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fqe.c.b);
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
