import javax.annotation.Nullable;

public class chf extends cgt {
   private static final byte c = 10;
   private int d = -1;

   public chf(blt<? extends chf> $$0, cti $$1) {
      super($$0, $$1);
   }

   public chf(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.ba, $$0, $$1, $$2, $$3);
   }

   @Override
   public cgt.a w() {
      return cgt.a.d;
   }

   @Override
   public dja y() {
      return cwl.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dM().a(jx.ab, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dp().i());
      }

      if (this.P) {
         double $$0 = this.dp().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if ($$0.c() instanceof cfh $$3 && $$3.bN()) {
         bkn $$4 = this.dN().d(this, $$0.d());
         this.a($$4, $$3.dp().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bkn $$0) {
      double $$1 = this.dp().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ah_());
      } else {
         if (this.d < 0) {
            this.C();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cmm ah_() {
      return cmu.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bkn $$0, double $$1) {
      if (!this.dM().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dM().a(this, $$0, null, this.dr(), this.dt(), this.dx(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, cti.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.C();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.C();
      } else {
         super.b($$0);
      }
   }

   public void C() {
      this.d = 80;
      if (!this.dM().B) {
         this.dM().a(this, (byte)10);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.yB, arn.e, 1.0F, 1.0F);
         }
      }
   }

   public int D() {
      return this.d;
   }

   public boolean E() {
      return this.d > -1;
   }

   @Override
   public float a(cta $$0, cso $$1, hx $$2, dja $$3, eek $$4, float $$5) {
      return !this.E() || !$$3.a(asb.N) && !$$1.a_($$2.c()).a(asb.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cta $$0, cso $$1, hx $$2, dja $$3, float $$4) {
      return !this.E() || !$$3.a(asb.N) && !$$1.a_($$2.c()).a(asb.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(sl $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bkn $$0) {
      return e($$0);
   }

   private static boolean e(bkn $$0) {
      return $$0.a(asd.j) || $$0.a(asd.m);
   }
}
