public class ezv extends eza implements ezx<cfe> {
   private final cfe q;
   private final ceo s = new ceo() {
      @Override
      public void a(cec $$0, int $$1, ciw $$2) {
         ezv.this.H();
      }

      @Override
      public void a(cec $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ezv.this.I();
         }
      }
   };

   public ezv(cfe $$0, cbk $$1, te $$2) {
      this.q = $$0;
   }

   public cfe G() {
      return this.q;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.q.a(this.s);
   }

   @Override
   public void au_() {
      this.f.t.q();
      super.au_();
   }

   @Override
   public void h() {
      super.h();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.t.gc()) {
         this.d(esi.a(td.d, $$0 -> this.au_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(esi.a(te.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      this.f.r.a(this.q.j, $$0);
   }

   @Override
   public boolean j() {
      return false;
   }

   void H() {
      ciw $$0 = this.q.l();
      this.a(eza.a.a($$0));
   }

   void I() {
      this.a(this.q.m());
   }

   @Override
   protected void F() {
      this.f.t.q();
   }
}
