public abstract class ciz extends cja {
   private static final ajx<Boolean> bY = akb.a(ciz.class, ajz.k);
   private final bum bZ;

   protected ciz(buq<? extends ciz> $$0, dgg $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(bul.a().a(buk.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azg $$0) {
      this.g(bwn.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwm.a p() {
      return gR().a(bwn.v, 0.175F).a(bwn.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bY);
   }

   public void x(boolean $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void f(arc $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, djm.cD);
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
            cwn $$3 = this.ct.a($$2);
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
               this.ct.a($$4 + 1, cwn.a(this.dY(), (un)$$3).orElse(cwn.j));
            }
         }
      }

      this.gP();
   }

   @Override
   public bvx a_(int $$0) {
      return $$0 == 499 ? new bvx() {
         @Override
         public cwn a() {
            return ciz.this.t() ? new cwn(cwr.fb) : cwn.j;
         }

         @Override
         public boolean a(cwn $$0) {
            if ($$0.f()) {
               if (ciz.this.t()) {
                  ciz.this.x(false);
                  ciz.this.gO();
               }

               return true;
            } else if ($$0.a(cwr.fb)) {
               if (!ciz.this.t()) {
                  ciz.this.x(true);
                  ciz.this.gO();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      boolean $$2 = !this.e_() && this.gG() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwn $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gG()) {
               this.gW();
               return bsi.a;
            }

            if (!this.t() && $$3.a(cwr.fb)) {
               this.d($$0, $$3);
               return bsi.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cov $$0, cwn $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gO();
   }

   @Override
   protected void x() {
      this.a(avz.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? 5 : 0;
   }
}
