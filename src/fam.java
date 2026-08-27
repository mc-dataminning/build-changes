public class fam extends ezr implements fao<cfp> {
   private final cfp q;
   private final cez s = new cez() {
      @Override
      public void a(cen $$0, int $$1, cjh $$2) {
         fam.this.J();
      }

      @Override
      public void a(cen $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fam.this.K();
         }
      }
   };

   public fam(cfp $$0, cbv $$1, tn $$2) {
      this.q = $$0;
   }

   public cfp I() {
      return this.q;
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.q.a(this.s);
   }

   @Override
   public void az_() {
      this.f.s.q();
      super.az_();
   }

   @Override
   public void h() {
      super.h();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.s.gd()) {
         this.d(ess.a(tm.d, $$0 -> this.az_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(ess.a(tn.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.l();
      }
   }

   @Override
   protected void F() {
      this.c(1);
   }

   @Override
   protected void G() {
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

   void J() {
      cjh $$0 = this.q.l();
      this.a(ezr.a.a($$0));
   }

   void K() {
      this.a(this.q.m());
   }

   @Override
   protected void H() {
      this.f.s.q();
   }
}
