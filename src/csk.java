import javax.annotation.Nullable;

public class csk extends crw {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final float d = 4.0F;
   private int h = -1;
   private float i = 4.0F;

   public csk(bvr<? extends csk> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public dxv w() {
      return dko.cr.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.h > 0) {
         this.h--;
         this.dW().a(ls.af, this.dB(), this.dD() + 0.5, this.dH(), 0.0, 0.0, 0.0);
      } else if (this.h == 0) {
         this.h(this.dz().j());
      }

      if (this.P) {
         double $$0 = this.dz().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if ($$1.c() instanceof cqe $$4 && $$4.bY()) {
         bua $$5 = this.dX().d(this, $$1.d());
         this.a($$5, $$4.dz().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ash $$0, bua $$1) {
      double $$2 = this.dz().j();
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
   protected cxl u() {
      return cxt.oi;
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.oi);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bua $$0, double $$1) {
      if (this.dW() instanceof ash $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dB(), this.dD(), this.dH(), (float)((double)this.i + this.ae.j() * 1.5 * $$3), false, dhi.a.d);
         this.at();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
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
      if (!this.dW().C) {
         this.dW().a(this, (byte)10);
         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.zX, axg.e, 1.0F, 1.0F);
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
   public float a(dha $$0, dgn $$1, jh $$2, dxv $$3, etx $$4, float $$5) {
      return !this.B() || !$$3.a(axu.P) && !$$1.a_($$2.d()).a(axu.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dha $$0, dgn $$1, jh $$2, dxv $$3, float $$4) {
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
   boolean a(bua $$0) {
      return e($$0);
   }

   private static boolean e(bua $$0) {
      return $$0.a(axw.i) || $$0.a(axw.l);
   }
}
