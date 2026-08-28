public abstract class cjz extends cka {
   private static final alc<Boolean> bZ = alg.a(cjz.class, ale.k);
   private final bvm ca;

   protected cjz(bvq<? extends cjz> $$0, dhh $$1) {
      super($$0, $$1);
      this.cy = false;
      this.ca = $$0.n().a(bvl.a().a(bvk.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxn.s).a((double)a($$0::a));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static bxm.a p() {
      return gO().a(bxn.v, 0.175F).a(bxn.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bZ);
   }

   public void x(boolean $$0) {
      this.al.a(bZ, $$0);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? this.ca : super.e($$0);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dkn.cD);
         this.x(false);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         vd $$1 = new vd();

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cxo $$3 = this.cu.a($$2);
            if (!$$3.f()) {
               ux $$4 = new ux();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gL();
      if (this.t()) {
         vd $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ux $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cxo.a(this.dX(), (vu)$$3).orElse(cxo.k));
            }
         }
      }

      this.gM();
   }

   @Override
   public bwx a_(int $$0) {
      return $$0 == 499 ? new bwx() {
         @Override
         public cxo a() {
            return cjz.this.t() ? new cxo(cxs.eZ) : cxo.k;
         }

         @Override
         public boolean a(cxo $$0) {
            if ($$0.f()) {
               if (cjz.this.t()) {
                  cjz.this.x(false);
                  cjz.this.gL();
               }

               return true;
            } else if ($$0.a(cxs.eZ)) {
               if (!cjz.this.t()) {
                  cjz.this.x(true);
                  cjz.this.gL();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      boolean $$2 = !this.e_() && this.gD() && $$0.fW();
      if (!this.ca() && !$$2) {
         cxo $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bti.a;
            }

            if (!this.t() && $$3.a(cxs.eZ)) {
               this.d($$0, $$3);
               return bti.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cpw $$0, cxo $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gL();
   }

   @Override
   protected void x() {
      this.a(axf.hB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? 5 : 0;
   }
}
