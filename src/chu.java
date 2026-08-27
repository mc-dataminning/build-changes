import javax.annotation.Nullable;

public class chu extends chi {
   private static final byte c = 10;
   private int d = -1;

   public chu(bmc<? extends chu> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public chu(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.bb, $$0, $$1, $$2, $$3);
   }

   @Override
   public chi.a w() {
      return chi.a.d;
   }

   @Override
   public djp y() {
      return cxa.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dL().a(jx.ab, this.dq(), this.ds() + 0.5, this.dw(), 0.0, 0.0, 0.0);
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
   public boolean a(bkv $$0, float $$1) {
      if ($$0.c() instanceof cfw $$3 && $$3.bN()) {
         bkv $$4 = this.dM().d(this, $$0.d());
         this.a($$4, $$3.do().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bkv $$0) {
      double $$1 = this.do().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ai_());
      } else {
         if (this.d < 0) {
            this.C();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cnb ai_() {
      return cnj.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bkv $$0, double $$1) {
      if (!this.dL().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dL().a(this, $$0, null, this.dq(), this.ds(), this.dw(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, ctx.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
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
      if (!this.dL().B) {
         this.dL().a(this, (byte)10);
         if (!this.aU()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), art.yQ, aru.e, 1.0F, 1.0F);
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
   public float a(ctp $$0, ctd $$1, hx $$2, djp $$3, eez $$4, float $$5) {
      return !this.E() || !$$3.a(asi.N) && !$$1.a_($$2.c()).a(asi.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(ctp $$0, ctd $$1, hx $$2, djp $$3, float $$4) {
      return !this.E() || !$$3.a(asi.N) && !$$1.a_($$2.c()).a(asi.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(so $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bkv $$0) {
      return e($$0);
   }

   private static boolean e(bkv $$0) {
      return $$0.a(ask.j) || $$0.a(ask.m);
   }
}
