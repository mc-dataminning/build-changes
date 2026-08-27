public class fhn extends fgr implements fhp<clj> {
   private final clj q;
   private final ckr r = new ckr() {
      @Override
      public void a(ckf $$0, int $$1, cpd $$2) {
         fhn.this.M();
      }

      @Override
      public void a(ckf $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fhn.this.N();
         }
      }
   };

   public fhn(clj $$0, chk $$1, vq $$2) {
      this.q = $$0;
   }

   public clj L() {
      return this.q;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
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
      if (this.f.s.gf()) {
         this.c(ezo.a(vp.d, $$0 -> this.d()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.c(ezo.a(vq.c("lectern.take_book"), $$0 -> this.g(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      cpd $$0 = this.q.l();
      this.a(fgr.a.a($$0));
   }

   void N() {
      this.a(this.q.m());
   }

   @Override
   protected void K() {
      this.f.s.r();
   }
}
