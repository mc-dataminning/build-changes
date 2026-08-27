import java.util.List;
import javax.annotation.Nullable;

public class bzh extends bzy {
   @Nullable
   private bvt e;

   public bzh(bja<? extends bzh> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bzh.b());
      this.bO.a(2, new bpo<>(this, cca.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new bzh.c());
      this.bO.a(5, new bzh.a());
      this.bO.a(6, new bzh.d());
      this.bO.a(8, new bre(this, 0.6));
      this.bO.a(9, new bqp(this, cca.class, 3.0F, 1.0F));
      this.bO.a(10, new bqp(this, bjo.class, 8.0F));
      this.bP.a(1, new brz(this, cdi.class).a());
      this.bP.a(2, new bsa<>(this, cca.class, true).c(300));
      this.bP.a(3, new bsa<>(this, cbi.class, false).c(300));
      this.bP.a(3, new bsa<>(this, bvj.class, false));
   }

   public static bkr.a t() {
      return bzo.gk().a(bks.m, 0.5).a(bks.g, 12.0).a(bks.l, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
   }

   @Override
   public apf ac_() {
      return apg.hs;
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public boolean s(biw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof cac) {
         return this.s(((cac)$$0).t());
      } else {
         return $$0 instanceof bjm && ((bjm)$$0).eR() == bjr.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected apf w() {
      return apg.hq;
   }

   @Override
   protected apf l_() {
      return apg.ht;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.hv;
   }

   void a(@Nullable bvt $$0) {
      this.e = $$0;
   }

   @Nullable
   bvt gx() {
      return this.e;
   }

   @Override
   protected apf ge() {
      return apg.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzy.c {
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
         bjm $$0 = bzh.this.q();
         double $$1 = Math.min($$0.ds(), bzh.this.ds());
         double $$2 = Math.max($$0.ds(), bzh.this.ds()) + 1.0;
         float $$3 = (float)asb.d($$0.dw() - bzh.this.dw(), $$0.dq() - bzh.this.dq());
         if (bzh.this.f((biw)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(bzh.this.dq() + (double)asb.b($$5) * 1.5, bzh.this.dw() + (double)asb.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(bzh.this.dq() + (double)asb.b($$7) * 2.5, bzh.this.dw() + (double)asb.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(bzh.this.dq() + (double)asb.b($$3) * $$9, bzh.this.dw() + (double)asb.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gw $$6 = gw.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gw $$9 = $$6.d();
            dfd $$10 = bzh.this.dL().a_($$9);
            if ($$10.d(bzh.this.dL(), $$9, ha.b)) {
               if (!bzh.this.dL().t($$6)) {
                  dfd $$11 = bzh.this.dL().a_($$6);
                  eia $$12 = $$11.k(bzh.this.dL(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ha.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= asb.a($$2) - 1);

         if ($$7) {
            bzh.this.dL().b(new cck(bzh.this.dL(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, bzh.this));
            bzh.this.dL().a(djn.t, new ehh($$0, (double)$$6.v() + $$8, $$1), djn.a.a(bzh.this));
         }
      }

      @Override
      protected apf l() {
         return apg.hw;
      }

      @Override
      protected bzy.a m() {
         return bzy.a.c;
      }
   }

   class b extends bzy.b {
      @Override
      public void e() {
         if (bzh.this.q() != null) {
            bzh.this.G().a(bzh.this.q(), (float)bzh.this.Z(), (float)bzh.this.Y());
         } else if (bzh.this.gx() != null) {
            bzh.this.G().a(bzh.this.gx(), (float)bzh.this.Z(), (float)bzh.this.Y());
         }
      }
   }

   class c extends bzy.c {
      private final bty e = bty.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = bzh.this.dL().a(cac.class, this.e, bzh.this, bzh.this.cG().g(16.0)).size();
            return bzh.this.ag.a(8) + 1 > $$0;
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
         akt $$0 = (akt)bzh.this.dL();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = bzh.this.dl().b(-2 + bzh.this.ag.a(5), 1, -2 + bzh.this.ag.a(5));
            cac $$3 = bja.be.a(bzh.this.dL());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, bzh.this.dL().d_($$2), bjq.f, null, null);
               $$3.a(bzh.this);
               $$3.i($$2);
               $$3.b(20 * (30 + bzh.this.ag.a(90)));
               $$0.a_($$3);
               $$0.a(djn.t, $$2, djn.a.a(bzh.this));
            }
         }
      }

      @Override
      protected apf l() {
         return apg.hx;
      }

      @Override
      protected bzy.a m() {
         return bzy.a.b;
      }
   }

   public class d extends bzy.c {
      private final bty e = bty.b().a(16.0).a($$0x -> ((bvt)$$0x).t() == chz.l);

      @Override
      public boolean a() {
         if (bzh.this.q() != null) {
            return false;
         } else if (bzh.this.go()) {
            return false;
         } else if (bzh.this.ah < this.c) {
            return false;
         } else if (!bzh.this.dL().X().b(cpx.c)) {
            return false;
         } else {
            List<bvt> $$0 = bzh.this.dL().a(bvt.class, this.e, bzh.this, bzh.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               bzh.this.a($$0.get(bzh.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return bzh.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         bzh.this.a(null);
      }

      @Override
      protected void k() {
         bvt $$0 = bzh.this.gx();
         if ($$0 != null && $$0.bv()) {
            $$0.b(chz.o);
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
      protected apf l() {
         return apg.hy;
      }

      @Override
      protected bzy.a m() {
         return bzy.a.d;
      }
   }
}
