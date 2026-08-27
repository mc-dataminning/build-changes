import javax.annotation.Nullable;

public class cma extends clo {
   private static final byte c = 10;
   private int d = -1;

   public cma(bqb<? extends cma> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cma(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.bc, $$0, $$1, $$2, $$3);
   }

   @Override
   public clo.a v() {
      return clo.a.d;
   }

   @Override
   public doz x() {
      return dca.ck.n();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dM().a(kl.ac, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
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
   public boolean a(bot $$0, float $$1) {
      if ($$0.c() instanceof cjz $$3 && $$3.bN()) {
         bot $$4 = this.dN().d(this, $$0.d());
         this.a($$4, $$3.dp().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bot $$0) {
      double $$1 = this.dp().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ag_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cre ag_() {
      return crm.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bot $$0, double $$1) {
      if (!this.dM().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dM().a(this, $$0, null, this.dr(), this.dt(), this.dx(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, cyx.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
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
      if (!this.dM().B) {
         this.dM().a(this, (byte)10);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.zc, aun.e, 1.0F, 1.0F);
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
   public float a(cyp $$0, cyd $$1, ib $$2, doz $$3, eks $$4, float $$5) {
      return !this.D() || !$$3.a(avc.N) && !$$1.a_($$2.c()).a(avc.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cyp $$0, cyd $$1, ib $$2, doz $$3, float $$4) {
      return !this.D() || !$$3.a(avc.N) && !$$1.a_($$2.c()).a(avc.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tm $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(tm $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bot $$0) {
      return e($$0);
   }

   private static boolean e(bot $$0) {
      return $$0.a(ave.j) || $$0.a(ave.m);
   }
}
