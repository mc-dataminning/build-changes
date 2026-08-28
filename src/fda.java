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

public class fda extends gvb {
   static final Logger a = LogUtils.getLogger();
   static final alb b = new alb("widget/slot_frame");
   private static final xl c = xl.c("mco.template.button.select");
   private static final xl B = xl.c("mco.template.button.trailer");
   private static final xl C = xl.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fkm F = new fkm(this);
   final Consumer<fbr> G;
   fda.b H;
   private final fba.d I;
   private fgz J;
   private fgz K;
   private fgz L;
   @Nullable
   fbr M = null;
   @Nullable
   String N;
   @Nullable
   private xl[] O;
   @Nullable
   List<fdr.a> P;

   public fda(xl $$0, Consumer<fbr> $$1, fba.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fda(xl $$0, Consumer<fbr> $$1, fba.d $$2, @Nullable fbs $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fda.b(this);
         this.a(new fbs(10));
      } else {
         this.H = new fda.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xl... $$0) {
      this.O = $$0;
   }

   @Override
   public void aN_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fda.b(this, this.H.d()));
      fkq $$0 = this.F.b(fkq.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fgz.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(fgz.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(fgz.a(xk.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fgz.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         fgx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.I());
      this.F.a();
   }

   @Override
   public xl i() {
      List<xl> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xk.a($$0);
   }

   void C() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void D() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void E() {
      if (this.M != null && !this.M.g.isBlank()) {
         flp.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         flp.a(this, this.M.e);
      }
   }

   private void a(final fbs $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fbs $$0 = $$0;
            faj $$1 = faj.a();

            while ($$0 != null) {
               Either<fbs, Exception> $$2 = fda.this.a($$0, $$1);
               $$0 = fda.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fda.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fda.this.H.c()) {
                        fda.this.P = fdr.a(gqa.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fbs $$1x = (fbs)$$2.left().get();

                     for (fbr $$2x : $$1x.a) {
                        fda.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fda.this.H.c()) {
                           String $$3 = gqa.a("mco.template.select.none", "%link");
                           fdr.b $$4 = fdr.b.a(gqa.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fda.this.P = fdr.a($$3, $$4);
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

   Either<fbs, Exception> a(fbs $$0, faj $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fbw var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xl $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fgm $$0, int $$1, int $$2, List<fdr.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fdr.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fdr.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xl.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fhv.a<fda.a> {
      private static final fim c = new fim(new alb("icon/link"), new alb("icon/link_highlighted"));
      private static final fim d = new fim(new alb("icon/video_link"), new alb("icon/video_link_highlighted"));
      private static final xl e = xl.c("mco.template.info.tooltip");
      private static final xl f = xl.c("mco.template.trailer.tooltip");
      public final fbr a;
      private long g;
      @Nullable
      private fhl h;
      @Nullable
      private fhl i;

      public a(final fbr $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fhl(15, 15, c, flp.b(fda.this, $$0.e), e);
            this.h.a(fik.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fhl(15, 15, d, flp.b(fda.this, $$0.g), f);
            this.i.a(fik.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fda.this.M = this.a;
         fda.this.C();
         if (ac.c() - this.g < 250L && this.aJ_()) {
            fda.this.G.accept(this.a);
         }

         this.g = ac.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdp.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fda.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fda.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.x() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.x() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(fda.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fda.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fda.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fda.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xl a() {
         xl $$0 = xk.b(
            xl.b(this.a.b), xl.a("mco.template.select.narrate.authors", this.a.d), xl.b(this.a.h), xl.a("mco.template.select.narrate.version", this.a.c)
         );
         return xl.a("narrator.select", $$0);
      }
   }

   class b extends gva<fda.a> {
      public b(final fda param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fbr> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.I(), var1.I(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fbr $$0) {
         this.a((fda.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            flp.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fda.a $$0) {
         super.a($$0);
         this.a.M = $$0 == null ? null : $$0.a;
         this.a.C();
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

      public List<fbr> d() {
         return this.aF_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
