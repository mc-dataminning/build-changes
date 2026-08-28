public abstract class cjb extends cjc {
   private static final akm<Boolean> bY = akq.a(cjb.class, ako.k);
   private final buo bZ;

   protected cjb(bus<? extends cjb> $$0, dfm $$1) {
      super($$0, $$1);
      this.cx = false;
      this.bZ = $$0.n().a(bun.a().a(bum.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(azu $$0) {
      this.g(bwp.s).a((double)a($$0::a));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public static bwo.a n() {
      return gO().a(bwp.v, 0.175F).a(bwp.o, 0.5);
   }

   public boolean q() {
      return this.al.a(bY);
   }

   public void x(boolean $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? this.bZ : super.e($$0);
   }

   @Override
   protected void f(arp $$0) {
      super.f($$0);
      if (this.q()) {
         this.a($$0, dis.cv);
         this.x(false);
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.q());
      if (this.q()) {
         ur $$1 = new ur();

         for (int $$2 = 1; $$2 < this.ct.b(); $$2++) {
            cwm $$3 = this.ct.a($$2);
            if (!$$3.f()) {
               ul $$4 = new ul();
               $$4.a("Slot", (byte)($$2 - 1));
               $$1.add($$3.b(this.dX(), $$4));
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("ChestedHorse"));
      this.gL();
      if (this.q()) {
         ur $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ul $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 < this.ct.b() - 1) {
               this.ct.a($$4 + 1, cwm.a(this.dX(), (vi)$$3).orElse(cwm.k));
            }
         }
      }

      this.gM();
   }

   @Override
   public bvz a_(int $$0) {
      return $$0 == 499 ? new bvz() {
         @Override
         public cwm a() {
            return cjb.this.q() ? new cwm(cwq.eN) : cwm.k;
         }

         @Override
         public boolean a(cwm $$0) {
            if ($$0.f()) {
               if (cjb.this.q()) {
                  cjb.this.x(false);
                  cjb.this.gL();
               }

               return true;
            } else if ($$0.a(cwq.eN)) {
               if (!cjb.this.q()) {
                  cjb.this.x(true);
                  cjb.this.gL();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      boolean $$2 = !this.e_() && this.gD() && $$0.fW();
      if (!this.ca() && !$$2) {
         cwm $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bsk.a;
            }

            if (!this.q() && $$3.a(cwq.eN)) {
               this.d($$0, $$3);
               return bsk.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cou $$0, cwm $$1) {
      this.x(true);
      this.v();
      $$1.a(1, $$0);
      this.gL();
   }

   @Override
   protected void v() {
      this.a(awn.hi, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.q() ? 5 : 0;
   }
}
