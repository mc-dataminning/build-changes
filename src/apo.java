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

public class apo {
   public static final apr<dsd> a = apr.a("Unloaded chunk");
   public static final CompletableFuture<apr<dsd>> b = CompletableFuture.completedFuture(a);
   public static final apr<dsn> c = apr.a("Unloaded level chunk");
   public static final apr<dsd> d = apr.a("Not done yet");
   private static final CompletableFuture<apr<dsn>> e = CompletableFuture.completedFuture(c);
   private static final List<dtc> f = dtc.a();
   private final AtomicReferenceArray<CompletableFuture<apr<dsd>>> g = new AtomicReferenceArray<>(f.size());
   private final daf h;
   private volatile CompletableFuture<apr<dsn>> i = e;
   private volatile CompletableFuture<apr<dsn>> j = e;
   private volatile CompletableFuture<apr<dsn>> k = e;
   private CompletableFuture<dsd> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final axc<apo.a> m = null;
   private int n;
   private int o;
   private int p;
   private final czk q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final elp v;
   private final apo.b w;
   private final apo.c x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public apo(czk $$0, int $$1, daf $$2, elp $$3, apo.b $$4, apo.c $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = app.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.am()];
   }

   public CompletableFuture<apr<dsd>> a(dtc $$0) {
      CompletableFuture<apr<dsd>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<apr<dsd>> b(dtc $$0) {
      return app.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<apr<dsn>> a() {
      return this.j;
   }

   public CompletableFuture<apr<dsn>> b() {
      return this.k;
   }

   public CompletableFuture<apr<dsn>> c() {
      return this.i;
   }

   @Nullable
   public dsn d() {
      return this.a().getNow(c).b(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public dsn f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public dtc g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dtc $$1 = f.get($$0);
         CompletableFuture<apr<dsd>> $$2 = this.a($$1);
         if ($$2.getNow(a).a()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dsd h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dtc $$1 = f.get($$0);
         CompletableFuture<apr<dsd>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            dsd $$3 = $$2.getNow(a).b(null);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public CompletableFuture<dsd> i() {
      return this.l;
   }

   public void a(in $$0) {
      dsn $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(jp.b($$0));
      }
   }

   public void a(dam $$0, int $$1) {
      dsd $$2 = this.b(dtc.k).getNow(a).b(null);
      if ($$2 != null) {
         $$2.a(true);
         dsn $$3 = this.d();
         if ($$3 != null) {
            int $$4 = this.v.d();
            int $$5 = this.v.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               int $$6 = $$1 - $$4;
               if ($$0 == dam.a) {
                  this.u.set($$6);
               } else {
                  this.t.set($$6);
               }
            }
         }
      }
   }

   public void a(dsn $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         dad $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<aqi> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               adb $$3 = new adb($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<aqi> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     jp $$8 = jp.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        in $$9 = $$8.g($$6.iterator().nextShort());
                        dqh $$10 = $$1.a_($$9);
                        this.a($$4, new abv($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dso $$11 = $$0.b($$5);
                        aeb $$12 = new aeb($$8, $$6, $$11);
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

   private void a(List<aqi> $$0, dad $$1, in $$2, dqh $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<aqi> $$0, dad $$1, in $$2) {
      dnm $$3 = $$1.c_($$2);
      if ($$3 != null) {
         zb<?> $$4 = $$3.av_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<aqi> $$0, zb<?> $$1) {
      $$0.forEach($$1x -> $$1x.d.b($$1));
   }

   public CompletableFuture<apr<dsd>> a(dtc $$0, apq $$1) {
      int $$2 = $$0.c();
      CompletableFuture<apr<dsd>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         apr<dsd> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.a()) {
            return $$3;
         }
      }

      if (app.a(this.o).b($$0)) {
         CompletableFuture<apr<dsd>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new apo.a(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends apr<? extends dsd>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new apo.a(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> apr.a($$1x, $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public aqa j() {
      return app.b(this.o);
   }

   public czk k() {
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

   private void a(apq $$0, CompletableFuture<apr<dsn>> $$1, Executor $$2, aqa $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(apq $$0, aqa $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(apq $$0, Executor $$1) {
      dtc $$2 = app.a(this.n);
      dtc $$3 = app.a(this.o);
      boolean $$4 = app.e(this.n);
      boolean $$5 = app.e(this.o);
      aqa $$6 = app.b(this.n);
      aqa $$7 = app.b(this.o);
      if ($$4) {
         apr<dsd> $$8 = apr.a(() -> "Unloaded ticket level " + this.q);

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<apr<dsd>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(aqa.b);
      boolean $$12 = $$7.a(aqa.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, aqa.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(aqa.c);
      boolean $$14 = $$7.a(aqa.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, aqa.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(aqa.d);
      boolean $$16 = $$7.a(aqa.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, aqa.d);
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
      this.y = app.b(this.o).a(aqa.b);
   }

   public void a(dsm $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<apr<dsd>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            dsd $$3 = $$2.getNow(a).b(null);
            if ($$3 instanceof dsx) {
               this.g.set($$1, CompletableFuture.completedFuture(apr.a($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(apr.a($$0.C())), "replaceProto");
   }

   public List<Pair<dtc, CompletableFuture<apr<dsd>>>> p() {
      List<Pair<dtc, CompletableFuture<apr<dsd>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   static record a(Thread a, CompletableFuture<?> b, String c) {
   }

   @FunctionalInterface
   public interface b {
      void onLevelChange(czk var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface c {
      List<aqi> a(czk var1, boolean var2);
   }
}
