import java.util.List;
import javax.annotation.Nullable;

public class ccp extends cdg {
   @Nullable
   private byy e;

   public ccp(bmc<? extends ccp> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(1, new ccp.b());
      this.bP.a(2, new bsr<>(this, cfq.class, 8.0F, 0.6, 1.0));
      this.bP.a(4, new ccp.c());
      this.bP.a(5, new ccp.a());
      this.bP.a(6, new ccp.d());
      this.bP.a(8, new buh(this, 0.6));
      this.bP.a(9, new bts(this, cfq.class, 3.0F, 1.0F));
      this.bP.a(10, new bts(this, bmq.class, 8.0F));
      this.bQ.a(1, new bvc(this, cgz.class).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, true).c(300));
      this.bQ.a(3, new bvd<>(this, cey.class, false).c(300));
      this.bQ.a(3, new bvd<>(this, byo.class, false));
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.o, 0.5).a(bnu.i, 12.0).a(bnu.n, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
   }

   @Override
   public ars ag_() {
      return art.ik;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public boolean r(blw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.r($$0)) {
         return true;
      } else if ($$0 instanceof cdk) {
         return this.r(((cdk)$$0).A());
      } else {
         return $$0 instanceof bmo && ((bmo)$$0).eS() == bmt.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected ars y() {
      return art.ii;
   }

   @Override
   protected ars n_() {
      return art.il;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.in;
   }

   void a(@Nullable byy $$0) {
      this.e = $$0;
   }

   @Nullable
   byy gy() {
      return this.e;
   }

   @Override
   protected ars gf() {
      return art.ij;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cdg.c {
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
         bmo $$0 = ccp.this.q();
         double $$1 = Math.min($$0.ds(), ccp.this.ds());
         double $$2 = Math.max($$0.ds(), ccp.this.ds()) + 1.0;
         float $$3 = (float)aup.d($$0.dw() - ccp.this.dw(), $$0.dq() - ccp.this.dq());
         if (ccp.this.f((blw)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(ccp.this.dq() + (double)aup.b($$5) * 1.5, ccp.this.dw() + (double)aup.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(ccp.this.dq() + (double)aup.b($$7) * 2.5, ccp.this.dw() + (double)aup.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(ccp.this.dq() + (double)aup.b($$3) * $$9, ccp.this.dw() + (double)aup.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hx $$6 = hx.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hx $$9 = $$6.d();
            djp $$10 = ccp.this.dL().a_($$9);
            if ($$10.d(ccp.this.dL(), $$9, ic.b)) {
               if (!ccp.this.dL().u($$6)) {
                  djp $$11 = ccp.this.dL().a_($$6);
                  emv $$12 = $$11.k(ccp.this.dL(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ic.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aup.a($$2) - 1);

         if ($$7) {
            ccp.this.dL().b(new cga(ccp.this.dL(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, ccp.this));
            ccp.this.dL().a(dnz.t, new emc($$0, (double)$$6.v() + $$8, $$1), dnz.a.a(ccp.this));
         }
      }

      @Override
      protected ars l() {
         return art.io;
      }

      @Override
      protected cdg.a m() {
         return cdg.a.c;
      }
   }

   class b extends cdg.b {
      @Override
      public void e() {
         if (ccp.this.q() != null) {
            ccp.this.I().a(ccp.this.q(), (float)ccp.this.fH(), (float)ccp.this.ab());
         } else if (ccp.this.gy() != null) {
            ccp.this.I().a(ccp.this.gy(), (float)ccp.this.fH(), (float)ccp.this.ab());
         }
      }
   }

   class c extends cdg.c {
      private final bxd e = bxd.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = ccp.this.dL().a(cdk.class, this.e, ccp.this, ccp.this.cH().g(16.0)).size();
            return ccp.this.ag.a(8) + 1 > $$0;
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
         ane $$0 = (ane)ccp.this.dL();
         enb $$1 = ccp.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hx $$3 = ccp.this.dl().b(-2 + ccp.this.ag.a(5), 1, -2 + ccp.this.ag.a(5));
            cdk $$4 = bmc.bg.a(ccp.this.dL());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, ccp.this.dL().d_($$3), bms.f, null, null);
               $$4.a(ccp.this);
               $$4.i($$3);
               $$4.b(20 * (30 + ccp.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dnz.t, $$3, dnz.a.a(ccp.this));
            }
         }
      }

      @Override
      protected ars l() {
         return art.ip;
      }

      @Override
      protected cdg.a m() {
         return cdg.a.b;
      }
   }

   public class d extends cdg.c {
      private final bxd e = bxd.b().a(16.0).a($$0x -> ((byy)$$0x).w() == clv.l);

      @Override
      public boolean a() {
         if (ccp.this.q() != null) {
            return false;
         } else if (ccp.this.gp()) {
            return false;
         } else if (ccp.this.ah < this.c) {
            return false;
         } else if (!ccp.this.dL().Z().b(ctt.c)) {
            return false;
         } else {
            List<byy> $$0 = ccp.this.dL().a(byy.class, this.e, ccp.this, ccp.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               ccp.this.a($$0.get(ccp.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return ccp.this.gy() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         ccp.this.a(null);
      }

      @Override
      protected void k() {
         byy $$0 = ccp.this.gy();
         if ($$0 != null && $$0.bx()) {
            $$0.b(clv.o);
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
      protected ars l() {
         return art.iq;
      }

      @Override
      protected cdg.a m() {
         return cdg.a.d;
      }
   }
}
