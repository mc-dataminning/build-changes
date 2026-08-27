public class fcw extends fca implements fcy<chq> {
   private final chq q;
   private final cgy r = new cgy() {
      @Override
      public void a(cgm $$0, int $$1, clj $$2) {
         fcw.this.I();
      }

      @Override
      public void a(cgm $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fcw.this.J();
         }
      }
   };

   public fcw(chq $$0, cdt $$1, ur $$2) {
      this.q = $$0;
   }

   public chq H() {
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
      if (this.f.s.gf()) {
         this.d(euz.a(uq.d, $$0 -> this.aF_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(euz.a(ur.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      clj $$0 = this.q.l();
      this.a(fca.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.r();
   }
}
