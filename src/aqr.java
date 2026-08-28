import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;

public class aqr extends arf {
   public static final aqu<dxp> a = aqu.a("Unloaded level chunk");
   private static final CompletableFuture<aqu<dxp>> e = CompletableFuture.completedFuture(a);
   private final dfd f;
   private volatile CompletableFuture<aqu<dxp>> g = e;
   private volatile CompletableFuture<aqu<dxp>> h = e;
   private volatile CompletableFuture<aqu<dxp>> i = e;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private final ShortSet[] n;
   private final BitSet o = new BitSet();
   private final BitSet p = new BitSet();
   private final eqz q;
   private final aqr.a r;
   private final aqr.b s;
   private boolean t;
   private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

   public aqr(deh $$0, int $$1, dfd $$2, eqz $$3, aqr.a $$4, aqr.b $$5) {
      super($$0);
      this.f = $$2;
      this.q = $$3;
      this.r = $$4;
      this.s = $$5;
      this.j = aqs.b + 1;
      this.k = this.j;
      this.l = this.j;
      this.a($$1);
      this.n = new ShortSet[$$2.am()];
   }

   public CompletableFuture<aqu<dxp>> a() {
      return this.h;
   }

   public CompletableFuture<aqu<dxp>> b() {
      return this.i;
   }

   public CompletableFuture<aqu<dxp>> c() {
      return this.g;
   }

   @Nullable
   public dxp d() {
      return this.a().getNow(a).b(null);
   }

   @Nullable
   public dxp e() {
      return !this.v.isDone() ? null : this.d();
   }

   public CompletableFuture<?> f() {
      return this.v;
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.v.isDone()) {
         this.v = $$0;
      } else {
         this.v = this.v.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public CompletableFuture<?> g() {
      return this.w;
   }

   public boolean h() {
      return this.w.isDone();
   }

   @Override
   protected void b(CompletableFuture<?> $$0) {
      if (this.w.isDone()) {
         this.w = $$0;
      } else {
         this.w = this.w.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public boolean a(jh $$0) {
      dxp $$1 = this.d();
      if ($$1 == null) {
         return false;
      } else {
         boolean $$2 = this.m;
         int $$3 = this.f.f($$0.v());
         if (this.n[$$3] == null) {
            this.m = true;
            this.n[$$3] = new ShortOpenHashSet();
         }

         this.n[$$3].add(kj.b($$0));
         return !$$2;
      }
   }

   public boolean a(dfk $$0, int $$1) {
      dxf $$2 = this.b(dyg.k);
      if ($$2 == null) {
         return false;
      } else {
         $$2.a(true);
         dxp $$3 = this.d();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.q.d();
            int $$5 = this.q.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               BitSet $$6 = $$0 == dfk.a ? this.p : this.o;
               int $$7 = $$1 - $$4;
               if (!$$6.get($$7)) {
                  $$6.set($$7);
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   public void a(dxp $$0) {
      if (this.m || !this.p.isEmpty() || !this.o.isEmpty()) {
         dfb $$1 = $$0.E();
         if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<aro> $$2 = this.s.a(this.d, true);
            if (!$$2.isEmpty()) {
               adt $$3 = new adt($$0.f(), this.q, this.p, this.o);
               this.a($$2, $$3);
            }

            this.p.clear();
            this.o.clear();
         }

         if (this.m) {
            List<aro> $$4 = this.s.a(this.d, false);

            for (int $$5 = 0; $$5 < this.n.length; $$5++) {
               ShortSet $$6 = this.n[$$5];
               if ($$6 != null) {
                  this.n[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.f.h($$5);
                     kj $$8 = kj.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        jh $$9 = $$8.g($$6.iterator().nextShort());
                        dvj $$10 = $$1.a_($$9);
                        this.a($$4, new acn($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dxq $$11 = $$0.b($$5);
                        aev $$12 = new aev($$8, $$6, $$11);
                        this.a($$4, $$12);
                        $$12.a(($$2, $$3) -> this.a($$4, $$1, $$2, $$3));
                     }
                  }
               }
            }

            this.m = false;
         }
      }
   }

   private void a(List<aro> $$0, dfb $$1, jh $$2, dvj $$3) {
      if ($$3.x()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<aro> $$0, dfb $$1, jh $$2) {
      dsm $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zp<?> $$4 = $$3.ay_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<aro> $$0, zp<?> $$1) {
      $$0.forEach($$1x -> $$1x.g.b($$1));
   }

   @Override
   public int i() {
      return this.k;
   }

   @Override
   public int j() {
      return this.l;
   }

   private void b(int $$0) {
      this.l = $$0;
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   private void a(aqt $$0, CompletableFuture<aqu<dxp>> $$1, Executor $$2, ard $$3) {
      this.u.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
      this.u = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(aqt $$0, ard $$1) {
      this.u.cancel(false);
      $$0.a(this.d, $$1);
   }

   protected void a(aqt $$0, Executor $$1) {
      ard $$2 = aqs.c(this.j);
      ard $$3 = aqs.c(this.k);
      boolean $$4 = $$2.a(ard.b);
      boolean $$5 = $$3.a(ard.b);
      this.t |= $$5;
      if (!$$4 && $$5) {
         this.g = $$0.c(this);
         this.a($$0, this.g, $$1, ard.b);
         this.b(this.g);
      }

      if ($$4 && !$$5) {
         this.g.complete(a);
         this.g = e;
      }

      boolean $$6 = $$2.a(ard.c);
      boolean $$7 = $$3.a(ard.c);
      if (!$$6 && $$7) {
         this.h = $$0.b(this);
         this.a($$0, this.h, $$1, ard.c);
         this.b(this.h);
      }

      if ($$6 && !$$7) {
         this.h.complete(a);
         this.h = e;
      }

      boolean $$8 = $$2.a(ard.d);
      boolean $$9 = $$3.a(ard.d);
      if (!$$8 && $$9) {
         if (this.i != e) {
            throw (IllegalStateException)ae.b(new IllegalStateException());
         }

         this.i = $$0.a(this);
         this.a($$0, this.i, $$1, ard.d);
         this.b(this.i);
      }

      if ($$8 && !$$9) {
         this.i.complete(a);
         this.i = e;
      }

      if (!$$3.a($$2)) {
         this.a($$0, $$3);
      }

      this.r.onLevelChange(this.d, this::j, this.k, this::b);
      this.j = this.k;
   }

   public boolean k() {
      return this.t;
   }

   public void l() {
      this.t = aqs.c(this.k).a(ard.b);
   }

   @FunctionalInterface
   public interface a {
      void onLevelChange(deh var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface b {
      List<aro> a(deh var1, boolean var2);
   }
}
