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

public class fcb extends gty {
   static final Logger a = LogUtils.getLogger();
   static final akn b = new akn("widget/slot_frame");
   private static final wx c = wx.c("mco.template.button.select");
   private static final wx B = wx.c("mco.template.button.trailer");
   private static final wx C = wx.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fjn F = new fjn(this);
   final Consumer<fas> G;
   fcb.b H;
   private final fab.d I;
   private fga J;
   private fga K;
   private fga L;
   @Nullable
   fas M = null;
   @Nullable
   String N;
   @Nullable
   private wx[] O;
   @Nullable
   List<fcs.a> P;

   public fcb(wx $$0, Consumer<fas> $$1, fab.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fcb(wx $$0, Consumer<fas> $$1, fab.d $$2, @Nullable fat $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fcb.b();
         this.a(new fat(10));
      } else {
         this.H = new fcb.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wx... $$0) {
      this.O = $$0;
   }

   @Override
   public void aN_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fcb.b(this.H.d()));
      fjr $$0 = this.F.b(fjr.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fga.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(fga.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(fga.a(ww.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fga.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         ffy var10000 = this.c($$1);
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
         fkq.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         fkq.a(this, this.M.e);
      }
   }

   private void a(final fat $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fat $$0 = $$0;
            ezk $$1 = ezk.a();

            while ($$0 != null) {
               Either<fat, Exception> $$2 = fcb.this.a($$0, $$1);
               $$0 = fcb.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fcb.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fcb.this.H.c()) {
                        fcb.this.P = fcs.a(gpb.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fat $$1x = (fat)$$2.left().get();

                     for (fas $$2x : $$1x.a) {
                        fcb.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fcb.this.H.c()) {
                           String $$3 = gpb.a("mco.template.select.none", "%link");
                           fcs.b $$4 = fcs.b.a(gpb.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fcb.this.P = fcs.a($$3, $$4);
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

   Either<fat, Exception> a(fat $$0, ezk $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fax var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
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

   private void a(ffn $$0, int $$1, int $$2, List<fcs.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fcs.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fcs.b $$9 : $$5.a) {
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

   class a extends fgw.a<fcb.a> {
      private static final fhn c = new fhn(new akn("icon/link"), new akn("icon/link_highlighted"));
      private static final fhn d = new fhn(new akn("icon/video_link"), new akn("icon/video_link_highlighted"));
      private static final wx e = wx.c("mco.template.info.tooltip");
      private static final wx f = wx.c("mco.template.trailer.tooltip");
      public final fas a;
      private long g;
      @Nullable
      private fgm h;
      @Nullable
      private fgm i;

      public a(fas $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fgm(15, 15, c, fkq.b(fcb.this, $$0.e), e);
            this.h.a(fhl.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fgm(15, 15, d, fkq.b(fcb.this, $$0.g), f);
            this.i.a(fhl.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fcb.this.M = this.a;
         fcb.this.C();
         if (ac.c() - this.g < 250L && this.aJ_()) {
            fcb.this.G.accept(this.a);
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
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcq.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fcb.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fcb.this.p.b(this.a.c);
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
         $$0.a(fcb.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fcb.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fcb.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fcb.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gtx<fcb.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<fas> $$0) {
         super(fcb.this.n, fcb.this.o - 33 - fcb.this.I(), fcb.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(fas $$0) {
         this.a((fcb.a)(fcb.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (fcb.this.N != null) {
            fkq.a(fcb.this, fcb.this.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fcb.a $$0) {
         super.a($$0);
         fcb.this.M = $$0 == null ? null : $$0.a;
         fcb.this.C();
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

      public List<fas> d() {
         return this.aF_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
