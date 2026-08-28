import javax.annotation.Nullable;

public class cty extends ctk {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   @Nullable
   private bus k;
   private int l = -1;
   private float m = 4.0F;
   private float n = 1.0F;

   public cty(bwm<? extends cty> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   public dzz v() {
      return dmc.cs.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.l > 0) {
         this.l--;
         this.dV().a(lx.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
      } else if (this.l == 0) {
         this.a(this.k, this.dy().j());
      }

      if (this.P) {
         double $$0 = this.dy().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if ($$1.c() instanceof crf $$4 && $$4.bY()) {
         bus $$5 = this.dW().d(this, $$1.d());
         this.a($$5, $$4.dy().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(arq $$0, bus $$1) {
      double $$2 = this.dy().j();
      if (!f($$1) && !($$2 >= 0.01F)) {
         this.a($$0, this.o());
      } else {
         if (this.l < 0) {
            this.a($$1);
            this.l = this.ae.a(20) + this.ae.a(20);
         }
      }
   }

   @Override
   protected cyu o() {
      return czc.ov;
   }

   @Override
   public cyy dI() {
      return new cyy(czc.ov);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bus $$0, double $$1) {
      if (this.dV() instanceof arq $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dA(), this.dC(), this.dG(), (float)((double)this.m + (double)this.n * this.ae.j() * 1.5 * $$3), false, div.a.d);
         this.at();
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      if ($$0 >= 3.0) {
         double $$3 = $$0 / 10.0;
         this.h($$3 * $$3);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.l < 0) {
         this.a(null);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.a(null);
      } else {
         super.b($$0);
      }
   }

   public void a(@Nullable bus $$0) {
      this.l = 80;
      if (!this.dV().C) {
         if ($$0 != null && this.k == null) {
            this.k = this.dW().d(this, $$0.d());
         }

         this.dV().a(this, (byte)10);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.Az, awo.e, 1.0F, 1.0F);
         }
      }
   }

   public int q() {
      return this.l;
   }

   public boolean s() {
      return this.l > -1;
   }

   @Override
   public float a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4, float $$5) {
      return !this.s() || !$$3.a(axc.P) && !$$1.a_($$2.d()).a(axc.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dio $$0, dib $$1, iu $$2, dzz $$3, float $$4) {
      return !this.s() || !$$3.a(axc.P) && !$$1.a_($$2.d()).a(axc.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      if ($$0.b("fuse", 99)) {
         this.l = $$0.h("fuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.m = azm.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }

      if ($$0.b("explosion_speed_factor", 99)) {
         this.n = azm.a($$0.j("explosion_speed_factor"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      $$0.a("fuse", this.l);
      if (this.m != 4.0F) {
         $$0.a("explosion_power", this.m);
      }

      if (this.n != 1.0F) {
         $$0.a("explosion_speed_factor", this.n);
      }
   }

   @Override
   boolean e(bus $$0) {
      return f($$0);
   }

   private static boolean f(bus $$0) {
      return $$0.c() instanceof crs $$1 ? $$1.bY() : $$0.a(axd.i) || $$0.a(axd.l);
   }
}
