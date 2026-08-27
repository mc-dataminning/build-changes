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

public class fbz extends gty {
   static final Logger a = LogUtils.getLogger();
   static final akm b = new akm("widget/slot_frame");
   private static final wx c = wx.c("mco.template.button.select");
   private static final wx B = wx.c("mco.template.button.trailer");
   private static final wx C = wx.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fjm F = new fjm(this);
   final Consumer<faq> G;
   fbz.b H;
   private final ezz.d I;
   private ffz J;
   private ffz K;
   private ffz L;
   @Nullable
   faq M = null;
   @Nullable
   String N;
   @Nullable
   private wx[] O;
   @Nullable
   List<fcq.a> P;

   public fbz(wx $$0, Consumer<faq> $$1, ezz.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fbz(wx $$0, Consumer<faq> $$1, ezz.d $$2, @Nullable far $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fbz.b();
         this.a(new far(10));
      } else {
         this.H = new fbz.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wx... $$0) {
      this.O = $$0;
   }

   @Override
   public void aM_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fbz.b(this.H.d()));
      fjq $$0 = this.F.b(fjq.e().a(10));
      $$0.c().b();
      this.K = $$0.a(ffz.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(ffz.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(ffz.a(ww.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(ffz.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         ffx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.I());
      this.F.a();
   }

   @Override
   public wx i() {
      List<wx> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return ww.a($$0);
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
         fkp.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         fkp.a(this, this.M.e);
      }
   }

   private void a(final far $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            far $$0 = $$0;
            ezi $$1 = ezi.a();

            while ($$0 != null) {
               Either<far, Exception> $$2 = fbz.this.a($$0, $$1);
               $$0 = fbz.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fbz.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fbz.this.H.c()) {
                        fbz.this.P = fcq.a(gpb.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     far $$1x = (far)$$2.left().get();

                     for (faq $$2x : $$1x.a) {
                        fbz.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fbz.this.H.c()) {
                           String $$3 = gpb.a("mco.template.select.none", "%link");
                           fcq.b $$4 = fcq.b.a(gpb.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fbz.this.P = fcq.a($$3, $$4);
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

   Either<far, Exception> a(far $$0, ezi $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fav var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            wx $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ffm $$0, int $$1, int $$2, List<fcq.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fcq.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fcq.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wx.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fgv.a<fbz.a> {
      private static final fhm c = new fhm(new akm("icon/link"), new akm("icon/link_highlighted"));
      private static final fhm d = new fhm(new akm("icon/video_link"), new akm("icon/video_link_highlighted"));
      private static final wx e = wx.c("mco.template.info.tooltip");
      private static final wx f = wx.c("mco.template.trailer.tooltip");
      public final faq a;
      private long g;
      @Nullable
      private fgl h;
      @Nullable
      private fgl i;

      public a(faq $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fgl(15, 15, c, fkp.b(fbz.this, $$0.e), e);
            this.h.a(fhk.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fgl(15, 15, d, fkp.b(fbz.this, $$0.g), f);
            this.i.a(fhk.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fbz.this.M = this.a;
         fbz.this.C();
         if (ac.c() - this.g < 250L && this.aI_()) {
            fbz.this.G.accept(this.a);
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
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fco.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fbz.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fbz.this.p.b(this.a.c);
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
         $$0.a(fbz.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fbz.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fbz.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fbz.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public wx a() {
         wx $$0 = ww.b(
            wx.b(this.a.b), wx.a("mco.template.select.narrate.authors", this.a.d), wx.b(this.a.h), wx.a("mco.template.select.narrate.version", this.a.c)
         );
         return wx.a("narrator.select", $$0);
      }
   }

   class b extends gtx<fbz.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<faq> $$0) {
         super(fbz.this.n, fbz.this.o - 33 - fbz.this.I(), fbz.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(faq $$0) {
         this.a((fbz.a)(fbz.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (fbz.this.N != null) {
            fkp.a(fbz.this, fbz.this.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fbz.a $$0) {
         super.a($$0);
         fbz.this.M = $$0 == null ? null : $$0.a;
         fbz.this.C();
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

      public List<faq> d() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
