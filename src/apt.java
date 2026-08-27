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

public class apt {
   public static final apw<dsx> a = apw.a("Unloaded chunk");
   public static final CompletableFuture<apw<dsx>> b = CompletableFuture.completedFuture(a);
   public static final apw<dth> c = apw.a("Unloaded level chunk");
   public static final apw<dsx> d = apw.a("Not done yet");
   private static final CompletableFuture<apw<dth>> e = CompletableFuture.completedFuture(c);
   private static final List<dtw> f = dtw.a();
   private final AtomicReferenceArray<CompletableFuture<apw<dsx>>> g = new AtomicReferenceArray<>(f.size());
   private final daz h;
   private volatile CompletableFuture<apw<dth>> i = e;
   private volatile CompletableFuture<apw<dth>> j = e;
   private volatile CompletableFuture<apw<dth>> k = e;
   private CompletableFuture<dsx> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final axh<apt.a> m = null;
   private int n;
   private int o;
   private int p;
   private final dae q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final emj v;
   private final apt.b w;
   private final apt.c x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public apt(dae $$0, int $$1, daz $$2, emj $$3, apt.b $$4, apt.c $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = apu.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.am()];
   }

   public CompletableFuture<apw<dsx>> a(dtw $$0) {
      CompletableFuture<apw<dsx>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<apw<dsx>> b(dtw $$0) {
      return apu.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<apw<dth>> a() {
      return this.j;
   }

   public CompletableFuture<apw<dth>> b() {
      return this.k;
   }

   public CompletableFuture<apw<dth>> c() {
      return this.i;
   }

   @Nullable
   public dth d() {
      return this.a().getNow(c).b(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public dth f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public dtw g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dtw $$1 = f.get($$0);
         CompletableFuture<apw<dsx>> $$2 = this.a($$1);
         if ($$2.getNow(a).a()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dsx h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dtw $$1 = f.get($$0);
         CompletableFuture<apw<dsx>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            dsx $$3 = $$2.getNow(a).b(null);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public CompletableFuture<dsx> i() {
      return this.l;
   }

   public void a(io $$0) {
      dth $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(jq.b($$0));
      }
   }

   public void a(dbg $$0, int $$1) {
      dsx $$2 = this.b(dtw.k).getNow(a).b(null);
      if ($$2 != null) {
         $$2.a(true);
         dth $$3 = this.d();
         if ($$3 != null) {
            int $$4 = this.v.d();
            int $$5 = this.v.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               int $$6 = $$1 - $$4;
               if ($$0 == dbg.a) {
                  this.u.set($$6);
               } else {
                  this.t.set($$6);
               }
            }
         }
      }
   }

   public void a(dth $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         dax $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<aqn> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               adf $$3 = new adf($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<aqn> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     jq $$8 = jq.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        io $$9 = $$8.g($$6.iterator().nextShort());
                        drb $$10 = $$1.a_($$9);
                        this.a($$4, new abz($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        dti $$11 = $$0.b($$5);
                        aef $$12 = new aef($$8, $$6, $$11);
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

   private void a(List<aqn> $$0, dax $$1, io $$2, drb $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<aqn> $$0, dax $$1, io $$2) {
      dog $$3 = $$1.c_($$2);
      if ($$3 != null) {
         ze<?> $$4 = $$3.av_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<aqn> $$0, ze<?> $$1) {
      $$0.forEach($$1x -> $$1x.d.b($$1));
   }

   public CompletableFuture<apw<dsx>> a(dtw $$0, apv $$1) {
      int $$2 = $$0.c();
      CompletableFuture<apw<dsx>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         apw<dsx> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.a()) {
            return $$3;
         }
      }

      if (apu.a(this.o).b($$0)) {
         CompletableFuture<apw<dsx>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new apt.a(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends apw<? extends dsx>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new apt.a(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> apw.a($$1x, $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public aqf j() {
      return apu.b(this.o);
   }

   public dae k() {
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

   private void a(apv $$0, CompletableFuture<apw<dth>> $$1, Executor $$2, aqf $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(apv $$0, aqf $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(apv $$0, Executor $$1) {
      dtw $$2 = apu.a(this.n);
      dtw $$3 = apu.a(this.o);
      boolean $$4 = apu.e(this.n);
      boolean $$5 = apu.e(this.o);
      aqf $$6 = apu.b(this.n);
      aqf $$7 = apu.b(this.o);
      if ($$4) {
         apw<dsx> $$8 = apw.a(() -> "Unloaded ticket level " + this.q);

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<apw<dsx>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(aqf.b);
      boolean $$12 = $$7.a(aqf.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, aqf.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(aqf.c);
      boolean $$14 = $$7.a(aqf.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, aqf.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(aqf.d);
      boolean $$16 = $$7.a(aqf.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, aqf.d);
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
      this.y = apu.b(this.o).a(aqf.b);
   }

   public void a(dtg $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<apw<dsx>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            dsx $$3 = $$2.getNow(a).b(null);
            if ($$3 instanceof dtr) {
               this.g.set($$1, CompletableFuture.completedFuture(apw.a($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(apw.a($$0.C())), "replaceProto");
   }

   public List<Pair<dtw, CompletableFuture<apw<dsx>>>> p() {
      List<Pair<dtw, CompletableFuture<apw<dsx>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   static record a(Thread a, CompletableFuture<?> b, String c) {
   }

   @FunctionalInterface
   public interface b {
      void onLevelChange(dae var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface c {
      List<aqn> a(dae var1, boolean var2);
   }
}
