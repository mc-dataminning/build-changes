public class ccc extends cca {
   private boolean p;

   public ccc(bsq $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected enk a(int $$0) {
      this.p = this.a.ak() == bsa.y;
      this.o = new eno(this.p);
      return new enk(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected euk b() {
      return new euk(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(euk $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(euk $$0, euk $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(io $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
