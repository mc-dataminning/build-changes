public class faf extends ezk implements fah<cft> {
   private final cft q;
   private final cfd s = new cfd() {
      @Override
      public void a(cer $$0, int $$1, cjl $$2) {
         faf.this.J();
      }

      @Override
      public void a(cer $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            faf.this.K();
         }
      }
   };

   public faf(cft $$0, cbz $$1, tl $$2) {
      this.q = $$0;
   }

   public cft I() {
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
      if (this.f.s.ge()) {
         this.d(esk.a(tk.d, $$0 -> this.az_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(esk.a(tl.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      cjl $$0 = this.q.l();
      this.a(ezk.a.a($$0));
   }

   void K() {
      this.a(this.q.m());
   }

   @Override
   protected void H() {
      this.f.s.q();
   }
}
