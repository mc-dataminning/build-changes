public class ffo extends fes implements ffq<cjn> {
   private final cjn q;
   private final civ r = new civ() {
      @Override
      public void a(cij $$0, int $$1, cng $$2) {
         ffo.this.M();
      }

      @Override
      public void a(cij $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ffo.this.N();
         }
      }
   };

   public ffo(cjn $$0, cfp $$1, vg $$2) {
      this.q = $$0;
   }

   public cjn L() {
      return this.q;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.q.a(this.r);
   }

   @Override
   public void d() {
      this.f.s.r();
      super.d();
   }

   @Override
   public void k() {
      super.k();
      this.q.b(this.r);
   }

   @Override
   protected void o() {
      if (this.f.s.ge()) {
         this.d(exr.a(vf.d, $$0 -> this.d()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(exr.a(vg.c("lectern.take_book"), $$0 -> this.g(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.o();
      }
   }

   @Override
   protected void I() {
      this.g(1);
   }

   @Override
   protected void J() {
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
   public boolean m() {
      return false;
   }

   void M() {
      cng $$0 = this.q.l();
      this.a(fes.a.a($$0));
   }

   void N() {
      this.a(this.q.m());
   }

   @Override
   protected void K() {
      this.f.s.r();
   }
}
