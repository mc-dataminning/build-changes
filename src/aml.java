import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;

public class aml {
   public static final Either<dlc, aml.a> a = Either.right(aml.a.b);
   public static final CompletableFuture<Either<dlc, aml.a>> b = CompletableFuture.completedFuture(a);
   public static final Either<dln, aml.a> c = Either.right(aml.a.b);
   private static final Either<dlc, aml.a> d = Either.right(aml.a.b);
   private static final CompletableFuture<Either<dln, aml.a>> e = CompletableFuture.completedFuture(c);
   private static final List<dlh> f = dlh.a();
   private final AtomicReferenceArray<CompletableFuture<Either<dlc, aml.a>>> g = new AtomicReferenceArray<>(f.size());
   private final ctq h;
   private volatile CompletableFuture<Either<dln, aml.a>> i = e;
   private volatile CompletableFuture<Either<dln, aml.a>> j = e;
   private volatile CompletableFuture<Either<dln, aml.a>> k = e;
   private CompletableFuture<dlc> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final atq<aml.b> m = null;
   private int n;
   private int o;
   private int p;
   final csv q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final eef v;
   private final aml.c w;
   private final aml.d x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public aml(csv $$0, int $$1, ctq $$2, eef $$3, aml.c $$4, aml.d $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = amm.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.am()];
   }

   public CompletableFuture<Either<dlc, aml.a>> a(dlh $$0) {
      CompletableFuture<Either<dlc, aml.a>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<Either<dlc, aml.a>> b(dlh $$0) {
      return amm.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<Either<dln, aml.a>> a() {
      return this.j;
   }

   public CompletableFuture<Either<dln, aml.a>> b() {
      return this.k;
   }

   public CompletableFuture<Either<dln, aml.a>> c() {
      return this.i;
   }

   @Nullable
   public dln d() {
      CompletableFuture<Either<dln, aml.a>> $$0 = this.a();
      Either<dln, aml.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dln)$$1.left().orElse(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public dln f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public dln g() {
      CompletableFuture<Either<dln, aml.a>> $$0 = this.c();
      Either<dln, aml.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dln)$$1.left().orElse(null);
   }

   @Nullable
   public dlh h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dlh $$1 = f.get($$0);
         CompletableFuture<Either<dlc, aml.a>> $$2 = this.a($$1);
         if ($$2.getNow(a).left().isPresent()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dlc i() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dlh $$1 = f.get($$0);
         CompletableFuture<Either<dlc, aml.a>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            Optional<dlc> $$3 = $$2.getNow(a).left();
            if ($$3.isPresent()) {
               return $$3.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<dlc> j() {
      return this.l;
   }

   public void a(hx $$0) {
      dln $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(iz.b($$0));
      }
   }

   public void a(ctx $$0, int $$1) {
      Either<dlc, aml.a> $$2 = this.b(dlh.k).getNow(null);
      if ($$2 != null) {
         dlc $$3 = (dlc)$$2.left().orElse(null);
         if ($$3 != null) {
            $$3.a(true);
            dln $$4 = this.d();
            if ($$4 != null) {
               int $$5 = this.v.d();
               int $$6 = this.v.e();
               if ($$1 >= $$5 && $$1 <= $$6) {
                  int $$7 = $$1 - $$5;
                  if ($$0 == ctx.a) {
                     this.u.set($$7);
                  } else {
                     this.t.set($$7);
                  }
               }
            }
         }
      }
   }

   public void a(dln $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         cto $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<ane> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               aan $$3 = new aan($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<ane> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     iz $$8 = iz.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        hx $$9 = $$8.g($$6.iterator().nextShort());
                        djg $$10 = $$1.a_($$9);
                        this.a($$4, new zj($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dlo $$11 = $$0.b($$5);
                        abn $$12 = new abn($$8, $$6, $$11);
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

   private void a(List<ane> $$0, cto $$1, hx $$2, djg $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<ane> $$0, cto $$1, hx $$2) {
      dgu $$3 = $$1.c_($$2);
      if ($$3 != null) {
         xf<?> $$4 = $$3.j();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<ane> $$0, xf<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.b($$1));
   }

   public CompletableFuture<Either<dlc, aml.a>> a(dlh $$0, amn $$1) {
      int $$2 = $$0.c();
      CompletableFuture<Either<dlc, aml.a>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         Either<dlc, aml.a> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.right().isEmpty()) {
            return $$3;
         }
      }

      if (amm.a(this.o).b($$0)) {
         CompletableFuture<Either<dlc, aml.a>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new aml.b(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends Either<? extends dlc, aml.a>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new aml.b(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> (dlc)$$1x.map($$0xx -> $$0xx, $$1xx -> $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public amw k() {
      return amm.b(this.o);
   }

   public csv l() {
      return this.q;
   }

   public int m() {
      return this.o;
   }

   public int n() {
      return this.p;
   }

   private void b(int $$0) {
      this.p = $$0;
   }

   public void a(int $$0) {
      this.o = $$0;
   }

   private void a(amn $$0, CompletableFuture<Either<dln, aml.a>> $$1, Executor $$2, amw $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.ifLeft($$1xx -> $$4.complete(null)));
   }

   private void a(amn $$0, amw $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(amn $$0, Executor $$1) {
      dlh $$2 = amm.a(this.n);
      dlh $$3 = amm.a(this.o);
      boolean $$4 = amm.e(this.n);
      boolean $$5 = amm.e(this.o);
      amw $$6 = amm.b(this.n);
      amw $$7 = amm.b(this.o);
      if ($$4) {
         Either<dlc, aml.a> $$8 = Either.right(new aml.a() {
            @Override
            public String toString() {
               return "Unloaded ticket level " + aml.this.q;
            }
         });

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<Either<dlc, aml.a>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(amw.b);
      boolean $$12 = $$7.a(amw.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, amw.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(amw.c);
      boolean $$14 = $$7.a(amw.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, amw.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(amw.d);
      boolean $$16 = $$7.a(amw.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, amw.d);
         this.a(this.k, "entity ticking");
      }

      if ($$15 && !$$16) {
         this.k.complete(c);
         this.k = e;
      }

      if (!$$7.a($$6)) {
         this.a($$0, $$7);
      }

      this.w.onLevelChange(this.q, this::n, this.o, this::b);
      this.n = this.o;
   }

   public boolean o() {
      return this.y;
   }

   public void p() {
      this.y = amm.b(this.o).a(amw.b);
   }

   public void a(dlm $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<Either<dlc, aml.a>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            Optional<dlc> $$3 = $$2.getNow(a).left();
            if (!$$3.isEmpty() && $$3.get() instanceof dlx) {
               this.g.set($$1, CompletableFuture.completedFuture(Either.left($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(Either.left($$0.C())), "replaceProto");
   }

   public List<Pair<dlh, CompletableFuture<Either<dlc, aml.a>>>> q() {
      List<Pair<dlh, CompletableFuture<Either<dlc, aml.a>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   public interface a {
      aml.a b = new aml.a() {
         @Override
         public String toString() {
            return "UNLOADED";
         }
      };
   }

   static final class b {
      private final Thread a;
      private final CompletableFuture<?> b;
      private final String c;

      b(Thread $$0, CompletableFuture<?> $$1, String $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface c {
      void onLevelChange(csv var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface d {
      List<ane> a(csv var1, boolean var2);
   }
}
