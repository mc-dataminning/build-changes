public abstract class cig extends cih {
   private static final akh<Boolean> bY = akl.a(cig.class, akj.k);
   private final btu bZ;

   protected cig(bty<? extends cig> $$0, dej $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(btt.a().a(bts.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azn $$0) {
      this.g(bvu.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bvt.a q() {
      return gQ().a(bvu.v, 0.175F).a(bvu.o, 0.5);
   }

   public boolean t() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void eE() {
      super.eE();
      if (this.t()) {
         if (!this.dS().B) {
            this.a(dho.cv);
         }

         this.x(false);
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         um $$1 = new um();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cvs $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               ug $$4 = new ug();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dU(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gN();
      if (this.t()) {
         um $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ug $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cvs.a(this.dU(), (vd)$$3).orElse(cvs.k));
            }
         }
      }

      this.gO();
   }

   @Override
   public bve a_(int $$0) {
      return $$0 == 499 ? new bve() {
         @Override
         public cvs a() {
            return cig.this.t() ? new cvs(cvw.eN) : cvs.k;
         }

         @Override
         public boolean a(cvs $$0) {
            if ($$0.f()) {
               if (cig.this.t()) {
                  cig.this.x(false);
                  cig.this.gN();
               }

               return true;
            } else if ($$0.a(cvw.eN)) {
               if (!cig.this.t()) {
                  cig.this.x(true);
                  cig.this.gN();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fT();
      if (!this.bX() && !$$2) {
         cvs $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.n($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gW();
               return brs.a;
            }

            if (!this.t() && $$3.a(cvw.eN)) {
               this.d($$0, $$3);
               return brs.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cnx $$0, cvs $$1) {
      this.x(true);
      this.y();
      $$1.a(1, $$0);
      this.gN();
   }

   @Override
   protected void y() {
      this.a(awg.hi, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? 5 : 0;
   }
}
