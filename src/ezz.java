public class ezz extends eze implements fab<cfg> {
   private final cfg q;
   private final ceq s = new ceq() {
      @Override
      public void a(cee $$0, int $$1, ciy $$2) {
         ezz.this.H();
      }

      @Override
      public void a(cee $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ezz.this.I();
         }
      }
   };

   public ezz(cfg $$0, cbm $$1, tf $$2) {
      this.q = $$0;
   }

   public cfg G() {
      return this.q;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.q.a(this.s);
   }

   @Override
   public void au_() {
      this.f.v.q();
      super.au_();
   }

   @Override
   public void h() {
      super.h();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.v.gc()) {
         this.d(esh.a(te.d, $$0 -> this.au_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(esh.a(tf.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.l();
      }
   }

   @Override
   protected void D() {
      this.c(1);
   }

   @Override
   protected void E() {
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
      this.f.t.a(this.q.j, $$0);
   }

   @Override
   public boolean j() {
      return false;
   }

   void H() {
      ciy $$0 = this.q.l();
      this.a(eze.a.a($$0));
   }

   void I() {
      this.a(this.q.m());
   }

   @Override
   protected void F() {
      this.f.v.q();
   }
}
