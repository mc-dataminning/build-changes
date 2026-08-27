import javax.annotation.Nullable;

public class ckf extends cjt {
   private static final byte c = 10;
   private int d = -1;

   public ckf(bol<? extends ckf> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ckf(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.bb, $$0, $$1, $$2, $$3);
   }

   @Override
   public cjt.a w() {
      return cjt.a.d;
   }

   @Override
   public dme y() {
      return czh.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dJ().a(kb.ab, this.do(), this.dq() + 0.5, this.du(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dm().i());
      }

      if (this.O) {
         double $$0 = this.dm().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if ($$0.c() instanceof cig $$3 && $$3.bK()) {
         bne $$4 = this.dK().d(this, $$0.d());
         this.a($$4, $$3.dm().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bne $$0) {
      double $$1 = this.dm().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ai_());
      } else {
         if (this.d < 0) {
            this.C();
            this.d = this.af.a(20) + this.af.a(20);
         }
      }
   }

   @Override
   protected cpl ai_() {
      return cpt.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bne $$0, double $$1) {
      if (!this.dJ().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dJ().a(this, $$0, null, this.do(), this.dq(), this.du(), (float)(4.0 + this.af.j() * 1.5 * $$2), false, cwe.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
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
      if (!this.dJ().B) {
         this.dJ().a(this, (byte)10);
         if (!this.aU()) {
            this.dJ().a(null, this.do(), this.dq(), this.du(), atp.yR, atq.e, 1.0F, 1.0F);
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
   public float a(cvw $$0, cvk $$1, ib $$2, dme $$3, ehr $$4, float $$5) {
      return !this.E() || !$$3.a(aue.N) && !$$1.a_($$2.c()).a(aue.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cvw $$0, cvk $$1, ib $$2, dme $$3, float $$4) {
      return !this.E() || !$$3.a(aue.N) && !$$1.a_($$2.c()).a(aue.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bne $$0) {
      return e($$0);
   }

   private static boolean e(bne $$0) {
      return $$0.a(aug.j) || $$0.a(aug.m);
   }
}
