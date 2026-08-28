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

public class fhy extends hff {
   static final Logger a = LogUtils.getLogger();
   static final all b = all.b("widget/slot_frame");
   private static final xl c = xl.c("mco.template.button.select");
   private static final xl B = xl.c("mco.template.button.trailer");
   private static final xl C = xl.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fpl F = new fpl(this);
   final Consumer<fgq> G;
   fhy.b H;
   private final fgb.d I;
   private flw J;
   private flw K;
   private flw L;
   @Nullable
   fgq M = null;
   @Nullable
   String N;
   @Nullable
   private xl[] O;
   @Nullable
   List<fip.a> P;

   public fhy(xl $$0, Consumer<fgq> $$1, fgb.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fhy(xl $$0, Consumer<fgq> $$1, fgb.d $$2, @Nullable fgr $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fhy.b(this);
         this.a(new fgr(10));
      } else {
         this.H = new fhy.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xl... $$0) {
      this.O = $$0;
   }

   @Override
   public void aS_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fhy.b(this, this.H.d()));
      fpp $$0 = this.F.b(fpp.e().a(10));
      $$0.c().b();
      this.K = $$0.a(flw.a(B, $$0x -> this.F()).a(100).a());
      this.J = $$0.a(flw.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(flw.a(xk.e, $$0x -> this.aP_()).a(100).a());
      this.L = $$0.a(flw.a(C, $$0x -> this.G()).a(100).a());
      this.D();
      this.F.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.J());
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

   void D() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void aP_() {
      this.G.accept(null);
   }

   private void E() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void F() {
      if (this.M != null && !this.M.g.isBlank()) {
         fqm.a(this, this.M.g);
      }
   }

   private void G() {
      if (this.M != null && !this.M.e.isBlank()) {
         fqm.a(this, this.M.e);
      }
   }

   private void a(final fgr $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fgr $$0 = $$0;
            ffa $$1 = ffa.a();

            while ($$0 != null) {
               Either<fgr, Exception> $$2 = fhy.this.a($$0, $$1);
               $$0 = fhy.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fhy.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fhy.this.H.c()) {
                        fhy.this.P = fip.a(haa.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fgr $$1x = (fgr)$$2.left().get();

                     for (fgq $$2x : $$1x.a) {
                        fhy.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fhy.this.H.c()) {
                           String $$3 = haa.a("mco.template.select.none", "%link");
                           fip.b $$4 = fip.b.a(haa.a("mco.template.select.none.linkTitle"), ayj.t.toString());
                           fhy.this.P = fip.a($$3, $$4);
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

   Either<fgr, Exception> a(fgr $$0, ffa $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fgv var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
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

   private void a(flj $$0, int $$1, int $$2, List<fip.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fip.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fip.b $$9 : $$5.a) {
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

   int J() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fms.a<fhy.a> {
      private static final fnj c = new fnj(all.b("icon/link"), all.b("icon/link_highlighted"));
      private static final fnj d = new fnj(all.b("icon/video_link"), all.b("icon/video_link_highlighted"));
      private static final xl e = xl.c("mco.template.info.tooltip");
      private static final xl f = xl.c("mco.template.trailer.tooltip");
      public final fgq a;
      private long g;
      @Nullable
      private fmi h;
      @Nullable
      private fmi i;

      public a(final fgq $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fmi(15, 15, c, fqm.b(fhy.this, $$0.e), e);
            this.h.a(fnh.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fmi(15, 15, d, fqm.b(fhy.this, $$0.g), f);
            this.i.a(fnh.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fhy.this.M = this.a;
         fhy.this.D();
         if (ae.c() - this.g < 250L && this.aM_()) {
            fhy.this.G.accept(this.a);
         }

         this.g = ae.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gjh::B, fin.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gjh::B, fhy.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fhy.this.p.b(this.a.c);
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
         $$0.a(fhy.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fhy.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fhy.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fhy.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends hfe<fhy.a> {
      public b(final fhy param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fgq> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.J(), var1.J(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fgq $$0) {
         this.a((fhy.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            fqm.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fhy.a $$0) {
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

      public List<fgq> d() {
         return this.aI_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
