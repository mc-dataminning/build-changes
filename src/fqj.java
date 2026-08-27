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

public class fqj {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final int c = 2;
   private final PriorityBlockingQueue<fqj.b.a> d = Queues.newPriorityBlockingQueue();
   private final Queue<fqj.b.a> e = Queues.newLinkedBlockingDeque();
   private int f = 2;
   private final Queue<fnw> g;
   private final Queue<Runnable> h = Queues.newConcurrentLinkedQueue();
   private volatile int i;
   private volatile int j;
   final fnw k;
   private final bfj<Runnable> l;
   private final Executor m;
   fii n;
   final fnj o;
   private ehe p = ehe.b;

   public fqj(fii $$0, fnj $$1, Executor $$2, boolean $$3, fnw $$4) {
      this.n = $$0;
      this.o = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (fnt.G().stream().mapToInt(fnt::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.k = $$4;
      List<fnw> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fnw());
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
      this.l = bfj.a($$2, "Section Renderer");
      this.l.a(this::j);
   }

   public void a(fii $$0) {
      this.n = $$0;
   }

   private void j() {
      if (!this.g.isEmpty()) {
         fqj.b.a $$0 = this.k();
         if ($$0 != null) {
            fnw $$1 = this.g.poll();
            this.i = this.d.size() + this.e.size();
            this.j = this.g.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.m).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  eqm.O().a(o.a($$2, "Batching sections"));
               } else {
                  this.l.a(() -> {
                     if ($$1x == fqj.c.a) {
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
   private fqj.b.a k() {
      if (this.f <= 0) {
         fqj.b.a $$0 = this.e.poll();
         if ($$0 != null) {
            this.f = 2;
            return $$0;
         }
      }

      fqj.b.a $$1 = this.d.poll();
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

   public void a(ehe $$0) {
      this.p = $$0;
   }

   public ehe e() {
      return this.p;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.h.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fqj.b $$0, fqi $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fqj.b.a $$0) {
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

   public CompletableFuture<Void> a(elb.b $$0, elj $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            elj.b();
         }
      }, this.h::add);
   }

   private void l() {
      while (!this.d.isEmpty()) {
         fqj.b.a $$0 = this.d.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.e.isEmpty()) {
         fqj.b.a $$1 = this.e.poll();
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
      public static final fqj.a a = new fqj.a() {
         @Override
         public boolean a(ha $$0, ha $$1) {
            return false;
         }
      };
      final Set<fnt> b = new ObjectArraySet(fnt.G().size());
      final List<dcm> c = Lists.newArrayList();
      fql d = new fql();
      @Nullable
      elb.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(fnt $$0) {
         return !this.b.contains($$0);
      }

      public List<dcm> b() {
         return this.c;
      }

      public boolean a(ha $$0, ha $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fqj.a> c = new AtomicReference<>(fqj.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fqj.b.b f;
      @Nullable
      private fqj.b.c g;
      private final Set<dcm> h = Sets.newHashSet();
      private final Map<fnt, elj> i = fnt.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new elj(elj.a.a)));
      private egz j;
      private boolean k = true;
      final gu.a l = new gu.a(-1, -1, -1);
      private final gu.a[] m = ac.a(new gu.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new gu.a();
         }
      });
      private boolean n;

      public b(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(gu $$0) {
         return fqj.this.n.a(hx.a($$0.u()), hx.a($$0.w()), dhb.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ha.e.ordinal()]) && this.a(this.m[ha.c.ordinal()]) && this.a(this.m[ha.f.ordinal()]) && this.a(this.m[ha.d.ordinal()]);
      }

      public egz b() {
         return this.j;
      }

      public elj a(fnt $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new egz((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ha $$3 : ha.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         epx $$0 = eqm.O().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(elb $$0) {
         $$0.a(ell.b.h, ele.j);
      }

      public fqj.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fqj.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(elj::close);
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

      public boolean a(fnt $$0, fqj $$1) {
         fqj.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fqj.b.c(this.c(), $$2);
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

      public fqj.b.a a(fqi $$0) {
         boolean $$1 = this.j();
         gu $$2 = this.l.i();
         int $$3 = 1;
         fqh $$4 = $$0.a(fqj.this.n, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fqj.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fqj.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fqj $$0, fqi $$1) {
         fqj.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dcm> $$0) {
         Set<dcm> $$1 = Sets.newHashSet($$0);
         Set<dcm> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fqj.this.o.a($$2, $$1);
      }

      public void b(fqi $$0) {
         fqj.b.a $$1 = this.a($$0);
         $$1.a(fqj.this.k);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         gu $$3 = this.f();
         return $$0 == hx.a($$3.u()) || $$2 == hx.a($$3.w()) || $$1 == hx.a($$3.v());
      }

      abstract class a implements Comparable<fqj.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fqj.c> a(fnw var1);

         public abstract void a();

         protected abstract String b();

         public int a(fqj.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fqj.b.a {
         @Nullable
         protected fqh e;

         public b(double $$0, @Nullable fqh $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fqj.c> a(fnw $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqj.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fqj.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqj.c.b);
            } else {
               ehe $$1 = fqj.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fqj.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(elb.b::e);
                  return CompletableFuture.completedFuture(fqj.c.b);
               } else {
                  fqj.a $$6 = new fqj.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fqj.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        eqm.O().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fqj.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fqj.this.o.a(b.this);
                        return fqj.c.a;
                     }
                  });
               }
            }
         }

         private fqj.b.b.a a(float $$0, float $$1, float $$2, fnw $$3) {
            fqj.b.b.a $$4 = new fqj.b.b.a();
            int $$5 = 1;
            gu $$6 = b.this.l.i();
            gu $$7 = $$6.b(15, 15, 15);
            fqk $$8 = new fqk();
            fqh $$9 = this.e;
            this.e = null;
            elg $$10 = new elg();
            if ($$9 != null) {
               fog.a();
               Set<fnt> $$11 = new ReferenceArraySet(fnt.G().size());
               aru $$12 = aru.a();
               foe $$13 = eqm.O().an();

               for (gu $$14 : gu.a($$6, $$7)) {
                  dfa $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dcm $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  ead $$17 = $$15.u();
                  if (!$$17.c()) {
                     fnt $$18 = fng.a($$17);
                     elb $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != cyr.a) {
                     fnt $$20 = fng.a($$15);
                     elb $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(fnt.f())) {
                  elb $$22 = $$3.a(fnt.f());
                  if (!$$22.b()) {
                     $$22.a(elo.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (fnt $$23 : $$11) {
                  elb.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fog.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dcm> void a(fqj.b.b.a $$0, E $$1) {
            fpl<E> $$2 = eqm.O().ap().a($$1);
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
            public final List<dcm> a = new ArrayList<>();
            public final List<dcm> b = new ArrayList<>();
            public final Map<fnt, elb.b> c = new Reference2ObjectArrayMap();
            public fql d = new fql();
            @Nullable
            public elb.c e;
         }
      }

      class c extends fqj.b.a {
         private final fqj.a f;

         public c(double $$0, fqj.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fqj.c> a(fnw $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqj.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fqj.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqj.c.b);
            } else {
               ehe $$1 = fqj.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               elb.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(fnt.f())) {
                  elb $$6 = $$0.a(fnt.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(elo.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  elb.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fqj.c.b);
                  } else {
                     CompletableFuture<fqj.c> $$8 = fqj.this.a($$7, b.this.a(fnt.f())).thenApply($$0x -> fqj.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           eqm.O().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fqj.c.b : fqj.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fqj.c.b);
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
