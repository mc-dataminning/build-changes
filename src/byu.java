import java.util.List;
import javax.annotation.Nullable;

public class byu extends bzl {
   @Nullable
   private bvg e;

   public byu(bim<? extends byu> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new byu.b());
      this.bO.a(2, new bpb<>(this, cbn.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new byu.c());
      this.bO.a(5, new byu.a());
      this.bO.a(6, new byu.d());
      this.bO.a(8, new bqr(this, 0.6));
      this.bO.a(9, new bqc(this, cbn.class, 3.0F, 1.0F));
      this.bO.a(10, new bqc(this, bja.class, 8.0F));
      this.bP.a(1, new brm(this, ccv.class).a());
      this.bP.a(2, new brn<>(this, cbn.class, true).c(300));
      this.bP.a(3, new brn<>(this, cav.class, false).c(300));
      this.bP.a(3, new brn<>(this, buw.class, false));
   }

   public static bke.a q() {
      return bzb.gf().a(bkf.d, 0.5).a(bkf.b, 12.0).a(bkf.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
   }

   @Override
   public aov Y_() {
      return aow.hs;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
   }

   @Override
   protected void V() {
      super.V();
   }

   @Override
   public boolean s(bii $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof bzp) {
         return this.s(((bzp)$$0).q());
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aov r() {
      return aow.hq;
   }

   @Override
   protected aov h_() {
      return aow.ht;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.hv;
   }

   void a(@Nullable bvg $$0) {
      this.e = $$0;
   }

   @Nullable
   bvg gs() {
      return this.e;
   }

   @Override
   protected aov fZ() {
      return aow.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzl.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         biy $$0 = byu.this.j();
         double $$1 = Math.min($$0.dr(), byu.this.dr());
         double $$2 = Math.max($$0.dr(), byu.this.dr()) + 1.0;
         float $$3 = (float)arp.d($$0.dv() - byu.this.dv(), $$0.dp() - byu.this.dp());
         if (byu.this.f((bii)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(byu.this.dp() + (double)arp.b($$5) * 1.5, byu.this.dv() + (double)arp.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(byu.this.dp() + (double)arp.b($$7) * 2.5, byu.this.dv() + (double)arp.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(byu.this.dp() + (double)arp.b($$3) * $$9, byu.this.dv() + (double)arp.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gu $$6 = gu.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gu $$9 = $$6.d();
            dfa $$10 = byu.this.dK().a_($$9);
            if ($$10.d(byu.this.dK(), $$9, ha.b)) {
               if (!byu.this.dK().t($$6)) {
                  dfa $$11 = byu.this.dK().a_($$6);
                  ehx $$12 = $$11.k(byu.this.dK(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ha.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= arp.a($$2) - 1);

         if ($$7) {
            byu.this.dK().b(new cbx(byu.this.dK(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, byu.this));
            byu.this.dK().a(djk.t, new ehe($$0, (double)$$6.v() + $$8, $$1), djk.a.a(byu.this));
         }
      }

      @Override
      protected aov l() {
         return aow.hw;
      }

      @Override
      protected bzl.a m() {
         return bzl.a.c;
      }
   }

   class b extends bzl.b {
      @Override
      public void e() {
         if (byu.this.j() != null) {
            byu.this.D().a(byu.this.j(), (float)byu.this.X(), (float)byu.this.W());
         } else if (byu.this.gs() != null) {
            byu.this.D().a(byu.this.gs(), (float)byu.this.X(), (float)byu.this.W());
         }
      }
   }

   class c extends bzl.c {
      private final btl e = btl.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = byu.this.dK().a(bzp.class, this.e, byu.this, byu.this.cG().g(16.0)).size();
            return byu.this.ag.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         akk $$0 = (akk)byu.this.dK();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gu $$2 = byu.this.dk().b(-2 + byu.this.ag.a(5), 1, -2 + byu.this.ag.a(5));
            bzp $$3 = bim.be.a(byu.this.dK());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, byu.this.dK().d_($$2), bjc.f, null, null);
               $$3.a(byu.this);
               $$3.i($$2);
               $$3.b(20 * (30 + byu.this.ag.a(90)));
               $$0.a_($$3);
               $$0.a(djk.t, $$2, djk.a.a(byu.this));
            }
         }
      }

      @Override
      protected aov l() {
         return aow.hx;
      }

      @Override
      protected bzl.a m() {
         return bzl.a.b;
      }
   }

   public class d extends bzl.c {
      private final btl e = btl.b().a(16.0).a($$0x -> ((bvg)$$0x).q() == chm.l);

      @Override
      public boolean a() {
         if (byu.this.j() != null) {
            return false;
         } else if (byu.this.gj()) {
            return false;
         } else if (byu.this.ah < this.c) {
            return false;
         } else if (!byu.this.dK().X().b(cpi.c)) {
            return false;
         } else {
            List<bvg> $$0 = byu.this.dK().a(bvg.class, this.e, byu.this, byu.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               byu.this.a($$0.get(byu.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return byu.this.gs() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         byu.this.a(null);
      }

      @Override
      protected void k() {
         bvg $$0 = byu.this.gs();
         if ($$0 != null && $$0.bv()) {
            $$0.b(chm.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected aov l() {
         return aow.hy;
      }

      @Override
      protected bzl.a m() {
         return bzl.a.d;
      }
   }
}
