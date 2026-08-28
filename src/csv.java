import javax.annotation.Nullable;

public class csv extends csh {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   @Nullable
   private buh k;
   private int l = -1;
   private float m = 4.0F;
   private float n = 1.0F;

   public csv(bwb<? extends csv> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   public dym v() {
      return dkw.cr.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.l > 0) {
         this.l--;
         this.dV().a(lv.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
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
   public boolean a(arn $$0, buh $$1, float $$2) {
      if ($$1.c() instanceof cqp $$4 && $$4.bY()) {
         buh $$5 = this.dW().d(this, $$1.d());
         this.a($$5, $$4.dy().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(arn $$0, buh $$1) {
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
   protected cxu o() {
      return cyc.ot;
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.ot);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable buh $$0, double $$1) {
      if (this.dV() instanceof arn $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dA(), this.dC(), this.dG(), (float)((double)this.m + (double)this.n * this.ae.j() * 1.5 * $$3), false, dhp.a.d);
         this.at();
      }
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
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

   public void a(@Nullable buh $$0) {
      this.l = 80;
      if (!this.dV().C) {
         if ($$0 != null && this.k == null) {
            this.k = this.dW().d(this, $$0.d());
         }

         this.dV().a(this, (byte)10);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.Aw, awl.e, 1.0F, 1.0F);
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
   public float a(dhi $$0, dgv $$1, jj $$2, dym $$3, eut $$4, float $$5) {
      return !this.s() || !$$3.a(awz.P) && !$$1.a_($$2.d()).a(awz.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dhi $$0, dgv $$1, jj $$2, dym $$3, float $$4) {
      return !this.s() || !$$3.a(awz.P) && !$$1.a_($$2.d()).a(awz.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tw $$0) {
      super.a($$0);
      if ($$0.b("fuse", 99)) {
         this.l = $$0.h("fuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.m = azk.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }

      if ($$0.b("explosion_speed_factor", 99)) {
         this.n = azk.a($$0.j("explosion_speed_factor"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(tw $$0) {
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
   boolean e(buh $$0) {
      return f($$0);
   }

   private static boolean f(buh $$0) {
      return $$0.c() instanceof crb $$1 ? $$1.bY() : $$0.a(axb.i) || $$0.a(axb.l);
   }
}
