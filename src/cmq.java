import javax.annotation.Nullable;

public class cmq extends cnc implements cmw {
   private static final int bF = 4;
   private static final int bG = 3;
   public static final int a = 3;
   private int bH;
   private final fbx[][] bI;

   public cmq(bvi<? extends cmq> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bI = new fbx[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bI[0][$$2] = fbx.c;
         this.bI[1][$$2] = fbx.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cnc.b());
      this.bC.a(3, new ccd<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bC.a(4, new cmq.b());
      this.bC.a(5, new cmq.a());
      this.bC.a(6, new cdw<>(this, 0.5, 20, 15.0F));
      this.bC.a(8, new cdt(this, 0.6));
      this.bC.a(9, new cde(this, cpr.class, 3.0F, 1.0F));
      this.bC.a(10, new cde(this, bwa.class, 8.0F));
      this.bD.a(1, new ceo(this, crf.class).a());
      this.bD.a(2, new cep<>(this, cpr.class, true).c(300));
      this.bD.a(3, new cep<>(this, coy.class, false).c(300));
      this.bD.a(3, new cep<>(this, cib.class, false).c(300));
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.v, 0.5).a(bxg.m, 18.0).a(bxg.s, 32.0);
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.a(bvj.a, new cxh(cxl.pc));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dU().C && this.co()) {
         this.bH--;
         if (this.bH < 0) {
            this.bH = 0;
         }

         if (this.aN == 1 || this.af % 1200 == 0) {
            this.bH = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bI[0][$$2] = this.bI[1][$$2];
               this.bI[1][$$2] = new fbx(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dU().a(lt.e, this.d(0.5), this.dC(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dU().a(this.dz(), this.dB(), this.dF(), awa.nG, this.dl(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bH = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bI[0][$$4] = this.bI[1][$$4];
               this.bI[1][$$4] = new fbx(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avz ah_() {
      return awa.nC;
   }

   public fbx[] K(float $$0) {
      if (this.bH <= 0) {
         return this.bI[1];
      } else {
         double $$1 = (double)(((float)this.bH - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fbx[] $$2 = new fbx[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bI[1][$$3].c(1.0 - $$1).e(this.bI[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avz u() {
      return awa.nC;
   }

   @Override
   protected avz l_() {
      return awa.nE;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.nF;
   }

   @Override
   protected avz q() {
      return awa.nD;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bvy $$0, float $$1) {
      cxh $$2 = this.b(cqm.a(this, cxl.pc));
      cxh $$3 = this.d($$2);
      cpy $$4 = cqm.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dz() - this.dz();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dB();
      double $$7 = $$0.dF() - this.dF();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dU() instanceof ard $$9) {
         cqk.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awa.xX, 1.0F, 1.0F / (this.dX().i() * 0.4F + 0.8F));
   }

   @Override
   public clz.a j() {
      if (this.gz()) {
         return clz.a.c;
      } else {
         return this.gj() ? clz.a.d : clz.a.a;
      }
   }

   class a extends cnc.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cmq.this.f() == null) {
            return false;
         } else {
            return cmq.this.f().ar() == this.e ? false : cmq.this.dU().d_(cmq.this.du()).a((float)bsv.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bvy $$0 = cmq.this.f();
         if ($$0 != null) {
            this.e = $$0.ar();
         }
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 180;
      }

      @Override
      protected void k() {
         cmq.this.f().b(new bue(bug.o, 400), cmq.this);
      }

      @Override
      protected avz l() {
         return awa.nH;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.f;
      }
   }

   class b extends cnc.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cmq.this.b(bug.n);
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         cmq.this.a(new bue(bug.n, 1200));
      }

      @Nullable
      @Override
      protected avz l() {
         return awa.nI;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.e;
      }
   }
}
