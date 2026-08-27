import java.util.List;
import javax.annotation.Nullable;

public class byw extends bzn {
   @Nullable
   private bvi e;

   public byw(bip<? extends byw> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new byw.b());
      this.bO.a(2, new bpd<>(this, cbp.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new byw.c());
      this.bO.a(5, new byw.a());
      this.bO.a(6, new byw.d());
      this.bO.a(8, new bqt(this, 0.6));
      this.bO.a(9, new bqe(this, cbp.class, 3.0F, 1.0F));
      this.bO.a(10, new bqe(this, bjd.class, 8.0F));
      this.bP.a(1, new bro(this, ccx.class).a());
      this.bP.a(2, new brp<>(this, cbp.class, true).c(300));
      this.bP.a(3, new brp<>(this, cax.class, false).c(300));
      this.bP.a(3, new brp<>(this, buy.class, false));
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.d, 0.5).a(bkh.b, 12.0).a(bkh.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
   }

   @Override
   public aoy X_() {
      return aoz.hs;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
   }

   @Override
   protected void V() {
      super.V();
   }

   @Override
   public boolean s(bil $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof bzr) {
         return this.s(((bzr)$$0).q());
      } else {
         return $$0 instanceof bjb && ((bjb)$$0).eQ() == bjg.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aoy r() {
      return aoz.hq;
   }

   @Override
   protected aoy h_() {
      return aoz.ht;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.hv;
   }

   void a(@Nullable bvi $$0) {
      this.e = $$0;
   }

   @Nullable
   bvi gt() {
      return this.e;
   }

   @Override
   protected aoy ga() {
      return aoz.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzn.c {
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
         bjb $$0 = byw.this.j();
         double $$1 = Math.min($$0.dr(), byw.this.dr());
         double $$2 = Math.max($$0.dr(), byw.this.dr()) + 1.0;
         float $$3 = (float)ars.d($$0.dv() - byw.this.dv(), $$0.dp() - byw.this.dp());
         if (byw.this.f((bil)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(byw.this.dp() + (double)ars.b($$5) * 1.5, byw.this.dv() + (double)ars.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(byw.this.dp() + (double)ars.b($$7) * 2.5, byw.this.dv() + (double)ars.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(byw.this.dp() + (double)ars.b($$3) * $$9, byw.this.dv() + (double)ars.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gw $$6 = gw.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gw $$9 = $$6.d();
            dfe $$10 = byw.this.dK().a_($$9);
            if ($$10.d(byw.this.dK(), $$9, hc.b)) {
               if (!byw.this.dK().t($$6)) {
                  dfe $$11 = byw.this.dK().a_($$6);
                  eib $$12 = $$11.k(byw.this.dK(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hc.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ars.a($$2) - 1);

         if ($$7) {
            byw.this.dK().b(new cbz(byw.this.dK(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, byw.this));
            byw.this.dK().a(djo.t, new ehi($$0, (double)$$6.v() + $$8, $$1), djo.a.a(byw.this));
         }
      }

      @Override
      protected aoy l() {
         return aoz.hw;
      }

      @Override
      protected bzn.a m() {
         return bzn.a.c;
      }
   }

   class b extends bzn.b {
      @Override
      public void e() {
         if (byw.this.j() != null) {
            byw.this.D().a(byw.this.j(), (float)byw.this.X(), (float)byw.this.W());
         } else if (byw.this.gt() != null) {
            byw.this.D().a(byw.this.gt(), (float)byw.this.X(), (float)byw.this.W());
         }
      }
   }

   class c extends bzn.c {
      private final btn e = btn.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = byw.this.dK().a(bzr.class, this.e, byw.this, byw.this.cG().g(16.0)).size();
            return byw.this.ag.a(8) + 1 > $$0;
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
         akn $$0 = (akn)byw.this.dK();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = byw.this.dk().b(-2 + byw.this.ag.a(5), 1, -2 + byw.this.ag.a(5));
            bzr $$3 = bip.be.a(byw.this.dK());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, byw.this.dK().d_($$2), bjf.f, null, null);
               $$3.a(byw.this);
               $$3.i($$2);
               $$3.b(20 * (30 + byw.this.ag.a(90)));
               $$0.a_($$3);
               $$0.a(djo.t, $$2, djo.a.a(byw.this));
            }
         }
      }

      @Override
      protected aoy l() {
         return aoz.hx;
      }

      @Override
      protected bzn.a m() {
         return bzn.a.b;
      }
   }

   public class d extends bzn.c {
      private final btn e = btn.b().a(16.0).a($$0x -> ((bvi)$$0x).q() == cho.l);

      @Override
      public boolean a() {
         if (byw.this.j() != null) {
            return false;
         } else if (byw.this.gk()) {
            return false;
         } else if (byw.this.ah < this.c) {
            return false;
         } else if (!byw.this.dK().X().b(cpm.c)) {
            return false;
         } else {
            List<bvi> $$0 = byw.this.dK().a(bvi.class, this.e, byw.this, byw.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               byw.this.a($$0.get(byw.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return byw.this.gt() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         byw.this.a(null);
      }

      @Override
      protected void k() {
         bvi $$0 = byw.this.gt();
         if ($$0 != null && $$0.bv()) {
            $$0.b(cho.o);
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
      protected aoy l() {
         return aoz.hy;
      }

      @Override
      protected bzn.a m() {
         return bzn.a.d;
      }
   }
}
