public class faf extends ezk implements fah<cfi> {
   private final cfi q;
   private final ces s = new ces() {
      @Override
      public void a(ceg $$0, int $$1, cja $$2) {
         faf.this.I();
      }

      @Override
      public void a(ceg $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            faf.this.J();
         }
      }
   };

   public faf(cfi $$0, cbo $$1, ti $$2) {
      this.q = $$0;
   }

   public cfi H() {
      return this.q;
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.q.a(this.s);
   }

   @Override
   public void au_() {
      this.f.s.q();
      super.au_();
   }

   @Override
   public void av_() {
      super.av_();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.s.gc()) {
         this.d(esl.a(th.d, $$0 -> this.au_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(esl.a(ti.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      cja $$0 = this.q.l();
      this.a(ezk.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.q();
   }
}
