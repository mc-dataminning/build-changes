import javax.annotation.Nullable;

public class crk extends cqw {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   private int k = -1;
   private float l = 4.0F;
   private float m = 1.0F;

   public crk(bus<? extends crk> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public dwx w() {
      return djo.cr.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.k > 0) {
         this.k--;
         this.dV().a(lt.ag, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
      } else if (this.k == 0) {
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
   public boolean a(ard $$0, btb $$1, float $$2) {
      if ($$1.c() instanceof cpq $$4 && $$4.bY()) {
         btb $$5 = this.dW().d(this, $$1.d());
         this.a($$5, $$4.dy().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ard $$0, btb $$1) {
      double $$2 = this.dy().j();
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
   protected cwl u() {
      return cwt.or;
   }

   @Override
   public cwp dI() {
      return new cwp(cwt.or);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable btb $$0, double $$1) {
      if (this.dV() instanceof ard $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dA(), this.dC(), this.dG(), (float)((double)this.l + (double)this.m * this.ae.j() * 1.5 * $$3), false, dgi.a.d);
         this.at();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
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
      if (!this.dV().C) {
         this.dV().a(this, (byte)10);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.Am, awb.e, 1.0F, 1.0F);
         }
      }
   }

   public int x() {
      return this.k;
   }

   public boolean D() {
      return this.k > -1;
   }

   @Override
   public float a(dga $$0, dfn $$1, ji $$2, dwx $$3, esz $$4, float $$5) {
      return !this.D() || !$$3.a(awp.P) && !$$1.a_($$2.d()).a(awp.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dga $$0, dfn $$1, ji $$2, dwx $$3, float $$4) {
      return !this.D() || !$$3.a(awp.P) && !$$1.a_($$2.d()).a(awp.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      if ($$0.b("fuse", 99)) {
         this.k = $$0.h("fuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = ayz.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }

      if ($$0.b("explosion_speed_factor", 99)) {
         this.m = ayz.a($$0.j("explosion_speed_factor"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(tq $$0) {
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
   boolean a(btb $$0) {
      return e($$0);
   }

   private static boolean e(btb $$0) {
      return $$0.a(awr.i) || $$0.a(awr.l);
   }
}
