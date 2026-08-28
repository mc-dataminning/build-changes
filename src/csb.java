import javax.annotation.Nullable;

public class csb extends crn {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   private int k = -1;
   private float l = 4.0F;
   private float m = 1.0F;

   public csb(bvi<? extends csb> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public dxo w() {
      return dkf.cr.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.k > 0) {
         this.k--;
         this.dW().a(ls.ag, this.dB(), this.dD() + 0.5, this.dH(), 0.0, 0.0, 0.0);
      } else if (this.k == 0) {
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
   public boolean a(arx $$0, btr $$1, float $$2) {
      if ($$1.c() instanceof cqh $$4 && $$4.bY()) {
         btr $$5 = this.dX().d(this, $$1.d());
         this.a($$5, $$4.dz().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(arx $$0, btr $$1) {
      double $$2 = this.dz().j();
      if (!e($$1) && !($$2 >= 0.01F)) {
         this.a($$0, this.u());
      } else {
         if (this.k < 0) {
            this.v();
            this.k = this.ae.a(20) + this.ae.a(20);
         }
      }
   }

   @Override
   protected cxc u() {
      return cxk.or;
   }

   @Override
   public cxg dJ() {
      return new cxg(cxk.or);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable btr $$0, double $$1) {
      if (this.dW() instanceof arx $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dB(), this.dD(), this.dH(), (float)((double)this.l + (double)this.m * this.ae.j() * 1.5 * $$3), false, dgz.a.d);
         this.at();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btr $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.k < 0) {
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
      this.k = 80;
      if (!this.dW().C) {
         this.dW().a(this, (byte)10);
         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.An, aww.e, 1.0F, 1.0F);
         }
      }
   }

   public int x() {
      return this.k;
   }

   public boolean B() {
      return this.k > -1;
   }

   @Override
   public float a(dgr $$0, dge $$1, jh $$2, dxo $$3, etq $$4, float $$5) {
      return !this.B() || !$$3.a(axk.P) && !$$1.a_($$2.d()).a(axk.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dgr $$0, dge $$1, jh $$2, dxo $$3, float $$4) {
      return !this.B() || !$$3.a(axk.P) && !$$1.a_($$2.d()).a(axk.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(um $$0) {
      super.a($$0);
      if ($$0.b("fuse", 99)) {
         this.k = $$0.h("fuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = azu.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }

      if ($$0.b("explosion_speed_factor", 99)) {
         this.m = azu.a($$0.j("explosion_speed_factor"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(um $$0) {
      super.b($$0);
      $$0.a("fuse", this.k);
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }

      if (this.m != 1.0F) {
         $$0.a("explosion_speed_factor", this.m);
      }
   }

   @Override
   boolean a(btr $$0) {
      return e($$0);
   }

   private static boolean e(btr $$0) {
      return $$0.a(axm.i) || $$0.a(axm.l);
   }
}
