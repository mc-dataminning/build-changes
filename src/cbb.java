import java.util.List;
import javax.annotation.Nullable;

public class cbb extends cbs {
   @Nullable
   private bxn e;

   public cbb(bku<? extends cbb> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(1, new cbb.b());
      this.bO.a(2, new bri<>(this, cdu.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cbb.c());
      this.bO.a(5, new cbb.a());
      this.bO.a(6, new cbb.d());
      this.bO.a(8, new bsy(this, 0.6));
      this.bO.a(9, new bsj(this, cdu.class, 3.0F, 1.0F));
      this.bO.a(10, new bsj(this, bli.class, 8.0F));
      this.bP.a(1, new btt(this, cfc.class).a());
      this.bP.a(2, new btu<>(this, cdu.class, true).c(300));
      this.bP.a(3, new btu<>(this, cdc.class, false).c(300));
      this.bP.a(3, new btu<>(this, bxd.class, false));
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.m, 0.5).a(bmm.g, 12.0).a(bmm.l, 24.0);
   }

   @Override
   protected void b_() {
      super.b_();
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
   }

   @Override
   public aqq ae_() {
      return aqr.hM;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bkq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof cbw) {
         return this.s(((cbw)$$0).A());
      } else {
         return $$0 instanceof blg && ((blg)$$0).eT() == bll.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected aqq y() {
      return aqr.hK;
   }

   @Override
   protected aqq m_() {
      return aqr.hN;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.hP;
   }

   void a(@Nullable bxn $$0) {
      this.e = $$0;
   }

   @Nullable
   bxn gy() {
      return this.e;
   }

   @Override
   protected aqq gf() {
      return aqr.hL;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cbs.c {
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
         blg $$0 = cbb.this.q();
         double $$1 = Math.min($$0.du(), cbb.this.du());
         double $$2 = Math.max($$0.du(), cbb.this.du()) + 1.0;
         float $$3 = (float)atm.d($$0.dy() - cbb.this.dy(), $$0.ds() - cbb.this.ds());
         if (cbb.this.f((bkq)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cbb.this.ds() + (double)atm.b($$5) * 1.5, cbb.this.dy() + (double)atm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cbb.this.ds() + (double)atm.b($$7) * 2.5, cbb.this.dy() + (double)atm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cbb.this.ds() + (double)atm.b($$3) * $$9, cbb.this.dy() + (double)atm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ht $$6 = ht.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ht $$9 = $$6.d();
            dhi $$10 = cbb.this.dN().a_($$9);
            if ($$10.d(cbb.this.dN(), $$9, hx.b)) {
               if (!cbb.this.dN().t($$6)) {
                  dhi $$11 = cbb.this.dN().a_($$6);
                  ekn $$12 = $$11.k(cbb.this.dN(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hx.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= atm.a($$2) - 1);

         if ($$7) {
            cbb.this.dN().b(new cee(cbb.this.dN(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cbb.this));
            cbb.this.dN().a(dls.t, new eju($$0, (double)$$6.v() + $$8, $$1), dls.a.a(cbb.this));
         }
      }

      @Override
      protected aqq l() {
         return aqr.hQ;
      }

      @Override
      protected cbs.a m() {
         return cbs.a.c;
      }
   }

   class b extends cbs.b {
      @Override
      public void e() {
         if (cbb.this.q() != null) {
            cbb.this.I().a(cbb.this.q(), (float)cbb.this.ab(), (float)cbb.this.aa());
         } else if (cbb.this.gy() != null) {
            cbb.this.I().a(cbb.this.gy(), (float)cbb.this.ab(), (float)cbb.this.aa());
         }
      }
   }

   class c extends cbs.c {
      private final bvs e = bvs.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cbb.this.dN().a(cbw.class, this.e, cbb.this, cbb.this.cH().g(16.0)).size();
            return cbb.this.ag.a(8) + 1 > $$0;
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
         ame $$0 = (ame)cbb.this.dN();
         ekr $$1 = cbb.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ht $$3 = cbb.this.dn().b(-2 + cbb.this.ag.a(5), 1, -2 + cbb.this.ag.a(5));
            cbw $$4 = bku.be.a(cbb.this.dN());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cbb.this.dN().d_($$3), blk.f, null, null);
               $$4.a(cbb.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cbb.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dls.t, $$3, dls.a.a(cbb.this));
            }
         }
      }

      @Override
      protected aqq l() {
         return aqr.hR;
      }

      @Override
      protected cbs.a m() {
         return cbs.a.b;
      }
   }

   public class d extends cbs.c {
      private final bvs e = bvs.b().a(16.0).a($$0x -> ((bxn)$$0x).w() == cjx.l);

      @Override
      public boolean a() {
         if (cbb.this.q() != null) {
            return false;
         } else if (cbb.this.gp()) {
            return false;
         } else if (cbb.this.ah < this.c) {
            return false;
         } else if (!cbb.this.dN().Y().b(crw.c)) {
            return false;
         } else {
            List<bxn> $$0 = cbb.this.dN().a(bxn.class, this.e, cbb.this, cbb.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cbb.this.a($$0.get(cbb.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cbb.this.gy() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cbb.this.a(null);
      }

      @Override
      protected void k() {
         bxn $$0 = cbb.this.gy();
         if ($$0 != null && $$0.bx()) {
            $$0.b(cjx.o);
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
      protected aqq l() {
         return aqr.hS;
      }

      @Override
      protected cbs.a m() {
         return cbs.a.d;
      }
   }
}
