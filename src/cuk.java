import javax.annotation.Nullable;

public class cuk extends ctw {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   @Nullable
   private bux k;
   private int l = -1;
   private float m = 4.0F;
   private float n = 1.0F;

   public cuk(bwr<? extends cuk> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   public eao v() {
      return dmo.cu.m();
   }

   @Override
   public void h() {
      super.h();
      if (this.l > 0) {
         this.l--;
         this.dU().a(ly.ah, this.dz(), this.dB() + 0.5, this.dF(), 0.0, 0.0, 0.0);
      } else if (this.l == 0) {
         this.a(this.k, this.dx().j());
      }

      if (this.P) {
         double $$0 = this.dx().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if ($$1.c() instanceof crr $$4 && $$4.bW()) {
         bux $$5 = this.dV().d(this, $$1.d());
         this.a($$5, $$4.dx().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(arq $$0, bux $$1) {
      double $$2 = this.dx().j();
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
   protected czg o() {
      return czo.oy;
   }

   @Override
   public czk dH() {
      return new czk(czo.oy);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bux $$0, double $$1) {
      if (this.dU() instanceof arq $$2) {
         double $$3 = Math.min(Math.sqrt($$1), 5.0);
         $$2.a(this, $$0, null, this.dz(), this.dB(), this.dF(), (float)((double)this.m + (double)this.n * this.ae.j() * 1.5 * $$3), false, djh.a.d);
         this.aq();
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
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

   public void a(@Nullable bux $$0) {
      this.l = 80;
      if (!this.dU().C) {
         if ($$0 != null && this.k == null) {
            this.k = this.dV().d(this, $$0.d());
         }

         this.dU().a(this, (byte)10);
         if (!this.aZ()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.AC, awo.e, 1.0F, 1.0F);
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
   public float a(dja $$0, din $$1, iv $$2, eao $$3, ewv $$4, float $$5) {
      return !this.s() || !$$3.a(axc.P) && !$$1.a_($$2.d()).a(axc.P) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dja $$0, din $$1, iv $$2, eao $$3, float $$4) {
      return !this.s() || !$$3.a(axc.P) && !$$1.a_($$2.d()).a(axc.P) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      if ($$0.b("fuse", 99)) {
         this.l = $$0.f("fuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.m = azm.a($$0.h("explosion_power"), 0.0F, 128.0F);
      }

      if ($$0.b("explosion_speed_factor", 99)) {
         this.n = azm.a($$0.h("explosion_speed_factor"), 0.0F, 128.0F);
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
   boolean e(bux $$0) {
      return f($$0);
   }

   private static boolean f(bux $$0) {
      return $$0.c() instanceof cse $$1 ? $$1.bW() : $$0.a(axd.i) || $$0.a(axd.l);
   }
}
