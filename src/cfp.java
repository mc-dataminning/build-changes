import javax.annotation.Nullable;

public class cfp extends cfd {
   private static final byte c = 10;
   private int d = -1;

   public cfp(bkm<? extends cfp> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cfp(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.aZ, $$0, $$1, $$2, $$3);
   }

   @Override
   public cfd.a v() {
      return cfd.a.d;
   }

   @Override
   public dgw x() {
      return cuv.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dL().a(js.Z, this.dq(), this.ds() + 0.5, this.dw(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.do().i());
      }

      if (this.P) {
         double $$0 = this.do().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if ($$0.c() instanceof cds $$3 && $$3.bM()) {
         bjg $$4 = this.dM().d(this, $$0.d());
         this.a($$4, $$3.do().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bjg $$0) {
      double $$1 = this.do().i();
      if (!$$0.a(are.i) && !$$0.a(are.l) && !($$1 >= 0.01F)) {
         this.b(this.ag_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected ckw ag_() {
      return cle.nd;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bjg $$0, double $$1) {
      if (!this.dL().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dL().a(this, $$0, null, this.dq(), this.ds(), this.dw(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, crs.a.d);
         this.ak();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bjg $$2) {
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
      if (!this.dL().B) {
         this.dL().a(this, (byte)10);
         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.xP, aqo.e, 1.0F, 1.0F);
         }
      }
   }

   public int C() {
      return this.d;
   }

   public boolean E() {
      return this.d > -1;
   }

   @Override
   public float a(crk $$0, cqy $$1, ht $$2, dgw $$3, ecg $$4, float $$5) {
      return !this.E() || !$$3.a(arc.N) && !$$1.a_($$2.c()).a(arc.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(crk $$0, cqy $$1, ht $$2, dgw $$3, float $$4) {
      return !this.E() || !$$3.a(arc.N) && !$$1.a_($$2.c()).a(arc.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean ah_() {
      return true;
   }
}
