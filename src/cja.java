public abstract class cja extends cjb {
   private static final ajx<Boolean> bY = akb.a(cja.class, ajz.k);
   private final bun bZ;

   protected cja(bur<? extends cja> $$0, dgi $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(bum.a().a(bul.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwo.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwn.a p() {
      return gR().a(bwo.v, 0.175F).a(bwo.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bY);
   }

   public void x(boolean $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void f(arc $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, djo.cD);
         this.x(false);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         tw $$1 = new tw();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cwp $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               tq $$4 = new tq();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dY(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gO();
      if (this.t()) {
         tw $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cwp.a(this.dY(), (un)$$3).orElse(cwp.j));
            }
         }
      }

      this.gP();
   }

   @Override
   public bvy a_(int $$0) {
      return $$0 == 499 ? new bvy() {
         @Override
         public cwp a() {
            return cja.this.t() ? new cwp(cwt.fb) : cwp.j;
         }

         @Override
         public boolean a(cwp $$0) {
            if ($$0.f()) {
               if (cja.this.t()) {
                  cja.this.x(false);
                  cja.this.gO();
               }

               return true;
            } else if ($$0.a(cwt.fb)) {
               if (!cja.this.t()) {
                  cja.this.x(true);
                  cja.this.gO();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      boolean $$2 = !this.e_() && this.gG() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwp $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gG()) {
               this.gW();
               return bsj.a;
            }

            if (!this.t() && $$3.a(cwt.fb)) {
               this.d($$0, $$3);
               return bsj.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cox $$0, cwp $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gO();
   }

   @Override
   protected void x() {
      this.a(awa.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? 5 : 0;
   }
}
