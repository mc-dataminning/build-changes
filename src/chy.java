public abstract class chy extends chz {
   private static final akg<Boolean> bZ = akk.a(chy.class, aki.k);
   private final btm ca;

   protected chy(btq<? extends chy> $$0, dds $$1) {
      super($$0, $$1);
      this.cy = false;
      this.ca = $$0.n().a(btl.a().a(btk.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azk $$0) {
      this.g(bvm.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public static bvl.a q() {
      return gQ().a(bvm.v, 0.175F).a(bvm.o, 0.5);
   }

   public boolean t() {
      return this.am.a(bZ);
   }

   public void x(boolean $$0) {
      this.am.a(bZ, $$0);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? this.ca : super.e($$0);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.t()) {
         if (!this.dS().B) {
            this.a(dgx.cv);
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

         for (int $$2 = 1; $$2 < this.cu.b(); $$2++) {
            cvl $$3 = this.cu.a($$2);
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
      this.gN();
      if (this.t()) {
         ul $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.cu.b() - 1) {
               this.cu.a($$4 + 1, cvl.a(this.dU(), (vc)$$3).orElse(cvl.k));
            }
         }
      }

      this.gO();
   }

   @Override
   public buw a_(int $$0) {
      return $$0 == 499 ? new buw() {
         @Override
         public cvl a() {
            return chy.this.t() ? new cvl(cvo.eN) : cvl.k;
         }

         @Override
         public boolean a(cvl $$0) {
            if ($$0.f()) {
               if (chy.this.t()) {
                  chy.this.x(false);
                  chy.this.gN();
               }

               return true;
            } else if ($$0.a(cvo.eN)) {
               if (!chy.this.t()) {
                  chy.this.x(true);
                  chy.this.gN();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      boolean $$2 = !this.o_() && this.gF() && $$0.fR();
      if (!this.bX() && !$$2) {
         cvl $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.p($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gW();
               return brk.a;
            }

            if (!this.t() && $$3.a(cvo.eN)) {
               this.d($$0, $$3);
               return brk.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cnp $$0, cvl $$1) {
      this.x(true);
      this.y();
      $$1.a(1, $$0);
      this.gN();
   }

   @Override
   protected void y() {
      this.a(awd.hi, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ae_() {
      return this.t() ? 5 : 0;
   }
}
