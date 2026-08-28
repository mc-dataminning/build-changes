public abstract class cip extends ciq {
   private static final akk<Boolean> bY = ako.a(cip.class, akm.k);
   private final buc bZ;

   protected cip(bug<? extends cip> $$0, dev $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(bub.a().a(bua.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azr $$0) {
      this.g(bwd.s).a((double)a($$0::a));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwc.a q() {
      return gX().a(bwd.v, 0.175F).a(bwd.o, 0.5);
   }

   public boolean t() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.t()) {
         if (!this.dX().C) {
            this.a(dia.cv);
         }

         this.x(false);
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         up $$1 = new up();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cvx $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               uj $$4 = new uj();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dZ(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gU();
      if (this.t()) {
         up $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uj $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cvx.a(this.dZ(), (vg)$$3).orElse(cvx.k));
            }
         }
      }

      this.gV();
   }

   @Override
   public bvn a_(int $$0) {
      return $$0 == 499 ? new bvn() {
         @Override
         public cvx a() {
            return cip.this.t() ? new cvx(cwb.eN) : cvx.k;
         }

         @Override
         public boolean a(cvx $$0) {
            if ($$0.f()) {
               if (cip.this.t()) {
                  cip.this.x(false);
                  cip.this.gU();
               }

               return true;
            } else if ($$0.a(cwb.eN)) {
               if (!cip.this.t()) {
                  cip.this.x(true);
                  cip.this.gU();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      boolean $$2 = !this.p_() && this.gM() && $$0.ga();
      if (!this.cb() && !$$2) {
         cvx $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.l($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gM()) {
               this.hd();
               return bry.a;
            }

            if (!this.t() && $$3.a(cwb.eN)) {
               this.d($$0, $$3);
               return bry.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(coh $$0, cvx $$1) {
      this.x(true);
      this.y();
      $$1.a(1, $$0);
      this.gU();
   }

   @Override
   protected void y() {
      this.a(awk.hi, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? 5 : 0;
   }
}
