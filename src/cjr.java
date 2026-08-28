public abstract class cjr extends cjs {
   private static final aks<Boolean> bZ = akw.a(cjr.class, aku.k);
   private final bve ca;

   protected cjr(bvi<? extends cjr> $$0, dgz $$1) {
      super($$0, $$1);
      this.cy = false;
      this.ca = $$0.n().a(bvd.a().a(bvc.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(bac $$0) {
      this.g(bxf.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static bxe.a p() {
      return gQ().a(bxf.v, 0.175F).a(bxf.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bZ);
   }

   public void x(boolean $$0) {
      this.al.a(bZ, $$0);
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? this.ca : super.e($$0);
   }

   @Override
   protected void f(arx $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dkf.cD);
         this.x(false);
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         us $$1 = new us();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cxg $$3 = this.cu.a($$2);
            if (!$$3.f()) {
               um $$4 = new um();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dY(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gN();
      if (this.t()) {
         us $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            um $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cxg.a(this.dY(), (vj)$$3).orElse(cxg.j));
            }
         }
      }

      this.gO();
   }

   @Override
   public bwp a_(int $$0) {
      return $$0 == 499 ? new bwp() {
         @Override
         public cxg a() {
            return cjr.this.t() ? new cxg(cxk.fb) : cxg.j;
         }

         @Override
         public boolean a(cxg $$0) {
            if ($$0.f()) {
               if (cjr.this.t()) {
                  cjr.this.x(false);
                  cjr.this.gN();
               }

               return true;
            } else if ($$0.a(cxk.fb)) {
               if (!cjr.this.t()) {
                  cjr.this.x(true);
                  cjr.this.gN();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      boolean $$2 = !this.e_() && this.gF() && $$0.fY();
      if (!this.ca() && !$$2) {
         cxg $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bta.a;
            }

            if (!this.t() && $$3.a(cxk.fb)) {
               this.d($$0, $$3);
               return bta.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cpo $$0, cxg $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gN();
   }

   @Override
   protected void x() {
      this.a(awv.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? 5 : 0;
   }
}
