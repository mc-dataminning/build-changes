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

public class ajr {
   public static final Either<dgu, ajr.a> a = Either.right(ajr.a.b);
   public static final CompletableFuture<Either<dgu, ajr.a>> b = CompletableFuture.completedFuture(a);
   public static final Either<dhf, ajr.a> c = Either.right(ajr.a.b);
   private static final Either<dgu, ajr.a> d = Either.right(ajr.a.b);
   private static final CompletableFuture<Either<dhf, ajr.a>> e = CompletableFuture.completedFuture(c);
   private static final List<dgz> f = dgz.a();
   private final AtomicReferenceArray<CompletableFuture<Either<dgu, ajr.a>>> g = new AtomicReferenceArray<>(f.size());
   private final cpm h;
   private volatile CompletableFuture<Either<dhf, ajr.a>> i = e;
   private volatile CompletableFuture<Either<dhf, ajr.a>> j = e;
   private volatile CompletableFuture<Either<dhf, ajr.a>> k = e;
   private CompletableFuture<dgu> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final aqs<ajr.b> m = null;
   private int n;
   private int o;
   private int p;
   final cor q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final dzq v;
   private final ajr.c w;
   private final ajr.d x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);

   public ajr(cor $$0, int $$1, cpm $$2, dzq $$3, ajr.c $$4, ajr.d $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = ajs.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.ak()];
   }

   public CompletableFuture<Either<dgu, ajr.a>> a(dgz $$0) {
      CompletableFuture<Either<dgu, ajr.a>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<Either<dgu, ajr.a>> b(dgz $$0) {
      return ajs.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<Either<dhf, ajr.a>> a() {
      return this.j;
   }

   public CompletableFuture<Either<dhf, ajr.a>> b() {
      return this.k;
   }

   public CompletableFuture<Either<dhf, ajr.a>> c() {
      return this.i;
   }

   @Nullable
   public dhf d() {
      CompletableFuture<Either<dhf, ajr.a>> $$0 = this.a();
      Either<dhf, ajr.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dhf)$$1.left().orElse(null);
   }

   @Nullable
   public dhf e() {
      CompletableFuture<Either<dhf, ajr.a>> $$0 = this.c();
      Either<dhf, ajr.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dhf)$$1.left().orElse(null);
   }

   @Nullable
   public dgz f() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dgz $$1 = f.get($$0);
         CompletableFuture<Either<dgu, ajr.a>> $$2 = this.a($$1);
         if ($$2.getNow(a).left().isPresent()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dgu g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dgz $$1 = f.get($$0);
         CompletableFuture<Either<dgu, ajr.a>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            Optional<dgu> $$3 = $$2.getNow(a).left();
            if ($$3.isPresent()) {
               return $$3.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<dgu> h() {
      return this.l;
   }

   public void a(gv $$0) {
      dhf $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(hy.b($$0));
      }
   }

   public void a(cpt $$0, int $$1) {
      Either<dgu, ajr.a> $$2 = this.b(dgz.k).getNow(null);
      if ($$2 != null) {
         dgu $$3 = (dgu)$$2.left().orElse(null);
         if ($$3 != null) {
            $$3.a(true);
            dhf $$4 = this.d();
            if ($$4 != null) {
               int $$5 = this.v.d();
               int $$6 = this.v.e();
               if ($$1 >= $$5 && $$1 <= $$6) {
                  int $$7 = $$1 - $$5;
                  if ($$0 == cpt.a) {
                     this.u.set($$7);
                  } else {
                     this.t.set($$7);
                  }
               }
            }
         }
      }
   }

   public void a(dhf $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         cpk $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<akj> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               yc $$3 = new yc($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<akj> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     hy $$8 = hy.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        gv $$9 = $$8.g($$6.iterator().nextShort());
                        dey $$10 = $$1.a_($$9);
                        this.a($$4, new wy($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dhg $$11 = $$0.b($$5);
                        zb $$12 = new zb($$8, $$6, $$11);
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

   private void a(List<akj> $$0, cpk $$1, gv $$2, dey $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<akj> $$0, cpk $$1, gv $$2) {
      dck $$3 = $$1.c_($$2);
      if ($$3 != null) {
         uw<?> $$4 = $$3.h();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<akj> $$0, uw<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.b($$1));
   }

   public CompletableFuture<Either<dgu, ajr.a>> a(dgz $$0, ajt $$1) {
      int $$2 = $$0.c();
      CompletableFuture<Either<dgu, ajr.a>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         Either<dgu, ajr.a> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.right().isEmpty()) {
            return $$3;
         }
      }

      if (ajs.a(this.o).b($$0)) {
         CompletableFuture<Either<dgu, ajr.a>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new ajr.b(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends Either<? extends dgu, ajr.a>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new ajr.b(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> (dgu)$$1x.map($$0xx -> $$0xx, $$1xx -> $$0x));
   }

   public akb i() {
      return ajs.b(this.o);
   }

   public cor j() {
      return this.q;
   }

   public int k() {
      return this.o;
   }

   public int l() {
      return this.p;
   }

   private void b(int $$0) {
      this.p = $$0;
   }

   public void a(int $$0) {
      this.o = $$0;
   }

   private void a(ajt $$0, CompletableFuture<Either<dhf, ajr.a>> $$1, Executor $$2, akb $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.ifLeft($$1xx -> $$4.complete(null)));
   }

   private void a(ajt $$0, akb $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(ajt $$0, Executor $$1) {
      dgz $$2 = ajs.a(this.n);
      dgz $$3 = ajs.a(this.o);
      boolean $$4 = ajs.e(this.n);
      boolean $$5 = ajs.e(this.o);
      akb $$6 = ajs.b(this.n);
      akb $$7 = ajs.b(this.o);
      if ($$4) {
         Either<dgu, ajr.a> $$8 = Either.right(new ajr.a() {
            @Override
            public String toString() {
               return "Unloaded ticket level " + ajr.this.q;
            }
         });

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<Either<dgu, ajr.a>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(akb.b);
      boolean $$12 = $$7.a(akb.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, akb.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(akb.c);
      boolean $$14 = $$7.a(akb.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, akb.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(akb.d);
      boolean $$16 = $$7.a(akb.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, akb.d);
         this.a(this.k, "entity ticking");
      }

      if ($$15 && !$$16) {
         this.k.complete(c);
         this.k = e;
      }

      if (!$$7.a($$6)) {
         this.a($$0, $$7);
      }

      this.w.onLevelChange(this.q, this::l, this.o, this::b);
      this.n = this.o;
   }

   public boolean m() {
      return this.y;
   }

   public void n() {
      this.y = ajs.b(this.o).a(akb.b);
   }

   public void a(dhe $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<Either<dgu, ajr.a>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            Optional<dgu> $$3 = $$2.getNow(a).left();
            if (!$$3.isEmpty() && $$3.get() instanceof dhp) {
               this.g.set($$1, CompletableFuture.completedFuture(Either.left($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(Either.left($$0.C())), "replaceProto");
   }

   public List<Pair<dgz, CompletableFuture<Either<dgu, ajr.a>>>> o() {
      List<Pair<dgz, CompletableFuture<Either<dgu, ajr.a>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   public interface a {
      ajr.a b = new ajr.a() {
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
      void onLevelChange(cor var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface d {
      List<akj> a(cor var1, boolean var2);
   }
}
