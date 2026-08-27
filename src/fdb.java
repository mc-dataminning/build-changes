public class fdb extends fcf implements fdd<chv> {
   private final chv q;
   private final chd r = new chd() {
      @Override
      public void a(cgr $$0, int $$1, clo $$2) {
         fdb.this.I();
      }

      @Override
      public void a(cgr $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fdb.this.J();
         }
      }
   };

   public fdb(chv $$0, cdy $$1, uv $$2) {
      this.q = $$0;
   }

   public chv H() {
      return this.q;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.q.a(this.r);
   }

   @Override
   public void aG_() {
      this.f.s.r();
      super.aG_();
   }

   @Override
   public void aH_() {
      super.aH_();
      this.q.b(this.r);
   }

   @Override
   protected void l() {
      if (this.f.s.gf()) {
         this.d(eve.a(uu.d, $$0 -> this.aG_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(eve.a(uv.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      clo $$0 = this.q.l();
      this.a(fcf.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.r();
   }
}
