import javax.annotation.Nullable;

public class cpf extends cot {
   private static final byte c = 10;
   private int d = -1;

   public cpf(bsx<? extends cpf> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cpf(dcw $$0, double $$1, double $$2, double $$3) {
      super(bsx.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public cot.a v() {
      return cot.a.d;
   }

   @Override
   public dtc x() {
      return dga.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dO().a(lm.ae, this.dt(), this.dv() + 0.5, this.dz(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dr().i());
      }

      if (this.Q) {
         double $$0 = this.dr().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if ($$0.c() instanceof cnd $$3 && $$3.bR()) {
         brk $$4 = this.dP().d(this, $$0.d());
         this.a($$4, $$3.dr().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(brk $$0) {
      double $$1 = this.dr().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ak_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.ah.a(20) + this.ah.a(20);
         }
      }
   }

   @Override
   protected cul ak_() {
      return cut.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable brk $$0, double $$1) {
      if (!this.dO().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dO().a(this, $$0, null, this.dt(), this.dv(), this.dz(), (float)(4.0 + this.ah.j() * 1.5 * $$2), false, dcw.a.d);
         this.aq();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.B();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.B();
      } else {
         super.b($$0);
      }
   }

   public void B() {
      this.d = 80;
      if (!this.dO().B) {
         this.dO().a(this, (byte)10);
         if (!this.aX()) {
            this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.zy, avq.e, 1.0F, 1.0F);
         }
      }
   }

   public int C() {
      return this.d;
   }

   public boolean D() {
      return this.d > -1;
   }

   @Override
   public float a(dco $$0, dcc $$1, jd $$2, dtc $$3, epe $$4, float $$5) {
      return !this.D() || !$$3.a(awe.O) && !$$1.a_($$2.d()).a(awe.O) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dco $$0, dcc $$1, jd $$2, dtc $$3, float $$4) {
      return !this.D() || !$$3.a(awe.O) && !$$1.a_($$2.d()).a(awe.O) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(ub $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(ub $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(brk $$0) {
      return e($$0);
   }

   private static boolean e(brk $$0) {
      return $$0.a(awg.i) || $$0.a(awg.l);
   }
}
