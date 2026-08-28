import javax.annotation.Nullable;

public class cqx extends cqk {
   private static final byte c = 10;
   private static final String d = "explosion_power";
   private static final float e = 4.0F;
   private int i = -1;
   private float j = 4.0F;

   public cqx(bul<? extends cqx> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cqx(dfb $$0, double $$1, double $$2, double $$3) {
      super(bul.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public cqk.a y() {
      return cqk.a.d;
   }

   @Override
   public dvj A() {
      return dig.ck.m();
   }

   @Override
   public void l() {
      super.l();
      if (this.i > 0) {
         this.i--;
         this.dX().a(lr.ae, this.dC(), this.dE() + 0.5, this.dI(), 0.0, 0.0, 0.0);
      } else if (this.i == 0) {
         this.h(this.dA().j());
      }

      if (this.Q) {
         double $$0 = this.dA().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if ($$0.c() instanceof cou $$3 && $$3.bZ()) {
         bsu $$4 = this.dY().d(this, $$0.d());
         this.a($$4, $$3.dA().h());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bsu $$0) {
      double $$1 = this.dA().j();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.al_());
      } else {
         if (this.i < 0) {
            this.E();
            this.i = this.af.a(20) + this.af.a(20);
         }
      }
   }

   @Override
   protected cvx al_() {
      return cwf.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bsu $$0, double $$1) {
      if (!this.dX().C) {
         double $$2 = Math.min(Math.sqrt($$1), 5.0);
         this.dX().a(this, $$0, null, this.dC(), this.dE(), this.dI(), (float)((double)this.j + this.af.j() * 1.5 * $$2), false, dfb.a.d);
         this.av();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.i < 0) {
         this.E();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.E();
      } else {
         super.b($$0);
      }
   }

   public void E() {
      this.i = 80;
      if (!this.dX().C) {
         this.dX().a(this, (byte)10);
         if (!this.bc()) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.zC, awm.e, 1.0F, 1.0F);
         }
      }
   }

   public int F() {
      return this.i;
   }

   public boolean G() {
      return this.i > -1;
   }

   @Override
   public float a(det $$0, deg $$1, jh $$2, dvj $$3, erk $$4, float $$5) {
      return !this.G() || !$$3.a(axa.O) && !$$1.a_($$2.d()).a(axa.O) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(det $$0, deg $$1, jh $$2, dvj $$3, float $$4) {
      return !this.G() || !$$3.a(axa.O) && !$$1.a_($$2.d()).a(axa.O) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.i = $$0.h("TNTFuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.j = azk.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.i);
      if (this.j != 4.0F) {
         $$0.a("explosion_power", this.j);
      }
   }

   @Override
   boolean d(bsu $$0) {
      return e($$0);
   }

   private static boolean e(bsu $$0) {
      return $$0.a(axc.i) || $$0.a(axc.l);
   }
}
