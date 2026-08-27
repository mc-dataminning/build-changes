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

public class aoi {
   public static final Either<doa, aoi.a> a = Either.right(aoi.a.b);
   public static final CompletableFuture<Either<doa, aoi.a>> b = CompletableFuture.completedFuture(a);
   public static final Either<dol, aoi.a> c = Either.right(aoi.a.b);
   private static final Either<doa, aoi.a> d = Either.right(aoi.a.b);
   private static final CompletableFuture<Either<dol, aoi.a>> e = CompletableFuture.completedFuture(c);
   private static final List<dof> f = dof.a();
   private final AtomicReferenceArray<CompletableFuture<Either<doa, aoi.a>>> g = new AtomicReferenceArray<>(f.size());
   private final cwg h;
   private volatile CompletableFuture<Either<dol, aoi.a>> i = e;
   private volatile CompletableFuture<Either<dol, aoi.a>> j = e;
   private volatile CompletableFuture<Either<dol, aoi.a>> k = e;
   private CompletableFuture<doa> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final avp<aoi.b> m = null;
   private int n;
   private int o;
   private int p;
   final cvl q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final ehg v;
   private final aoi.c w;
   private final aoi.d x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public aoi(cvl $$0, int $$1, cwg $$2, ehg $$3, aoi.c $$4, aoi.d $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = aoj.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.al()];
   }

   public CompletableFuture<Either<doa, aoi.a>> a(dof $$0) {
      CompletableFuture<Either<doa, aoi.a>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<Either<doa, aoi.a>> b(dof $$0) {
      return aoj.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<Either<dol, aoi.a>> a() {
      return this.j;
   }

   public CompletableFuture<Either<dol, aoi.a>> b() {
      return this.k;
   }

   public CompletableFuture<Either<dol, aoi.a>> c() {
      return this.i;
   }

   @Nullable
   public dol d() {
      CompletableFuture<Either<dol, aoi.a>> $$0 = this.a();
      Either<dol, aoi.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dol)$$1.left().orElse(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public dol f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public dol g() {
      CompletableFuture<Either<dol, aoi.a>> $$0 = this.c();
      Either<dol, aoi.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dol)$$1.left().orElse(null);
   }

   @Nullable
   public dof h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dof $$1 = f.get($$0);
         CompletableFuture<Either<doa, aoi.a>> $$2 = this.a($$1);
         if ($$2.getNow(a).left().isPresent()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public doa i() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dof $$1 = f.get($$0);
         CompletableFuture<Either<doa, aoi.a>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            Optional<doa> $$3 = $$2.getNow(a).left();
            if ($$3.isPresent()) {
               return $$3.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<doa> j() {
      return this.l;
   }

   public void a(ib $$0) {
      dol $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(jd.b($$0));
      }
   }

   public void a(cwn $$0, int $$1) {
      Either<doa, aoi.a> $$2 = this.b(dof.k).getNow(null);
      if ($$2 != null) {
         doa $$3 = (doa)$$2.left().orElse(null);
         if ($$3 != null) {
            $$3.a(true);
            dol $$4 = this.d();
            if ($$4 != null) {
               int $$5 = this.v.d();
               int $$6 = this.v.e();
               if ($$1 >= $$5 && $$1 <= $$6) {
                  int $$7 = $$1 - $$5;
                  if ($$0 == cwn.a) {
                     this.u.set($$7);
                  } else {
                     this.t.set($$7);
                  }
               }
            }
         }
      }
   }

   public void a(dol $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         cwe $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<apb> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               abx $$3 = new abx($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<apb> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     jd $$8 = jd.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        ib $$9 = $$8.g($$6.iterator().nextShort());
                        dme $$10 = $$1.a_($$9);
                        this.a($$4, new aar($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dom $$11 = $$0.b($$5);
                        acx $$12 = new acx($$8, $$6, $$11);
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

   private void a(List<apb> $$0, cwe $$1, ib $$2, dme $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<apb> $$0, cwe $$1, ib $$2) {
      djl $$3 = $$1.c_($$2);
      if ($$3 != null) {
         xz<?> $$4 = $$3.az_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<apb> $$0, xz<?> $$1) {
      $$0.forEach($$1x -> $$1x.d.b($$1));
   }

   public CompletableFuture<Either<doa, aoi.a>> a(dof $$0, aok $$1) {
      int $$2 = $$0.c();
      CompletableFuture<Either<doa, aoi.a>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         Either<doa, aoi.a> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.right().isEmpty()) {
            return $$3;
         }
      }

      if (aoj.a(this.o).b($$0)) {
         CompletableFuture<Either<doa, aoi.a>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new aoi.b(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends Either<? extends doa, aoi.a>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new aoi.b(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> (doa)$$1x.map($$0xx -> $$0xx, $$1xx -> $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public aot k() {
      return aoj.b(this.o);
   }

   public cvl l() {
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

   private void a(aok $$0, CompletableFuture<Either<dol, aoi.a>> $$1, Executor $$2, aot $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.ifLeft($$1xx -> $$4.complete(null)));
   }

   private void a(aok $$0, aot $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(aok $$0, Executor $$1) {
      dof $$2 = aoj.a(this.n);
      dof $$3 = aoj.a(this.o);
      boolean $$4 = aoj.e(this.n);
      boolean $$5 = aoj.e(this.o);
      aot $$6 = aoj.b(this.n);
      aot $$7 = aoj.b(this.o);
      if ($$4) {
         Either<doa, aoi.a> $$8 = Either.right(new aoi.a() {
            @Override
            public String toString() {
               return "Unloaded ticket level " + aoi.this.q;
            }
         });

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<Either<doa, aoi.a>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(aot.b);
      boolean $$12 = $$7.a(aot.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, aot.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(aot.c);
      boolean $$14 = $$7.a(aot.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, aot.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(aot.d);
      boolean $$16 = $$7.a(aot.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, aot.d);
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
      this.y = aoj.b(this.o).a(aot.b);
   }

   public void a(dok $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<Either<doa, aoi.a>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            Optional<doa> $$3 = $$2.getNow(a).left();
            if (!$$3.isEmpty() && $$3.get() instanceof dov) {
               this.g.set($$1, CompletableFuture.completedFuture(Either.left($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(Either.left($$0.C())), "replaceProto");
   }

   public List<Pair<dof, CompletableFuture<Either<doa, aoi.a>>>> q() {
      List<Pair<dof, CompletableFuture<Either<doa, aoi.a>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   public interface a {
      aoi.a b = new aoi.a() {
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
      void onLevelChange(cvl var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface d {
      List<apb> a(cvl var1, boolean var2);
   }
}
