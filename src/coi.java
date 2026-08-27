import javax.annotation.Nullable;

public class coi extends cnw {
   private static final byte c = 10;
   private int d = -1;

   public coi(bsb<? extends coi> $$0, dca $$1) {
      super($$0, $$1);
   }

   public coi(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.bg, $$0, $$1, $$2, $$3);
   }

   @Override
   public cnw.a u() {
      return cnw.a.d;
   }

   @Override
   public dtc x() {
      return dfe.cV.n();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dU().a(lb.ac, this.dz(), this.dB() + 0.5, this.dF(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dx().i());
      }

      if (this.R) {
         double $$0 = this.dx().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if ($$0.c() instanceof cme $$3 && $$3.bV()) {
         bqt $$4 = this.dX().d(this, $$0.d());
         this.a($$4, $$3.dx().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bqt $$0) {
      double $$1 = this.dx().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ah_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.al.a(20) + this.al.a(20);
         }
      }
   }

   @Override
   protected cuc ah_() {
      return cuk.pf;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bqt $$0, double $$1) {
      if (!this.dU().C) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dU().a(this, $$0, null, this.dz(), this.dB(), this.dF(), (float)(4.0 + this.al.j() * 1.5 * $$2), false, dca.a.d);
         this.ao();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.B();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.B();
      } else {
         super.b($$0);
      }
   }

   public void B() {
      this.d = 80;
      if (!this.dU().C) {
         this.dU().a(this, (byte)10);
         if (!this.ba()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.zT, avq.e, 1.0F, 1.0F);
         }
      }
   }

   public int C() {
      return this.d;
   }

   public boolean D() {
      return this.d > -1;
   }

   @Override
   public float a(dbs $$0, dbg $$1, ir $$2, dtc $$3, epe $$4, float $$5) {
      return !this.D() || !$$3.a(awe.N) && !$$1.a_($$2.c()).a(awe.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dbs $$0, dbg $$1, ir $$2, dtc $$3, float $$4) {
      return !this.D() || !$$3.a(awe.N) && !$$1.a_($$2.c()).a(awe.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bqt $$0) {
      return e($$0);
   }

   private static boolean e(bqt $$0) {
      return $$0.a(awg.j) || $$0.a(awg.m);
   }
}
