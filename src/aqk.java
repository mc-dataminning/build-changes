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

public class aqk extends aqy {
   public static final aqn<dwg> a = aqn.a("Unloaded level chunk");
   private static final CompletableFuture<aqn<dwg>> e = CompletableFuture.completedFuture(a);
   private final ddu f;
   private volatile CompletableFuture<aqn<dwg>> g = e;
   private volatile CompletableFuture<aqn<dwg>> h = e;
   private volatile CompletableFuture<aqn<dwg>> i = e;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private final ShortSet[] n;
   private final BitSet o = new BitSet();
   private final BitSet p = new BitSet();
   private final epq q;
   private final aqk.a r;
   private final aqk.b s;
   private boolean t;
   private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

   public aqk(dcy $$0, int $$1, ddu $$2, epq $$3, aqk.a $$4, aqk.b $$5) {
      super($$0);
      this.f = $$2;
      this.q = $$3;
      this.r = $$4;
      this.s = $$5;
      this.j = aql.b + 1;
      this.k = this.j;
      this.l = this.j;
      this.a($$1);
      this.n = new ShortSet[$$2.ao()];
   }

   public CompletableFuture<aqn<dwg>> a() {
      return this.h;
   }

   public CompletableFuture<aqn<dwg>> b() {
      return this.i;
   }

   public CompletableFuture<aqn<dwg>> c() {
      return this.g;
   }

   @Nullable
   public dwg d() {
      return this.a().getNow(a).b(null);
   }

   @Nullable
   public dwg e() {
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
      dwg $$1 = this.d();
      if ($$1 == null) {
         return false;
      } else {
         boolean $$2 = this.m;
         int $$3 = this.f.e($$0.v());
         if (this.n[$$3] == null) {
            this.m = true;
            this.n[$$3] = new ShortOpenHashSet();
         }

         this.n[$$3].add(kg.b($$0));
         return !$$2;
      }
   }

   public boolean a(deb $$0, int $$1) {
      dvw $$2 = this.b(dwx.k);
      if ($$2 == null) {
         return false;
      } else {
         $$2.a(true);
         dwg $$3 = this.d();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.q.d();
            int $$5 = this.q.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               BitSet $$6 = $$0 == deb.a ? this.p : this.o;
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

   public void a(dwg $$0) {
      if (this.m || !this.p.isEmpty() || !this.o.isEmpty()) {
         dds $$1 = $$0.E();
         if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<arh> $$2 = this.s.a(this.d, true);
            if (!$$2.isEmpty()) {
               ado $$3 = new ado($$0.f(), this.q, this.p, this.o);
               this.a($$2, $$3);
            }

            this.p.clear();
            this.o.clear();
         }

         if (this.m) {
            List<arh> $$4 = this.s.a(this.d, false);

            for (int $$5 = 0; $$5 < this.n.length; $$5++) {
               ShortSet $$6 = this.n[$$5];
               if ($$6 != null) {
                  this.n[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.f.g($$5);
                     kg $$8 = kg.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        je $$9 = $$8.g($$6.iterator().nextShort());
                        dua $$10 = $$1.a_($$9);
                        this.a($$4, new aci($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dwh $$11 = $$0.b($$5);
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

   private void a(List<arh> $$0, dds $$1, je $$2, dua $$3) {
      if ($$3.x()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<arh> $$0, dds $$1, je $$2) {
      dre $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zk<?> $$4 = $$3.aA_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<arh> $$0, zk<?> $$1) {
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

   private void a(aqm $$0, CompletableFuture<aqn<dwg>> $$1, Executor $$2, aqw $$3) {
      this.u.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
      this.u = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(aqm $$0, aqw $$1) {
      this.u.cancel(false);
      $$0.a(this.d, $$1);
   }

   protected void a(aqm $$0, Executor $$1) {
      aqw $$2 = aql.c(this.j);
      aqw $$3 = aql.c(this.k);
      boolean $$4 = $$2.a(aqw.b);
      boolean $$5 = $$3.a(aqw.b);
      this.t |= $$5;
      if (!$$4 && $$5) {
         this.g = $$0.c(this);
         this.a($$0, this.g, $$1, aqw.b);
         this.b(this.g);
      }

      if ($$4 && !$$5) {
         this.g.complete(a);
         this.g = e;
      }

      boolean $$6 = $$2.a(aqw.c);
      boolean $$7 = $$3.a(aqw.c);
      if (!$$6 && $$7) {
         this.h = $$0.b(this);
         this.a($$0, this.h, $$1, aqw.c);
         this.b(this.h);
      }

      if ($$6 && !$$7) {
         this.h.complete(a);
         this.h = e;
      }

      boolean $$8 = $$2.a(aqw.d);
      boolean $$9 = $$3.a(aqw.d);
      if (!$$8 && $$9) {
         if (this.i != e) {
            throw (IllegalStateException)ad.b(new IllegalStateException());
         }

         this.i = $$0.a(this);
         this.a($$0, this.i, $$1, aqw.d);
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
      this.t = aql.c(this.k).a(aqw.b);
   }

   @FunctionalInterface
   public interface a {
      void onLevelChange(dcy var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface b {
      List<arh> a(dcy var1, boolean var2);
   }
}
