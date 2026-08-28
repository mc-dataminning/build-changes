import java.util.List;
import javax.annotation.Nullable;

public class cmp extends cng {
   @Nullable
   private cis a;

   public cmp(bvq<? extends cmp> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cmp.b());
      this.bT.a(2, new cck<>(this, cpw.class, 8.0F, 0.6, 1.0));
      this.bT.a(3, new cck<>(this, coa.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cmp.c());
      this.bT.a(5, new cmp.a());
      this.bT.a(6, new cmp.d());
      this.bT.a(8, new cea(this, 0.6));
      this.bT.a(9, new cdl(this, cpw.class, 3.0F, 1.0F));
      this.bT.a(10, new cdl(this, bwh.class, 8.0F));
      this.bU.a(1, new cev(this, crk.class).a());
      this.bU.a(2, new cew<>(this, cpw.class, true).c(300));
      this.bU.a(3, new cew<>(this, cpd.class, false).c(300));
      this.bU.a(3, new cew<>(this, cii.class, false));
   }

   public static bxm.a p() {
      return cmw.gr().a(bxn.v, 0.5).a(bxn.m, 12.0).a(bxn.s, 24.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
   }

   @Override
   public axe ak_() {
      return axf.iT;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bvj $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cnk $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected axe u() {
      return axf.iR;
   }

   @Override
   protected axe o_() {
      return axf.iU;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.iW;
   }

   void a(@Nullable cis $$0) {
      this.a = $$0;
   }

   @Nullable
   cis gG() {
      return this.a;
   }

   @Override
   protected axe x() {
      return axf.iS;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   class a extends cng.c {
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
         bwf $$0 = cmp.this.O_();
         double $$1 = Math.min($$0.dC(), cmp.this.dC());
         double $$2 = Math.max($$0.dC(), cmp.this.dC()) + 1.0;
         float $$3 = (float)bae.d($$0.dG() - cmp.this.dG(), $$0.dA() - cmp.this.dA());
         if (cmp.this.g((bvj)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cmp.this.dA() + (double)bae.b($$5) * 1.5, cmp.this.dG() + (double)bae.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cmp.this.dA() + (double)bae.b($$7) * 2.5, cmp.this.dG() + (double)bae.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cmp.this.dA() + (double)bae.b($$3) * $$9, cmp.this.dG() + (double)bae.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jh $$6 = jh.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jh $$9 = $$6.e();
            dxu $$10 = cmp.this.dV().a_($$9);
            if ($$10.c(cmp.this.dV(), $$9, jm.b)) {
               if (!cmp.this.dV().u($$6)) {
                  dxu $$11 = cmp.this.dV().a_($$6);
                  fcr $$12 = $$11.g(cmp.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jm.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= bae.a($$2) - 1);

         if ($$7) {
            cmp.this.dV().b(new cqh(cmp.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cmp.this));
            cmp.this.dV().a(ecq.t, new fbx($$0, (double)$$6.v() + $$8, $$1), ecq.a.a(cmp.this));
         }
      }

      @Override
      protected axe l() {
         return axf.iX;
      }

      @Override
      protected cng.a m() {
         return cng.a.c;
      }
   }

   class b extends cng.b {
      @Override
      public void a() {
         if (cmp.this.O_() != null) {
            cmp.this.H().a(cmp.this.O_(), (float)cmp.this.aa(), (float)cmp.this.Z());
         } else if (cmp.this.gG() != null) {
            cmp.this.H().a(cmp.this.gG(), (float)cmp.this.aa(), (float)cmp.this.Z());
         }
      }
   }

   class c extends cng.c {
      private final cgw e = cgw.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cmp.this.dV()).a(cnk.class, this.e, cmp.this, cmp.this.cR().g(16.0)).size();
            return cmp.this.ae.a(8) + 1 > $$0;
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
         ash $$0 = (ash)cmp.this.dV();
         fcx $$1 = cmp.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jh $$3 = cmp.this.dv().b(-2 + cmp.this.ae.a(5), 1, -2 + cmp.this.ae.a(5));
            cnk $$4 = bvq.bC.a(cmp.this.dV(), bvp.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cmp.this.dV().d_($$3), bvp.f, null);
               $$4.a(cmp.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cmp.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ecq.t, $$3, ecq.a.a(cmp.this));
            }
         }
      }

      @Override
      protected axe l() {
         return axf.iY;
      }

      @Override
      protected cng.a m() {
         return cng.a.b;
      }
   }

   public class d extends cng.c {
      private final cgw e = cgw.b().a(16.0).a(($$0x, $$1) -> ((cis)$$0x).t() == cwl.l);

      @Override
      public boolean b() {
         if (cmp.this.O_() != null) {
            return false;
         } else if (cmp.this.gv()) {
            return false;
         } else if (cmp.this.af < this.c) {
            return false;
         } else {
            ash $$0 = a(cmp.this.dV());
            if (!$$0.N().b(dhd.c)) {
               return false;
            } else {
               List<cis> $$1 = $$0.a(cis.class, this.e, cmp.this, cmp.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cmp.this.a($$1.get(cmp.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cmp.this.gG() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cmp.this.a(null);
      }

      @Override
      protected void k() {
         cis $$0 = cmp.this.gG();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cwl.o);
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
      protected axe l() {
         return axf.iZ;
      }

      @Override
      protected cng.a m() {
         return cng.a.d;
      }
   }
}
