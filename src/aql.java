import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;

public class aql {
   public static final aqo<dtx> a = aqo.a("Unloaded chunk");
   public static final CompletableFuture<aqo<dtx>> b = CompletableFuture.completedFuture(a);
   public static final aqo<duh> c = aqo.a("Unloaded level chunk");
   public static final aqo<dtx> d = aqo.a("Not done yet");
   private static final CompletableFuture<aqo<duh>> e = CompletableFuture.completedFuture(c);
   private static final List<duw> f = duw.a();
   private final AtomicReferenceArray<CompletableFuture<aqo<dtx>>> g = new AtomicReferenceArray<>(f.size());
   private final dbz h;
   private volatile CompletableFuture<aqo<duh>> i = e;
   private volatile CompletableFuture<aqo<duh>> j = e;
   private volatile CompletableFuture<aqo<duh>> k = e;
   private CompletableFuture<dtx> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final aya<aql.a> m = null;
   private int n;
   private int o;
   private int p;
   private final dbe q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final enj v;
   private final aql.b w;
   private final aql.c x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public aql(dbe $$0, int $$1, dbz $$2, enj $$3, aql.b $$4, aql.c $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = aqm.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.an()];
   }

   public CompletableFuture<aqo<dtx>> a(duw $$0) {
      CompletableFuture<aqo<dtx>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<aqo<dtx>> b(duw $$0) {
      return aqm.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<aqo<duh>> a() {
      return this.j;
   }

   public CompletableFuture<aqo<duh>> b() {
      return this.k;
   }

   public CompletableFuture<aqo<duh>> c() {
      return this.i;
   }

   @Nullable
   public duh d() {
      return this.a().getNow(c).b(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public duh f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public duw g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         duw $$1 = f.get($$0);
         CompletableFuture<aqo<dtx>> $$2 = this.a($$1);
         if ($$2.getNow(a).a()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dtx h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         duw $$1 = f.get($$0);
         CompletableFuture<aqo<dtx>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            dtx $$3 = $$2.getNow(a).b(null);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public CompletableFuture<dtx> i() {
      return this.l;
   }

   public void a(iz $$0) {
      duh $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(kb.b($$0));
      }
   }

   public void a(dcg $$0, int $$1) {
      dtx $$2 = this.b(duw.k).getNow(a).b(null);
      if ($$2 != null) {
         $$2.a(true);
         duh $$3 = this.d();
         if ($$3 != null) {
            int $$4 = this.v.d();
            int $$5 = this.v.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               int $$6 = $$1 - $$4;
               if ($$0 == dcg.a) {
                  this.u.set($$6);
               } else {
                  this.t.set($$6);
               }
            }
         }
      }
   }

   public void a(duh $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         dbx $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<arf> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               adw $$3 = new adw($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<arf> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     kb $$8 = kb.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        iz $$9 = $$8.g($$6.iterator().nextShort());
                        dsb $$10 = $$1.a_($$9);
                        this.a($$4, new acq($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dui $$11 = $$0.b($$5);
                        aex $$12 = new aex($$8, $$6, $$11);
                        this.a($$4, $$12);
                        $$12.a(($$2, $$3) -> this.a($$4, $$1, $$2, $$3));
                     }
                  }
               }
            }

            this.r = false;
         }
      }
   }

   private void a(List<arf> $$0, dbx $$1, iz $$2, dsb $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<arf> $$0, dbx $$1, iz $$2) {
      dpg $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zv<?> $$4 = $$3.au_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<arf> $$0, zv<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.b($$1));
   }

   public CompletableFuture<aqo<dtx>> a(duw $$0, aqn $$1) {
      int $$2 = $$0.c();
      CompletableFuture<aqo<dtx>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         aqo<dtx> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.a()) {
            return $$3;
         }
      }

      if (aqm.a(this.o).b($$0)) {
         CompletableFuture<aqo<dtx>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new aql.a(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends aqo<? extends dtx>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new aql.a(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> aqo.a($$1x, $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public aqx j() {
      return aqm.b(this.o);
   }

   public dbe k() {
      return this.q;
   }

   public int l() {
      return this.o;
   }

   public int m() {
      return this.p;
   }

   private void b(int $$0) {
      this.p = $$0;
   }

   public void a(int $$0) {
      this.o = $$0;
   }

   private void a(aqn $$0, CompletableFuture<aqo<duh>> $$1, Executor $$2, aqx $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(aqn $$0, aqx $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(aqn $$0, Executor $$1) {
      duw $$2 = aqm.a(this.n);
      duw $$3 = aqm.a(this.o);
      boolean $$4 = aqm.e(this.n);
      boolean $$5 = aqm.e(this.o);
      aqx $$6 = aqm.b(this.n);
      aqx $$7 = aqm.b(this.o);
      if ($$4) {
         aqo<dtx> $$8 = aqo.a(() -> "Unloaded ticket level " + this.q);

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<aqo<dtx>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(aqx.b);
      boolean $$12 = $$7.a(aqx.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, aqx.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(aqx.c);
      boolean $$14 = $$7.a(aqx.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, aqx.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(aqx.d);
      boolean $$16 = $$7.a(aqx.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, aqx.d);
         this.a(this.k, "entity ticking");
      }

      if ($$15 && !$$16) {
         this.k.complete(c);
         this.k = e;
      }

      if (!$$7.a($$6)) {
         this.a($$0, $$7);
      }

      this.w.onLevelChange(this.q, this::m, this.o, this::b);
      this.n = this.o;
   }

   public boolean n() {
      return this.y;
   }

   public void o() {
      this.y = aqm.b(this.o).a(aqx.b);
   }

   public void a(dug $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<aqo<dtx>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            dtx $$3 = $$2.getNow(a).b(null);
            if ($$3 instanceof dur) {
               this.g.set($$1, CompletableFuture.completedFuture(aqo.a($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(aqo.a($$0.C())), "replaceProto");
   }

   public List<Pair<duw, CompletableFuture<aqo<dtx>>>> p() {
      List<Pair<duw, CompletableFuture<aqo<dtx>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   static record a(Thread a, CompletableFuture<?> b, String c) {
   }

   @FunctionalInterface
   public interface b {
      void onLevelChange(dbe var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface c {
      List<arf> a(dbe var1, boolean var2);
   }
}
