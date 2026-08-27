public abstract class cew extends cex {
   private static final ajk<Boolean> bZ = ajo.a(cew.class, ajm.k);
   public static final int bY = 15;
   private final bqo cb;

   protected cew(bqr<? extends cew> $$0, czu $$1) {
      super($$0, $$1);
      this.cx = false;
      this.cb = $$0.n().a(bqn.a().a(bqm.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayd $$0) {
      this.f(bsl.q).a((double)a($$0::a));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static bsk.a r() {
      return gO().a(bsl.r, 0.175F).a(bsl.m, 0.5);
   }

   public boolean u() {
      return this.ao.a(bZ);
   }

   public void w(boolean $$0) {
      this.ao.a(bZ, $$0);
   }

   @Override
   protected int ab_() {
      return this.u() ? 16 : super.ab_();
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? this.cb : super.e($$0);
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.u()) {
         if (!this.dN().B) {
            this.a(dcx.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.u());
      if (this.u()) {
         ue $$1 = new ue();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            csd $$3 = this.ct.a($$2);
            if (!$$3.d()) {
               ty $$4 = new ty();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dP(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gL();
      if (this.u()) {
         ue $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ty $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, csd.a(this.dP(), (uv)$$3).orElse(csd.i));
            }
         }
      }

      this.gM();
   }

   @Override
   public brv a_(int $$0) {
      return $$0 == 499 ? new brv() {
         @Override
         public csd a() {
            return cew.this.u() ? new csd(csg.eN) : csd.i;
         }

         @Override
         public boolean a(csd $$0) {
            if ($$0.d()) {
               if (cew.this.u()) {
                  cew.this.w(false);
                  cew.this.gL();
               }

               return true;
            } else if ($$0.a(csg.eN)) {
               if (!cew.this.u()) {
                  cew.this.w(true);
                  cew.this.gL();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fP();
      if (!this.bQ() && !$$2) {
         csd $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return boq.a(this.dN().B);
            }

            if (!this.u() && $$3.a(csg.eN)) {
               this.d($$0, $$3);
               return boq.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(ckl $$0, csd $$1) {
      this.w(true);
      this.gp();
      $$1.a(1, $$0);
      this.gL();
   }

   @Override
   protected void gp() {
      this.a(auz.hc, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   public int gx() {
      return 5;
   }
}
