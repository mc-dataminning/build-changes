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

public class aqs extends arg {
   public static final aqv<dya> a = aqv.a("Unloaded level chunk");
   private static final CompletableFuture<aqv<dya>> e = CompletableFuture.completedFuture(a);
   private final dfo f;
   private volatile CompletableFuture<aqv<dya>> g = e;
   private volatile CompletableFuture<aqv<dya>> h = e;
   private volatile CompletableFuture<aqv<dya>> i = e;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private final ShortSet[] n;
   private final BitSet o = new BitSet();
   private final BitSet p = new BitSet();
   private final erk q;
   private final aqs.a r;
   private final aqs.b s;
   private boolean t;
   private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

   public aqs(des $$0, int $$1, dfo $$2, erk $$3, aqs.a $$4, aqs.b $$5) {
      super($$0);
      this.f = $$2;
      this.q = $$3;
      this.r = $$4;
      this.s = $$5;
      this.j = aqt.b + 1;
      this.k = this.j;
      this.l = this.j;
      this.a($$1);
      this.n = new ShortSet[$$2.am()];
   }

   public CompletableFuture<aqv<dya>> a() {
      return this.h;
   }

   public CompletableFuture<aqv<dya>> b() {
      return this.i;
   }

   public CompletableFuture<aqv<dya>> c() {
      return this.g;
   }

   @Nullable
   public dya d() {
      return this.a().getNow(a).b(null);
   }

   @Nullable
   public dya e() {
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
      dya $$1 = this.d();
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

   public boolean a(dfv $$0, int $$1) {
      dxq $$2 = this.b(dyr.k);
      if ($$2 == null) {
         return false;
      } else {
         $$2.a(true);
         dya $$3 = this.d();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.q.d();
            int $$5 = this.q.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               BitSet $$6 = $$0 == dfv.a ? this.p : this.o;
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

   public void a(dya $$0) {
      if (this.m || !this.p.isEmpty() || !this.o.isEmpty()) {
         dfm $$1 = $$0.E();
         if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<arq> $$2 = this.s.a(this.d, true);
            if (!$$2.isEmpty()) {
               adu $$3 = new adu($$0.f(), this.q, this.p, this.o);
               this.a($$2, $$3);
            }

            this.p.clear();
            this.o.clear();
         }

         if (this.m) {
            List<arq> $$4 = this.s.a(this.d, false);

            for (int $$5 = 0; $$5 < this.n.length; $$5++) {
               ShortSet $$6 = this.n[$$5];
               if ($$6 != null) {
                  this.n[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.f.h($$5);
                     kj $$8 = kj.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        jh $$9 = $$8.g($$6.iterator().nextShort());
                        dvv $$10 = $$1.a_($$9);
                        this.a($$4, new aco($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dyb $$11 = $$0.b($$5);
                        aew $$12 = new aew($$8, $$6, $$11);
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

   private void a(List<arq> $$0, dfm $$1, jh $$2, dvv $$3) {
      if ($$3.x()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<arq> $$0, dfm $$1, jh $$2) {
      dsy $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zq<?> $$4 = $$3.ax_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<arq> $$0, zq<?> $$1) {
      $$0.forEach($$1x -> $$1x.f.b($$1));
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

   private void a(aqu $$0, CompletableFuture<aqv<dya>> $$1, Executor $$2, are $$3) {
      this.u.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
      this.u = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(aqu $$0, are $$1) {
      this.u.cancel(false);
      $$0.a(this.d, $$1);
   }

   protected void a(aqu $$0, Executor $$1) {
      are $$2 = aqt.c(this.j);
      are $$3 = aqt.c(this.k);
      boolean $$4 = $$2.a(are.b);
      boolean $$5 = $$3.a(are.b);
      this.t |= $$5;
      if (!$$4 && $$5) {
         this.g = $$0.c(this);
         this.a($$0, this.g, $$1, are.b);
         this.b(this.g);
      }

      if ($$4 && !$$5) {
         this.g.complete(a);
         this.g = e;
      }

      boolean $$6 = $$2.a(are.c);
      boolean $$7 = $$3.a(are.c);
      if (!$$6 && $$7) {
         this.h = $$0.b(this);
         this.a($$0, this.h, $$1, are.c);
         this.b(this.h);
      }

      if ($$6 && !$$7) {
         this.h.complete(a);
         this.h = e;
      }

      boolean $$8 = $$2.a(are.d);
      boolean $$9 = $$3.a(are.d);
      if (!$$8 && $$9) {
         if (this.i != e) {
            throw (IllegalStateException)ae.b(new IllegalStateException());
         }

         this.i = $$0.a(this);
         this.a($$0, this.i, $$1, are.d);
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
      this.t = aqt.c(this.k).a(are.b);
   }

   @FunctionalInterface
   public interface a {
      void onLevelChange(des var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface b {
      List<arq> a(des var1, boolean var2);
   }
}
