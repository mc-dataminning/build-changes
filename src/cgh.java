public abstract class cgh extends cgi {
   private static final ajy<Boolean> ci = akc.a(cgh.class, aka.k);
   public static final int ch = 15;
   private final bry ck;

   protected cgh(bsb<? extends cgh> $$0, dca $$1) {
      super($$0, $$1);
      this.cF = false;
      this.ck = $$0.n().a(brx.a().a(brw.a, 0.0F, $$0.l() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(ayt $$0) {
      this.f(btv.q).a((double)a($$0::a));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, false);
   }

   public static btu.a r() {
      return gX().a(btv.r, 0.175F).a(btv.m, 0.5);
   }

   public boolean t() {
      return this.as.a(ci);
   }

   public void w(boolean $$0) {
      this.as.a(ci, $$0);
   }

   @Override
   protected int ac_() {
      return this.t() ? 16 : super.ac_();
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? this.ck : super.e($$0);
   }

   @Override
   protected void eL() {
      super.eL();
      if (this.t()) {
         if (!this.dU().C) {
            this.a(dfe.dg);
         }

         this.w(false);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uq $$1 = new uq();

         for (int $$2 = 1; $$2 < this.cB.b(); $$2++) {
            cuh $$3 = this.cB.a($$2);
            if (!$$3.d()) {
               uk $$4 = new uk();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dY(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gU();
      if (this.t()) {
         uq $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cB.b() - 1) {
               this.cB.a($$4 + 1, cuh.a(this.dY(), (vh)$$3).orElse(cuh.i));
            }
         }
      }

      this.gV();
   }

   @Override
   public btf a_(int $$0) {
      return $$0 == 499 ? new btf() {
         @Override
         public cuh a() {
            return cgh.this.t() ? new cuh(cuk.fY) : cuh.i;
         }

         @Override
         public boolean a(cuh $$0) {
            if ($$0.d()) {
               if (cgh.this.t()) {
                  cgh.this.w(false);
                  cgh.this.gU();
               }

               return true;
            } else if ($$0.a(cuk.fY)) {
               if (!cgh.this.t()) {
                  cgh.this.w(true);
                  cgh.this.gU();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      boolean $$2 = !this.o_() && this.gN() && $$0.ga();
      if (!this.bX() && !$$2) {
         cuh $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gN()) {
               this.hd();
               return bqa.a(this.dU().C);
            }

            if (!this.t() && $$3.a(cuk.fY)) {
               this.d($$0, $$3);
               return bqa.a(this.dU().C);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cly $$0, cuh $$1) {
      this.w(true);
      this.gy();
      $$1.a(1, $$0);
      this.gU();
   }

   @Override
   protected void gy() {
      this.a(avo.hh, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 1.0F);
   }

   public int gG() {
      return 5;
   }
}
