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

public class fre {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4;
   private static final int c = 2;
   private final PriorityBlockingQueue<fre.b.a> d = Queues.newPriorityBlockingQueue();
   private final Queue<fre.b.a> e = Queues.newLinkedBlockingDeque();
   private int f = 2;
   private final Queue<fos> g;
   private final Queue<Runnable> h = Queues.newConcurrentLinkedQueue();
   private volatile int i;
   private volatile int j;
   final fos k;
   private final bft<Runnable> l;
   private final Executor m;
   fiz n;
   final foe o;
   private ehp p = ehp.b;

   public fre(fiz $$0, foe $$1, Executor $$2, boolean $$3, fos $$4) {
      this.n = $$0;
      this.o = $$1;
      int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (foo.G().stream().mapToInt(foo::H).sum() * 4) - 1);
      int $$6 = Runtime.getRuntime().availableProcessors();
      int $$7 = $$3 ? $$6 : Math.min($$6, 4);
      int $$8 = Math.max(1, Math.min($$7, $$5));
      this.k = $$4;
      List<fos> $$9 = Lists.newArrayListWithExpectedSize($$8);

      try {
         for (int $$10 = 0; $$10 < $$8; $$10++) {
            $$9.add(new fos());
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
      this.l = bft.a($$2, "Section Renderer");
      this.l.a(this::j);
   }

   public void a(fiz $$0) {
      this.n = $$0;
   }

   private void j() {
      if (!this.g.isEmpty()) {
         fre.b.a $$0 = this.k();
         if ($$0 != null) {
            fos $$1 = this.g.poll();
            this.i = this.d.size() + this.e.size();
            this.j = this.g.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.m).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  eqx.O().a(o.a($$2, "Batching sections"));
               } else {
                  this.l.a(() -> {
                     if ($$1x == fre.c.a) {
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
   private fre.b.a k() {
      if (this.f <= 0) {
         fre.b.a $$0 = this.e.poll();
         if ($$0 != null) {
            this.f = 2;
            return $$0;
         }
      }

      fre.b.a $$1 = this.d.poll();
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

   public void a(ehp $$0) {
      this.p = $$0;
   }

   public ehp e() {
      return this.p;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.h.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fre.b $$0, frd $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fre.b.a $$0) {
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

   public CompletableFuture<Void> a(elm.b $$0, elu $$1) {
      return CompletableFuture.runAsync(() -> {
         if (!$$1.e()) {
            $$1.a();
            $$1.a($$0);
            elu.b();
         }
      }, this.h::add);
   }

   private void l() {
      while (!this.d.isEmpty()) {
         fre.b.a $$0 = this.d.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.e.isEmpty()) {
         fre.b.a $$1 = this.e.poll();
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
      public static final fre.a a = new fre.a() {
         @Override
         public boolean a(hc $$0, hc $$1) {
            return false;
         }
      };
      final Set<foo> b = new ObjectArraySet(foo.G().size());
      final List<dcx> c = Lists.newArrayList();
      frg d = new frg();
      @Nullable
      elm.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(foo $$0) {
         return !this.b.contains($$0);
      }

      public List<dcx> b() {
         return this.c;
      }

      public boolean a(hc $$0, hc $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fre.a> c = new AtomicReference<>(fre.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fre.b.b f;
      @Nullable
      private fre.b.c g;
      private final Set<dcx> h = Sets.newHashSet();
      private final Map<foo, elu> i = foo.G().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new elu(elu.a.a)));
      private ehk j;
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
         return fre.this.n.a(hz.a($$0.u()), hz.a($$0.w()), dhm.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[hc.e.ordinal()]) && this.a(this.m[hc.c.ordinal()]) && this.a(this.m[hc.f.ordinal()]) && this.a(this.m[hc.d.ordinal()]);
      }

      public ehk b() {
         return this.j;
      }

      public elu a(foo $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new ehk((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (hc $$3 : hc.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         eqi $$0 = eqx.O().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(elm $$0) {
         $$0.a(elw.b.h, elp.j);
      }

      public fre.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fre.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(elu::close);
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

      public boolean a(foo $$0, fre $$1) {
         fre.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fre.b.c(this.c(), $$2);
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

      public fre.b.a a(frd $$0) {
         boolean $$1 = this.j();
         gw $$2 = this.l.i();
         int $$3 = 1;
         frc $$4 = $$0.a(fre.this.n, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fre.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fre.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fre $$0, frd $$1) {
         fre.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dcx> $$0) {
         Set<dcx> $$1 = Sets.newHashSet($$0);
         Set<dcx> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fre.this.o.a($$2, $$1);
      }

      public void b(frd $$0) {
         fre.b.a $$1 = this.a($$0);
         $$1.a(fre.this.k);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         gw $$3 = this.f();
         return $$0 == hz.a($$3.u()) || $$2 == hz.a($$3.w()) || $$1 == hz.a($$3.v());
      }

      abstract class a implements Comparable<fre.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fre.c> a(fos var1);

         public abstract void a();

         protected abstract String b();

         public int a(fre.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fre.b.a {
         @Nullable
         protected frc e;

         public b(double $$0, @Nullable frc $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fre.c> a(fos $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fre.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fre.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fre.c.b);
            } else {
               ehp $$1 = fre.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fre.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(elm.b::e);
                  return CompletableFuture.completedFuture(fre.c.b);
               } else {
                  fre.a $$6 = new fre.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fre.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        eqx.O().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fre.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fre.this.o.a(b.this);
                        return fre.c.a;
                     }
                  });
               }
            }
         }

         private fre.b.b.a a(float $$0, float $$1, float $$2, fos $$3) {
            fre.b.b.a $$4 = new fre.b.b.a();
            int $$5 = 1;
            gw $$6 = b.this.l.i();
            gw $$7 = $$6.b(15, 15, 15);
            frf $$8 = new frf();
            frc $$9 = this.e;
            this.e = null;
            elr $$10 = new elr();
            if ($$9 != null) {
               fpc.a();
               Set<foo> $$11 = new ReferenceArraySet(foo.G().size());
               ase $$12 = ase.a();
               fpa $$13 = eqx.O().an();

               for (gw $$14 : gw.a($$6, $$7)) {
                  dfl $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dcx $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eao $$17 = $$15.u();
                  if (!$$17.c()) {
                     foo $$18 = fob.a($$17);
                     elm $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != czc.a) {
                     foo $$20 = fob.a($$15);
                     elm $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(foo.f())) {
                  elm $$22 = $$3.a(foo.f());
                  if (!$$22.b()) {
                     $$22.a(elz.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (foo $$23 : $$11) {
                  elm.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fpc.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dcx> void a(fre.b.b.a $$0, E $$1) {
            fqg<E> $$2 = eqx.O().ap().a($$1);
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
            public final List<dcx> a = new ArrayList<>();
            public final List<dcx> b = new ArrayList<>();
            public final Map<foo, elm.b> c = new Reference2ObjectArrayMap();
            public frg d = new frg();
            @Nullable
            public elm.c e;
         }
      }

      class c extends fre.b.a {
         private final fre.a f;

         public c(double $$0, fre.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fre.c> a(fos $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fre.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fre.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fre.c.b);
            } else {
               ehp $$1 = fre.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               elm.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(foo.f())) {
                  elm $$6 = $$0.a(foo.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(elz.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  elm.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fre.c.b);
                  } else {
                     CompletableFuture<fre.c> $$8 = fre.this.a($$7, b.this.a(foo.f())).thenApply($$0x -> fre.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           eqx.O().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fre.c.b : fre.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fre.c.b);
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
