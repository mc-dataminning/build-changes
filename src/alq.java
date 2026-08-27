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

public class alq {
   public static final Either<djj, alq.a> a = Either.right(alq.a.b);
   public static final CompletableFuture<Either<djj, alq.a>> b = CompletableFuture.completedFuture(a);
   public static final Either<dju, alq.a> c = Either.right(alq.a.b);
   private static final Either<djj, alq.a> d = Either.right(alq.a.b);
   private static final CompletableFuture<Either<dju, alq.a>> e = CompletableFuture.completedFuture(c);
   private static final List<djo> f = djo.a();
   private final AtomicReferenceArray<CompletableFuture<Either<djj, alq.a>>> g = new AtomicReferenceArray<>(f.size());
   private final csh h;
   private volatile CompletableFuture<Either<dju, alq.a>> i = e;
   private volatile CompletableFuture<Either<dju, alq.a>> j = e;
   private volatile CompletableFuture<Either<dju, alq.a>> k = e;
   private CompletableFuture<djj> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final asu<alq.b> m = null;
   private int n;
   private int o;
   private int p;
   final crm q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final ecm v;
   private final alq.c w;
   private final alq.d x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public alq(crm $$0, int $$1, csh $$2, ecm $$3, alq.c $$4, alq.d $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = alr.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.al()];
   }

   public CompletableFuture<Either<djj, alq.a>> a(djo $$0) {
      CompletableFuture<Either<djj, alq.a>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<Either<djj, alq.a>> b(djo $$0) {
      return alr.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<Either<dju, alq.a>> a() {
      return this.j;
   }

   public CompletableFuture<Either<dju, alq.a>> b() {
      return this.k;
   }

   public CompletableFuture<Either<dju, alq.a>> c() {
      return this.i;
   }

   @Nullable
   public dju d() {
      CompletableFuture<Either<dju, alq.a>> $$0 = this.a();
      Either<dju, alq.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dju)$$1.left().orElse(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public dju f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public dju g() {
      CompletableFuture<Either<dju, alq.a>> $$0 = this.c();
      Either<dju, alq.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dju)$$1.left().orElse(null);
   }

   @Nullable
   public djo h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         djo $$1 = f.get($$0);
         CompletableFuture<Either<djj, alq.a>> $$2 = this.a($$1);
         if ($$2.getNow(a).left().isPresent()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public djj i() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         djo $$1 = f.get($$0);
         CompletableFuture<Either<djj, alq.a>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            Optional<djj> $$3 = $$2.getNow(a).left();
            if ($$3.isPresent()) {
               return $$3.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<djj> j() {
      return this.l;
   }

   public void a(hx $$0) {
      dju $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(iy.b($$0));
      }
   }

   public void a(cso $$0, int $$1) {
      Either<djj, alq.a> $$2 = this.b(djo.k).getNow(null);
      if ($$2 != null) {
         djj $$3 = (djj)$$2.left().orElse(null);
         if ($$3 != null) {
            $$3.a(true);
            dju $$4 = this.d();
            if ($$4 != null) {
               int $$5 = this.v.d();
               int $$6 = this.v.e();
               if ($$1 >= $$5 && $$1 <= $$6) {
                  int $$7 = $$1 - $$5;
                  if ($$0 == cso.a) {
                     this.u.set($$7);
                  } else {
                     this.t.set($$7);
                  }
               }
            }
         }
      }
   }

   public void a(dju $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         csf $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<amj> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               zu $$3 = new zu($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<amj> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     iy $$8 = iy.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        hx $$9 = $$8.g($$6.iterator().nextShort());
                        dhn $$10 = $$1.a_($$9);
                        this.a($$4, new yq($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        djv $$11 = $$0.b($$5);
                        aat $$12 = new aat($$8, $$6, $$11);
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

   private void a(List<amj> $$0, csf $$1, hx $$2, dhn $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<amj> $$0, csf $$1, hx $$2) {
      dfi $$3 = $$1.c_($$2);
      if ($$3 != null) {
         wo<?> $$4 = $$3.j();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<amj> $$0, wo<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.b($$1));
   }

   public CompletableFuture<Either<djj, alq.a>> a(djo $$0, als $$1) {
      int $$2 = $$0.c();
      CompletableFuture<Either<djj, alq.a>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         Either<djj, alq.a> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.right().isEmpty()) {
            return $$3;
         }
      }

      if (alr.a(this.o).b($$0)) {
         CompletableFuture<Either<djj, alq.a>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new alq.b(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends Either<? extends djj, alq.a>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new alq.b(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> (djj)$$1x.map($$0xx -> $$0xx, $$1xx -> $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public amb k() {
      return alr.b(this.o);
   }

   public crm l() {
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

   private void a(als $$0, CompletableFuture<Either<dju, alq.a>> $$1, Executor $$2, amb $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.ifLeft($$1xx -> $$4.complete(null)));
   }

   private void a(als $$0, amb $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(als $$0, Executor $$1) {
      djo $$2 = alr.a(this.n);
      djo $$3 = alr.a(this.o);
      boolean $$4 = alr.e(this.n);
      boolean $$5 = alr.e(this.o);
      amb $$6 = alr.b(this.n);
      amb $$7 = alr.b(this.o);
      if ($$4) {
         Either<djj, alq.a> $$8 = Either.right(new alq.a() {
            @Override
            public String toString() {
               return "Unloaded ticket level " + alq.this.q;
            }
         });

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<Either<djj, alq.a>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(amb.b);
      boolean $$12 = $$7.a(amb.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, amb.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(amb.c);
      boolean $$14 = $$7.a(amb.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, amb.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(amb.d);
      boolean $$16 = $$7.a(amb.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, amb.d);
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
      this.y = alr.b(this.o).a(amb.b);
   }

   public void a(djt $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<Either<djj, alq.a>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            Optional<djj> $$3 = $$2.getNow(a).left();
            if (!$$3.isEmpty() && $$3.get() instanceof dke) {
               this.g.set($$1, CompletableFuture.completedFuture(Either.left($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(Either.left($$0.C())), "replaceProto");
   }

   public List<Pair<djo, CompletableFuture<Either<djj, alq.a>>>> q() {
      List<Pair<djo, CompletableFuture<Either<djj, alq.a>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   public interface a {
      alq.a b = new alq.a() {
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
      void onLevelChange(crm var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface d {
      List<amj> a(crm var1, boolean var2);
   }
}
