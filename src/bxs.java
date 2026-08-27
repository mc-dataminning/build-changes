public abstract class bxs extends bxt {
   private static final afc<Boolean> bU = aff.a(bxs.class, afe.k);
   public static final int bT = 15;

   protected bxs(bjx<? extends bxs> $$0, cqz $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(ate $$0) {
      this.a(blp.l).a((double)a($$0::a));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, false);
   }

   public static blo.a s() {
      return gE().a(blp.m, 0.175F).a(blp.h, 0.5);
   }

   public boolean t() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int aa_() {
      return this.t() ? 17 : super.aa_();
   }

   @Override
   protected float a(bju $$0, float $$1) {
      return $$0.b - (this.n_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.t()) {
         if (!this.dL().B) {
            this.a(cuc.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         rz $$1 = new rz();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            ckj $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               rt $$4 = new rt();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gA();
      if (this.t()) {
         rz $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            rt $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, ckj.a($$3));
            }
         }
      }

      this.gB();
   }

   @Override
   public blb a_(int $$0) {
      return $$0 == 499 ? new blb() {
         @Override
         public ckj a() {
            return bxs.this.t() ? new ckj(ckm.er) : ckj.b;
         }

         @Override
         public boolean a(ckj $$0) {
            if ($$0.b()) {
               if (bxs.this.t()) {
                  bxs.this.w(false);
                  bxs.this.gA();
               }

               return true;
            } else if ($$0.a(ckm.er)) {
               if (!bxs.this.t()) {
                  bxs.this.w(true);
                  bxs.this.gA();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      boolean $$2 = !this.n_() && this.gt() && $$0.fI();
      if (!this.bO() && !$$2) {
         ckj $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bib.a(this.dL().B);
            }

            if (!this.t() && $$3.a(ckm.er)) {
               this.d($$0, $$3);
               return bib.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(ccx $$0, ckj $$1) {
      this.w(true);
      this.ge();
      if (!$$0.fT().d) {
         $$1.h(1);
      }

      this.gA();
   }

   @Override
   protected void ge() {
      this.a(aqd.gd, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gm() {
      return 5;
   }
}
