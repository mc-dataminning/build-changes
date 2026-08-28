public abstract class ciu extends civ {
   private static final akl<Boolean> bY = akp.a(ciu.class, akn.k);
   private final buh bZ;

   protected ciu(bul<? extends ciu> $$0, dfb $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(bug.a().a(buf.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bwi.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwh.a q() {
      return gW().a(bwi.v, 0.175F).a(bwi.o, 0.5);
   }

   public boolean t() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.t()) {
         if (!this.dX().C) {
            this.a(dig.cv);
         }

         this.x(false);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         uq $$1 = new uq();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cwb $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               uk $$4 = new uk();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dZ(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gT();
      if (this.t()) {
         uq $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cwb.a(this.dZ(), (vh)$$3).orElse(cwb.k));
            }
         }
      }

      this.gU();
   }

   @Override
   public bvs a_(int $$0) {
      return $$0 == 499 ? new bvs() {
         @Override
         public cwb a() {
            return ciu.this.t() ? new cwb(cwf.eN) : cwb.k;
         }

         @Override
         public boolean a(cwb $$0) {
            if ($$0.f()) {
               if (ciu.this.t()) {
                  ciu.this.x(false);
                  ciu.this.gT();
               }

               return true;
            } else if ($$0.a(cwf.eN)) {
               if (!ciu.this.t()) {
                  ciu.this.x(true);
                  ciu.this.gT();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      boolean $$2 = !this.p_() && this.gL() && $$0.ga();
      if (!this.cb() && !$$2) {
         cwb $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.l($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.hc();
               return bsd.a;
            }

            if (!this.t() && $$3.a(cwf.eN)) {
               this.d($$0, $$3);
               return bsd.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(com $$0, cwb $$1) {
      this.x(true);
      this.y();
      $$1.a(1, $$0);
      this.gT();
   }

   @Override
   protected void y() {
      this.a(awl.hi, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? 5 : 0;
   }
}
