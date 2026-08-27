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

public class frc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final int c = 2;
   private final PriorityBlockingQueue<frc.b.a> d = Queues.newPriorityBlockingQueue();
   private final Queue<frc.b.a> e = Queues.newLinkedBlockingDeque();
   private int f = 2;
   private final Queue<fop> g;
   private final Queue<Runnable> h = Queues.newConcurrentLinkedQueue();
   private volatile int i;
   private volatile int j;
   final fop k;
   private final bfr<Runnable> l;
   private final Executor m;
   fix n;
   final foc o;
   private ehn p = ehn.b;

   public frc(fix $$0, foc $$1, Executor $$2, boolean $$3, fop $$4) {
      this.n = $$0;
      this.o = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (fom.G().stream().mapToInt(fom::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.k = $$4;
      List<fop> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fop());
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
      this.l = bfr.a($$2, "Section Renderer");
      this.l.a(this::j);
   }

   public void a(fix $$0) {
      this.n = $$0;
   }

   private void j() {
      if (!this.g.isEmpty()) {
         frc.b.a $$0 = this.k();
         if ($$0 != null) {
            fop $$1 = this.g.poll();
            this.i = this.d.size() + this.e.size();
            this.j = this.g.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.m).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  eqv.O().a(o.a($$2, "Batching sections"));
               } else {
                  this.l.a(() -> {
                     if ($$1x == frc.c.a) {
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
   private frc.b.a k() {
      if (this.f <= 0) {
         frc.b.a $$0 = this.e.poll();
         if ($$0 != null) {
            this.f = 2;
            return $$0;
         }
      }

      frc.b.a $$1 = this.d.poll();
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

   public void a(ehn $$0) {
      this.p = $$0;
   }

   public ehn e() {
      return this.p;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.h.poll()) != null) {
         $$0.run();
      }
   }

   public void a(frc.b $$0, frb $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(frc.b.a $$0) {
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

   public CompletableFuture<Void> a(elk.b $$0, els $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            els.b();
         }
      }, this.h::add);
   }

   private void l() {
      while (!this.d.isEmpty()) {
         frc.b.a $$0 = this.d.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.e.isEmpty()) {
         frc.b.a $$1 = this.e.poll();
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
      public static final frc.a a = new frc.a() {
         @Override
         public boolean a(hc $$0, hc $$1) {
            return false;
         }
      };
      final Set<fom> b = new ObjectArraySet(fom.G().size());
      final List<dcv> c = Lists.newArrayList();
      fre d = new fre();
      @Nullable
      elk.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(fom $$0) {
         return !this.b.contains($$0);
      }

      public List<dcv> b() {
         return this.c;
      }

      public boolean a(hc $$0, hc $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<frc.a> c = new AtomicReference<>(frc.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private frc.b.b f;
      @Nullable
      private frc.b.c g;
      private final Set<dcv> h = Sets.newHashSet();
      private final Map<fom, els> i = fom.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new els(els.a.a)));
      private ehi j;
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
         return frc.this.n.a(hz.a($$0.u()), hz.a($$0.w()), dhk.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[hc.e.ordinal()]) && this.a(this.m[hc.c.ordinal()]) && this.a(this.m[hc.f.ordinal()]) && this.a(this.m[hc.d.ordinal()]);
      }

      public ehi b() {
         return this.j;
      }

      public els a(fom $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new ehi((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (hc $$3 : hc.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         eqg $$0 = eqv.O().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(elk $$0) {
         $$0.a(elu.b.h, eln.j);
      }

      public frc.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(frc.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(els::close);
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

      public gw a(hc $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(fom $$0, frc $$1) {
         frc.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new frc.b.c(this.c(), $$2);
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

      public frc.b.a a(frb $$0) {
         boolean $$1 = this.j();
         gw $$2 = this.l.i();
         int $$3 = 1;
         fra $$4 = $$0.a(frc.this.n, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == frc.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new frc.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(frc $$0, frb $$1) {
         frc.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dcv> $$0) {
         Set<dcv> $$1 = Sets.newHashSet($$0);
         Set<dcv> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         frc.this.o.a($$2, $$1);
      }

      public void b(frb $$0) {
         frc.b.a $$1 = this.a($$0);
         $$1.a(frc.this.k);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         gw $$3 = this.f();
         return $$0 == hz.a($$3.u()) || $$2 == hz.a($$3.w()) || $$1 == hz.a($$3.v());
      }

      abstract class a implements Comparable<frc.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<frc.c> a(fop var1);

         public abstract void a();

         protected abstract String b();

         public int a(frc.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends frc.b.a {
         @Nullable
         protected fra e;

         public b(double $$0, @Nullable fra $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<frc.c> a(fop $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(frc.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(frc.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(frc.c.b);
            } else {
               ehn $$1 = frc.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               frc.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(elk.b::e);
                  return CompletableFuture.completedFuture(frc.c.b);
               } else {
                  frc.a $$6 = new frc.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(frc.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        eqv.O().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return frc.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        frc.this.o.a(b.this);
                        return frc.c.a;
                     }
                  });
               }
            }
         }

         private frc.b.b.a a(float $$0, float $$1, float $$2, fop $$3) {
            frc.b.b.a $$4 = new frc.b.b.a();
            int $$5 = 1;
            gw $$6 = b.this.l.i();
            gw $$7 = $$6.b(15, 15, 15);
            frd $$8 = new frd();
            fra $$9 = this.e;
            this.e = null;
            elp $$10 = new elp();
            if ($$9 != null) {
               fpa.a();
               Set<fom> $$11 = new ReferenceArraySet(fom.G().size());
               asc $$12 = asc.a();
               foy $$13 = eqv.O().an();

               for (gw $$14 : gw.a($$6, $$7)) {
                  dfj $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dcv $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eam $$17 = $$15.u();
                  if (!$$17.c()) {
                     fom $$18 = fnz.a($$17);
                     elk $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != cza.a) {
                     fom $$20 = fnz.a($$15);
                     elk $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(fom.f())) {
                  elk $$22 = $$3.a(fom.f());
                  if (!$$22.b()) {
                     $$22.a(elx.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (fom $$23 : $$11) {
                  elk.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fpa.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dcv> void a(frc.b.b.a $$0, E $$1) {
            fqe<E> $$2 = eqv.O().ap().a($$1);
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
            public final List<dcv> a = new ArrayList<>();
            public final List<dcv> b = new ArrayList<>();
            public final Map<fom, elk.b> c = new Reference2ObjectArrayMap();
            public fre d = new fre();
            @Nullable
            public elk.c e;
         }
      }

      class c extends frc.b.a {
         private final frc.a f;

         public c(double $$0, frc.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<frc.c> a(fop $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(frc.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(frc.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(frc.c.b);
            } else {
               ehn $$1 = frc.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               elk.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(fom.f())) {
                  elk $$6 = $$0.a(fom.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(elx.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  elk.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(frc.c.b);
                  } else {
                     CompletableFuture<frc.c> $$8 = frc.this.a($$7, b.this.a(fom.f())).thenApply($$0x -> frc.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           eqv.O().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? frc.c.b : frc.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(frc.c.b);
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
