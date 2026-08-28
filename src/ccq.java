public class ccq extends cco {
   private boolean p;

   public ccq(bte $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected eoz a(int $$0) {
      this.p = this.a.am() == bsn.y;
      this.o = new epd(this.p);
      return new eoz(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bk();
   }

   @Override
   protected ewh b() {
      return new ewh(this.a.dw(), this.a.e(0.5), this.a.dC());
   }

   @Override
   protected double a(ewh $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ewh $$0, ewh $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ja $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
