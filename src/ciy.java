public abstract class ciy extends ciz {
   private static final ako<Boolean> bY = aks.a(ciy.class, akq.k);
   private final bul bZ;

   protected ciy(bup<? extends ciy> $$0, dff $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(buk.a().a(buj.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azv $$0) {
      this.g(bwm.s).a((double)a($$0::a));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwl.a q() {
      return gX().a(bwm.v, 0.175F).a(bwm.o, 0.5);
   }

   public boolean t() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void eK() {
      super.eK();
      if (this.t()) {
         if (!this.dY().C) {
            this.a(dil.cv);
         }

         this.x(false);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         ut $$1 = new ut();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cwf $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               un $$4 = new un();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.ea(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gU();
      if (this.t()) {
         ut $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            un $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cwf.a(this.ea(), (vk)$$3).orElse(cwf.k));
            }
         }
      }

      this.gV();
   }

   @Override
   public bvw a_(int $$0) {
      return $$0 == 499 ? new bvw() {
         @Override
         public cwf a() {
            return ciy.this.t() ? new cwf(cwj.eN) : cwf.k;
         }

         @Override
         public boolean a(cwf $$0) {
            if ($$0.f()) {
               if (ciy.this.t()) {
                  ciy.this.x(false);
                  ciy.this.gU();
               }

               return true;
            } else if ($$0.a(cwj.eN)) {
               if (!ciy.this.t()) {
                  ciy.this.x(true);
                  ciy.this.gU();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      boolean $$2 = !this.p_() && this.gM() && $$0.gb();
      if (!this.cc() && !$$2) {
         cwf $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.l($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gM()) {
               this.hd();
               return bsh.a;
            }

            if (!this.t() && $$3.a(cwj.eN)) {
               this.d($$0, $$3);
               return bsh.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cor $$0, cwf $$1) {
      this.x(true);
      this.y();
      $$1.a(1, $$0);
      this.gU();
   }

   @Override
   protected void y() {
      this.a(awo.hi, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? 5 : 0;
   }
}
