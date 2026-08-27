public class fee extends fdi implements feg<cio> {
   private final cio q;
   private final chw r = new chw() {
      @Override
      public void a(chk $$0, int $$1, cmh $$2) {
         fee.this.I();
      }

      @Override
      public void a(chk $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fee.this.J();
         }
      }
   };

   public fee(cio $$0, ceq $$1, vb $$2) {
      this.q = $$0;
   }

   public cio H() {
      return this.q;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.q.a(this.r);
   }

   @Override
   public void aF_() {
      this.f.s.r();
      super.aF_();
   }

   @Override
   public void aG_() {
      super.aG_();
      this.q.b(this.r);
   }

   @Override
   protected void l() {
      if (this.f.s.ge()) {
         this.d(ewh.a(va.d, $$0 -> this.aF_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(ewh.a(vb.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      cmh $$0 = this.q.l();
      this.a(fdi.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.r();
   }
}
