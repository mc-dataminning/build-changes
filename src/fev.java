public class fev extends fdz implements fex<ciy> {
   private final ciy q;
   private final cig r = new cig() {
      @Override
      public void a(chu $$0, int $$1, cmr $$2) {
         fev.this.K();
      }

      @Override
      public void a(chu $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fev.this.L();
         }
      }
   };

   public fev(ciy $$0, cfa $$1, vd $$2) {
      this.q = $$0;
   }

   public ciy J() {
      return this.q;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.q.a(this.r);
   }

   @Override
   public void aE_() {
      this.f.s.r();
      super.aE_();
   }

   @Override
   public void j() {
      super.j();
      this.q.b(this.r);
   }

   @Override
   protected void n() {
      if (this.f.s.ge()) {
         this.d(ewy.a(vc.d, $$0 -> this.aE_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(ewy.a(vd.c("lectern.take_book"), $$0 -> this.g(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.n();
      }
   }

   @Override
   protected void E() {
      this.g(1);
   }

   @Override
   protected void H() {
      this.g(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.q.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.f.q.a(this.q.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void K() {
      cmr $$0 = this.q.l();
      this.a(fdz.a.a($$0));
   }

   void L() {
      this.a(this.q.m());
   }

   @Override
   protected void I() {
      this.f.s.r();
   }
}
