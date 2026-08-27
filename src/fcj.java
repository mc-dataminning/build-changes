public class fcj extends fbn implements fcl<chi> {
   private final chi q;
   private final cgq r = new cgq() {
      @Override
      public void a(cge $$0, int $$1, clb $$2) {
         fcj.this.I();
      }

      @Override
      public void a(cge $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fcj.this.J();
         }
      }
   };

   public fcj(chi $$0, cdl $$1, ur $$2) {
      this.q = $$0;
   }

   public chi H() {
      return this.q;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.q.a(this.r);
   }

   @Override
   public void aE_() {
      this.f.s.q();
      super.aE_();
   }

   @Override
   public void aF_() {
      super.aF_();
      this.q.b(this.r);
   }

   @Override
   protected void l() {
      if (this.f.s.ge()) {
         this.d(eum.a(uq.d, $$0 -> this.aE_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(eum.a(ur.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.l();
      }
   }

   @Override
   protected void E() {
      this.c(1);
   }

   @Override
   protected void F() {
      this.c(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.q.m()) {
         this.c(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void c(int $$0) {
      this.f.q.a(this.q.j, $$0);
   }

   @Override
   public boolean j() {
      return false;
   }

   void I() {
      clb $$0 = this.q.l();
      this.a(fbn.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.q();
   }
}
