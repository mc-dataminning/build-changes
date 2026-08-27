public abstract class bwr extends bws {
   private static final aeg<Boolean> bU = aej.a(bwr.class, aei.k);
   public static final int bT = 15;

   protected bwr(biw<? extends bwr> $$0, cpx $$1) {
      super($$0, $$1);
      this.ct = false;
   }

   @Override
   protected void a(ase $$0) {
      this.a(bko.a).a((double)a($$0::a));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, false);
   }

   public static bkn.a s() {
      return gD().a(bko.d, 0.175F).a(bko.n, 0.5);
   }

   public boolean t() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected int Z_() {
      return this.t() ? 17 : super.Z_();
   }

   @Override
   protected float a(bit $$0, float $$1) {
      return $$0.b - (this.m_() ? 0.15625F : 0.3875F) * $$1;
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.t()) {
         if (!this.dL().B) {
            this.a(csy.cv);
         }

         this.w(false);
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         re $$1 = new re();

         for (int $$2 = 2; $$2 < this.cp.b(); $$2++) {
            cjh $$3 = this.cp.a($$2);
            if (!$$3.b()) {
               qy $$4 = new qy();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", $$1);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.w($$0.q("ChestedHorse"));
      this.gz();
      if (this.t()) {
         re $$1 = $$0.c("Items", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qy $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.cp.b()) {
               this.cp.a($$4, cjh.a($$3));
            }
         }
      }

      this.gA();
   }

   @Override
   public bka a_(int $$0) {
      return $$0 == 499 ? new bka() {
         @Override
         public cjh a() {
            return bwr.this.t() ? new cjh(cjk.er) : cjh.b;
         }

         @Override
         public boolean a(cjh $$0) {
            if ($$0.b()) {
               if (bwr.this.t()) {
                  bwr.this.w(false);
                  bwr.this.gz();
               }

               return true;
            } else if ($$0.a(cjk.er)) {
               if (!bwr.this.t()) {
                  bwr.this.w(true);
                  bwr.this.gz();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      boolean $$2 = !this.m_() && this.gs() && $$0.fH();
      if (!this.bO() && !$$2) {
         cjh $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gs()) {
               this.gJ();
               return bha.a(this.dL().B);
            }

            if (!this.t() && $$3.a(cjk.er)) {
               this.d($$0, $$3);
               return bha.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cbw $$0, cjh $$1) {
      this.w(true);
      this.gd();
      if (!$$0.fS().d) {
         $$1.h(1);
      }

      this.gz();
   }

   @Override
   protected void gd() {
      this.a(apf.gb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   public int gl() {
      return 5;
   }
}
