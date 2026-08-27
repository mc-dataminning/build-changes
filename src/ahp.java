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

public class ahp {
   public static final Either<ddx, ahp.a> a = Either.right(ahp.a.b);
   public static final CompletableFuture<Either<ddx, ahp.a>> b = CompletableFuture.completedFuture(a);
   public static final Either<dei, ahp.a> c = Either.right(ahp.a.b);
   private static final Either<ddx, ahp.a> d = Either.right(ahp.a.b);
   private static final CompletableFuture<Either<dei, ahp.a>> e = CompletableFuture.completedFuture(c);
   private static final List<dec> f = dec.a();
   private final AtomicReferenceArray<CompletableFuture<Either<ddx, ahp.a>>> g = new AtomicReferenceArray<>(f.size());
   private final cmo h;
   private volatile CompletableFuture<Either<dei, ahp.a>> i = e;
   private volatile CompletableFuture<Either<dei, ahp.a>> j = e;
   private volatile CompletableFuture<Either<dei, ahp.a>> k = e;
   private CompletableFuture<ddx> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final aoe<ahp.b> m = null;
   private int n;
   private int o;
   private int p;
   final clt q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final dwt v;
   private final ahp.c w;
   private final ahp.d x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);

   public ahp(clt $$0, int $$1, cmo $$2, dwt $$3, ahp.c $$4, ahp.d $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = ahq.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.ak()];
   }

   public CompletableFuture<Either<ddx, ahp.a>> a(dec $$0) {
      CompletableFuture<Either<ddx, ahp.a>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<Either<ddx, ahp.a>> b(dec $$0) {
      return ahq.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<Either<dei, ahp.a>> a() {
      return this.j;
   }

   public CompletableFuture<Either<dei, ahp.a>> b() {
      return this.k;
   }

   public CompletableFuture<Either<dei, ahp.a>> c() {
      return this.i;
   }

   @Nullable
   public dei d() {
      CompletableFuture<Either<dei, ahp.a>> $$0 = this.a();
      Either<dei, ahp.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dei)$$1.left().orElse(null);
   }

   @Nullable
   public dei e() {
      CompletableFuture<Either<dei, ahp.a>> $$0 = this.c();
      Either<dei, ahp.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dei)$$1.left().orElse(null);
   }

   @Nullable
   public dec f() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dec $$1 = f.get($$0);
         CompletableFuture<Either<ddx, ahp.a>> $$2 = this.a($$1);
         if ($$2.getNow(a).left().isPresent()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public ddx g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dec $$1 = f.get($$0);
         CompletableFuture<Either<ddx, ahp.a>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            Optional<ddx> $$3 = $$2.getNow(a).left();
            if ($$3.isPresent()) {
               return $$3.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<ddx> h() {
      return this.l;
   }

   public void a(gu $$0) {
      dei $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(hx.b($$0));
      }
   }

   public void a(cmv $$0, int $$1) {
      Either<ddx, ahp.a> $$2 = this.b(dec.k).getNow(null);
      if ($$2 != null) {
         ddx $$3 = (ddx)$$2.left().orElse(null);
         if ($$3 != null) {
            $$3.a(true);
            dei $$4 = this.d();
            if ($$4 != null) {
               int $$5 = this.v.d();
               int $$6 = this.v.e();
               if ($$1 >= $$5 && $$1 <= $$6) {
                  int $$7 = $$1 - $$5;
                  if ($$0 == cmv.a) {
                     this.u.set($$7);
                  } else {
                     this.t.set($$7);
                  }
               }
            }
         }
      }
   }

   public void a(dei $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         cmm $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<aig> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               wg $$3 = new wg($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<aig> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     hx $$8 = hx.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        gu $$9 = $$8.g($$6.iterator().nextShort());
                        dcb $$10 = $$1.a_($$9);
                        this.a($$4, new vb($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dej $$11 = $$0.b($$5);
                        xh $$12 = new xh($$8, $$6, $$11);
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

   private void a(List<aig> $$0, cmm $$1, gu $$2, dcb $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<aig> $$0, cmm $$1, gu $$2) {
      czn $$3 = $$1.c_($$2);
      if ($$3 != null) {
         uo<?> $$4 = $$3.h();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<aig> $$0, uo<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.a($$1));
   }

   public CompletableFuture<Either<ddx, ahp.a>> a(dec $$0, ahr $$1) {
      int $$2 = $$0.c();
      CompletableFuture<Either<ddx, ahp.a>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         Either<ddx, ahp.a> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.right().isEmpty()) {
            return $$3;
         }
      }

      if (ahq.a(this.o).b($$0)) {
         CompletableFuture<Either<ddx, ahp.a>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new ahp.b(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends Either<? extends ddx, ahp.a>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new ahp.b(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> (ddx)$$1x.map($$0xx -> $$0xx, $$1xx -> $$0x));
   }

   public ahy i() {
      return ahq.b(this.o);
   }

   public clt j() {
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

   private void a(ahr $$0, CompletableFuture<Either<dei, ahp.a>> $$1, Executor $$2, ahy $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.ifLeft($$1xx -> $$4.complete(null)));
   }

   private void a(ahr $$0, ahy $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(ahr $$0, Executor $$1) {
      dec $$2 = ahq.a(this.n);
      dec $$3 = ahq.a(this.o);
      boolean $$4 = ahq.e(this.n);
      boolean $$5 = ahq.e(this.o);
      ahy $$6 = ahq.b(this.n);
      ahy $$7 = ahq.b(this.o);
      if ($$4) {
         Either<ddx, ahp.a> $$8 = Either.right(new ahp.a() {
            @Override
            public String toString() {
               return "Unloaded ticket level " + ahp.this.q;
            }
         });

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<Either<ddx, ahp.a>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(ahy.b);
      boolean $$12 = $$7.a(ahy.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, ahy.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(ahy.c);
      boolean $$14 = $$7.a(ahy.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, ahy.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(ahy.d);
      boolean $$16 = $$7.a(ahy.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, ahy.d);
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
      this.y = ahq.b(this.o).a(ahy.b);
   }

   public void a(deh $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<Either<ddx, ahp.a>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            Optional<ddx> $$3 = $$2.getNow(a).left();
            if (!$$3.isEmpty() && $$3.get() instanceof des) {
               this.g.set($$1, CompletableFuture.completedFuture(Either.left($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(Either.left($$0.C())), "replaceProto");
   }

   public List<Pair<dec, CompletableFuture<Either<ddx, ahp.a>>>> o() {
      List<Pair<dec, CompletableFuture<Either<ddx, ahp.a>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   public interface a {
      ahp.a b = new ahp.a() {
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
      void onLevelChange(clt var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface d {
      List<aig> a(clt var1, boolean var2);
   }
}
