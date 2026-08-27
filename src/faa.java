public class faa extends ezf implements fac<cff> {
   private final cff q;
   private final cep s = new cep() {
      @Override
      public void a(ced $$0, int $$1, cix $$2) {
         faa.this.I();
      }

      @Override
      public void a(ced $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            faa.this.J();
         }
      }
   };

   public faa(cff $$0, cbl $$1, tf $$2) {
      this.q = $$0;
   }

   public cff H() {
      return this.q;
   }

   @Override
   protected void aC_() {
      super.aC_();
      this.q.a(this.s);
   }

   @Override
   public void at_() {
      this.f.s.q();
      super.at_();
   }

   @Override
   public void h() {
      super.h();
      this.q.b(this.s);
   }

   @Override
   protected void l() {
      if (this.f.s.gc()) {
         this.d(esg.a(te.d, $$0 -> this.at_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(esg.a(tf.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
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
      cix $$0 = this.q.l();
      this.a(ezf.a.a($$0));
   }

   void J() {
      this.a(this.q.m());
   }

   @Override
   protected void G() {
      this.f.s.q();
   }
}
