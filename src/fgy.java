import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgy extends hee {
   static final Logger a = LogUtils.getLogger();
   static final alh b = alh.b("widget/slot_frame");
   private static final xh c = xh.c("mco.template.button.select");
   private static final xh B = xh.c("mco.template.button.trailer");
   private static final xh C = xh.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fon F = new fon(this);
   final Consumer<ffp> G;
   fgy.b H;
   private final ffa.d I;
   private fkz J;
   private fkz K;
   private fkz L;
   @Nullable
   ffp M = null;
   @Nullable
   String N;
   @Nullable
   private xh[] O;
   @Nullable
   List<fhp.a> P;

   public fgy(xh $$0, Consumer<ffp> $$1, ffa.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fgy(xh $$0, Consumer<ffp> $$1, ffa.d $$2, @Nullable ffq $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fgy.b(this);
         this.a(new ffq(10));
      } else {
         this.H = new fgy.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xh... $$0) {
      this.O = $$0;
   }

   @Override
   public void aS_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fgy.b(this, this.H.d()));
      fos $$0 = this.F.b(fos.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fkz.a(B, $$0x -> this.F()).a(100).a());
      this.J = $$0.a(fkz.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(fkz.a(xg.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fkz.a(C, $$0x -> this.G()).a(100).a());
      this.D();
      this.F.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.J());
      this.F.a();
   }

   @Override
   public xh i() {
      List<xh> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xg.a($$0);
   }

   void D() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void E() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void F() {
      if (this.M != null && !this.M.g.isBlank()) {
         fpp.a(this, this.M.g);
      }
   }

   private void G() {
      if (this.M != null && !this.M.e.isBlank()) {
         fpp.a(this, this.M.e);
      }
   }

   private void a(final ffq $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ffq $$0 = $$0;
            fej $$1 = fej.a();

            while ($$0 != null) {
               Either<ffq, Exception> $$2 = fgy.this.a($$0, $$1);
               $$0 = fgy.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fgy.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fgy.this.H.c()) {
                        fgy.this.P = fhp.a(gyz.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ffq $$1x = (ffq)$$2.left().get();

                     for (ffp $$2x : $$1x.a) {
                        fgy.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fgy.this.H.c()) {
                           String $$3 = gyz.a("mco.template.select.none", "%link");
                           fhp.b $$4 = fhp.b.a(gyz.a("mco.template.select.none.linkTitle"), ayf.t.toString());
                           fgy.this.P = fhp.a($$3, $$4);
                        }

                        return null;
                     } else {
                        return $$1x;
                     }
                  }
               }).join();
            }
         }
      }).start();
   }

   Either<ffq, Exception> a(ffq $$0, fej $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (ffu var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xh $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fkm $$0, int $$1, int $$2, List<fhp.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fhp.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fhp.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xh.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int J() {
      return this.O != null ? g(1) : 33;
   }

   class a extends flv.a<fgy.a> {
      private static final fmm c = new fmm(alh.b("icon/link"), alh.b("icon/link_highlighted"));
      private static final fmm d = new fmm(alh.b("icon/video_link"), alh.b("icon/video_link_highlighted"));
      private static final xh e = xh.c("mco.template.info.tooltip");
      private static final xh f = xh.c("mco.template.trailer.tooltip");
      public final ffp a;
      private long g;
      @Nullable
      private fll h;
      @Nullable
      private fll i;

      public a(final ffp $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fll(15, 15, c, fpp.b(fgy.this, $$0.e), e);
            this.h.a(fmk.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fll(15, 15, d, fpp.b(fgy.this, $$0.g), f);
            this.i.a(fmk.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fgy.this.M = this.a;
         fgy.this.D();
         if (ad.c() - this.g < 250L && this.aN_()) {
            fgy.this.G.accept(this.a);
         }

         this.g = ad.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gig::B, fhn.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gig::B, fgy.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fgy.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.y() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.y() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(fgy.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fgy.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fgy.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fgy.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xh a() {
         xh $$0 = xg.b(
            xh.b(this.a.b), xh.a("mco.template.select.narrate.authors", this.a.d), xh.b(this.a.h), xh.a("mco.template.select.narrate.version", this.a.c)
         );
         return xh.a("narrator.select", $$0);
      }
   }

   class b extends hed<fgy.a> {
      public b(final fgy param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<ffp> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.J(), var1.J(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(ffp $$0) {
         this.a((fgy.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            fpp.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fgy.a $$0) {
         super.a($$0);
         this.a.M = $$0 == null ? null : $$0.a;
         this.a.D();
      }

      @Override
      public int a() {
         return this.l() * 46;
      }

      @Override
      public int b() {
         return 300;
      }

      public boolean c() {
         return this.l() == 0;
      }

      public List<ffp> d() {
         return this.aJ_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
