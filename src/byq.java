import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byq extends bza implements bjf {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bkc d = new bkc(c, "Attacking speed boost", 0.15F, bkc.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final adz<Optional<dez>> bU = aec.a(byq.class, aeb.j);
   private static final adz<Boolean> bV = aec.a(byq.class, aeb.k);
   private static final adz<Boolean> bW = aec.a(byq.class, aeb.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bgb bZ = asm.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public byq(bim<? extends byq> $$0, cpl $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(ean.j, -1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new byq.a(this));
      this.bO.a(2, new bqd(this, 1.0, false));
      this.bO.a(7, new brg(this, 1.0, 0.0F));
      this.bO.a(8, new bqb(this, cbm.class, 8.0F));
      this.bO.a(8, new bqo(this));
      this.bO.a(10, new byq.b(this));
      this.bO.a(11, new byq.d(this));
      this.bP.a(1, new byq.c(this, this::a_));
      this.bP.a(2, new brl(this));
      this.bP.a(3, new brm<>(this, byr.class, true, false));
      this.bP.a(4, new brs<>(this, false));
   }

   public static bkd.a p() {
      return bza.gg().a(bke.a, 40.0).a(bke.d, 0.3F).a(bke.f, 7.0).a(bke.b, 64.0);
   }

   @Override
   public void h(@Nullable biy $$0) {
      super.h($$0);
      bka $$1 = this.a(bke.d);
      if ($$0 == null) {
         this.bY = 0;
         this.an.b(bV, false);
         this.an.b(bW, false);
         $$1.b(d.a());
      } else {
         this.bY = this.ah;
         this.an.b(bV, true);
         if (!$$1.a(d)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, Optional.empty());
      this.an.a(bV, false);
      this.an.a(bW, false);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   public void q() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dt(), this.dv(), aow.hg, this.da(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(adz<?> $$0) {
      if (bV.equals($$0) && this.gc() && this.dK().B) {
         this.q();
      }

      super.a($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      dez $$1 = this.ga();
      if ($$1 != null) {
         $$0.a("carriedBlockState", rd.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      dez $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = rd.a(this.dK().a(jc.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dK(), $$0);
   }

   boolean g(cbm $$0) {
      cix $$1 = $$0.fQ().j.get(3);
      if ($$1.a(csm.ef.k())) {
         return false;
      } else {
         ehd $$2 = $$0.f(1.0F).d();
         ehd $$3 = new ehd(this.dp() - $$0.dp(), this.dt() - $$0.dt(), this.dv() - $$0.dv());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void b_() {
      if (this.dK().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dK().a(iv.X, this.d(0.5), this.ds() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dK().B) {
         this.a((akk)this.dK(), true);
      }

      super.b_();
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   protected void V() {
      if (this.dK().N() && this.ah >= this.bY + 600) {
         float $$0 = this.bm();
         if ($$0 > 0.5F && this.dK().g(this.dk()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.V();
   }

   protected boolean t() {
      if (!this.dK().r_() && this.bv()) {
         double $$0 = this.dp() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.dr() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dv() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bii $$0) {
      ehd $$1 = new ehd(this.dp() - $$0.dp(), this.e(0.5) - $$0.dt(), this.dv() - $$0.dv());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dp() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dr() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dv() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      gu.a $$3 = new gu.a($$0, $$1, $$2);

      while ($$3.v() > this.dK().C_() && !this.dK().a_($$3).d()) {
         $$3.c(ha.a);
      }

      dez $$4 = this.dK().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(apq.a);
      if ($$5 && !$$6) {
         ehd $$7 = this.di();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dK().a(djj.R, $$7, djj.a.a(this));
            if (!this.aS()) {
               this.dK().a(null, this.K, this.L, this.M, aow.hh, this.da(), 1.0F, 1.0F);
               this.a(aow.hh, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aov r() {
      return this.gb() ? aow.hf : aow.hc;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.he;
   }

   @Override
   protected aov h_() {
      return aow.hd;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dez $$3 = this.ga();
      if ($$3 != null) {
         cix $$4 = new cix(cja.ou);
         $$4.a(cni.v, 1);
         ecm.a $$5 = new ecm.a((akk)this.dK()).a(eer.f, this.di()).a(eer.i, $$4).b(eer.a, this);

         for (cix $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dez $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dez ga() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof ccp;
         if (!$$0.a(apn.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dK().r_() && !($$0.d() instanceof biy) && this.ag.a(10) != 0) {
               this.t();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (ccp)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bhg $$0, ccp $$1, float $$2) {
      cix $$3 = $$1.j();
      cku $$4 = ckw.d($$3);
      List<bhv> $$5 = ckw.a($$3);
      boolean $$6 = $$4 == ckx.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gb() {
      return this.an.b(bV);
   }

   public boolean gc() {
      return this.an.b(bW);
   }

   public void gd() {
      this.an.b(bW, true);
   }

   @Override
   public boolean R() {
      return super.R() || this.ga() != null;
   }

   static class a extends bpt {
      private final byq a;
      @Nullable
      private biy b;

      public a(byq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.c, bpt.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.j();
         if (!(this.b instanceof cbm)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cbm)this.b);
         }
      }

      @Override
      public void c() {
         this.a.H().n();
      }

      @Override
      public void e() {
         this.a.D().a(this.b.dp(), this.b.dt(), this.b.dv());
      }
   }

   static class b extends bpt {
      private final byq a;

      public b(byq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ga() == null) {
            return false;
         } else {
            return !this.a.dK().X().b(cph.c) ? false : this.a.ee().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         aru $$0 = this.a.ee();
         cpl $$1 = this.a.dK();
         int $$2 = arp.a(this.a.dp() - 1.0 + $$0.j() * 2.0);
         int $$3 = arp.a(this.a.dr() + $$0.j() * 2.0);
         int $$4 = arp.a(this.a.dv() - 1.0 + $$0.j() * 2.0);
         gu $$5 = new gu($$2, $$3, $$4);
         dez $$6 = $$1.a_($$5);
         gu $$7 = $$5.d();
         dez $$8 = $$1.a_($$7);
         dez $$9 = this.a.ga();
         if ($$9 != null) {
            $$9 = csl.b($$9, this.a.dK(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(djj.i, $$5, djj.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cpl $$0, gu $$1, dez $$2, dez $$3, dez $$4, gu $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(csm.F) && $$4.r($$0, $$5) && $$2.a((cpo)$$0, $$1) && $$0.a_(this.a, egy.a(ehd.a($$1))).isEmpty();
      }
   }

   static class c extends brm<cbm> {
      private final byq i;
      @Nullable
      private cbm j;
      private int k;
      private int l;
      private final btk m;
      private final btk n = btk.a().d();
      private final Predicate<biy> o;

      public c(byq $$0, @Nullable Predicate<biy> $$1) {
         super($$0, cbm.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cbm)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = btk.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dK().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gd();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.z(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.j() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bN()) {
               if (this.i.g((cbm)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.t();
                  }

                  this.l = 0;
               } else if (this.c.f(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.a(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends bpt {
      private final byq a;

      public d(byq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ga() != null) {
            return false;
         } else {
            return !this.a.dK().X().b(cph.c) ? false : this.a.ee().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         aru $$0 = this.a.ee();
         cpl $$1 = this.a.dK();
         int $$2 = arp.a(this.a.dp() - 2.0 + $$0.j() * 4.0);
         int $$3 = arp.a(this.a.dr() + $$0.j() * 3.0);
         int $$4 = arp.a(this.a.dv() - 2.0 + $$0.j() * 4.0);
         gu $$5 = new gu($$2, $$3, $$4);
         dez $$6 = $$1.a_($$5);
         ehd $$7 = new ehd((double)this.a.do() + 0.5, (double)$$3 + 0.5, (double)this.a.du() + 0.5);
         ehd $$8 = new ehd((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         egz $$9 = $$1.a(new cou($$7, $$8, cou.a.b, cou.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(apl.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(djj.f, $$5, djj.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
