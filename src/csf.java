import javax.annotation.Nullable;

public class csf extends crr {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final float d = 4.0F;
   private int h = -1;
   private float i = 4.0F;

   public csf(bvm<? extends csf> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public dxn w() {
      return dkg.cr.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.h > 0) {
         this.h--;
         this.dV().a(ls.af, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
      } else if (this.h == 0) {
         this.h(this.dy().j());
      }

      if (this.P) {
         double $$0 = this.dy().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if ($$1.c() instanceof cpz $$4 && $$4.bY()) {
         btv $$5 = this.dW().d(this, $$1.d());
         this.a($$5, $$4.dy().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ash $$0, btv $$1) {
      double $$2 = this.dy().j();
      if (!e($$1) && !($$2 >= 0.01F)) {
         this.a($$0, this.u());
      } else {
         if (this.h < 0) {
            this.v();
            this.h = this.ae.a(20) + this.ae.a(20);
         }
      }
   }

   @Override
   protected cxg u() {
      return cxo.oi;
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.oi);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable btv $$0, double $$1) {
      if (this.dV() instanceof ash $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dA(), this.dC(), this.dG(), (float)((double)this.i + this.ae.j() * 1.5 * $$3), false, dha.a.d);
         this.at();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btv $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.h < 0) {
         this.v();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.v();
      } else {
         super.b($$0);
      }
   }

   public void v() {
      this.h = 80;
      if (!this.dV().C) {
         this.dV().a(this, (byte)10);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.zW, axg.e, 1.0F, 1.0F);
         }
      }
   }

   public int x() {
      return this.h;
   }

   public boolean B() {
      return this.h > -1;
   }

   @Override
   public float a(dgs $$0, dgf $$1, jh $$2, dxn $$3, etp $$4, float $$5) {
      return !this.B() || !$$3.a(axu.P) && !$$1.a_($$2.d()).a(axu.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dgs $$0, dgf $$1, jh $$2, dxn $$3, float $$4) {
      return !this.B() || !$$3.a(axu.P) && !$$1.a_($$2.d()).a(axu.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.h = $$0.h("TNTFuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.i = bae.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.h);
      if (this.i != 4.0F) {
         $$0.a("explosion_power", this.i);
      }
   }

   @Override
   boolean a(btv $$0) {
      return e($$0);
   }

   private static boolean e(btv $$0) {
      return $$0.a(axw.i) || $$0.a(axw.l);
   }
}
