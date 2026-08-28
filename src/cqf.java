import javax.annotation.Nullable;

public class cqf extends cps {
   private static final byte c = 10;
   private static final String d = "explosion_power";
   private static final float e = 4.0F;
   private int i = -1;
   private float j = 4.0F;

   public cqf(btv<? extends cqf> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cqf(deg $$0, double $$1, double $$2, double $$3) {
      super(btv.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public cps.a y() {
      return cps.a.d;
   }

   @Override
   public duo A() {
      return dhl.ck.o();
   }

   @Override
   public void l() {
      double $$0 = this.dv().j();
      super.l();
      if (this.i > 0) {
         this.i--;
         this.dS().a(ln.ae, this.dx(), this.dz() + 0.5, this.dD(), 0.0, 0.0, 0.0);
      } else if (this.i == 0) {
         this.h(this.dv().j());
      }

      if (this.Q) {
         double $$1 = this.dv().j();
         if ($$0 >= 0.01F && $$1 <= 0.01F) {
            this.h($$1);
         }
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if ($$0.c() instanceof cob $$3 && $$3.bV()) {
         bsg $$4 = this.dT().d(this, $$0.d());
         this.a($$4, $$3.dv().h());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bsg $$0) {
      double $$1 = this.dv().j();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.aj_());
      } else {
         if (this.i < 0) {
            this.F();
            this.i = this.af.a(20) + this.af.a(20);
         }
      }
   }

   @Override
   protected cvk aj_() {
      return cvt.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bsg $$0, double $$1) {
      if (!this.dS().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dS().a(this, $$0, null, this.dx(), this.dz(), this.dD(), (float)(4.0 + this.af.j() * 1.5 * $$2), false, deg.a.d);
         this.as();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.i < 0) {
         this.F();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.F();
      } else {
         super.b($$0);
      }
   }

   public void F() {
      this.i = 80;
      if (!this.dS().B) {
         this.dS().a(this, (byte)10);
         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.zE, awf.e, 1.0F, 1.0F);
         }
      }
   }

   public int G() {
      return this.i;
   }

   public boolean I() {
      return this.i > -1;
   }

   @Override
   public float a(ddy $$0, ddl $$1, je $$2, duo $$3, eqp $$4, float $$5) {
      return !this.I() || !$$3.a(awt.O) && !$$1.a_($$2.d()).a(awt.O) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(ddy $$0, ddl $$1, je $$2, duo $$3, float $$4) {
      return !this.I() || !$$3.a(awt.O) && !$$1.a_($$2.d()).a(awt.O) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.i = $$0.h("TNTFuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.j = azd.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.i);
      if (this.j != 4.0F) {
         $$0.a("explosion_power", this.j);
      }
   }

   @Override
   boolean d(bsg $$0) {
      return e($$0);
   }

   private static boolean e(bsg $$0) {
      return $$0.a(awv.i) || $$0.a(awv.l);
   }
}
