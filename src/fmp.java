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

public class fmp {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final eio c = eih.j;
   private static final int d = 2;
   private final PriorityBlockingQueue<fmp.c.a> e = Queues.newPriorityBlockingQueue();
   private final Queue<fmp.c.a> f = Queues.newLinkedBlockingDeque();
   private int g = 2;
   private final Queue<fjk> h;
   private final Queue<Runnable> i = Queues.newConcurrentLinkedQueue();
   private volatile int j;
   private volatile int k;
   final fjk l;
   private final bcq<Runnable> m;
   private final Executor n;
   few o;
   final fjv p;
   private eei q = eei.b;

   public fmp(few $$0, fjv $$1, Executor $$2, boolean $$3, fjk $$4) {
      this.o = $$0;
      this.p = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (fkf.G().stream().mapToInt(fkf::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.l = $$4;
      List<fjk> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fjk());
         }
      } catch (OutOfMemoryError var14) {
         a.warn("Allocated only {}/{} buffers", $$9.size(), $$8);
         int $$12 = Math.min($$9.size() * 2 / 3, $$9.size() - 1);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            $$9.remove($$9.size() - 1);
         }

         System.gc();
      }

      this.h = Queues.newArrayDeque($$9);
      this.k = this.h.size();
      this.n = $$2;
      this.m = bcq.a($$2, "Chunk Renderer");
      this.m.a(this::j);
   }

   public void a(few $$0) {
      this.o = $$0;
   }

   private void j() {
      if (!this.h.isEmpty()) {
         fmp.c.a $$0 = this.k();
         if ($$0 != null) {
            fjk $$1 = this.h.poll();
            this.j = this.e.size() + this.f.size();
            this.k = this.h.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.n).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  enn.N().a(o.a($$2, "Batching chunks"));
               } else {
                  this.m.a(() -> {
                     if ($$1x == fmp.a.a) {
                        $$1.a();
                     } else {
                        $$1.b();
                     }

                     this.h.add($$1);
                     this.k = this.h.size();
                     this.j();
                  });
               }
            });
         }
      }
   }

   @Nullable
   private fmp.c.a k() {
      if (this.g <= 0) {
         fmp.c.a $$0 = this.f.poll();
         if ($$0 != null) {
            this.g = 2;
            return $$0;
         }
      }

      fmp.c.a $$1 = this.e.poll();
      if ($$1 != null) {
         this.g--;
         return $$1;
      } else {
         this.g = 2;
         return this.f.poll();
      }
   }

   public String a() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.j, this.i.size(), this.k);
   }

   public int b() {
      return this.j;
   }

   public int c() {
      return this.i.size();
   }

   public int d() {
      return this.k;
   }

   public void a(eei $$0) {
      this.q = $$0;
   }

   public eei e() {
      return this.q;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.i.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fmp.c $$0, fms $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fmp.c.a $$0) {
      this.m.a(() -> {
         if ($$0.c) {
            this.e.offer($$0);
         } else {
            this.f.offer($$0);
         }

         this.j = this.e.size() + this.f.size();
         this.j();
      });
   }

   public CompletableFuture<Void> a(eie.b $$0, eim $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            eim.b();
         }
      }, this.i::add);
   }

   private void l() {
      while (!this.e.isEmpty()) {
         fmp.c.a $$0 = this.e.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.f.isEmpty()) {
         fmp.c.a $$1 = this.f.poll();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.j = 0;
   }

   public boolean h() {
      return this.j == 0 && this.i.isEmpty();
   }

   public void i() {
      this.l();
      this.m.close();
      this.h.clear();
   }

   static enum a {
      a,
      b;
   }

   public static class b {
      public static final fmp.b a = new fmp.b() {
         @Override
         public boolean a(ha $$0, ha $$1) {
            return false;
         }
      };
      final Set<fkf> b = new ObjectArraySet(fkf.G().size());
      final List<czn> c = Lists.newArrayList();
      fmu d = new fmu();
      @Nullable
      eie.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(fkf $$0) {
         return !this.b.contains($$0);
      }

      public List<czn> b() {
         return this.c;
      }

      public boolean a(ha $$0, ha $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class c {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fmp.b> c = new AtomicReference<>(fmp.b.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fmp.c.b f;
      @Nullable
      private fmp.c.c g;
      private final Set<czn> h = Sets.newHashSet();
      private final Map<fkf, eim> i = fkf.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new eim(eim.a.a)));
      private eed j;
      private boolean k = true;
      final gu.a l = new gu.a(-1, -1, -1);
      private final gu.a[] m = ac.a(new gu.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new gu.a();
         }
      });
      private boolean n;

      public c(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(gu $$0) {
         return fmp.this.o.a(hx.a($$0.u()), hx.a($$0.w()), dec.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ha.e.ordinal()]) && this.a(this.m[ha.c.ordinal()]) && this.a(this.m[ha.f.ordinal()]) && this.a(this.m[ha.d.ordinal()]);
      }

      public eed b() {
         return this.j;
      }

      public eim a(fkf $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new eed((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ha $$3 : ha.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         emz $$0 = enn.N().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(eie $$0) {
         $$0.a(eio.b.h, eih.j);
      }

      public fmp.b d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fmp.b.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(eim::close);
      }

      public gu f() {
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

      public gu a(ha $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(fkf $$0, fmp $$1) {
         fmp.b $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fmp.c.c(this.c(), $$2);
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

      public fmp.c.a a(fms $$0) {
         boolean $$1 = this.j();
         gu $$2 = this.l.i();
         int $$3 = 1;
         fmr $$4 = $$0.a(fmp.this.o, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fmp.b.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fmp.c.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fmp $$0, fms $$1) {
         fmp.c.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<czn> $$0) {
         Set<czn> $$1 = Sets.newHashSet($$0);
         Set<czn> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fmp.this.p.a($$2, $$1);
      }

      public void b(fms $$0) {
         fmp.c.a $$1 = this.a($$0);
         $$1.a(fmp.this.l);
      }

      abstract class a implements Comparable<fmp.c.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fmp.a> a(fjk var1);

         public abstract void a();

         protected abstract String b();

         public int a(fmp.c.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fmp.c.a {
         @Nullable
         protected fmr e;

         public b(double $$0, @Nullable fmr $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fmp.a> a(fjk $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fmp.a.b);
            } else if (!c.this.a()) {
               this.e = null;
               c.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fmp.a.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fmp.a.b);
            } else {
               eei $$1 = fmp.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fmp.c.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               c.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(eie.b::e);
                  return CompletableFuture.completedFuture(fmp.a.b);
               } else {
                  fmp.b $$6 = new fmp.b();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fmp.this.a($$3x, c.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        enn.N().a(o.a($$2x, "Rendering chunk"));
                     }

                     if (this.b.get()) {
                        return fmp.a.b;
                     } else {
                        c.this.c.set($$6);
                        c.this.e.set(0);
                        fmp.this.p.a(c.this);
                        return fmp.a.a;
                     }
                  });
               }
            }
         }

         private fmp.c.b.a a(float $$0, float $$1, float $$2, fjk $$3) {
            fmp.c.b.a $$4 = new fmp.c.b.a();
            int $$5 = 1;
            gu $$6 = c.this.l.i();
            gu $$7 = $$6.b(15, 15, 15);
            fmt $$8 = new fmt();
            fmr $$9 = this.e;
            this.e = null;
            eij $$10 = new eij();
            if ($$9 != null) {
               fkq.a();
               Set<fkf> $$11 = new ReferenceArraySet(fkf.G().size());
               apf $$12 = apf.a();
               fko $$13 = enn.N().am();

               for (gu $$14 : gu.a($$6, $$7)) {
                  dcb $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     czn $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  dcb $$17 = $$9.a_($$14);
                  dxe $$18 = $$17.u();
                  if (!$$18.c()) {
                     fkf $$19 = fjs.a($$18);
                     eie $$20 = $$3.a($$19);
                     if ($$11.add($$19)) {
                        c.this.a($$20);
                     }

                     $$13.a($$14, $$9, $$20, $$17, $$18);
                  }

                  if ($$15.l() != cvs.a) {
                     fkf $$21 = fjs.a($$15);
                     eie $$22 = $$3.a($$21);
                     if ($$11.add($$21)) {
                        c.this.a($$22);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$22, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(fkf.f())) {
                  eie $$23 = $$3.a(fkf.f());
                  if (!$$23.b()) {
                     $$23.a(eir.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$23.a();
                  }
               }

               for (fkf $$24 : $$11) {
                  eie.b $$25 = $$3.a($$24).c();
                  if ($$25 != null) {
                     $$4.c.put($$24, $$25);
                  }
               }

               fkq.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends czn> void a(fmp.c.b.a $$0, E $$1) {
            flu<E> $$2 = enn.N().ao().a($$1);
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
               c.this.a(false);
            }
         }

         static final class a {
            public final List<czn> a = new ArrayList<>();
            public final List<czn> b = new ArrayList<>();
            public final Map<fkf, eie.b> c = new Reference2ObjectArrayMap();
            public fmu d = new fmu();
            @Nullable
            public eie.c e;
         }
      }

      class c extends fmp.c.a {
         private final fmp.b f;

         public c(double $$0, fmp.b $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fmp.a> a(fjk $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fmp.a.b);
            } else if (!c.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fmp.a.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fmp.a.b);
            } else {
               eei $$1 = fmp.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               eie.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(fkf.f())) {
                  eie $$6 = $$0.a(fkf.f());
                  c.this.a($$6);
                  $$6.a($$5);
                  $$6.a(eir.a($$2 - (float)c.this.l.u(), $$3 - (float)c.this.l.v(), $$4 - (float)c.this.l.w()));
                  this.f.e = $$6.a();
                  eie.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fmp.a.b);
                  } else {
                     CompletableFuture<fmp.a> $$8 = fmp.this.a($$7, c.this.a(fkf.f())).thenApply($$0x -> fmp.a.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           enn.N().a(o.a($$1x, "Rendering chunk"));
                        }

                        return this.b.get() ? fmp.a.b : fmp.a.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fmp.a.b);
               }
            }
         }

         @Override
         public void a() {
            this.b.set(true);
         }
      }
   }
}
