import javax.annotation.Nullable;

public class cjq extends cje {
   private static final byte c = 10;
   private int d = -1;

   public cjq(bnw<? extends cjq> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cjq(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.bb, $$0, $$1, $$2, $$3);
   }

   @Override
   public cje.a w() {
      return cje.a.d;
   }

   @Override
   public dlj y() {
      return cyu.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dM().a(jz.ab, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dp().i());
      }

      if (this.O) {
         double $$0 = this.dp().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if ($$0.c() instanceof chr $$3 && $$3.bN()) {
         bmp $$4 = this.dN().d(this, $$0.d());
         this.a($$4, $$3.dp().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bmp $$0) {
      double $$1 = this.dp().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ai_());
      } else {
         if (this.d < 0) {
            this.C();
            this.d = this.af.a(20) + this.af.a(20);
         }
      }
   }

   @Override
   protected coy ai_() {
      return cpg.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bmp $$0, double $$1) {
      if (!this.dM().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dM().a(this, $$0, null, this.dr(), this.dt(), this.dx(), (float)(4.0 + this.af.j() * 1.5 * $$2), false, cvr.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.C();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.C();
      } else {
         super.b($$0);
      }
   }

   public void C() {
      this.d = 80;
      if (!this.dM().B) {
         this.dM().a(this, (byte)10);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.yR, atm.e, 1.0F, 1.0F);
         }
      }
   }

   public int D() {
      return this.d;
   }

   public boolean E() {
      return this.d > -1;
   }

   @Override
   public float a(cvj $$0, cux $$1, hz $$2, dlj $$3, egw $$4, float $$5) {
      return !this.E() || !$$3.a(aua.N) && !$$1.a_($$2.c()).a(aua.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cvj $$0, cux $$1, hz $$2, dlj $$3, float $$4) {
      return !this.E() || !$$3.a(aua.N) && !$$1.a_($$2.c()).a(aua.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bmp $$0) {
      return e($$0);
   }

   private static boolean e(bmp $$0) {
      return $$0.a(auc.j) || $$0.a(auc.m);
   }
}
