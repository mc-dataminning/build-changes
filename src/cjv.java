public abstract class cjv extends cjw {
   private static final alc<Boolean> bZ = alg.a(cjv.class, ale.k);
   private final bvi ca;

   protected cjv(bvm<? extends cjv> $$0, dha $$1) {
      super($$0, $$1);
      this.cy = false;
      this.ca = $$0.n().a(bvh.a().a(bvg.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxj.s).a((double)a($$0::a));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static bxi.a p() {
      return gO().a(bxj.v, 0.175F).a(bxj.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bZ);
   }

   public void x(boolean $$0) {
      this.al.a(bZ, $$0);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? this.ca : super.e($$0);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dkg.cD);
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
            cxk $$3 = this.cu.a($$2);
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
               this.cu.a($$4 + 1, cxk.a(this.dX(), (vu)$$3).orElse(cxk.k));
            }
         }
      }

      this.gM();
   }

   @Override
   public bwt a_(int $$0) {
      return $$0 == 499 ? new bwt() {
         @Override
         public cxk a() {
            return cjv.this.t() ? new cxk(cxo.eZ) : cxk.k;
         }

         @Override
         public boolean a(cxk $$0) {
            if ($$0.f()) {
               if (cjv.this.t()) {
                  cjv.this.x(false);
                  cjv.this.gL();
               }

               return true;
            } else if ($$0.a(cxo.eZ)) {
               if (!cjv.this.t()) {
                  cjv.this.x(true);
                  cjv.this.gL();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      boolean $$2 = !this.e_() && this.gD() && $$0.fW();
      if (!this.ca() && !$$2) {
         cxk $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bte.a;
            }

            if (!this.t() && $$3.a(cxo.eZ)) {
               this.d($$0, $$3);
               return bte.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cps $$0, cxk $$1) {
      this.x(true);
      this.x();
      $$1.a(1, $$0);
      this.gL();
   }

   @Override
   protected void x() {
      this.a(axf.hA, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? 5 : 0;
   }
}
