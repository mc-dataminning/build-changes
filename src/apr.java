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

public class apr extends aqf {
   public static final apu<dur> a = apu.a("Unloaded level chunk");
   private static final CompletableFuture<apu<dur>> e = CompletableFuture.completedFuture(a);
   private final dci f;
   private volatile CompletableFuture<apu<dur>> g = e;
   private volatile CompletableFuture<apu<dur>> h = e;
   private volatile CompletableFuture<apu<dur>> i = e;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private final ShortSet[] n;
   private final BitSet o = new BitSet();
   private final BitSet p = new BitSet();
   private final eny q;
   private final apr.a r;
   private final apr.b s;
   private boolean t;
   private CompletableFuture<?> u = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> v = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> w = CompletableFuture.completedFuture(null);

   public apr(dbn $$0, int $$1, dci $$2, eny $$3, apr.a $$4, apr.b $$5) {
      super($$0);
      this.f = $$2;
      this.q = $$3;
      this.r = $$4;
      this.s = $$5;
      this.j = aps.b + 1;
      this.k = this.j;
      this.l = this.j;
      this.a($$1);
      this.n = new ShortSet[$$2.an()];
   }

   public CompletableFuture<apu<dur>> a() {
      return this.h;
   }

   public CompletableFuture<apu<dur>> b() {
      return this.i;
   }

   public CompletableFuture<apu<dur>> c() {
      return this.g;
   }

   @Nullable
   public dur d() {
      return this.a().getNow(a).b(null);
   }

   @Nullable
   public dur e() {
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

   public void a(ja $$0) {
      dur $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.f.e($$0.v());
         if (this.n[$$2] == null) {
            this.m = true;
            this.n[$$2] = new ShortOpenHashSet();
         }

         this.n[$$2].add(kc.b($$0));
      }
   }

   public void a(dcp $$0, int $$1) {
      duh $$2 = this.b(dvi.k);
      if ($$2 != null) {
         $$2.a(true);
         dur $$3 = this.d();
         if ($$3 != null) {
            int $$4 = this.q.d();
            int $$5 = this.q.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               int $$6 = $$1 - $$4;
               if ($$0 == dcp.a) {
                  this.p.set($$6);
               } else {
                  this.o.set($$6);
               }
            }
         }
      }
   }

   public void a(dur $$0) {
      if (this.m || !this.p.isEmpty() || !this.o.isEmpty()) {
         dcg $$1 = $$0.F();
         if (!this.p.isEmpty() || !this.o.isEmpty()) {
            List<aqn> $$2 = this.s.a(this.d, true);
            if (!$$2.isEmpty()) {
               adc $$3 = new adc($$0.f(), this.q, this.p, this.o);
               this.a($$2, $$3);
            }

            this.p.clear();
            this.o.clear();
         }

         if (this.m) {
            List<aqn> $$4 = this.s.a(this.d, false);

            for (int $$5 = 0; $$5 < this.n.length; $$5++) {
               ShortSet $$6 = this.n[$$5];
               if ($$6 != null) {
                  this.n[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.f.g($$5);
                     kc $$8 = kc.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        ja $$9 = $$8.g($$6.iterator().nextShort());
                        dsl $$10 = $$1.a_($$9);
                        this.a($$4, new abw($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dus $$11 = $$0.b($$5);
                        aed $$12 = new aed($$8, $$6, $$11);
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

   private void a(List<aqn> $$0, dcg $$1, ja $$2, dsl $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<aqn> $$0, dcg $$1, ja $$2) {
      dpq $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zb<?> $$4 = $$3.av_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<aqn> $$0, zb<?> $$1) {
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

   private void a(apt $$0, CompletableFuture<apu<dur>> $$1, Executor $$2, aqd $$3) {
      this.u.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.d, $$3), $$2);
      this.u = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(apt $$0, aqd $$1) {
      this.u.cancel(false);
      $$0.a(this.d, $$1);
   }

   protected void a(apt $$0, Executor $$1) {
      aqd $$2 = aps.c(this.j);
      aqd $$3 = aps.c(this.k);
      boolean $$4 = $$2.a(aqd.b);
      boolean $$5 = $$3.a(aqd.b);
      this.t |= $$5;
      if (!$$4 && $$5) {
         this.g = $$0.c(this);
         this.a($$0, this.g, $$1, aqd.b);
         this.b(this.g);
      }

      if ($$4 && !$$5) {
         this.g.complete(a);
         this.g = e;
      }

      boolean $$6 = $$2.a(aqd.c);
      boolean $$7 = $$3.a(aqd.c);
      if (!$$6 && $$7) {
         this.h = $$0.b(this);
         this.a($$0, this.h, $$1, aqd.c);
         this.b(this.h);
      }

      if ($$6 && !$$7) {
         this.h.complete(a);
         this.h = e;
      }

      boolean $$8 = $$2.a(aqd.d);
      boolean $$9 = $$3.a(aqd.d);
      if (!$$8 && $$9) {
         if (this.i != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.i = $$0.a(this);
         this.a($$0, this.i, $$1, aqd.d);
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
      this.t = aps.c(this.k).a(aqd.b);
   }

   @FunctionalInterface
   public interface a {
      void onLevelChange(dbn var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface b {
      List<aqn> a(dbn var1, boolean var2);
   }
}
