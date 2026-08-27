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

public class ajt {
   public static final Either<dgw, ajt.a> a = Either.right(ajt.a.b);
   public static final CompletableFuture<Either<dgw, ajt.a>> b = CompletableFuture.completedFuture(a);
   public static final Either<dhh, ajt.a> c = Either.right(ajt.a.b);
   private static final Either<dgw, ajt.a> d = Either.right(ajt.a.b);
   private static final CompletableFuture<Either<dhh, ajt.a>> e = CompletableFuture.completedFuture(c);
   private static final List<dhb> f = dhb.a();
   private final AtomicReferenceArray<CompletableFuture<Either<dgw, ajt.a>>> g = new AtomicReferenceArray<>(f.size());
   private final cpo h;
   private volatile CompletableFuture<Either<dhh, ajt.a>> i = e;
   private volatile CompletableFuture<Either<dhh, ajt.a>> j = e;
   private volatile CompletableFuture<Either<dhh, ajt.a>> k = e;
   private CompletableFuture<dgw> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final aqu<ajt.b> m = null;
   private int n;
   private int o;
   private int p;
   final cot q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final dzs v;
   private final ajt.c w;
   private final ajt.d x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);

   public ajt(cot $$0, int $$1, cpo $$2, dzs $$3, ajt.c $$4, ajt.d $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = aju.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.ak()];
   }

   public CompletableFuture<Either<dgw, ajt.a>> a(dhb $$0) {
      CompletableFuture<Either<dgw, ajt.a>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<Either<dgw, ajt.a>> b(dhb $$0) {
      return aju.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<Either<dhh, ajt.a>> a() {
      return this.j;
   }

   public CompletableFuture<Either<dhh, ajt.a>> b() {
      return this.k;
   }

   public CompletableFuture<Either<dhh, ajt.a>> c() {
      return this.i;
   }

   @Nullable
   public dhh d() {
      CompletableFuture<Either<dhh, ajt.a>> $$0 = this.a();
      Either<dhh, ajt.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dhh)$$1.left().orElse(null);
   }

   @Nullable
   public dhh e() {
      CompletableFuture<Either<dhh, ajt.a>> $$0 = this.c();
      Either<dhh, ajt.a> $$1 = $$0.getNow(null);
      return $$1 == null ? null : (dhh)$$1.left().orElse(null);
   }

   @Nullable
   public dhb f() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dhb $$1 = f.get($$0);
         CompletableFuture<Either<dgw, ajt.a>> $$2 = this.a($$1);
         if ($$2.getNow(a).left().isPresent()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dgw g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dhb $$1 = f.get($$0);
         CompletableFuture<Either<dgw, ajt.a>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            Optional<dgw> $$3 = $$2.getNow(a).left();
            if ($$3.isPresent()) {
               return $$3.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<dgw> h() {
      return this.l;
   }

   public void a(gu $$0) {
      dhh $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(hx.b($$0));
      }
   }

   public void a(cpv $$0, int $$1) {
      Either<dgw, ajt.a> $$2 = this.b(dhb.k).getNow(null);
      if ($$2 != null) {
         dgw $$3 = (dgw)$$2.left().orElse(null);
         if ($$3 != null) {
            $$3.a(true);
            dhh $$4 = this.d();
            if ($$4 != null) {
               int $$5 = this.v.d();
               int $$6 = this.v.e();
               if ($$1 >= $$5 && $$1 <= $$6) {
                  int $$7 = $$1 - $$5;
                  if ($$0 == cpv.a) {
                     this.u.set($$7);
                  } else {
                     this.t.set($$7);
                  }
               }
            }
         }
      }
   }

   public void a(dhh $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         cpm $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<akl> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               yd $$3 = new yd($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<akl> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     hx $$8 = hx.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        gu $$9 = $$8.g($$6.iterator().nextShort());
                        dfa $$10 = $$1.a_($$9);
                        this.a($$4, new wz($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dhi $$11 = $$0.b($$5);
                        zc $$12 = new zc($$8, $$6, $$11);
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

   private void a(List<akl> $$0, cpm $$1, gu $$2, dfa $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<akl> $$0, cpm $$1, gu $$2) {
      dcm $$3 = $$1.c_($$2);
      if ($$3 != null) {
         ux<?> $$4 = $$3.h();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<akl> $$0, ux<?> $$1) {
      $$0.forEach($$1x -> $$1x.c.b($$1));
   }

   public CompletableFuture<Either<dgw, ajt.a>> a(dhb $$0, ajv $$1) {
      int $$2 = $$0.c();
      CompletableFuture<Either<dgw, ajt.a>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         Either<dgw, ajt.a> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.right().isEmpty()) {
            return $$3;
         }
      }

      if (aju.a(this.o).b($$0)) {
         CompletableFuture<Either<dgw, ajt.a>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new ajt.b(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends Either<? extends dgw, ajt.a>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new ajt.b(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> (dgw)$$1x.map($$0xx -> $$0xx, $$1xx -> $$0x));
   }

   public akd i() {
      return aju.b(this.o);
   }

   public cot j() {
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

   private void a(ajv $$0, CompletableFuture<Either<dhh, ajt.a>> $$1, Executor $$2, akd $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.ifLeft($$1xx -> $$4.complete(null)));
   }

   private void a(ajv $$0, akd $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(ajv $$0, Executor $$1) {
      dhb $$2 = aju.a(this.n);
      dhb $$3 = aju.a(this.o);
      boolean $$4 = aju.e(this.n);
      boolean $$5 = aju.e(this.o);
      akd $$6 = aju.b(this.n);
      akd $$7 = aju.b(this.o);
      if ($$4) {
         Either<dgw, ajt.a> $$8 = Either.right(new ajt.a() {
            @Override
            public String toString() {
               return "Unloaded ticket level " + ajt.this.q;
            }
         });

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<Either<dgw, ajt.a>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(akd.b);
      boolean $$12 = $$7.a(akd.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, akd.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(akd.c);
      boolean $$14 = $$7.a(akd.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, akd.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(akd.d);
      boolean $$16 = $$7.a(akd.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, akd.d);
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
      this.y = aju.b(this.o).a(akd.b);
   }

   public void a(dhg $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<Either<dgw, ajt.a>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            Optional<dgw> $$3 = $$2.getNow(a).left();
            if (!$$3.isEmpty() && $$3.get() instanceof dhr) {
               this.g.set($$1, CompletableFuture.completedFuture(Either.left($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(Either.left($$0.C())), "replaceProto");
   }

   public List<Pair<dhb, CompletableFuture<Either<dgw, ajt.a>>>> o() {
      List<Pair<dhb, CompletableFuture<Either<dgw, ajt.a>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   public interface a {
      ajt.a b = new ajt.a() {
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
      void onLevelChange(cot var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface d {
      List<akl> a(cot var1, boolean var2);
   }
}
