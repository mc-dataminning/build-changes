public abstract class bwp extends bwq {
   private static final aee<Boolean> bU = aeh.a(bwp.class, aeg.k);
   public static final int bT = 15;

   protected bwp(biu<? extends bwp> $$0, cpv $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(asc $$0) {
      this.a(bkm.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bkl.a s() {
      return gD().a(bkm.d, 0.175F).a(bkm.n, 0.5);
   }

   public boolean t() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int Z_() {
      return this.t() ? 17 : super.Z_();
   }

   @Override
   protected float a(bir $$0, float $$1) {
      return $$0.b - (this.m_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.t()) {
         if (!this.dL().B) {
            this.a(csw.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         rc $$1 = new rc();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cjf $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               qw $$4 = new qw();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gz();
      if (this.t()) {
         rc $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qw $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cjf.a($$3));
            }
         }
      }

      this.gA();
   }

   @Override
   public bjy a_(int $$0) {
      return $$0 == 499 ? new bjy() {
         @Override
         public cjf a() {
            return bwp.this.t() ? new cjf(cji.er) : cjf.b;
         }

         @Override
         public boolean a(cjf $$0) {
            if ($$0.b()) {
               if (bwp.this.t()) {
                  bwp.this.w(false);
                  bwp.this.gz();
               }

               return true;
            } else if ($$0.a(cji.er)) {
               if (!bwp.this.t()) {
                  bwp.this.w(true);
                  bwp.this.gz();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      boolean $$2 = !this.m_() && this.gs() && $$0.fH();
      if (!this.bO() && !$$2) {
         cjf $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gs()) {
               this.gJ();
               return bgy.a(this.dL().B);
            }

            if (!this.t() && $$3.a(cji.er)) {
               this.d($$0, $$3);
               return bgy.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cbu $$0, cjf $$1) {
      this.w(true);
      this.gd();
      if (!$$0.fS().d) {
         $$1.h(1);
      }

      this.gz();
   }

   @Override
   protected void gd() {
      this.a(apd.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gl() {
      return 5;
   }
}
