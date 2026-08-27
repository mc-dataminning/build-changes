import java.util.List;
import javax.annotation.Nullable;

public class cae extends cav {
   @Nullable
   private bwq e;

   public cae(bjx<? extends cae> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new cae.b());
      this.bO.a(2, new bql<>(this, ccx.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cae.c());
      this.bO.a(5, new cae.a());
      this.bO.a(6, new cae.d());
      this.bO.a(8, new bsb(this, 0.6));
      this.bO.a(9, new brm(this, ccx.class, 3.0F, 1.0F));
      this.bO.a(10, new brm(this, bkl.class, 8.0F));
      this.bP.a(1, new bsw(this, cef.class).a());
      this.bP.a(2, new bsx<>(this, ccx.class, true).c(300));
      this.bP.a(3, new bsx<>(this, ccf.class, false).c(300));
      this.bP.a(3, new bsx<>(this, bwg.class, false));
   }

   public static blo.a t() {
      return cal.gk().a(blp.m, 0.5).a(blp.g, 12.0).a(blp.l, 24.0);
   }

   @Override
   protected void b_() {
      super.b_();
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
   }

   @Override
   public aqc ad_() {
      return aqd.hu;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public boolean s(bjt $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof caz) {
         return this.s(((caz)$$0).t());
      } else {
         return $$0 instanceof bkj && ((bkj)$$0).eR() == bko.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aqc w() {
      return aqd.hs;
   }

   @Override
   protected aqc m_() {
      return aqd.hv;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.hx;
   }

   void a(@Nullable bwq $$0) {
      this.e = $$0;
   }

   @Nullable
   bwq gx() {
      return this.e;
   }

   @Override
   protected aqc ge() {
      return aqd.ht;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cav.c {
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
         bkj $$0 = cae.this.q();
         double $$1 = Math.min($$0.ds(), cae.this.ds());
         double $$2 = Math.max($$0.ds(), cae.this.ds()) + 1.0;
         float $$3 = (float)asy.d($$0.dw() - cae.this.dw(), $$0.dq() - cae.this.dq());
         if (cae.this.f((bjt)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cae.this.dq() + (double)asy.b($$5) * 1.5, cae.this.dw() + (double)asy.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cae.this.dq() + (double)asy.b($$7) * 2.5, cae.this.dw() + (double)asy.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cae.this.dq() + (double)asy.b($$3) * $$9, cae.this.dw() + (double)asy.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ht $$6 = ht.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ht $$9 = $$6.d();
            dgb $$10 = cae.this.dL().a_($$9);
            if ($$10.d(cae.this.dL(), $$9, hx.b)) {
               if (!cae.this.dL().t($$6)) {
                  dgb $$11 = cae.this.dL().a_($$6);
                  eiy $$12 = $$11.k(cae.this.dL(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hx.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= asy.a($$2) - 1);

         if ($$7) {
            cae.this.dL().b(new cdh(cae.this.dL(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cae.this));
            cae.this.dL().a(dkl.t, new eif($$0, (double)$$6.v() + $$8, $$1), dkl.a.a(cae.this));
         }
      }

      @Override
      protected aqc l() {
         return aqd.hy;
      }

      @Override
      protected cav.a m() {
         return cav.a.c;
      }
   }

   class b extends cav.b {
      @Override
      public void e() {
         if (cae.this.q() != null) {
            cae.this.G().a(cae.this.q(), (float)cae.this.Z(), (float)cae.this.Y());
         } else if (cae.this.gx() != null) {
            cae.this.G().a(cae.this.gx(), (float)cae.this.Z(), (float)cae.this.Y());
         }
      }
   }

   class c extends cav.c {
      private final buv e = buv.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cae.this.dL().a(caz.class, this.e, cae.this, cae.this.cG().g(16.0)).size();
            return cae.this.ag.a(8) + 1 > $$0;
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
         alq $$0 = (alq)cae.this.dL();
         ejc $$1 = cae.this.cf();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ht $$3 = cae.this.dl().b(-2 + cae.this.ag.a(5), 1, -2 + cae.this.ag.a(5));
            caz $$4 = bjx.be.a(cae.this.dL());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cae.this.dL().d_($$3), bkn.f, null, null);
               $$4.a(cae.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cae.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cx(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dkl.t, $$3, dkl.a.a(cae.this));
            }
         }
      }

      @Override
      protected aqc l() {
         return aqd.hz;
      }

      @Override
      protected cav.a m() {
         return cav.a.b;
      }
   }

   public class d extends cav.c {
      private final buv e = buv.b().a(16.0).a($$0x -> ((bwq)$$0x).t() == cix.l);

      @Override
      public boolean a() {
         if (cae.this.q() != null) {
            return false;
         } else if (cae.this.go()) {
            return false;
         } else if (cae.this.ah < this.c) {
            return false;
         } else if (!cae.this.dL().X().b(cqv.c)) {
            return false;
         } else {
            List<bwq> $$0 = cae.this.dL().a(bwq.class, this.e, cae.this, cae.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cae.this.a($$0.get(cae.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cae.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cae.this.a(null);
      }

      @Override
      protected void k() {
         bwq $$0 = cae.this.gx();
         if ($$0 != null && $$0.bv()) {
            $$0.b(cix.o);
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
      protected aqc l() {
         return aqd.hA;
      }

      @Override
      protected cav.a m() {
         return cav.a.d;
      }
   }
}
