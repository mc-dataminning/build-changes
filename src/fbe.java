public class fbe extends faj implements fbg<cgr> {
   private final cgr q;
   private final cgb s = new cgb() {
      @Override
      public void a(cfp $$0, int $$1, ckj $$2) {
         fbe.this.I();
      }

      @Override
      public void a(cfp $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fbe.this.J();
         }
      }
   };

   public fbe(cgr $$0, ccw $$1, ui $$2) {
      this.q = $$0;
   }

   public cgr H() {
      return this.q;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.q.a(this.s);
   }

   @Override
   public void aC_() {
      this.f.s.q();
      super.aC_();
   }

   @Override
   public void aD_() {
      super.aD_();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.s.ge()) {
         this.d(etj.a(uh.d, $$0 -> this.aC_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(etj.a(ui.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      ckj $$0 = this.q.l();
      this.a(faj.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.q();
   }
}
