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

public class fqs {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final int c = 2;
   private final PriorityBlockingQueue<fqs.b.a> d = Queues.newPriorityBlockingQueue();
   private final Queue<fqs.b.a> e = Queues.newLinkedBlockingDeque();
   private int f = 2;
   private final Queue<fof> g;
   private final Queue<Runnable> h = Queues.newConcurrentLinkedQueue();
   private volatile int i;
   private volatile int j;
   final fof k;
   private final bfj<Runnable> l;
   private final Executor m;
   fin n;
   final fns o;
   private ehd p = ehd.b;

   public fqs(fin $$0, fns $$1, Executor $$2, boolean $$3, fof $$4) {
      this.n = $$0;
      this.o = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (foc.G().stream().mapToInt(foc::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.k = $$4;
      List<fof> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fof());
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

   public void a(fin $$0) {
      this.n = $$0;
   }

   private void j() {
      if (!this.g.isEmpty()) {
         fqs.b.a $$0 = this.k();
         if ($$0 != null) {
            fof $$1 = this.g.poll();
            this.i = this.d.size() + this.e.size();
            this.j = this.g.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.m).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  eql.O().a(o.a($$2, "Batching sections"));
               } else {
                  this.l.a(() -> {
                     if ($$1x == fqs.c.a) {
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
   private fqs.b.a k() {
      if (this.f <= 0) {
         fqs.b.a $$0 = this.e.poll();
         if ($$0 != null) {
            this.f = 2;
            return $$0;
         }
      }

      fqs.b.a $$1 = this.d.poll();
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

   public void a(ehd $$0) {
      this.p = $$0;
   }

   public ehd e() {
      return this.p;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.h.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fqs.b $$0, fqr $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fqs.b.a $$0) {
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

   public CompletableFuture<Void> a(ela.b $$0, eli $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            eli.b();
         }
      }, this.h::add);
   }

   private void l() {
      while (!this.d.isEmpty()) {
         fqs.b.a $$0 = this.d.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.e.isEmpty()) {
         fqs.b.a $$1 = this.e.poll();
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
      public static final fqs.a a = new fqs.a() {
         @Override
         public boolean a(ha $$0, ha $$1) {
            return false;
         }
      };
      final Set<foc> b = new ObjectArraySet(foc.G().size());
      final List<dcl> c = Lists.newArrayList();
      fqu d = new fqu();
      @Nullable
      ela.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(foc $$0) {
         return !this.b.contains($$0);
      }

      public List<dcl> b() {
         return this.c;
      }

      public boolean a(ha $$0, ha $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fqs.a> c = new AtomicReference<>(fqs.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fqs.b.b f;
      @Nullable
      private fqs.b.c g;
      private final Set<dcl> h = Sets.newHashSet();
      private final Map<foc, eli> i = foc.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new eli(eli.a.a)));
      private egy j;
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
         return fqs.this.n.a(hx.a($$0.u()), hx.a($$0.w()), dha.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ha.e.ordinal()]) && this.a(this.m[ha.c.ordinal()]) && this.a(this.m[ha.f.ordinal()]) && this.a(this.m[ha.d.ordinal()]);
      }

      public egy b() {
         return this.j;
      }

      public eli a(foc $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new egy((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ha $$3 : ha.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         epw $$0 = eql.O().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(ela $$0) {
         $$0.a(elk.b.h, eld.j);
      }

      public fqs.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fqs.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(eli::close);
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

      public boolean a(foc $$0, fqs $$1) {
         fqs.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fqs.b.c(this.c(), $$2);
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

      public fqs.b.a a(fqr $$0) {
         boolean $$1 = this.j();
         gu $$2 = this.l.i();
         int $$3 = 1;
         fqq $$4 = $$0.a(fqs.this.n, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fqs.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fqs.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fqs $$0, fqr $$1) {
         fqs.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dcl> $$0) {
         Set<dcl> $$1 = Sets.newHashSet($$0);
         Set<dcl> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fqs.this.o.a($$2, $$1);
      }

      public void b(fqr $$0) {
         fqs.b.a $$1 = this.a($$0);
         $$1.a(fqs.this.k);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         gu $$3 = this.f();
         return $$0 == hx.a($$3.u()) || $$2 == hx.a($$3.w()) || $$1 == hx.a($$3.v());
      }

      abstract class a implements Comparable<fqs.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fqs.c> a(fof var1);

         public abstract void a();

         protected abstract String b();

         public int a(fqs.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fqs.b.a {
         @Nullable
         protected fqq e;

         public b(double $$0, @Nullable fqq $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fqs.c> a(fof $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqs.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fqs.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqs.c.b);
            } else {
               ehd $$1 = fqs.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fqs.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(ela.b::e);
                  return CompletableFuture.completedFuture(fqs.c.b);
               } else {
                  fqs.a $$6 = new fqs.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fqs.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        eql.O().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fqs.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fqs.this.o.a(b.this);
                        return fqs.c.a;
                     }
                  });
               }
            }
         }

         private fqs.b.b.a a(float $$0, float $$1, float $$2, fof $$3) {
            fqs.b.b.a $$4 = new fqs.b.b.a();
            int $$5 = 1;
            gu $$6 = b.this.l.i();
            gu $$7 = $$6.b(15, 15, 15);
            fqt $$8 = new fqt();
            fqq $$9 = this.e;
            this.e = null;
            elf $$10 = new elf();
            if ($$9 != null) {
               fop.a();
               Set<foc> $$11 = new ReferenceArraySet(foc.G().size());
               aru $$12 = aru.a();
               fon $$13 = eql.O().an();

               for (gu $$14 : gu.a($$6, $$7)) {
                  dez $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dcl $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eac $$17 = $$15.u();
                  if (!$$17.c()) {
                     foc $$18 = fnp.a($$17);
                     ela $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != cyq.a) {
                     foc $$20 = fnp.a($$15);
                     ela $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(foc.f())) {
                  ela $$22 = $$3.a(foc.f());
                  if (!$$22.b()) {
                     $$22.a(eln.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (foc $$23 : $$11) {
                  ela.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fop.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dcl> void a(fqs.b.b.a $$0, E $$1) {
            fpu<E> $$2 = eql.O().ap().a($$1);
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
            public final List<dcl> a = new ArrayList<>();
            public final List<dcl> b = new ArrayList<>();
            public final Map<foc, ela.b> c = new Reference2ObjectArrayMap();
            public fqu d = new fqu();
            @Nullable
            public ela.c e;
         }
      }

      class c extends fqs.b.a {
         private final fqs.a f;

         public c(double $$0, fqs.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fqs.c> a(fof $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fqs.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fqs.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fqs.c.b);
            } else {
               ehd $$1 = fqs.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               ela.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(foc.f())) {
                  ela $$6 = $$0.a(foc.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(eln.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  ela.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fqs.c.b);
                  } else {
                     CompletableFuture<fqs.c> $$8 = fqs.this.a($$7, b.this.a(foc.f())).thenApply($$0x -> fqs.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           eql.O().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fqs.c.b : fqs.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fqs.c.b);
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
