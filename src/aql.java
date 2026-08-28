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

public class aql extends aqz {
   public static final aqo<dwu> a = aqo.a("Unloaded level chunk");
   private static final CompletableFuture<aqo<dwu>> e = CompletableFuture.completedFuture(a);
   private final dei f;
   private volatile CompletableFuture<aqo<dwu>> g = e;
   private volatile CompletableFuture<aqo<dwu>> h = e;
   private volatile CompletableFuture<aqo<dwu>> i = e;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private final ShortSet[] n;
   private final BitSet o = new BitSet();
   private final BitSet p = new BitSet();
   private final eqe q;
   private final aql.a r;
   private final aql.b s;
   private boolean t;
   private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

   public aql(ddm $$0, int $$1, dei $$2, eqe $$3, aql.a $$4, aql.b $$5) {
      super($$0);
      this.f = $$2;
      this.q = $$3;
      this.r = $$4;
      this.s = $$5;
      this.j = aqm.b + 1;
      this.k = this.j;
      this.l = this.j;
      this.a($$1);
      this.n = new ShortSet[$$2.ao()];
   }

   public CompletableFuture<aqo<dwu>> a() {
      return this.h;
   }

   public CompletableFuture<aqo<dwu>> b() {
      return this.i;
   }

   public CompletableFuture<aqo<dwu>> c() {
      return this.g;
   }

   @Nullable
   public dwu d() {
      return this.a().getNow(a).b(null);
   }

   @Nullable
   public dwu e() {
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
      return this.o() == 0 && this.w.isDone();
   }

   private void b(CompletableFuture<?> $$0) {
      if (this.w.isDone()) {
         this.w = $$0;
      } else {
         this.w = this.w.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public boolean a(je $$0) {
      dwu $$1 = this.d();
      if ($$1 == null) {
         return false;
      } else {
         boolean $$2 = this.m;
         int $$3 = this.f.f($$0.v());
         if (this.n[$$3] == null) {
            this.m = true;
            this.n[$$3] = new ShortOpenHashSet();
         }

         this.n[$$3].add(kg.b($$0));
         return !$$2;
      }
   }

   public boolean a(dep $$0, int $$1) {
      dwk $$2 = this.b(dxl.k);
      if ($$2 == null) {
         return false;
      } else {
         $$2.a(true);
         dwu $$3 = this.d();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.q.d();
            int $$5 = this.q.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               BitSet $$6 = $$0 == dep.a ? this.p : this.o;
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

   public void a(dwu $$0) {
      if (this.m || !this.p.isEmpty() || !this.o.isEmpty()) {
         deg $$1 = $$0.E();
         if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<ari> $$2 = this.s.a(this.d, true);
            if (!$$2.isEmpty()) {
               ado $$3 = new ado($$0.f(), this.q, this.p, this.o);
               this.a($$2, $$3);
            }

            this.p.clear();
            this.o.clear();
         }

         if (this.m) {
            List<ari> $$4 = this.s.a(this.d, false);

            for (int $$5 = 0; $$5 < this.n.length; $$5++) {
               ShortSet $$6 = this.n[$$5];
               if ($$6 != null) {
                  this.n[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.f.h($$5);
                     kg $$8 = kg.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        je $$9 = $$8.g($$6.iterator().nextShort());
                        duo $$10 = $$1.a_($$9);
                        this.a($$4, new aci($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dwv $$11 = $$0.b($$5);
                        aeq $$12 = new aeq($$8, $$6, $$11);
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

   private void a(List<ari> $$0, deg $$1, je $$2, duo $$3) {
      if ($$3.x()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<ari> $$0, deg $$1, je $$2) {
      drs $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zk<?> $$4 = $$3.ay_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<ari> $$0, zk<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.b($$1));
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

   private void a(aqn $$0, CompletableFuture<aqo<dwu>> $$1, Executor $$2, aqx $$3) {
      this.u.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
      this.u = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(aqn $$0, aqx $$1) {
      this.u.cancel(false);
      $$0.a(this.d, $$1);
   }

   protected void a(aqn $$0, Executor $$1) {
      aqx $$2 = aqm.c(this.j);
      aqx $$3 = aqm.c(this.k);
      boolean $$4 = $$2.a(aqx.b);
      boolean $$5 = $$3.a(aqx.b);
      this.t |= $$5;
      if (!$$4 && $$5) {
         this.g = $$0.c(this);
         this.a($$0, this.g, $$1, aqx.b);
         this.b(this.g);
      }

      if ($$4 && !$$5) {
         this.g.complete(a);
         this.g = e;
      }

      boolean $$6 = $$2.a(aqx.c);
      boolean $$7 = $$3.a(aqx.c);
      if (!$$6 && $$7) {
         this.h = $$0.b(this);
         this.a($$0, this.h, $$1, aqx.c);
         this.b(this.h);
      }

      if ($$6 && !$$7) {
         this.h.complete(a);
         this.h = e;
      }

      boolean $$8 = $$2.a(aqx.d);
      boolean $$9 = $$3.a(aqx.d);
      if (!$$8 && $$9) {
         if (this.i != e) {
            throw (IllegalStateException)ad.b(new IllegalStateException());
         }

         this.i = $$0.a(this);
         this.a($$0, this.i, $$1, aqx.d);
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
      this.t = aqm.c(this.k).a(aqx.b);
   }

   @FunctionalInterface
   public interface a {
      void onLevelChange(ddm var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface b {
      List<ari> a(ddm var1, boolean var2);
   }
}
