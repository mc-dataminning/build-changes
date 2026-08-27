public class fak extends ezp implements fam<cfn> {
   private final cfn q;
   private final cex s = new cex() {
      @Override
      public void a(cel $$0, int $$1, cjf $$2) {
         fak.this.I();
      }

      @Override
      public void a(cel $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fak.this.J();
         }
      }
   };

   public fak(cfn $$0, cbt $$1, tl $$2) {
      this.q = $$0;
   }

   public cfn H() {
      return this.q;
   }

   @Override
   protected void aI_() {
      super.aI_();
      this.q.a(this.s);
   }

   @Override
   public void az_() {
      this.f.s.q();
      super.az_();
   }

   @Override
   public void aA_() {
      super.aA_();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.s.gd()) {
         this.d(esq.a(tk.d, $$0 -> this.az_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(esq.a(tl.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      cjf $$0 = this.q.l();
      this.a(ezp.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.q();
   }
}
