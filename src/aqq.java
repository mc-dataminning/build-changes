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

public class aqq extends are {
   public static final aqt<ebv> a = aqt.a("Unloaded level chunk");
   private static final CompletableFuture<aqt<ebv>> e = CompletableFuture.completedFuture(a);
   private final dir f;
   private volatile CompletableFuture<aqt<ebv>> g = e;
   private volatile CompletableFuture<aqt<ebv>> h = e;
   private volatile CompletableFuture<aqt<ebv>> i = e;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private final ShortSet[] n;
   private final BitSet o = new BitSet();
   private final BitSet p = new BitSet();
   private final evk q;
   private final aqq.a r;
   private final aqq.b s;
   private boolean t;
   private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

   public aqq(dhw $$0, int $$1, dir $$2, evk $$3, aqq.a $$4, aqq.b $$5) {
      super($$0);
      this.f = $$2;
      this.q = $$3;
      this.r = $$4;
      this.s = $$5;
      this.j = aqr.b + 1;
      this.k = this.j;
      this.l = this.j;
      this.a($$1);
      this.n = new ShortSet[$$2.ap()];
   }

   public CompletableFuture<aqt<ebv>> a() {
      return this.h;
   }

   public CompletableFuture<aqt<ebv>> b() {
      return this.i;
   }

   public CompletableFuture<aqt<ebv>> c() {
      return this.g;
   }

   @Nullable
   public ebv d() {
      return this.a().getNow(a).b(null);
   }

   @Nullable
   public ebv e() {
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

   public boolean a(iu $$0) {
      ebv $$1 = this.d();
      if ($$1 == null) {
         return false;
      } else {
         boolean $$2 = this.m;
         int $$3 = this.f.f($$0.v());
         if (this.n[$$3] == null) {
            this.m = true;
            this.n[$$3] = new ShortOpenHashSet();
         }

         this.n[$$3].add(jx.b($$0));
         return !$$2;
      }
   }

   public boolean a(diy $$0, int $$1) {
      ebl $$2 = this.b(ecm.k);
      if ($$2 == null) {
         return false;
      } else {
         $$2.i();
         ebv $$3 = this.d();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.q.d();
            int $$5 = this.q.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               BitSet $$6 = $$0 == diy.a ? this.p : this.o;
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

   public boolean i() {
      return this.m || !this.p.isEmpty() || !this.o.isEmpty();
   }

   public void a(ebv $$0) {
      if (this.i()) {
         dip $$1 = $$0.H();
         if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<arp> $$2 = this.s.a(this.d, true);
            if (!$$2.isEmpty()) {
               adh $$3 = new adh($$0.f(), this.q, this.p, this.o);
               this.a($$2, $$3);
            }

            this.p.clear();
            this.o.clear();
         }

         if (this.m) {
            List<arp> $$4 = this.s.a(this.d, false);

            for (int $$5 = 0; $$5 < this.n.length; $$5++) {
               ShortSet $$6 = this.n[$$5];
               if ($$6 != null) {
                  this.n[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.f.h($$5);
                     jx $$8 = jx.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        iu $$9 = $$8.g($$6.iterator().nextShort());
                        dzo $$10 = $$1.a_($$9);
                        this.a($$4, new aca($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        ebw $$11 = $$0.b($$5);
                        aem $$12 = new aem($$8, $$6, $$11);
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

   private void a(List<arp> $$0, dip $$1, iu $$2, dzo $$3) {
      if ($$3.x()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<arp> $$0, dip $$1, iu $$2) {
      dwn $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zd<?> $$4 = $$3.at_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<arp> $$0, zd<?> $$1) {
      $$0.forEach($$1x -> $$1x.f.b($$1));
   }

   @Override
   public int j() {
      return this.k;
   }

   @Override
   public int k() {
      return this.l;
   }

   private void b(int $$0) {
      this.l = $$0;
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   private void a(aqs $$0, CompletableFuture<aqt<ebv>> $$1, Executor $$2, arc $$3) {
      this.u.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
      this.u = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(aqs $$0, arc $$1) {
      this.u.cancel(false);
      $$0.a(this.d, $$1);
   }

   protected void a(aqs $$0, Executor $$1) {
      arc $$2 = aqr.c(this.j);
      arc $$3 = aqr.c(this.k);
      boolean $$4 = $$2.a(arc.b);
      boolean $$5 = $$3.a(arc.b);
      this.t |= $$5;
      if (!$$4 && $$5) {
         this.g = $$0.c(this);
         this.a($$0, this.g, $$1, arc.b);
         this.b(this.g);
      }

      if ($$4 && !$$5) {
         this.g.complete(a);
         this.g = e;
      }

      boolean $$6 = $$2.a(arc.c);
      boolean $$7 = $$3.a(arc.c);
      if (!$$6 && $$7) {
         this.h = $$0.b(this);
         this.a($$0, this.h, $$1, arc.c);
         this.b(this.h);
      }

      if ($$6 && !$$7) {
         this.h.complete(a);
         this.h = e;
      }

      boolean $$8 = $$2.a(arc.d);
      boolean $$9 = $$3.a(arc.d);
      if (!$$8 && $$9) {
         if (this.i != e) {
            throw (IllegalStateException)af.b(new IllegalStateException());
         }

         this.i = $$0.a(this);
         this.a($$0, this.i, $$1, arc.d);
         this.b(this.i);
      }

      if ($$8 && !$$9) {
         this.i.complete(a);
         this.i = e;
      }

      if (!$$3.a($$2)) {
         this.a($$0, $$3);
      }

      this.r.onLevelChange(this.d, this::k, this.k, this::b);
      this.j = this.k;
   }

   public boolean l() {
      return this.t;
   }

   public void m() {
      this.t = aqr.c(this.k).a(arc.b);
   }

   @FunctionalInterface
   public interface a {
      void onLevelChange(dhw var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface b {
      List<arp> a(dhw var1, boolean var2);
   }
}
