public abstract class bsn extends bgi {
   protected bsn(bfn<? extends bsn> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.j, 0.0F);
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   public bge eN() {
      return bge.e;
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this);
   }

   @Override
   public int M() {
      return 120;
   }

   @Override
   public int ea() {
      return 1 + this.dI().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bs() && !this.aY()) {
         this.j($$0 - 1);
         if (this.cf() == -20) {
            this.j(0);
            this.a(this.dJ().h(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void ao() {
      int $$0 = this.cf();
      super.ao();
      this.b($$0);
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public boolean a(byo $$0) {
      return false;
   }

   public static boolean c(bfn<? extends bsn> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      int $$5 = $$1.t_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(anb.a) && $$1.a_($$3.c()).a(cpo.G);
   }
}
