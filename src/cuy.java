import javax.annotation.Nullable;

public class cuy extends cuk {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   private static final int k = -1;
   @Nullable
   private bvi l;
   private int m = -1;
   private float n = 4.0F;
   private float o = 1.0F;

   public cuy(bxc<? extends cuy> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   public ebe v() {
      return dne.cu.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.m > 0) {
         this.m--;
         this.dV().a(ly.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
      } else if (this.m == 0) {
         this.a(this.l, this.dy().j());
      }

      if (this.P) {
         double $$0 = this.dy().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if ($$1.c() instanceof csf $$4 && $$4.bX()) {
         bvi $$5 = this.dW().d(this, $$1.d());
         this.a($$5, $$4.dy().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(ars $$0, bvi $$1) {
      double $$2 = this.dy().j();
      if (!f($$1) && !($$2 >= 0.01F)) {
         this.a($$0, this.o());
      } else {
         if (this.m < 0) {
            this.a($$1);
            this.m = this.ae.a(20) + this.ae.a(20);
         }
      }
   }

   @Override
   protected czu o() {
      return dac.oy;
   }

   @Override
   public czy dI() {
      return new czy(dac.oy);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bvi $$0, double $$1) {
      if (this.dV() instanceof ars $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dA(), this.dC(), this.dG(), (float)((double)this.n + (double)this.o * this.ae.j() * 1.5 * $$3), false, djx.a.d);
         this.aq();
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
      if ($$0 >= 3.0) {
         double $$3 = $$0 / 10.0;
         this.h($$3 * $$3);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.m < 0) {
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

   public void a(@Nullable bvi $$0) {
      this.m = 80;
      if (!this.dV().C) {
         if ($$0 != null && this.l == null) {
            this.l = this.dW().d(this, $$0.d());
         }

         this.dV().a(this, (byte)10);
         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.AC, awq.e, 1.0F, 1.0F);
         }
      }
   }

   public int q() {
      return this.m;
   }

   public boolean s() {
      return this.m > -1;
   }

   @Override
   public float a(djq $$0, djb $$1, iv $$2, ebe $$3, exo $$4, float $$5) {
      return !this.s() || !$$3.a(axe.P) && !$$1.a_($$2.d()).a(axe.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(djq $$0, djb $$1, iv $$2, ebe $$3, float $$4) {
      return !this.s() || !$$3.a(axe.P) && !$$1.a_($$2.d()).a(axe.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.m = $$0.b("fuse", -1);
      this.n = azo.a($$0.b("explosion_power", 4.0F), 0.0F, 128.0F);
      this.o = azo.a($$0.b("explosion_speed_factor", 1.0F), 0.0F, 128.0F);
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      $$0.a("fuse", this.m);
      if (this.n != 4.0F) {
         $$0.a("explosion_power", this.n);
      }

      if (this.o != 1.0F) {
         $$0.a("explosion_speed_factor", this.o);
      }
   }

   @Override
   boolean e(bvi $$0) {
      return f($$0);
   }

   private static boolean f(bvi $$0) {
      return $$0.c() instanceof css $$1 ? $$1.bX() : $$0.a(axf.i) || $$0.a(axf.l);
   }
}
