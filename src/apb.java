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

public class apb {
   public static final ape<dre> a = ape.a("Unloaded chunk");
   public static final CompletableFuture<ape<dre>> b = CompletableFuture.completedFuture(a);
   public static final ape<dro> c = ape.a("Unloaded level chunk");
   public static final ape<dre> d = ape.a("Not done yet");
   private static final CompletableFuture<ape<dro>> e = CompletableFuture.completedFuture(c);
   private static final List<dsd> f = dsd.a();
   private final AtomicReferenceArray<CompletableFuture<ape<dre>>> g = new AtomicReferenceArray<>(f.size());
   private final czi h;
   private volatile CompletableFuture<ape<dro>> i = e;
   private volatile CompletableFuture<ape<dro>> j = e;
   private volatile CompletableFuture<ape<dro>> k = e;
   private CompletableFuture<dre> l = CompletableFuture.completedFuture(null);
   @Nullable
   private final awp<apb.a> m = null;
   private int n;
   private int o;
   private int p;
   private final cyn q;
   private boolean r;
   private final ShortSet[] s;
   private final BitSet t = new BitSet();
   private final BitSet u = new BitSet();
   private final ekq v;
   private final apb.b w;
   private final apb.c x;
   private boolean y;
   private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);
   private CompletableFuture<?> A = CompletableFuture.completedFuture(null);

   public apb(cyn $$0, int $$1, czi $$2, ekq $$3, apb.b $$4, apb.c $$5) {
      this.q = $$0;
      this.h = $$2;
      this.v = $$3;
      this.w = $$4;
      this.x = $$5;
      this.n = apc.a + 1;
      this.o = this.n;
      this.p = this.n;
      this.a($$1);
      this.s = new ShortSet[$$2.am()];
   }

   public CompletableFuture<ape<dre>> a(dsd $$0) {
      CompletableFuture<ape<dre>> $$1 = this.g.get($$0.c());
      return $$1 == null ? b : $$1;
   }

   public CompletableFuture<ape<dre>> b(dsd $$0) {
      return apc.a(this.o).b($$0) ? this.a($$0) : b;
   }

   public CompletableFuture<ape<dro>> a() {
      return this.j;
   }

   public CompletableFuture<ape<dro>> b() {
      return this.k;
   }

   public CompletableFuture<ape<dro>> c() {
      return this.i;
   }

   @Nullable
   public dro d() {
      return this.a().getNow(c).b(null);
   }

   public CompletableFuture<?> e() {
      return this.A;
   }

   @Nullable
   public dro f() {
      return !this.A.isDone() ? null : this.d();
   }

   @Nullable
   public dsd g() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dsd $$1 = f.get($$0);
         CompletableFuture<ape<dre>> $$2 = this.a($$1);
         if ($$2.getNow(a).a()) {
            return $$1;
         }
      }

      return null;
   }

   @Nullable
   public dre h() {
      for (int $$0 = f.size() - 1; $$0 >= 0; $$0--) {
         dsd $$1 = f.get($$0);
         CompletableFuture<ape<dre>> $$2 = this.a($$1);
         if (!$$2.isCompletedExceptionally()) {
            dre $$3 = $$2.getNow(a).b(null);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public CompletableFuture<dre> i() {
      return this.l;
   }

   public void a(id $$0) {
      dro $$1 = this.d();
      if ($$1 != null) {
         int $$2 = this.h.e($$0.v());
         if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
         }

         this.s[$$2].add(jg.b($$0));
      }
   }

   public void a(czp $$0, int $$1) {
      dre $$2 = this.b(dsd.k).getNow(a).b(null);
      if ($$2 != null) {
         $$2.a(true);
         dro $$3 = this.d();
         if ($$3 != null) {
            int $$4 = this.v.d();
            int $$5 = this.v.e();
            if ($$1 >= $$4 && $$1 <= $$5) {
               int $$6 = $$1 - $$4;
               if ($$0 == czp.a) {
                  this.u.set($$6);
               } else {
                  this.t.set($$6);
               }
            }
         }
      }
   }

   public void a(dro $$0) {
      if (this.r || !this.u.isEmpty() || !this.t.isEmpty()) {
         czg $$1 = $$0.F();
         if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<apv> $$2 = this.x.a(this.q, true);
            if (!$$2.isEmpty()) {
               acp $$3 = new acp($$0.f(), this.v, this.u, this.t);
               this.a($$2, $$3);
            }

            this.u.clear();
            this.t.clear();
         }

         if (this.r) {
            List<apv> $$4 = this.x.a(this.q, false);

            for (int $$5 = 0; $$5 < this.s.length; $$5++) {
               ShortSet $$6 = this.s[$$5];
               if ($$6 != null) {
                  this.s[$$5] = null;
                  if (!$$4.isEmpty()) {
                     int $$7 = this.h.g($$5);
                     jg $$8 = jg.a($$0.f(), $$7);
                     if ($$6.size() == 1) {
                        id $$9 = $$8.g($$6.iterator().nextShort());
                        dpi $$10 = $$1.a_($$9);
                        this.a($$4, new abj($$9, $$10));
                        this.a($$4, $$1, $$9, $$10);
                     } else {
                        drp $$11 = $$0.b($$5);
                        adp $$12 = new adp($$8, $$6, $$11);
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

   private void a(List<apv> $$0, czg $$1, id $$2, dpi $$3) {
      if ($$3.t()) {
         this.a($$0, $$1, $$2);
      }
   }

   private void a(List<apv> $$0, czg $$1, id $$2) {
      dmo $$3 = $$1.c_($$2);
      if ($$3 != null) {
         yp<?> $$4 = $$3.av_();
         if ($$4 != null) {
            this.a($$0, $$4);
         }
      }
   }

   private void a(List<apv> $$0, yp<?> $$1) {
      $$0.forEach($$1x -> $$1x.d.b($$1));
   }

   public CompletableFuture<ape<dre>> a(dsd $$0, apd $$1) {
      int $$2 = $$0.c();
      CompletableFuture<ape<dre>> $$3 = this.g.get($$2);
      if ($$3 != null) {
         ape<dre> $$4 = $$3.getNow(d);
         if ($$4 == null) {
            String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
            throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
         }

         if ($$4 == d || $$4.a()) {
            return $$3;
         }
      }

      if (apc.a(this.o).b($$0)) {
         CompletableFuture<ape<dre>> $$6 = $$1.a(this, $$0);
         this.a($$6, "schedule " + $$0);
         this.g.set($$2, $$6);
         return $$6;
      } else {
         return $$3 == null ? b : $$3;
      }
   }

   protected void a(String $$0, CompletableFuture<?> $$1) {
      if (this.m != null) {
         this.m.a(new apb.a(Thread.currentThread(), $$1, $$0));
      }

      this.l = this.l.thenCombine((CompletionStage<? extends Object>)$$1, ($$0x, $$1x) -> $$0x);
   }

   private void a(CompletableFuture<? extends ape<? extends dre>> $$0, String $$1) {
      if (this.m != null) {
         this.m.a(new apb.a(Thread.currentThread(), $$0, $$1));
      }

      this.l = this.l.thenCombine($$0, ($$0x, $$1x) -> ape.a($$1x, $$0x));
   }

   public void a(CompletableFuture<?> $$0) {
      if (this.A.isDone()) {
         this.A = $$0;
      } else {
         this.A = this.A.thenCombine((CompletionStage<? extends Object>)$$0, ($$0x, $$1) -> null);
      }
   }

   public apn j() {
      return apc.b(this.o);
   }

   public cyn k() {
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

   private void a(apd $$0, CompletableFuture<ape<dro>> $$1, Executor $$2, apn $$3) {
      this.z.cancel(false);
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
      this.z = $$4;
      $$1.thenAccept($$1x -> $$1x.a($$1xx -> $$4.complete(null)));
   }

   private void a(apd $$0, apn $$1) {
      this.z.cancel(false);
      $$0.a(this.q, $$1);
   }

   protected void a(apd $$0, Executor $$1) {
      dsd $$2 = apc.a(this.n);
      dsd $$3 = apc.a(this.o);
      boolean $$4 = apc.e(this.n);
      boolean $$5 = apc.e(this.o);
      apn $$6 = apc.b(this.n);
      apn $$7 = apc.b(this.o);
      if ($$4) {
         ape<dre> $$8 = ape.a(() -> "Unloaded ticket level " + this.q);

         for (int $$9 = $$5 ? $$3.c() + 1 : 0; $$9 <= $$2.c(); $$9++) {
            CompletableFuture<ape<dre>> $$10 = this.g.get($$9);
            if ($$10 == null) {
               this.g.set($$9, CompletableFuture.completedFuture($$8));
            }
         }
      }

      boolean $$11 = $$6.a(apn.b);
      boolean $$12 = $$7.a(apn.b);
      this.y |= $$12;
      if (!$$11 && $$12) {
         this.i = $$0.c(this);
         this.a($$0, this.i, $$1, apn.b);
         this.a(this.i, "full");
      }

      if ($$11 && !$$12) {
         this.i.complete(c);
         this.i = e;
      }

      boolean $$13 = $$6.a(apn.c);
      boolean $$14 = $$7.a(apn.c);
      if (!$$13 && $$14) {
         this.j = $$0.b(this);
         this.a($$0, this.j, $$1, apn.c);
         this.a(this.j, "ticking");
      }

      if ($$13 && !$$14) {
         this.j.complete(c);
         this.j = e;
      }

      boolean $$15 = $$6.a(apn.d);
      boolean $$16 = $$7.a(apn.d);
      if (!$$15 && $$16) {
         if (this.k != e) {
            throw (IllegalStateException)ac.b(new IllegalStateException());
         }

         this.k = $$0.a(this);
         this.a($$0, this.k, $$1, apn.d);
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
      this.y = apc.b(this.o).a(apn.b);
   }

   public void a(drn $$0) {
      for (int $$1 = 0; $$1 < this.g.length(); $$1++) {
         CompletableFuture<ape<dre>> $$2 = this.g.get($$1);
         if ($$2 != null) {
            dre $$3 = $$2.getNow(a).b(null);
            if ($$3 instanceof dry) {
               this.g.set($$1, CompletableFuture.completedFuture(ape.a($$0)));
            }
         }
      }

      this.a(CompletableFuture.completedFuture(ape.a($$0.C())), "replaceProto");
   }

   public List<Pair<dsd, CompletableFuture<ape<dre>>>> p() {
      List<Pair<dsd, CompletableFuture<ape<dre>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < f.size(); $$1++) {
         $$0.add(Pair.of(f.get($$1), this.g.get($$1)));
      }

      return $$0;
   }

   static record a(Thread a, CompletableFuture<?> b, String c) {
   }

   @FunctionalInterface
   public interface b {
      void onLevelChange(cyn var1, IntSupplier var2, int var3, IntConsumer var4);
   }

   public interface c {
      List<apv> a(cyn var1, boolean var2);
   }
}
