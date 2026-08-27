public class ffc extends feg implements ffe<cje> {
   private final cje q;
   private final cim r = new cim() {
      @Override
      public void a(cia $$0, int $$1, cmx $$2) {
         ffc.this.L();
      }

      @Override
      public void a(cia $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ffc.this.M();
         }
      }
   };

   public ffc(cje $$0, cfg $$1, vf $$2) {
      this.q = $$0;
   }

   public cje K() {
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
         this.d(exf.a(ve.d, $$0 -> this.aE_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(exf.a(vf.c("lectern.take_book"), $$0 -> this.g(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.n();
      }
   }

   @Override
   protected void H() {
      this.g(1);
   }

   @Override
   protected void I() {
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

   void L() {
      cmx $$0 = this.q.l();
      this.a(feg.a.a($$0));
   }

   void M() {
      this.a(this.q.m());
   }

   @Override
   protected void J() {
      this.f.s.r();
   }
}
