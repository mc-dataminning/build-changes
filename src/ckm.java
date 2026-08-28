public abstract class ckm extends ckn {
   private static final akg<Boolean> bE = akk.a(ckm.class, aki.k);
   private final bvv bF;

   protected ckm(bwb<? extends ckm> $$0, dhp $$1) {
      super($$0, $$1);
      this.ca = false;
      this.bF = $$0.n().a(bvu.a().a(bvt.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bxx.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, false);
   }

   public static bxw.a q() {
      return gR().a(bxx.v, 0.175F).a(bxx.o, 0.5);
   }

   public boolean t() {
      return this.al.a(bE);
   }

   public void w(boolean $$0) {
      this.al.a(bE, $$0);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? this.bF : super.e($$0);
   }

   @Override
   protected void f(arn $$0) {
      super.f($$0);
      if (this.t()) {
         this.a($$0, dkw.cD);
         this.w(false);
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uc $$1 = new uc();

         for (int $$2 = 0; $$2 < this.bW.b(); $$2++) {
            cxy $$3 = this.bW.a($$2);
            if (!$$3.f()) {
               tw $$4 = new tw();
               $$4.a("Slot", (byte)$$2);
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gP();
      if (this.t()) {
         uc $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tw $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.bW.b()) {
               this.bW.a($$4, cxy.a(this.dX(), (ut)$$3).orElse(cxy.k));
            }
         }
      }
   }

   @Override
   public bxi a_(int $$0) {
      return $$0 == 499 ? new bxi() {
         @Override
         public cxy a() {
            return ckm.this.t() ? new cxy(cyc.fd) : cxy.k;
         }

         @Override
         public boolean a(cxy $$0) {
            if ($$0.f()) {
               if (ckm.this.t()) {
                  ckm.this.w(false);
                  ckm.this.gP();
               }

               return true;
            } else if ($$0.a(cyc.fd)) {
               if (!ckm.this.t()) {
                  ckm.this.w(true);
                  ckm.this.gP();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      boolean $$2 = !this.n_() && this.gH() && $$0.fX();
      if (!this.ca() && !$$2) {
         cxy $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.k($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gH()) {
               this.gW();
               return btq.a;
            }

            if (!this.t() && $$3.a(cyc.fd)) {
               this.d($$0, $$3);
               return btq.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cqi $$0, cxy $$1) {
      this.w(true);
      this.x();
      $$1.a(1, $$0);
      this.gP();
   }

   @Override
   protected void x() {
      this.a(awk.hC, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int aa_() {
      return this.t() ? 5 : 0;
   }
}
