public abstract class cid extends cie {
   private static final akg<Boolean> bY = akk.a(cid.class, aki.k);
   private final btr bZ;

   protected cid(btv<? extends cid> $$0, deg $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(btq.a().a(btp.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azl $$0) {
      this.g(bvr.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bvq.a q() {
      return gR().a(bvr.v, 0.175F).a(bvr.o, 0.5);
   }

   public boolean t() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.t()) {
         if (!this.dS().B) {
            this.a(dhl.cv);
         }

         this.x(false);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         ul $$1 = new ul();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cvp $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               uf $$4 = new uf();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dU(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gO();
      if (this.t()) {
         ul $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cvp.a(this.dU(), (vc)$$3).orElse(cvp.k));
            }
         }
      }

      this.gP();
   }

   @Override
   public bvb a_(int $$0) {
      return $$0 == 499 ? new bvb() {
         @Override
         public cvp a() {
            return cid.this.t() ? new cvp(cvt.eN) : cvp.k;
         }

         @Override
         public boolean a(cvp $$0) {
            if ($$0.f()) {
               if (cid.this.t()) {
                  cid.this.x(false);
                  cid.this.gO();
               }

               return true;
            } else if ($$0.a(cvt.eN)) {
               if (!cid.this.t()) {
                  cid.this.x(true);
                  cid.this.gO();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      boolean $$2 = !this.o_() && this.gG() && $$0.fS();
      if (!this.bX() && !$$2) {
         cvp $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.n($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gG()) {
               this.gX();
               return brp.a;
            }

            if (!this.t() && $$3.a(cvt.eN)) {
               this.d($$0, $$3);
               return brp.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cnu $$0, cvp $$1) {
      this.x(true);
      this.y();
      $$1.a(1, $$0);
      this.gO();
   }

   @Override
   protected void y() {
      this.a(awe.hi, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ae_() {
      return this.t() ? 5 : 0;
   }
}
