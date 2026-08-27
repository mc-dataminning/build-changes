public abstract class bpf extends boz {
   protected static final float bU = 0.0F;

   protected bpf(bol<? extends bpf> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public float h(ib $$0) {
      return this.a($$0, this.dJ());
   }

   public float a(ib $$0, cwh $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cwf $$0, bpb $$1) {
      return this.a(this.dj(), $$0) >= 0.0F;
   }

   public boolean gh() {
      return !this.N().l();
   }

   public boolean gi() {
      if (this.bA.a(bya.Z)) {
         return this.bA.c(bya.Z).isPresent();
      } else {
         for (bxi $$0 : this.bP.b()) {
            if ($$0.h() && $$0.k() instanceof bwn) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fY() {
      super.fY();
      bof $$0 = this.ga();
      if ($$0 != null && $$0.dJ() == this.dJ()) {
         this.a($$0.dj(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bpt && ((bpt)this).A()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bP.a(bvu.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.do() - this.do()) / (double)$$1;
            double $$3 = ($$0.dq() - this.dq()) / (double)$$1;
            double $$4 = ($$0.du() - this.du()) / (double)$$1;
            this.g(this.dm().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.ck();
         } else if (this.gj() && !this.gi()) {
            this.bP.b(bvu.a.a);
            float $$5 = 2.0F;
            eov $$6 = new eov($$0.do() - this.do(), $$0.dq() - this.dq(), $$0.du() - this.du()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.N().a(this.do() + $$6.c, this.dq() + $$6.d, this.du() + $$6.e, this.gk());
         }
      }
   }

   protected boolean gj() {
      return true;
   }

   protected double gk() {
      return 1.0;
   }

   protected void D(float $$0) {
   }
}
