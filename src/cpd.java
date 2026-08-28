import javax.annotation.Nullable;

public class cpd extends cor {
   private static final byte c = 10;
   private int d = -1;

   public cpd(bsw<? extends cpd> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cpd(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public cor.a v() {
      return cor.a.d;
   }

   @Override
   public dta x() {
      return dfy.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dQ().a(lm.ae, this.dv(), this.dx() + 0.5, this.dB(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dt().i());
      }

      if (this.Q) {
         double $$0 = this.dt().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if ($$0.c() instanceof cnb $$3 && $$3.bR()) {
         brj $$4 = this.dR().d(this, $$0.d());
         this.a($$4, $$3.dt().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(brj $$0) {
      double $$1 = this.dt().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ag_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.ah.a(20) + this.ah.a(20);
         }
      }
   }

   @Override
   protected cuj ag_() {
      return cur.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable brj $$0, double $$1) {
      if (!this.dQ().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dQ().a(this, $$0, null, this.dv(), this.dx(), this.dB(), (float)(4.0 + this.ah.j() * 1.5 * $$2), false, dcu.a.d);
         this.aq();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
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
      if (!this.dQ().B) {
         this.dQ().a(this, (byte)10);
         if (!this.aX()) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.zy, avp.e, 1.0F, 1.0F);
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
   public float a(dcm $$0, dca $$1, jd $$2, dta $$3, eoy $$4, float $$5) {
      return !this.D() || !$$3.a(awd.N) && !$$1.a_($$2.c()).a(awd.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dcm $$0, dca $$1, jd $$2, dta $$3, float $$4) {
      return !this.D() || !$$3.a(awd.N) && !$$1.a_($$2.c()).a(awd.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(brj $$0) {
      return e($$0);
   }

   private static boolean e(brj $$0) {
      return $$0.a(awf.i) || $$0.a(awf.l);
   }
}
