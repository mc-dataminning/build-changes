import javax.annotation.Nullable;

public class cpz extends cpm {
   private static final byte c = 10;
   private static final String d = "explosion_power";
   private static final float e = 4.0F;
   private int i = -1;
   private float j = 4.0F;

   public cpz(btq<? extends cpz> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cpz(dds $$0, double $$1, double $$2, double $$3) {
      super(btq.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public cpm.a x() {
      return cpm.a.d;
   }

   @Override
   public dua z() {
      return dgx.ck.o();
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
   public boolean a(bsb $$0, float $$1) {
      if ($$0.c() instanceof cnw $$3 && $$3.bV()) {
         bsb $$4 = this.dT().d(this, $$0.d());
         this.a($$4, $$3.dv().h());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bsb $$0) {
      double $$1 = this.dv().j();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.aj_());
      } else {
         if (this.i < 0) {
            this.E();
            this.i = this.af.a(20) + this.af.a(20);
         }
      }
   }

   @Override
   protected cvg aj_() {
      return cvo.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bsb $$0, double $$1) {
      if (!this.dS().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dS().a(this, $$0, null, this.dx(), this.dz(), this.dD(), (float)(4.0 + this.af.j() * 1.5 * $$2), false, dds.a.d);
         this.as();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.i < 0) {
         this.E();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.E();
      } else {
         super.b($$0);
      }
   }

   public void E() {
      this.i = 80;
      if (!this.dS().B) {
         this.dS().a(this, (byte)10);
         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.zE, awe.e, 1.0F, 1.0F);
         }
      }
   }

   public int F() {
      return this.i;
   }

   public boolean G() {
      return this.i > -1;
   }

   @Override
   public float a(ddk $$0, dcx $$1, je $$2, dua $$3, eqb $$4, float $$5) {
      return !this.G() || !$$3.a(aws.O) && !$$1.a_($$2.d()).a(aws.O) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(ddk $$0, dcx $$1, je $$2, dua $$3, float $$4) {
      return !this.G() || !$$3.a(aws.O) && !$$1.a_($$2.d()).a(aws.O) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.i = $$0.h("TNTFuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.j = azc.a($$0.j("explosion_power"), 0.0F, 128.0F);
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
   boolean d(bsb $$0) {
      return e($$0);
   }

   private static boolean e(bsb $$0) {
      return $$0.a(awu.i) || $$0.a(awu.l);
   }
}
